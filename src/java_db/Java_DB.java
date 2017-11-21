
package java_db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;


public class Java_DB {

    public static void main(String[] args) throws SQLException {
       
        Connection con = null;
        
    
        try {
            // Load Oracle JDBC Driver
            //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connect to Oracle Database
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "pass");
             if (con != null) {
                System.out.println("Connected with connection #1");
            }
             con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Java_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
    
// first commit
