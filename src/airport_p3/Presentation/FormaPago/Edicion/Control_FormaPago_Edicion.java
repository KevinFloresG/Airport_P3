package airport_p3.Presentation.FormaPago.Edicion;

import airport_p3.datos.Dao_FormaPago;
import airport_p3.logica.Formapago;

/*
 *
 * @author Carlos Naranjo
 *
 */
public class Control_FormaPago_Edicion {

    Model_FormaPago_Edicion model;
    View_FormaPago_Edicion view;
    Dao_FormaPago daoFormaPago;

    public Control_FormaPago_Edicion(Model_FormaPago_Edicion model, View_FormaPago_Edicion view) {
        this.daoFormaPago = new Dao_FormaPago();
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setModel(model);
    }

    public void agregar(Formapago fp) {
        try {
            daoFormaPago.add(fp);
            model.setFormaPago(new Formapago());
        } catch (Exception ex) {
            view.interruption(ex.getMessage());
        }
    }

    public void eliminar(Formapago fp) {

        try {
            daoFormaPago.delete(fp);
            model.setFormaPago(new Formapago());
        } catch (Exception ex) {
            view.interruption(ex.getMessage());
        }

    }

    public void consultar(String idFormaPago) {
        try {
            model.setFormaPago(daoFormaPago.get(idFormaPago));
        } catch (Exception ex) {
            view.interruption(ex.getMessage());
        }

    }

    public void modificar(Formapago fp) {
        try {
            daoFormaPago.update(fp);
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
