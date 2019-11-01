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
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public void buscar(String idVuelo,String Fecha) throws SQLException, Exception{
        try{
        model.getFiltro().setIdFechaVuelo("");
        model.getFiltro().setVuelo(new Vuelo());
        model.getFiltro().getVuelo().setIdVuelo(idVuelo);
        model.getFiltro().setFecha(this.ParseFecha(Fecha));
        this.refrescar();
        }
        catch (Exception ex) {
                view.interruption("Datos Erroneos.");
            }
    }
    
    public void mostrarTodos(){
             try{
                 model.setFechas(daoFechaVuelo.getAll());
        }
        catch (Exception ex) {
                view.interruption("Datos Erroneos.");
            }
    }

    public void refrescar() throws SQLException, Exception{
        model.setFechas(daoFechaVuelo.search(model.getFiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_Ciudad.consultar(model.getFechas().get(row).getIdFechaVuelo());
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }
        public Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
}
