package airport_p3.Presentation.FormaPago.Listado;

import airport_p3.Presentation.Pais.Listado.*;
import airport_p3.Presentation.aplication.View;
import airport_p3.Presentation.Pais.Listado.Model_Pais_Listado;
import java.util.logging.Level;
import airport_p3.Airport_P3;
import airport_p3.datos.Dao_Ciudad;
import airport_p3.datos.Dao_FormaPago;
import airport_p3.datos.Dao_Pais;
import airport_p3.logica.Ciudad;
import java.sql.SQLException;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Control_FormaPago_Listado {

    Model_FormaPago_Listado model;
    View_FormaPago_Listado view;
    Dao_FormaPago daoFormaPago;

    public Control_FormaPago_Listado(Model_FormaPago_Listado model, View_FormaPago_Listado view) {
        daoFormaPago = new Dao_FormaPago();
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
        model.setFormasPago(daoFormaPago.search(model.getFiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_Ciudad.consultar(model.getFormasPago().get(row).getIdFormaPago());
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }

}
