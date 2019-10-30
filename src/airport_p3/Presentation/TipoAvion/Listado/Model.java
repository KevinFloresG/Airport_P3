
package airport_p3.Presentation.TipoAvion.Listado;

import airport_p3.logica.Tipoavion;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Kevin Flores
 */
public class Model extends Observable{
    
    private List<Tipoavion> list;
    private Tipoavion filtro;

    public Model() {
        this.list = new ArrayList<>();
        this.filtro = new Tipoavion();
    }

    public List<Tipoavion> getList() {
        return list;
    }

    public void setList(List<Tipoavion> list) {
        this.list = list;
    }

    public Tipoavion getFiltro() {
        return filtro;
    }

    public void setFiltro(Tipoavion filtro) {
        this.filtro = filtro;
    }
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }
    
}
