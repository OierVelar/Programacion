/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Caso;
import ModeloUML.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW08
 */
public class TablaCasos {
    private Connection con;
    private static Cliente cl;
    
    public TablaCasos(Connection con){
        this.con = con;
    }
    
    public void insertar(Caso ca) throws Exception{
        String plantilla = "INSERT INTO casos VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, ca.getNroExp());
        ps.setDate(2, Date.valueOf(ca.getFechaInicio()));
        ps.setString(3, ca.getEstado());
        ps.setString(4, ca.getC().getDni());
        
        int n =ps.executeUpdate();
        ps.close();
        if(n!=1){
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }
    
    public void borrar(Caso ca) throws Exception{
        String plantilla = "DELETE FROM casos WHERE NroExp=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, ca.getNroExp());
        
        int n =ps.executeUpdate();
        ps.close();
        if(n!=1){
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }
}
