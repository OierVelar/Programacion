/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Evento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 1GDAW08
 */
public class TablaEventos {
    private Connection con;
    
    public TablaEventos(Connection con) {
        this.con = con;
    }
    
    public void insertar( Evento e) throws Exception{
        String plantilla = "INSERT INTO eventos VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        ps.setString(2,e.getLugar());
        ps.setDate(3,Date.valueOf(e.getFecha()));
        ps.setString(4,e.getHoraInicio());
        ps.setString(5,e.getHoraFinalizacion());
        ps.setInt(6,e.getNumeroPersonas());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
    public void borrar(Evento e) throws Exception{
        String plantilla = "DELETE FROM eventos WHERE Nombre=?";
        PreparedStatement ps = con.prepareStatement (plantilla);
        ps.setString(1, e.getNombre());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n !=1)
            throw new Exception("El numero de filas actualizadas no es uno");
    }
    
    public Evento consultar(Evento e) throws Exception{
        String plantilla="SELECT * FROM eventos WHERE Nombre=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,e.getNombre());
        
        ResultSet resultado = ps.executeQuery();
        if (resultado.next())
        {
           
            e = new Evento(resultado.getString("nombre"),resultado.getString("lugar"),resultado.getDate("fecha").toLocalDate(),resultado.getString("horaInicio"),resultado.getString("horaFinalizacion"),resultado.getInt("numeroPersonas"));
            return e;
        }
        else{
           return null;
        }
    }
}
