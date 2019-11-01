/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.FechaVuelo.Listado;

import airport_p3.logica.Fechavuelo;
import airport_p3.logica.Vuelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Daniel
 */
public class Model_FechaVuelo extends Observable {

    List<Vuelo> VuelosDisponibles;
    List<Fechavuelo> FechavueloDisponibles;
    Fechavuelo filtro;

    public Model_FechaVuelo() {
        VuelosDisponibles = new ArrayList<>();
        FechavueloDisponibles = new ArrayList<>();
        this.filtro = new Fechavuelo("");
    }

    public Model_FechaVuelo(List<Vuelo> VuelosDisponibles, Fechavuelo FechaVuelo) {
        this.VuelosDisponibles = VuelosDisponibles;
        this.filtro = FechaVuelo;
    }

    public List<Vuelo> getVuelosDisponibles() {
        return VuelosDisponibles;
    }

    public List<Fechavuelo> getFechavueloDisponibles() {
        return FechavueloDisponibles;
    }

    public void setFechavueloDisponibles(List<Fechavuelo> FechavueloDisponibles) {
        this.FechavueloDisponibles = FechavueloDisponibles;
        this.setChanged();
        this.notifyObservers();
    }

    public void setVuelosDisponibles(List<Vuelo> VuelosDisponibles) {
        this.VuelosDisponibles = VuelosDisponibles;
        this.setChanged();
        this.notifyObservers();
    }

    public Fechavuelo getfiltro() {
        return filtro;
    }

    public void setFechaVuelo(Fechavuelo FechaVuelo) {
        this.filtro = FechaVuelo;
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
