
package airport_p3.Presentation.TipoAvion.Edicion;

import airport_p3.datos.Dao_TipoAvion;
import airport_p3.logica.Tipoavion;

/**
 *
 * @author Daniel
 * @author Kevin Flores
 */
public class Control {
    
    private Model model;
    private View view;
    private final Dao_TipoAvion dao;

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
    
    public void add(Tipoavion t){
        if(t != null){
            try{
                dao.add(t);
                model.setTipoAvion(new Tipoavion());
            }catch (Exception ex) {
                view.interruption(ex.getMessage());
            }
        }
    }
    
    public void delete(Tipoavion t){
        if(t != null){
            try{
                dao.delete(t);
                model.setTipoAvion(new Tipoavion());
            }catch (Exception ex) {
                view.interruption(ex.getMessage());
            }
        }
    }
    
    public void get(String id){
        try{
            model.setTipoAvion(dao.get(id));
        }catch (Exception ex) {
            view.interruption(ex.getMessage());
        }
    
    }
    
    public void update(Tipoavion t){
        if(t != null){
            try{
                dao.update(t);
            }catch (Exception ex) {
                view.interruption(ex.getMessage());
            }
        }
    }
    
    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }
}
