/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Personas;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW08
 */
public class TablaPersonas {
    private Connection con;
    
    public TablaPersonas(Connection con) {
        this.con = con;
    }
    
    public void insertar(Personas p) throws Exception{
        try{
            String plantilla="INSERT INTO personas VALUES (?,?,?,?);";
            PreparedStatement ps=con.prepareStatement(plantilla);
            ps.setString(1,p.getDni());
            ps.setString(2,p.getNombre());
            ps.setString(3,p.getApellidos());
            ps.setString(4,valueOf(p.getNif()));
        }
        catch(MySQLIntegrityConstraintViolationException ex){
            
        }
    }
}
