package airport_p3.Presentation.Pais.Listado;

import airport_p3.Airport_P3;
import airport_p3.datos.Dao_Pais;
import java.sql.SQLException;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Control_Pais_Listado {

    Model_Pais_Listado model;
    View_Pais_Listado view;
    Dao_Pais daoPais;

    public Control_Pais_Listado(Model_Pais_Listado model, View_Pais_Listado view) {
        daoPais = new Dao_Pais();
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void buscar(String nombre) throws SQLException {
        model.getFiltro().setNombre(nombre);
        this.refrescar();
    }

    public void refrescar() throws SQLException {
        model.setPaises(daoPais.search(model.getFiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_Pais.consultar(model.getPaises().get(row).getIdPais());
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }

}
