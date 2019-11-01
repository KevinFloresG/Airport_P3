/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.FechaVuelo.Listado;

import airport_p3.Airport_P3;
import airport_p3.datos.Dao_FechaVuelo;
import airport_p3.datos.Dao_Vuelo;
import airport_p3.logica.Vuelo;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Control_FechaVuelo {

    Model_FechaVuelo model_avionE;
    View_FechaVuelo view_avionE;
    Dao_FechaVuelo daoFechaVuelo;

    public Control_FechaVuelo(Model_FechaVuelo model_avionE, View_FechaVuelo view_avionE) {
        this.model_avionE = model_avionE;
        this.view_avionE = view_avionE;
        daoFechaVuelo = new Dao_FechaVuelo();
        view_avionE.setModel(model_avionE);
        view_avionE.setController(this);
    }

    
    public void buscar(Vuelo vuelo,Date fecha) throws SQLException, Exception{
        model_avionE.getfiltro().setIdFechaVuelo("");
        model_avionE.getfiltro().setVuelo(vuelo);
        model_avionE.getfiltro().setFecha(fecha);
        this.refrescar();
    }

    public void refrescar() throws SQLException, Exception{
        model_avionE.setFechavueloDisponibles(daoFechaVuelo.search(model_avionE.getfiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_Ciudad.consultar(model_avionE.getVuelosDisponibles().get(row).getIdVuelo());
    }

    public void show() {
        view_avionE.setVisible(true);
    }

    public void hide() {
        view_avionE.setVisible(false);
    }

        
    public void MostrarTodos(){
        try{
            model_avionE.setFechavueloDisponibles(daoFechaVuelo.getAll());
        }
        catch (Exception ex) {
                view_avionE.interruption("Se encuentra vacia.");
            }
    }

    
}
