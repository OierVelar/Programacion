/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Empresa;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW08
 */
public class TablaEmpresas {
    private Connection con;
    
    public TablaEmpresas(Connection con) {
        this.con = con;
    }
    
    public void insertar(Empresa em) throws Exception{
        try{
            String plantilla= "INSERT INTO empresas VALUES (?,?);";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1,em.getNif());
            ps.setString(2,em.getNombre());

            int n = ps.executeUpdate();
            ps.close();
            if (n != 1)
                throw new Exception("El número de filas actualizadas no es uno");
        }
        catch(MySQLIntegrityConstraintViolationException ex){
            
        }
    }
}
