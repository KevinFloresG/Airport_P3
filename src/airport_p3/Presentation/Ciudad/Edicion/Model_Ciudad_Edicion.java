/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Ciudad.Edicion;

import airport_p3.logica.Ciudad;
import airport_p3.logica.Pais;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Model_Ciudad_Edicion extends Observable {

    Ciudad ciudad;
    List<Pais> paises;

    public Model_Ciudad_Edicion() {
        ciudad = new Ciudad();
        paises = new ArrayList<>();
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
     public List<Pais> getPaises() {
        return paises;
    }
     
      public void setPaises(List<Pais> paises) {
          
        List<Pais> aux = new ArrayList<>();
        this.paises = paises;
    }
     
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();
    }

}
