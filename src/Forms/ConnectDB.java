
package Forms;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDB {
    
    public static Connection getConnection()
    {
        try
        {
            String sqlcon="jdbc:sqlserver://192.168.99.130:1433;databaseName = TGInventory";
            String user = "sa";
            String pas = "Mee@2016";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(sqlcon, user, pas);
            return c;                        
        }catch(Exception e)
        {
             int type = JOptionPane.WARNING_MESSAGE;
            String a;
            a = "Error...check your Connection.";
            String b = "MESSAGE";
            JOptionPane.showMessageDialog(null, a,b,type);
            System.exit(0);           
        }
        return null;
    }
    
}
