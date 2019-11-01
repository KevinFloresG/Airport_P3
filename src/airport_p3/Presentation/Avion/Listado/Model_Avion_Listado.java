
package airport_p3.Presentation.Avion.Listado;
import airport_p3.logica.Avion;
import airport_p3.logica.Tipoavion;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Carlos Naranjo
 * 
 */

public class Model_Avion_Listado extends Observable{
    
    List<Avion> aviones;
    Avion filtro;

    public Model_Avion_Listado(List<Avion> aviones) {
        this.aviones = aviones;
        filtro=new Avion("");
  
    }

    public Model_Avion_Listado() {
        aviones = new ArrayList<>();
        filtro=new Avion("");
   
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
        this.setChanged();
        this.notifyObservers();         
    }

    public Avion getFiltro() {
        return filtro;
    }

    public void setFiltro(Avion filtro) {
        this.filtro = filtro;
    }
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }

}
