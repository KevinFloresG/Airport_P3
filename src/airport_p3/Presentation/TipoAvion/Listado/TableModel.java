
package airport_p3.Presentation.TipoAvion.Listado;

import airport_p3.logica.Tipoavion;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kevin Flores
 */
public class TableModel extends AbstractTableModel {
    
    List<Tipoavion> list;   

    public TableModel(List<Tipoavion> list) {
        this.list = list;
    }

    public List<Tipoavion> getList() {
        return list;
    }

    public void setList(List<Tipoavion> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "ID";
            case 1: return "Modelo";
            case 2: return "Asientos";
            case 3: return "Filas";
            case 4: return "Columnas";
            default: return "";
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tipoavion x = list.get(rowIndex);
        switch(columnIndex){
            case 0: return x.getIdTipoAvion();
            case 1: return x.getMondelo();
            case 2: return x.getCantidadAsientos();
            case 3: return x.getCantidadFilas();
            case 4: return x.getCantidadColumnas();
            default: return "";
        }
    }
}
