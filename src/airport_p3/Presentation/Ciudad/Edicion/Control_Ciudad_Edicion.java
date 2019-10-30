package airport_p3.Presentation.Ciudad.Edicion;

import airport_p3.Presentation.Pais.Edicion.*;
import airport_p3.datos.Dao_Ciudad;
import airport_p3.datos.Dao_Pais;
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
public class Control_Ciudad_Edicion {

    Model_Ciudad_Edicion model;
    View_Ciudad_Edicion view;
    Dao_Ciudad daoCiudad;
    Dao_Pais daoPais;
    

    public Control_Ciudad_Edicion(Model_Ciudad_Edicion model, View_Ciudad_Edicion view) throws SQLException {
        daoCiudad = new Dao_Ciudad();
        daoPais = new Dao_Pais();
        model.setPaises(daoPais.getAll());
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void consultar(String idCiudad) {
        try {
            model.setCiudad(daoCiudad.get(idCiudad));
        } catch (Exception ex) {
            model.setCiudad(new Ciudad("No existe Ciudad"));
        }
    }

    public void agregar(Ciudad c) {
        try {
            daoCiudad.add(c);
            model.setCiudad(new Ciudad());
        } catch (Exception ex) {

        }
    }

    public void modificar(Ciudad c) {
        try {
            daoCiudad.update(c);

        } catch (Exception ex) {

        }
    }

    public void eliminar(Ciudad c) {
        try {
            daoCiudad.delete(c);

        } catch (Exception ex) {

        }

    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }
}
