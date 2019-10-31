
package airport_p3.Presentation.FormaPago.Listado;


import airport_p3.logica.Formapago;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Carlos Naranjo
 * 
 */

public class FormaPagoTableModel extends AbstractTableModel{
    List<Formapago> FormasPagos;   

    public FormaPagoTableModel(List<Formapago> FormasPagos) {
        this.FormasPagos = FormasPagos;
    }

    public List<Formapago> getFormasPagos() {
        return FormasPagos;
    }

    public void setFormasPagos(List<Formapago> FormasPagos) {
        this.FormasPagos = FormasPagos;
    }
    
    @Override
    public int getRowCount() {
        return FormasPagos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Id Forma de Pago";
            case 1: return "Nombre Forma Pago";
            default: return "";
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Formapago fp = FormasPagos.get(rowIndex);
        switch(columnIndex){
            case 0: return fp.getIdFormaPago();
            case 1: return fp.getNombre();
            default: return "";
        }
    }
     
}
