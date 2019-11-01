/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Vuelo.Edicion;
import airport_p3.datos.Dao_Avion;
import airport_p3.datos.Dao_Ciudad;
import airport_p3.datos.Dao_Vuelo;
import airport_p3.logica.Vuelo;

/**
 *
 * @author Daniel
 */
public class Control_VueloEdcion {
    Model_VueloEdicion model_E;
    View_VueloEdiicion view_E;
    Dao_Vuelo daoVuelo;
    Dao_Ciudad daoCiudad;
    Dao_Avion daoAvion;

    public Control_VueloEdcion(Model_VueloEdicion model_E, View_VueloEdiicion view_E) throws Exception {
        this.model_E = model_E;
        this.view_E = view_E;
         daoVuelo = new Dao_Vuelo();
        daoCiudad = new Dao_Ciudad();
        daoAvion = new Dao_Avion();
        
        model_E.setCiudadesOrigen(daoCiudad.getAll());
        model_E.setCiudadesDestino(daoCiudad.getAll());
        
        model_E.setAvionesDisponibles(daoAvion.getAll());
        view_E.setModel(model_E);
        view_E.setController(this);
    }
    
    
     public void consultar(String idVuelo) {
        try {
            model_E.setVuelo(daoVuelo.get(idVuelo));
        } catch (Exception ex) {
            model_E.setVuelo(new Vuelo("No existe Vuelo"));
        }
    }

    public void agregar(Vuelo c) {
        try {
            daoVuelo.add(c);
            model_E.setVuelo(new Vuelo());
        } catch (Exception ex) {

        }
    }

    public void modificar(Vuelo c) {
        try {
            daoVuelo.update(c);

        } catch (Exception ex) {

        }
    }

    public void eliminar(Vuelo c) {
        try {
            daoVuelo.delete(c);

        } catch (Exception ex) {

        }

    }

    public void show() {
        view_E.setVisible(true);
    }

    public void hide() {
        view_E.setVisible(false);
    }
    
    
    
}
