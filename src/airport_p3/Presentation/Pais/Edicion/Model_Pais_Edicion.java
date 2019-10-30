/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Pais.Edicion;


import java.util.Observable;
import java.util.Observer;
import airport_p3.logica.Pais;


/**
 *
 * @author Carlos Naranjo
 * 
 */
public class Model_Pais_Edicion extends Observable{
    Pais pais;  

    public Model_Pais_Edicion() {
        pais=new Pais();
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
        this.setChanged();
        this.notifyObservers();           
    }
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }
    
}
