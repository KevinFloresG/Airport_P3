/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Avion.Edicion;

/**
 *
 * @author Daniel
 */
public class Control_Avion {
    Model_Avion model_avionE;
    View_Avion view_avionE;

    public Control_Avion(Model_Avion model_avion, View_Avion view_avion) {
        this.model_avionE = model_avion;
        this.view_avionE = view_avion;
    }

    public void show() {
       
    view_avionE.setVisible(true);
    }
}
