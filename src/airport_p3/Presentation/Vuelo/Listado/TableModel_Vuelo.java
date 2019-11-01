/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Vuelo.Listado;

import airport_p3.logica.Vuelo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 */
public class TableModel_Vuelo extends AbstractTableModel {
    List<Vuelo> Vuelos;  

    public TableModel_Vuelo(List<Vuelo> Vuelos) {
        this.Vuelos = Vuelos;
    }

    public List<Vuelo> getVuelos() {
        return Vuelos;
    }

    public void setVuelos(List<Vuelo> Vuelos) {
        this.Vuelos = Vuelos;
    }

    @Override
    public int getRowCount() {
        return Vuelos.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
            case 0:
                return "Id del Vuelo";
            case 1:
                return "Dia";
            case 2:
                return "Hora";
            case 3:
                return "Avion";
            case 4:
                return "Origen";
            case 5:
                return "Destino";
            case 6:
                return "Duracion";
            default:
                return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vuelo c = Vuelos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getIdVuelo();
            case 1:
                return c.getDia().toString();
            case 2:
                return c.getHoraString();
            case 3:
                return c.getAvion().getIdAvion();
            case 4:
                return c.getCiudad().getIdCiudad();
            case 5:
                return c.getCiudad1().getIdCiudad();
            case 6:
                return c.getDuracionString();
            default:
                return "";
        }
    }
}
