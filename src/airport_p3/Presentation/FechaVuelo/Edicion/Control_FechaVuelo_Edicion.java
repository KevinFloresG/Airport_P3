package airport_p3.Presentation.FechaVuelo.Edicion;

import airport_p3.datos.Dao_FechaVuelo;
import airport_p3.datos.Dao_Vuelo;
import airport_p3.logica.Fechavuelo;
import airport_p3.logica.Vuelo;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Control_FechaVuelo_Edicion {

    Model_FechaVuelo_Edicion model;
    View_FechaVuelo_Edicion view;
    Dao_FechaVuelo daoFechaVuelo;
    Dao_Vuelo daoVuelo;
    

    public Control_FechaVuelo_Edicion(Model_FechaVuelo_Edicion model, View_FechaVuelo_Edicion view) throws SQLException, Exception {
        daoFechaVuelo = new Dao_FechaVuelo();
        daoVuelo = new Dao_Vuelo();
        model.setVuelos(daoVuelo.getAll());
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void consultar(String idFechaVuelo) {
        try {
            model.setFechaVuelo(daoFechaVuelo.get(idFechaVuelo));
        } catch (Exception ex) {
             view.interruption(ex.getMessage());
        }
    }

    public void agregar(Fechavuelo fv) {
        try {
            daoFechaVuelo.add(fv);
            model.setFechaVuelo(new Fechavuelo());
        } catch (Exception ex) {
             view.interruption(ex.getMessage());
        }
    }

    public void modificar(Fechavuelo fv) {
        try {
            daoFechaVuelo.update(fv);

        } catch (Exception ex) {
             view.interruption(ex.getMessage());
        }
    }

    public void eliminar(Fechavuelo fv) {
        try {
            daoFechaVuelo.delete(fv);

        } catch (Exception ex) {
             view.interruption(ex.getMessage());
        }

    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }
}
