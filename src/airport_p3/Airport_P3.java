package airport_p3;

import airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion;
import airport_p3.datos.*;
import airport_p3.logica.*;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kevin Flores
 * 
 */
public class Airport_P3 {

    public static void main(String[] args) throws Exception {
//        Usuario s = new Usuario();
//        s.setApellido("");
//        s.setNombre("");
//        s.setIdUsuario("");
//        Dao_Usuario dao = new Dao_Usuario();
//        s = dao.get("Kefin****");
//        
//        System.out.println(s.getFechaNacimientoString());
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        /*ListadoAvion*/
        airport_p3.Presentation.Avion.Listado.Model_Avion_Listado MAvion = new airport_p3.Presentation.Avion.Listado.Model_Avion_Listado();
        airport_p3.Presentation.Avion.Listado.View_Avion_Listado VAvion = new airport_p3.Presentation.Avion.Listado.View_Avion_Listado();
        airport_p3.Presentation.Avion.Listado.Control_Avion_Listado CAvion = new airport_p3.Presentation.Avion.Listado.Control_Avion_Listado(MAvion, VAvion);
        LISTADO_Control_Avion = CAvion;

        /*EdicionAvion*/
        airport_p3.Presentation.Avion.Edicion.Model_Avion_Edicion MAvionE = new airport_p3.Presentation.Avion.Edicion.Model_Avion_Edicion();
        airport_p3.Presentation.Avion.Edicion.View_Avion_Edicion VAvionE = new airport_p3.Presentation.Avion.Edicion.View_Avion_Edicion();
        airport_p3.Presentation.Avion.Edicion.Control_Avion_Edicion CAvionE = new airport_p3.Presentation.Avion.Edicion.Control_Avion_Edicion(MAvionE, VAvionE);
        EDICION_Control_Avion = CAvionE;
        
        
        
        

        /*EdicionPais*/
        airport_p3.Presentation.Pais.Edicion.Model_Pais_Edicion MPaisE = new airport_p3.Presentation.Pais.Edicion.Model_Pais_Edicion();
        airport_p3.Presentation.Pais.Edicion.View_Pais_Edicion VPaisE = new airport_p3.Presentation.Pais.Edicion.View_Pais_Edicion();
        airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion CPaisE = new airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion(MPaisE, VPaisE);
        EDICION_Control_Pais = CPaisE;
       
        /*ListadoPais*/
        airport_p3.Presentation.Pais.Listado.Model_Pais_Listado MPaisL = new airport_p3.Presentation.Pais.Listado.Model_Pais_Listado();
        airport_p3.Presentation.Pais.Listado.View_Pais_Listado VPaisL = new airport_p3.Presentation.Pais.Listado.View_Pais_Listado();
        airport_p3.Presentation.Pais.Listado.Control_Pais_Listado CPaisL = new airport_p3.Presentation.Pais.Listado.Control_Pais_Listado(MPaisL,VPaisL);
        LISTADO_Control_Pais = CPaisL;
        
        /*EdicionCiudad*/
        airport_p3.Presentation.Ciudad.Edicion.Model_Ciudad_Edicion MCiudadE = new airport_p3.Presentation.Ciudad.Edicion.Model_Ciudad_Edicion();
        airport_p3.Presentation.Ciudad.Edicion.View_Ciudad_Edicion VCiudadE = new airport_p3.Presentation.Ciudad.Edicion.View_Ciudad_Edicion();
        airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion CCiudadE = new airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion(MCiudadE,VCiudadE);
        EDICION_Control_Ciudad= CCiudadE;
        
        
        /*ListadoCiudad*/
        airport_p3.Presentation.Ciudad.Listado.Model_Ciudad_Listado MCiudadL = new airport_p3.Presentation.Ciudad.Listado.Model_Ciudad_Listado();
       airport_p3.Presentation.Ciudad.Listado.View_Ciudad_Listado VCiudadL = new airport_p3.Presentation.Ciudad.Listado.View_Ciudad_Listado();
        airport_p3.Presentation.Ciudad.Listado.Control_Ciudad_Listado CCiudadL = new airport_p3.Presentation.Ciudad.Listado.Control_Ciudad_Listado(MCiudadL, VCiudadL);
        LISTADO_Control_Ciudad = CCiudadL;
        
        /*EdicionFormaPago*/
        airport_p3.Presentation.FormaPago.Edicion.Model_FormaPago_Edicion MFormaPagoE = new airport_p3.Presentation.FormaPago.Edicion.Model_FormaPago_Edicion();
        airport_p3.Presentation.FormaPago.Edicion.View_FormaPago_Edicion VFormaPagoE = new airport_p3.Presentation.FormaPago.Edicion.View_FormaPago_Edicion();
        airport_p3.Presentation.FormaPago.Edicion.Control_FormaPago_Edicion CFormaPagoE = new airport_p3.Presentation.FormaPago.Edicion.Control_FormaPago_Edicion(MFormaPagoE, VFormaPagoE);
        EDICION_Control_FormaPago = CFormaPagoE;
        
        /*ListadoFormaPago*/
        airport_p3.Presentation.FormaPago.Listado.Model_FormaPago_Listado MFormaPagoL = new airport_p3.Presentation.FormaPago.Listado.Model_FormaPago_Listado();
        airport_p3.Presentation.FormaPago.Listado.View_FormaPago_Listado VFormaPagoL = new airport_p3.Presentation.FormaPago.Listado.View_FormaPago_Listado();
        airport_p3.Presentation.FormaPago.Listado.Control_FormaPago_Listado CFormaPagoL = new airport_p3.Presentation.FormaPago.Listado.Control_FormaPago_Listado(MFormaPagoL, VFormaPagoL);
        LISTADO_Control_FormaPago = CFormaPagoL;
        
   
        
        
   
        /*ListadoVuelo*/
        airport_p3.Presentation.Vuelo.Listado.Model_Vuelo MVuelo = new airport_p3.Presentation.Vuelo.Listado.Model_Vuelo();
        airport_p3.Presentation.Vuelo.Listado.View_Vuelo VVuelo = new airport_p3.Presentation.Vuelo.Listado.View_Vuelo();
        airport_p3.Presentation.Vuelo.Listado.Control_Vuelo CVuelo = new airport_p3.Presentation.Vuelo.Listado.Control_Vuelo(MVuelo, VVuelo);
        LISTADO_Control_Vuelo = CVuelo;
        
        
        
        
        
        
        
        /*ListadoFechaVuelo*/
        airport_p3.Presentation.FechaVuelo.Listado.Model_FechaVuelo MFechaVuelo = new airport_p3.Presentation.FechaVuelo.Listado.Model_FechaVuelo();
        airport_p3.Presentation.FechaVuelo.Listado.View_FechaVuelo VFechaVuelo = new airport_p3.Presentation.FechaVuelo.Listado.View_FechaVuelo();
        airport_p3.Presentation.FechaVuelo.Listado.Control_FechaVuelo CFechaVuelo = new airport_p3.Presentation.FechaVuelo.Listado.Control_FechaVuelo(MFechaVuelo, VFechaVuelo);
        LISTADO_Control_FechaVuelo = CFechaVuelo;

      

        /*ListadoHorario*/
        airport_p3.Presentation.Horario.Listado.Model_Horario MHorario = new airport_p3.Presentation.Horario.Listado.Model_Horario();
        airport_p3.Presentation.Horario.Listado.View_Horario VHorario = new airport_p3.Presentation.Horario.Listado.View_Horario();
        airport_p3.Presentation.Horario.Listado.Control_Horario CHorario = new airport_p3.Presentation.Horario.Listado.Control_Horario(MHorario, VHorario);
        LISTADO_Control_Horario = CHorario;

        /*EdicionHorario*/
        airport_p3.Presentation.Horario.Edicion.Model_Horario MHorarioE = new airport_p3.Presentation.Horario.Edicion.Model_Horario();
        airport_p3.Presentation.Horario.Edicion.View_Horario VHorarioE = new airport_p3.Presentation.Horario.Edicion.View_Horario();
        airport_p3.Presentation.Horario.Edicion.Control_Horario CHorarioE = new airport_p3.Presentation.Horario.Edicion.Control_Horario(MHorarioE, VHorarioE);
        EDICION_Control_Horario = CHorarioE;

        /*ListadoHorario*/
        airport_p3.Presentation.Reserva.Listado.Model_Reserva MReserva = new airport_p3.Presentation.Reserva.Listado.Model_Reserva();
        airport_p3.Presentation.Reserva.Listado.View_Reserva VReserva = new airport_p3.Presentation.Reserva.Listado.View_Reserva();
        airport_p3.Presentation.Reserva.Listado.Control_Reserva CReserva = new airport_p3.Presentation.Reserva.Listado.Control_Reserva(MReserva, VReserva);
        LISTADO_Control_Reserva = CReserva;

        /*ListadoHorario*/
        airport_p3.Presentation.Ruta.Listado.Model_Ruta MRuta = new airport_p3.Presentation.Ruta.Listado.Model_Ruta();
        airport_p3.Presentation.Ruta.Listado.View_Ruta VRuta = new airport_p3.Presentation.Ruta.Listado.View_Ruta();
        airport_p3.Presentation.Ruta.Listado.Control_Ruta CRuta = new airport_p3.Presentation.Ruta.Listado.Control_Ruta(MRuta, VRuta);
        LISTADO_Control_Ruta = CRuta;

        /*EdicionRuta*/
        airport_p3.Presentation.Ruta.Edicion.Model_Ruta MRutaE = new airport_p3.Presentation.Ruta.Edicion.Model_Ruta();
        airport_p3.Presentation.Ruta.Edicion.View_Ruta VRutaE = new airport_p3.Presentation.Ruta.Edicion.View_Ruta();
        airport_p3.Presentation.Ruta.Edicion.Control_Ruta CRutaE = new airport_p3.Presentation.Ruta.Edicion.Control_Ruta(MRutaE, VRutaE);
        EDICION_Control_Horario = CHorarioE;

        /*EdicionTipoAvion*/
        airport_p3.Presentation.TipoAvion.Edicion.Model MTipoAvionE = new airport_p3.Presentation.TipoAvion.Edicion.Model();
        airport_p3.Presentation.TipoAvion.Edicion.View VTipoAvionE = new airport_p3.Presentation.TipoAvion.Edicion.View();
        airport_p3.Presentation.TipoAvion.Edicion.Control CTipoAvionE = new airport_p3.Presentation.TipoAvion.Edicion.Control(MTipoAvionE, VTipoAvionE);
        EDICION_Control_TipoAvion = CTipoAvionE;
        
        /*ListadoTipoAvion*/
        airport_p3.Presentation.TipoAvion.Listado.Model ml = new airport_p3.Presentation.TipoAvion.Listado.Model();
        airport_p3.Presentation.TipoAvion.Listado.View vl = new airport_p3.Presentation.TipoAvion.Listado.View();
        airport_p3.Presentation.TipoAvion.Listado.Control cl= new airport_p3.Presentation.TipoAvion.Listado.Control(ml, vl);
        //EDICION_Control_TipoAvion = CTipoAvionE;

        /*ListadoTiquete*/
        airport_p3.Presentation.Tiquete.Listado.Model_Tiquete_Listado MTiquete = new airport_p3.Presentation.Tiquete.Listado.Model_Tiquete_Listado();
        airport_p3.Presentation.Tiquete.Listado.View_Tiquete_Listado VTiquete = new airport_p3.Presentation.Tiquete.Listado.View_Tiquete_Listado();
        airport_p3.Presentation.Tiquete.Listado.Control_Tiquete_Listado CTiquete = new airport_p3.Presentation.Tiquete.Listado.Control_Tiquete_Listado(MTiquete, VTiquete);
        LISTADO_Control_Tiquete = CTiquete;

        /*ListadoUsuario*/
        airport_p3.Presentation.Usuario.Listado.Model_Usuario MUsuario = new airport_p3.Presentation.Usuario.Listado.Model_Usuario();
        airport_p3.Presentation.Usuario.Listado.View_Usuario VUsuario = new airport_p3.Presentation.Usuario.Listado.View_Usuario();
        airport_p3.Presentation.Usuario.Listado.Control_Usuario CUsuario = new airport_p3.Presentation.Usuario.Listado.Control_Usuario(MUsuario, VUsuario);
        LISTADO_Control_Usuario = CUsuario;
        
         /*PANTALLADMINISTRADOR*/

        airport_p3.Presentation.aplication.Administrador.Model appModel = new airport_p3.Presentation.aplication.Administrador.Model();
        airport_p3.Presentation.aplication.Administrador.View appViewA = new airport_p3.Presentation.aplication.Administrador.View();
        airport_p3.Presentation.aplication.Administrador.Controller appControllerA = new airport_p3.Presentation.aplication.Administrador.Controller(appModel, appViewA);
        CONTROL_PANTALLA_ADMINISTRADOR = appControllerA;
//        appViewA.setVisible(true);
        
         /*PANTALLAuSUARIO*/
        airport_p3.Presentation.aplication.Usuario.Model appModelU = new airport_p3.Presentation.aplication.Usuario.Model();
        airport_p3.Presentation.aplication.Usuario.View appViewU = new airport_p3.Presentation.aplication.Usuario.View();
        airport_p3.Presentation.aplication.Usuario.Controller appControllerU = new airport_p3.Presentation.aplication.Usuario.Controller(appModelU, appViewU);
        CONTROL_PANTALLA_USUARIO = appControllerU;
        
        /*PANTALLAPRINCIPAL*/
        airport_p3.Presentation.PantallaPrincipal.Model appModelP = new airport_p3.Presentation.PantallaPrincipal.Model();
        airport_p3.Presentation.PantallaPrincipal.View appViewP = new airport_p3.Presentation.PantallaPrincipal.View();
        airport_p3.Presentation.PantallaPrincipal.Controller appControllerP = new airport_p3.Presentation.PantallaPrincipal.Controller(appModelP, appViewP);
        appViewP.setVisible(true);
        
//-------------------PantallaDMINISTRADOR--------------------------------------------------------------------------
        /*Pais*/
        appViewA.panel.add(VPaisE);
        appViewA.panel.add(VPaisL);
        
       /*Ciudad*/
       appViewA.panel.add(VCiudadE);
       appViewA.panel.add(VCiudadL);
       
       /*FormaPago*/
       appViewA.panel.add(VFormaPagoE);
       appViewA.panel.add(VFormaPagoL);
       
       /*Tiquete*/
       appViewA.panel.add(VTiquete);
       /*Avion*/
       appViewA.panel.add(VAvionE);
       appViewA.panel.add(VAvion);
     //-------------------PantallUSUARIO--------------------------------------------------------------------------
        /*Pais*/
        appViewU.panel.add(VPaisE);
        appViewU.panel.add(VPaisL);
        
       /*Ciudad*/
       appViewU.panel.add(VCiudadE);
       appViewU.panel.add(VCiudadL);
       
       /*FormaPago*/
       appViewU.panel.add(VFormaPagoE);
       appViewU.panel.add(VFormaPagoL);
       
       /*Tiquete*/
       appViewU.panel.add(VTiquete);
       /*Avion*/
       appViewU.panel.add(VAvionE);
       appViewU.panel.add(VAvion);
       
//       CTipoAvionE.show();
//       cl.show();

    }

    public static airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion EDICION_Control_Pais;
    public static airport_p3.Presentation.Pais.Listado.Control_Pais_Listado LISTADO_Control_Pais;
    
    public static airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion EDICION_Control_Ciudad;
    public static airport_p3.Presentation.Ciudad.Listado.Control_Ciudad_Listado LISTADO_Control_Ciudad;

    public static airport_p3.Presentation.Avion.Edicion.Control_Avion_Edicion EDICION_Control_Avion;
    public static airport_p3.Presentation.Avion.Listado.Control_Avion_Listado LISTADO_Control_Avion;
    
    public static airport_p3.Presentation.FormaPago.Edicion.Control_FormaPago_Edicion EDICION_Control_FormaPago;
    public static airport_p3.Presentation.FormaPago.Listado.Control_FormaPago_Listado LISTADO_Control_FormaPago;
    
   
    

    public static airport_p3.Presentation.FechaVuelo.Listado.Control_FechaVuelo LISTADO_Control_FechaVuelo;
 
    public static airport_p3.Presentation.Horario.Listado.Control_Horario LISTADO_Control_Horario;
    public static airport_p3.Presentation.Horario.Edicion.Control_Horario EDICION_Control_Horario;
    public static airport_p3.Presentation.Reserva.Listado.Control_Reserva LISTADO_Control_Reserva;
    public static airport_p3.Presentation.Ruta.Listado.Control_Ruta LISTADO_Control_Ruta;
    public static airport_p3.Presentation.TipoAvion.Edicion.Control EDICION_Control_TipoAvion;
    public static airport_p3.Presentation.Usuario.Listado.Control_Usuario LISTADO_Control_Usuario;
    public static airport_p3.Presentation.Tiquete.Listado.Control_Tiquete_Listado LISTADO_Control_Tiquete;
    
    public static airport_p3.Presentation.Vuelo.Edicion.Control_VueloEdcion EDICION_Control_Vuelo;
     public static airport_p3.Presentation.Vuelo.Listado.Control_Vuelo LISTADO_Control_Vuelo;
    public static airport_p3.Presentation.aplication.Administrador.Controller CONTROL_PANTALLA_ADMINISTRADOR;
    public static airport_p3.Presentation.aplication.Usuario.Controller CONTROL_PANTALLA_USUARIO;
}
