/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Vuelo.Listado;

import airport_p3.logica.Avion;
import airport_p3.logica.Ciudad;
import airport_p3.logica.Vuelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Daniel
 */
public class Model_Vuelo extends Observable {

    List<Vuelo> VuelosDisponibles;
    List<Ciudad> CiudadesOrigen;
    List<Ciudad> CiudadesDestino;
    List<Avion> AvionesDisponibles;
    Vuelo VueloFiltro;

    public Model_Vuelo() {
        VuelosDisponibles = new ArrayList<>();
        CiudadesOrigen = new ArrayList<>();
        CiudadesDestino = new ArrayList<>();
        AvionesDisponibles = new ArrayList<>();
        VueloFiltro = new Vuelo("");
    }

    public Model_Vuelo(List<Vuelo> VuelosDisponibles, List<Ciudad> CiudadesOrigen, List<Ciudad> CiudadesDestino, List<Avion> AvionesDisponibles, Vuelo VueloFiltro) {
        this.VuelosDisponibles = VuelosDisponibles;
        this.CiudadesOrigen = CiudadesOrigen;
        this.CiudadesDestino = CiudadesDestino;
        this.AvionesDisponibles = AvionesDisponibles;
        this.VueloFiltro = VueloFiltro;
    }

    public Vuelo getVueloFiltro() {
        return VueloFiltro;
    }

    public void setVueloFiltro(Vuelo VueloFiltro) {
        this.VueloFiltro = VueloFiltro; 
        this.setChanged();
        this.notifyObservers();
    }
    
    public List<Ciudad> getCiudadesOrigen() {
        return CiudadesOrigen;
    }

    public void setCiudadesOrigen(List<Ciudad> CiudadesOrigen) {
        this.CiudadesOrigen = CiudadesOrigen;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Ciudad> getCiudadesDestino() {
        return CiudadesDestino;
    }

    public void setCiudadesDestino(List<Ciudad> CiudadesDestino) {
        this.CiudadesDestino = CiudadesDestino;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Avion> getAvionesDisponibles() {
        return AvionesDisponibles;
    }

    public void setAvionesDisponibles(List<Avion> AvionesDisponibles) {
        this.AvionesDisponibles = AvionesDisponibles;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Vuelo> getVuelosDisponibles() {
        return VuelosDisponibles;
    }

    public void setVuelos(List<Vuelo> Vuelo) {
        this.VuelosDisponibles = Vuelo;
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
