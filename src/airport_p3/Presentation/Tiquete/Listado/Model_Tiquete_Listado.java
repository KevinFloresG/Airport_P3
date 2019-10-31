/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Tiquete.Listado;

import airport_p3.logica.Reserva;
import airport_p3.logica.Tiquete;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Daniel
 * @author Carlos
 * 
 */
public class Model_Tiquete_Listado extends Observable{
    
    List<Tiquete> tiquete;
    Tiquete filtro;
    Reserva friltroReserva;


    public Model_Tiquete_Listado(List<Tiquete> tiquete) {
        this.tiquete = tiquete;
        friltroReserva = new Reserva();
        filtro=new Tiquete();
    }

    public Model_Tiquete_Listado() {
        tiquete = new ArrayList<>();
        friltroReserva = new Reserva();
        filtro=new Tiquete();
    }

    public List<Tiquete> getTiquetes() {
        return tiquete;
    }

    public void setTiquetes(List<Tiquete> tiquete) {
        this.tiquete = tiquete;
        this.setChanged();
        this.notifyObservers();         
    }
    public Reserva getFiltroReserva() {
        return friltroReserva;
    }

    public void setFiltroReserva(Reserva friltroReserva) {
        this.friltroReserva = friltroReserva;
    }
    public Tiquete getFiltro() {
        return filtro;
    }

    public void setFiltro(Tiquete filtro) {
        this.filtro = filtro;
    }

    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }

}
