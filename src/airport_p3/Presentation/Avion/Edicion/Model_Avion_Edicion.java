/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Avion.Edicion;

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
public class Model_Avion_Edicion extends Observable {

    Avion avion;
    List<Tipoavion> TipoAviones;

    public Model_Avion_Edicion() {
        avion = new Avion();
        TipoAviones = new ArrayList<>();
    }

    public Avion getAvion() {
        return avion;
    }
     public List<Tipoavion> getTipoAviones() {
        return TipoAviones;
    }
     
      public void setTipoAviones(List<Tipoavion> TipoAviones) {
         
        this.TipoAviones = TipoAviones;
        
    }
     
    public void setAvion(Avion avion) {
        this.avion = avion;
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
