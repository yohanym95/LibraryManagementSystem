
package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LibraryManagementSystem {

//    public static void main(String[] args) {
//        
//    }
    
    public static Connection conn() {
        
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/librarysystems";
        String user = "root";
        String password="";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            
        } catch (Exception ex) {
            System.out.println(ex);
            
        }
        
        
        return con;
    }
    
}
