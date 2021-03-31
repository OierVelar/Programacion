/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Abogado;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW08
 */
public class TablaAbogados {
    private Connection con;
    
    public TablaAbogados(Connection con){
        this.con = con;
    }
    
    public void insertar(Abogado a) throws Exception{
        String plantilla = "INSERT INTO abogados VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, a.getDni());
        ps.setString(2, a.getNombre());
        ps.setString(3, a.getApellidos());
        ps.setString(4, a.getDireccion());
        
        int n =ps.executeUpdate();
        ps.close();
        if(n!=1){
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }
    
    public void borrar(Abogado a) throws Exception{
        String plantilla = "DELETE FROM abogados WHERE dni=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, a.getDni());
        
        int n = ps.executeUpdate();
        ps.close();
        if (n !=1)
            throw new Exception("El numero de filas actualizadas no es uno");
    }
}
