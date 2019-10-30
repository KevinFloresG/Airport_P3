/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Vuelo.Listado;

/**
 *
 * @author Daniel
 */
public class Control_Vuelo {
      Model_Vuelo  model_avionE;
    View_Vuelo  view_avionE;

    public Control_Vuelo(Model_Vuelo model_avionE, View_Vuelo view_avionE) {
        this.model_avionE = model_avionE;
        this.view_avionE = view_avionE;
    }

}
