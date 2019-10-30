/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.aplication;

import airport_p3.Airport_P3;
import  airport_p3.Presentation.aplication.Model;
import airport_p3.Presentation.aplication.View;

/**
 *
 * @author Daniel
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }
    
        public void ListadoCiudadShow(){
        Airport_P3.LISTADO_Control_Ciudad.show();
    }

    public void EdicionCiudadShow(){
        Airport_P3.EDICION_Control_Ciudad.show();
    }
    
    public void ListadoPaisShow(){
         Airport_P3.LISTADO_Control_Pais.show();
    }

    public void EdicionPaisShow(){
        Airport_P3.EDICION_Control_Pais.show();
    }
}











