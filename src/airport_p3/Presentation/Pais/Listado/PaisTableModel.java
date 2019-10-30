
package airport_p3.Presentation.Pais.Listado;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import airport_p3.logica.Pais;

/**
 *
 * @author Carlos Naranjo
 * 
 */
public class PaisTableModel extends AbstractTableModel{
    List<Pais> pais;   

    public PaisTableModel(List<Pais> pais) {
        this.pais = pais;
    }

    public List<Pais> getPaises() {
        return pais;
    }

    public void setPaises(List<Pais> pais) {
        this.pais = pais;
    }
    
    @Override
    public int getRowCount() {
        return pais.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Id del Pais";
            case 1: return "Nombre del Pais";
            default: return "";
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pais p=pais.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getIdPais();
            case 1: return p.getNombre();
            default: return "";
        }
    }
     
}
