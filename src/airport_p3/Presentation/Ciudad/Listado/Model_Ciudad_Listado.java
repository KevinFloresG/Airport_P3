
package airport_p3.Presentation.Ciudad.Listado;

import airport_p3.Presentation.Pais.Listado.*;
import airport_p3.logica.Ciudad;
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
public class Model_Ciudad_Listado extends Observable{
    List<Ciudad> ciudad;
    Ciudad filtro;


    public Model_Ciudad_Listado(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
        filtro=new Ciudad("");
    }

    public Model_Ciudad_Listado() {
        ciudad = new ArrayList<>();
        filtro=new Ciudad("");
    }

    public List<Ciudad> getCiudades() {
        return ciudad;
    }

    public void setCiudades(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
        this.setChanged();
        this.notifyObservers();         
    }

    public Ciudad getFiltro() {
        return filtro;
    }

    public void setFiltro(Ciudad filtro) {
        this.filtro = filtro;
    }

    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }

}
