/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.PantallaPrincipal;
import airport_p3.Airport_P3;
/**
 *
 * @author ESCINF
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
    
   public void UsuarioShow(){
       Airport_P3.CONTROL_PANTALLA_USUARIO.show();
   }
    public void AdministradorShow(){
       Airport_P3.CONTROL_PANTALLA_ADMINISTRADOR.show();
   }
}
