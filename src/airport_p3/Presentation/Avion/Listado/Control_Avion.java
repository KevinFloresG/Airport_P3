/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Avion.Listado;

/**
 *
 * @author Daniel
 */
public class Control_Avion {
    Model_Avion model_avion;
    View_Avion view_avion;

    public Control_Avion(Model_Avion model_avion, View_Avion view_avion) {
        this.model_avion = model_avion;
        this.view_avion = view_avion;
    }

    public void show() {
       view_avion.setVisible(true);
    }
    
}
