
package airport_p3.Presentation.Pais.Listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import airport_p3.logica.Pais;

/**
 *
 * @author Carlos Naranjo
 * 
 */
public class Model_Pais_Listado extends Observable{
    List<Pais> pais;
    Pais filtro;


    public Model_Pais_Listado(List<Pais> pais) {
        this.pais = pais;
        filtro=new Pais();
    }

    public Model_Pais_Listado() {
        pais = new ArrayList<>();
        filtro=new Pais();
    }

    public List<Pais> getPaises() {
        return pais;
    }

    public void setPaises(List<Pais> pais) {
        this.pais = pais;
        this.setChanged();
        this.notifyObservers();         
    }

    public Pais getFiltro() {
        return filtro;
    }

    public void setFiltro(Pais filtro) {
        this.filtro = filtro;
    }

    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }

}
