/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Vuelo.Listado;

import java.sql.SQLException;
import airport_p3.Airport_P3;
import airport_p3.datos.Dao_Avion;
import airport_p3.datos.Dao_Ciudad;
import airport_p3.datos.Dao_Vuelo;
import airport_p3.logica.Avion;
import airport_p3.logica.Ciudad;

/**
 *
 * @author Daniel
 */
public class Control_Vuelo {
    Model_Vuelo model_avionE;
    View_Vuelo view_avionE;
    Dao_Vuelo daoVuelo;
    Dao_Ciudad daoCiudad;
    Dao_Avion daoAvion;

    public Control_Vuelo(Model_Vuelo model_avionE, View_Vuelo view_avionE) throws Exception {
        this.model_avionE = model_avionE;
        this.view_avionE = view_avionE;
        daoVuelo = new Dao_Vuelo();
        daoCiudad = new Dao_Ciudad();
        daoAvion = new Dao_Avion();
        
        model_avionE.setCiudadesOrigen(daoCiudad.getAll());
        model_avionE.setCiudadesDestino(daoCiudad.getAll());
        
        model_avionE.setAvionesDisponibles(daoAvion.getAll());
        
        view_avionE.setModel(model_avionE);
        view_avionE.setController(this);
    }

    public void buscar( Avion avionDisponible,Ciudad origen, Ciudad destino) throws SQLException, Exception {
        try {
            model_avionE.getVueloFiltro().setIdVuelo("");
            model_avionE.getVueloFiltro().setCiudad(origen);
            model_avionE.getVueloFiltro().setCiudad1(destino);
            model_avionE.getVueloFiltro().setAvion(avionDisponible);
            this.refrescar();
        } catch (Exception ex) {

        }

    }

    public void refrescar() throws SQLException, Exception {
        model_avionE.setVuelos(daoVuelo.search(model_avionE.getVueloFiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_Vuelo.consultar(model_avionE.getVuelosDisponibles().get(row).getIdVuelo());
    }
    
    public void MostrarTodos(){
        try{
            model_avionE.setVuelos(daoVuelo.getAll());
        }
        catch (Exception ex) {
                view_avionE.interruption("Se encuentra vacia.");
            }
    }

    public void show() {
       view_avionE.setVisible(true); }

    

    public void hide() {
        view_avionE.setVisible(false);
    }

}

