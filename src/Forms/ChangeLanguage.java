
package Forms;


import static Forms.ConnectDB.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class ChangeLanguage {
    public static String LangType;
    public static String getLabel(String txt){
        try {
            String sql;
            Connection c = getConnection();
            sql = "Select Sys_"+ LangType +" from Languages where Sys_FieldName = '"+ txt +"'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()){
                String a = rs.getString("sys_" + LangType);
              return a;
            }
        } catch (Exception e) {
        }
         return null;
    }
}
