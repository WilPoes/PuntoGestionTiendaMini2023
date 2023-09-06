package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;
    
    public Connection getConnection(){
        
        try {
            //
            String bd="jdbc:mysql://localhost:3306/tf_rev1?serverTimezone=UTC";          

            con = DriverManager.getConnection(bd,"root","");

            return con;
            
        } catch (Exception e) {
            System.out.println(e.toString());
        } 
        
        return null;
    }
}
