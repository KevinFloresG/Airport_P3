
package airport_p3.Presentation.FechaVuelo.Listado;


import airport_p3.logica.Ciudad;
import airport_p3.logica.Fechavuelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Daniel
 * 
 */
public class Model_FechaVuelo extends Observable{
    
    List<Fechavuelo> Fechas;
    Fechavuelo filtro;


    public Model_FechaVuelo(List<Fechavuelo> Fechas) {
        this.Fechas = Fechas;
        filtro=new Fechavuelo("");
    }

    public Model_FechaVuelo() {
        Fechas = new ArrayList<>();
        filtro=new Fechavuelo("");
    }

    public List<Fechavuelo> getFechas() {
        return Fechas;
    }

    public void setFechas(List<Fechavuelo> Fechas) {
        this.Fechas = Fechas;
        this.setChanged();
        this.notifyObservers();         
    }

    public Fechavuelo getFiltro() {
        return filtro;
    }

    public void setFiltro(Fechavuelo filtro) {
        this.filtro = filtro;
    }

    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }

}
