

package Forms;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
public class FilterRenderer extends DefaultTableCellRenderer{
@Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        String st = (String) table.getValueAt(row, column);
        if (st.equals("mee")) {
            setOpaque(true);
            setBackground(Color.RED);
        } else {
            setOpaque(false);
        }
        return this;
    }    
}
