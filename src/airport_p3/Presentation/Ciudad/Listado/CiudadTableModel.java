
package airport_p3.Presentation.Ciudad.Listado;

import airport_p3.Presentation.Pais.Listado.*;
import airport_p3.logica.Ciudad;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Carlos Naranjo
 * 
 */
public class CiudadTableModel extends AbstractTableModel{
    List<Ciudad> ciudad;   

    public CiudadTableModel(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }

    public List<Ciudad> getCiudades() {
        return ciudad;
    }

    public void setCiudades(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public int getRowCount() {
        return ciudad.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Id del Ciudad";
            case 1: return "Pais";
            case 2: return "Nombre Ciudad";
            default: return "";
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ciudad c=ciudad.get(rowIndex);
        switch(columnIndex){
            case 0: return c.getIdCiudad();
            case 1: return c.getPais().getIdPais();
            case 2: return c.getNombre();
            default: return "";
        }
    }
     
}
