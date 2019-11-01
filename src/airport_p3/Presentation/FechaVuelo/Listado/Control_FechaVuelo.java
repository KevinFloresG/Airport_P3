/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.FechaVuelo.Listado;

import airport_p3.Airport_P3;
import airport_p3.datos.Dao_FechaVuelo;
import airport_p3.logica.Vuelo;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Control_FechaVuelo {

    Model_FechaVuelo model;
    View_FechaVuelo view;
    Dao_FechaVuelo daoFechaVuelo;

    public Control_FechaVuelo(Model_FechaVuelo model, View_FechaVuelo view) {
        daoFechaVuelo = new Dao_FechaVuelo();
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void buscar(String idVuelo) throws SQLException, Exception{
        model.getFiltro().setIdFechaVuelo("");
        model.getFiltro().setVuelo(new Vuelo());
        model.getFiltro().getVuelo().setIdVuelo(idVuelo);
//        model.getFiltro().setFecha(fecha);
        this.refrescar();
    }

    public void refrescar() throws SQLException, Exception{
//        model.setCiudades(daoCiudad.search(model.getFiltro()));
    }

    public void editar(int row) {
//        Airport_P3.EDICION_Control_Ciudad.consultar(model.getCiudades().get(row).getIdCiudad());
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }
}
