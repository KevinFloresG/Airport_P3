
package airport_p3.Presentation.TipoAvion.Listado;

import airport_p3.Airport_P3;
import airport_p3.datos.Dao_TipoAvion;
import airport_p3.logica.Tipoavion;
import java.sql.SQLException;

/**
 *
 * @author Kevin Flores
 */
public class Control {
    
    private Model model;
    private View view;
    Dao_TipoAvion dao;

    public Control(Model model, View view) {
        this.dao = new Dao_TipoAvion();
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setModel(model);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
    
    public void buscar(String idTipo,String Modelo) throws SQLException {
        model.getFiltro().setMondelo(Modelo);
        model.getFiltro().setIdTipoAvion(idTipo);
        this.refrescar();
    }

    public void refrescar() throws SQLException {
        model.setList(dao.search(model.getFiltro()));
    }

    public void editar(int row) {
        Airport_P3.EDICION_Control_TipoAvion.get(model.getList().get(row).getIdTipoAvion());
    }
    
    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }
}
