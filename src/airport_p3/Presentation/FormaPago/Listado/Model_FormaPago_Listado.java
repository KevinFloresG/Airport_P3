
package airport_p3.Presentation.FormaPago.Listado;


import airport_p3.logica.Formapago;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Carlos Naranjo
 * 
 */
public class Model_FormaPago_Listado extends Observable{
    List<Formapago> FormasPago;
    Formapago filtro;


    public Model_FormaPago_Listado(List<Formapago> FormasPago) {
        this.FormasPago = FormasPago;
        filtro=new Formapago("");
    }

    public Model_FormaPago_Listado() {
        FormasPago = new ArrayList<>();
        filtro=new Formapago("");
    }

    public List<Formapago> getFormasPago() {
        return FormasPago;
    }

    public void setFormasPago(List<Formapago> FormasPago) {
        this.FormasPago = FormasPago;
        this.setChanged();
        this.notifyObservers();         
    }

    public Formapago getFiltro() {
        return filtro;
    }

    public void setFiltro(Formapago filtro) {
        this.filtro = filtro;
    }

    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }

}
