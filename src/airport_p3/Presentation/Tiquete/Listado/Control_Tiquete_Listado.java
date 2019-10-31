/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Tiquete.Listado;
import airport_p3.Airport_P3;
import static airport_p3.Airport_P3.LISTADO_Control_Tiquete;
import airport_p3.datos.Dao_Reserva;
import airport_p3.datos.Dao_Tiquete;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 * @author Carlos Naranjo
 */
public class Control_Tiquete_Listado {
       
    Model_Tiquete_Listado model;
    View_Tiquete_Listado view;
    Dao_Tiquete daoTiquete;
    Dao_Reserva daoReserva;

    public Control_Tiquete_Listado(Model_Tiquete_Listado model, View_Tiquete_Listado view) {
        daoTiquete = new Dao_Tiquete();
        daoReserva = new Dao_Reserva();
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }

    public void buscar(String numeroReserva) throws SQLException, Exception{
        
        try{
        int reserva = Integer.parseInt(numeroReserva);
        model.setFiltroReserva(daoReserva.get(reserva));
        model.getFiltro().setReserva(model.getFiltroReserva());
        this.refrescar();
        }
        catch (Exception ex) {
                view.interruption("Datos Erroneos.");
            }
    }

    public void refrescar() throws SQLException, Exception{
        model.setTiquetes(daoTiquete.search(model.getFiltro()));
    }
    
    public void MostrarTodos(){
        try{
            model.setTiquetes(daoTiquete.getAll());
        }
        catch (Exception ex) {
                view.interruption("Se encuentra vacia.");
            }
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }

}
