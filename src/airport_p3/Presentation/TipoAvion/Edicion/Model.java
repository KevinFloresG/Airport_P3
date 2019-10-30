
package airport_p3.Presentation.TipoAvion.Edicion;

import airport_p3.logica.Tipoavion;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Daniel
 */
public class Model extends Observable {
    
    private Tipoavion tipoAvion;

    public Model() {
        this.tipoAvion = new Tipoavion();
    }

    public Model(Tipoavion tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public Tipoavion getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(Tipoavion tipoAvion) {
        this.tipoAvion = tipoAvion;
        this.setChanged();
        this.notifyObservers();
    }
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }
    
}
