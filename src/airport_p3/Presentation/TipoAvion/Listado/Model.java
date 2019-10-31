
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
    
   List<Tipoavion> tavion;
   Tipoavion filtro;


    public Model(List<Tipoavion> tavion) {
        this.tavion = tavion;
        filtro=new Tipoavion();
    }

    public Model() {
        tavion = new ArrayList<>();
        filtro=new Tipoavion();
    }

    public List<Tipoavion> getList() {
        return tavion;
    }

    public void setList(List<Tipoavion> tavion) {
        this.tavion = tavion;
        this.setChanged();
        this.notifyObservers();         
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
