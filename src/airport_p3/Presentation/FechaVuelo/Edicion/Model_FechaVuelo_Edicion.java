/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.FechaVuelo.Edicion;

import airport_p3.logica.Fechavuelo;
import airport_p3.logica.Vuelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class Model_FechaVuelo_Edicion extends Observable {

    Fechavuelo fechavuelo;
    List<Vuelo> vuelos;

    public Model_FechaVuelo_Edicion() {
        fechavuelo = new Fechavuelo();
        vuelos = new ArrayList<>();
    }

    public Fechavuelo getFechaVuelo() {
        return fechavuelo;
    }
     public List<Vuelo> getVuelos() {
        return vuelos;
    }
     
      public void setVuelos(List<Vuelo> vuelos) {
          
        this.vuelos = vuelos;
        
    }
     
    public void setFechaVuelo(Fechavuelo fechavuelo) {
        this.fechavuelo = fechavuelo;
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
