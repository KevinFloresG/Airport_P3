package airport_p3.Presentation.Avion.Edicion;

import airport_p3.Presentation.Ciudad.Edicion.*;
import airport_p3.Presentation.Pais.Edicion.*;
import airport_p3.datos.Dao_Avion;
import airport_p3.datos.Dao_Ciudad;
import airport_p3.datos.Dao_Pais;
import airport_p3.datos.Dao_TipoAvion;
import airport_p3.logica.Avion;
import airport_p3.logica.Ciudad;
import java.util.logging.Level;
import java.util.logging.Logger;
import airport_p3.logica.Pais;
import java.sql.SQLException;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Control_Avion_Edicion {

    Model_Avion_Edicion model;
    View_Avion_Edicion view;
    Dao_Avion daoAvion;
    Dao_TipoAvion daoTipoAvion;
    

    public Control_Avion_Edicion(Model_Avion_Edicion model, View_Avion_Edicion view) throws SQLException {
        daoAvion = new Dao_Avion();
        daoTipoAvion = new Dao_TipoAvion();
        model.setTipoAviones(daoTipoAvion.getAll());
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void consultar(String idAvion) {
        try {
            model.setAvion(daoAvion.get(idAvion));
        } catch (Exception ex) {
            view.interruption(ex.getMessage());
        }
    }

    public void agregar(Avion a) {
        try {
            daoAvion.add(a);
            model.setAvion(new Avion());
        } catch (Exception ex) {
            view.interruption(ex.getMessage());
        }
    }

    public void modificar(Avion a) {
        try {
            daoAvion.update(a);

        } catch (Exception ex) {
            view.interruption(ex.getMessage());
        }
    }

    public void eliminar(Avion a) {
        try {
            daoAvion.delete(a);

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
