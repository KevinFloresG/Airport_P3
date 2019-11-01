package airport_p3.Presentation.FechaVuelo.Listado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import airport_p3.logica.Fechavuelo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 */
public class TableModel_FechaVuelo extends AbstractTableModel {
    List<Fechavuelo> FechaVuelos;  

    public TableModel_FechaVuelo(List<Fechavuelo> FechaVuelos) {
        this.FechaVuelos = FechaVuelos;
    }

    public List<Fechavuelo> getFechaVuelos() {
        return FechaVuelos;
    }

    public void setFechaVuelos(List<Fechavuelo> FechaVuelos) {
        this.FechaVuelos = FechaVuelos;
    }

    @Override
    public int getRowCount() {
        return FechaVuelos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
            case 0:
                return "Id del FechaVuelo";
            case 1:
                return "Id del Vuelo";
            case 2:
                return "Fecha";
            case 3:
                return "Disponibilidad";
            case 4:
                return "Precio";
            default:
                return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fechavuelo c = FechaVuelos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getIdFechaVuelo();
            case 1:
                return c.getVuelo().getIdVuelo();
            case 2:
                return c.getFechaString();
            case 3:
                return c.getDisponibles();
             case 4:
                return c.getPrecio();
            default:
                return "";
        }
    }
}
