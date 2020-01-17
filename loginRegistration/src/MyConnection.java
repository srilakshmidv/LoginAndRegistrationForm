
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/java_login_register"; 
           // System .out.println("connector okay");
            con = DriverManager.getConnection(url, "root", "");
           // System .out.println("MyConnection done");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
