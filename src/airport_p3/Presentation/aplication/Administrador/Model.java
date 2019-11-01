/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.aplication.Administrador;

import airport_p3.Presentation.aplication.*;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Escinf
 */
public class Model extends Observable{
    
    public Model() {
    }

    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }
    
}
