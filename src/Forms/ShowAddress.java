
package Forms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author User
 */
public class ShowAddress {
    public static String sql;
    public static ArrayList pv = new ArrayList();
    public static ArrayList DS = new ArrayList();
    public static ArrayList VL = new ArrayList();
    public static JComboBox cmbP = new JComboBox();
    public static JComboBox cmbD = new JComboBox();
    public static JComboBox cmbV = new JComboBox();
    public static void Provinces(){
        try{
            Connection con = ConnectDB.getConnection();
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql="Select ProvID, ProvName from Provinces";
            mode.removeAllElements();
            pv.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                pv.add(rs.getString("ProvID"));
                mode.addElement(rs.getString("ProvName"));
            }
             cmbP.setModel(mode);
        }catch(Exception e){}
    }
    public static void District(){
        try{
            Connection con = ConnectDB.getConnection();
            int dc =cmbP.getSelectedIndex();
            DefaultComboBoxModel md = new DefaultComboBoxModel();
            sql="SELECT dbo.Districts.DistID, dbo.Districts.DistName\n" +
            "FROM  dbo.Districts INNER JOIN\n" +
            " dbo.Provinces ON dbo.Districts.ProvID = dbo.Provinces.ProvID\n" +
            "WHERE (dbo.Districts.ProvID ="+ pv.get(dc) +" )";
            md.removeAllElements();
            DS.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                DS.add(rs.getString("DistID"));
                md.addElement(rs.getString("DistName"));
            }
             cmbD.setModel(md);
        }catch(Exception e){}
    }
    public static void Villages(){
        try{
            Connection con = ConnectDB.getConnection();
            int V1 =cmbD.getSelectedIndex();
            DefaultComboBoxModel md = new DefaultComboBoxModel();
            sql="SELECT dbo.Villages.VID, dbo.Villages.Village\n" +
            "FROM dbo.Villages INNER JOIN\n" +
            " dbo.Districts ON dbo.Villages.DistID = dbo.Districts.DistID WHERE (dbo.Villages.DistID ="+ DS.get(V1) +" )";
            md.removeAllElements();
            VL.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                VL.add(rs.getString("VID"));
                md.addElement(rs.getString("Village"));
            }
             cmbV.setModel(md);
        }catch(Exception e){}
    }
}
