/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.aplication.Usuario;


import airport_p3.Airport_P3;

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
    
    public void EdicionFechaVueloShow(){
        Airport_P3.EDICION_Control_FechaVuelo.show();
    }
    public void ListadoFechaVueloShow(){
        Airport_P3.LISTADO_Control_FechaVuelo.show();
    }
    public void ListadoAvionShow(){
        Airport_P3.LISTADO_Control_Avion.show();
    }
    
    public void EdicionAvionShow(){
        Airport_P3.EDICION_Control_Avion.show();
    }
     public void ListadoTiqueteShow(){
        Airport_P3.LISTADO_Control_Tiquete.show();
    }
   
    public void EdicionFormaPagoShow(){
        Airport_P3.EDICION_Control_FormaPago.show();
    }
    
    public void ListadoFormaPagoShow(){
        Airport_P3.LISTADO_Control_FormaPago.show();
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
    
  public void show() {
        
    view.setVisible(true);
    }
}











