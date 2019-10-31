/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.FormaPago.Edicion;


import airport_p3.logica.Formapago;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Carlos Naranjo
 *
 */

public class Model_FormaPago_Edicion extends Observable {

    Formapago formapago;
  

    public Model_FormaPago_Edicion() {
        formapago = new Formapago();
 
    }

    public Formapago getFormaPago() {
        return formapago;
    }
    
    public void setFormaPago(Formapago formapago) {
        this.formapago = formapago;
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
