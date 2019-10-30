package airport_p3.Presentation.Pais.Edicion;

import java.util.logging.Level;
import java.util.logging.Logger;
import airport_p3.datos.Dao_Pais;
import airport_p3.logica.Pais;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Control_Pais_Edicion {

    Model_Pais_Edicion model;
    View_Pais_Edicion view;
    Dao_Pais daoPais;

    public Control_Pais_Edicion(Model_Pais_Edicion model, View_Pais_Edicion view) {
        daoPais = new Dao_Pais();
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void consultar(String idPais) {
        try {
            model.setPais(daoPais.get(idPais));
        } catch (Exception ex) {
            model.setPais(new Pais("No existe Pais"));
        }
    }

    public void agregar(Pais p) {
        try {
            daoPais.add(p);
            model.setPais(new Pais());
        } catch (Exception ex) {

        }
    }

    public void modificar(Pais p) { // TODO
        try {
            daoPais.update(p);

        } catch (Exception ex) {

        }
    }

    public void eliminar(Pais p) {
        try {
            daoPais.delete(p);

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
