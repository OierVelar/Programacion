/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW08
 */
public class TablaClientes {
    private Connection con;
    
    public TablaClientes(Connection con){
        this.con = con;
    }
    
    public void insertar (Cliente cl) throws Exception{
        String plantilla = "INSERT INTO clientes VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, cl.getDni());
        ps.setString(2, cl.getNombre());
        ps.setString(3, cl.getApellidos());
        ps.setString(4, cl.getDireccion());
        ps.setString(5, cl.getTelefono());
        ps.setString(6, cl.getCorreo());
        
        int n =ps.executeUpdate();
        ps.close();
        if(n!=1){
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }
    
    public void borrar (Cliente cl) throws Exception{
        String plantilla = "DELETE FROM clientes WHERE dni=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, cl.getDni());
        int n = ps.executeUpdate();
        ps.close();
        if (n !=1)
            throw new Exception("El numero de filas actualizadas no es uno");
    }
}
