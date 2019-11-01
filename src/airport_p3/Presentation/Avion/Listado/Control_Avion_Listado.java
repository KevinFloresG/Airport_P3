
package airport_p3.Presentation.Avion.Listado;
import airport_p3.Airport_P3;
import airport_p3.datos.Dao_Avion;
import airport_p3.datos.Dao_Ciudad;
import airport_p3.datos.Dao_TipoAvion;
import airport_p3.logica.Tipoavion;
import java.sql.SQLException;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Control_Avion_Listado {

    Model_Avion_Listado model;
    View_Avion_Listado view;
    Dao_Avion daoAvion;


    public Control_Avion_Listado(Model_Avion_Listado model, View_Avion_Listado view) {
        
        daoAvion = new Dao_Avion();
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
        
    }

    public void buscar(String idAvion) throws SQLException, Exception{
        model.getFiltro().setIdAvion(idAvion);
        model.getFiltro().setTipoavion(new Tipoavion());
        model.getFiltro().getTipoavion().setIdTipoAvion("");
        this.refrescar();
    }

    public void refrescar() throws SQLException, Exception{
        model.setAviones(daoAvion.search(model.getFiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_Avion.consultar(model.getAviones().get(row).getIdAvion());
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }

}
