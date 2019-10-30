package airport_p3.Presentation.Ciudad.Listado;

import airport_p3.Presentation.Pais.Listado.*;
import airport_p3.Presentation.aplication.View;
import airport_p3.Presentation.Pais.Listado.Model_Pais_Listado;
import java.util.logging.Level;
import airport_p3.Airport_P3;
import airport_p3.datos.Dao_Ciudad;
import airport_p3.datos.Dao_Pais;
import java.sql.SQLException;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Control_Ciudad_Listado {

    Model_Ciudad_Listado model;
    View_Ciudad_Listado view;
    Dao_Ciudad daoCiudad;

    public Control_Ciudad_Listado(Model_Ciudad_Listado model, View_Ciudad_Listado view) {
        daoCiudad = new Dao_Ciudad();
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void buscar(String nombre) throws SQLException, Exception{
        model.getFiltro().setNombre(nombre);
        this.refrescar();
    }

    public void refrescar() throws SQLException, Exception{
        model.setCiudades(daoCiudad.search(model.getFiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_Ciudad.consultar(model.getCiudades().get(row).getIdCiudad());
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }

}
