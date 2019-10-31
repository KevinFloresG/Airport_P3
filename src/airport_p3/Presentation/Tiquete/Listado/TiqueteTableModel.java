
package airport_p3.Presentation.Tiquete.Listado;
import airport_p3.logica.Tiquete;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 * @author Carlos Naranjo
 * 
 */
public class TiqueteTableModel extends AbstractTableModel{
        List<Tiquete> tiquete;   

    public TiqueteTableModel(List<Tiquete> tiquete) {
        this.tiquete = tiquete;
    }

    public List<Tiquete> getTiquetes() {
        return tiquete;
    }

    public void setTiquetes(List<Tiquete> tiquete) {
        this.tiquete = tiquete;
    }
    
        @Override
    public int getRowCount() {
        return tiquete.size();
    }

        @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Id tiquete.";
            case 1: return "Asiento";
            case 2: return "Reserva";
            default: return "";
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tiquete c = tiquete.get(rowIndex);
        switch(columnIndex){
            case 0: return c.getIdTiquete();
            case 1: return c.getAsiento();
            case 2: return c.getReserva().getIdReserva();
            default: return "";
        }
    }
}
