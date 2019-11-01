
package airport_p3.Presentation.Avion.Listado;

import airport_p3.logica.Avion;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Carlos Naranjo
 * 
 */

public class AvionTableModel extends AbstractTableModel{
    List<Avion> aviones;   

    public AvionTableModel(List<Avion> aviones) {
        this.aviones = aviones;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }
    
    @Override
    public int getRowCount() {
        return aviones.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Id del avion";
            case 1: return "Tipo avion";
            default: return "";
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Avion a = aviones.get(rowIndex);
        switch(columnIndex){
            case 0: return a.getIdAvion();
            case 1: return a.getTipoavion().getMondelo();
            default: return "";
        }
    }
     
}
