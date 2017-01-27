

package Forms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class fetchResultSet {
    public static String Tables;
    public static ResultSet rsAll;
    public static void fatchR(){ 
        try {
            Connection con= ConnectDB.getConnection();
            String sql = "select * from "+ Tables +"";
            //rs1 = con.createStatement().executeQuery(query);
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rsAll = st.executeQuery(sql);
        } catch (Exception e) {
        }
    }
}
