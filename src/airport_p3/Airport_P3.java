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

        Dao_FechaVuelo d = new Dao_FechaVuelo();
        Fechavuelo v = d.get("A1");
        System.out.println(v.getFecha());
        
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        /* MVC Para el usuario */

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
        EDICION_Control_Avion_Admi = CAvionE;

        /*EdicionPais*/
        airport_p3.Presentation.Pais.Edicion.Model_Pais_Edicion MPaisE = new airport_p3.Presentation.Pais.Edicion.Model_Pais_Edicion();
        airport_p3.Presentation.Pais.Edicion.View_Pais_Edicion VPaisE = new airport_p3.Presentation.Pais.Edicion.View_Pais_Edicion();
        airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion CPaisE = new airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion(MPaisE, VPaisE);
        EDICION_Control_Pais = CPaisE;

        /*ListadoPais*/
        airport_p3.Presentation.Pais.Listado.Model_Pais_Listado MPaisL = new airport_p3.Presentation.Pais.Listado.Model_Pais_Listado();
        airport_p3.Presentation.Pais.Listado.View_Pais_Listado VPaisL = new airport_p3.Presentation.Pais.Listado.View_Pais_Listado();
        airport_p3.Presentation.Pais.Listado.Control_Pais_Listado CPaisL = new airport_p3.Presentation.Pais.Listado.Control_Pais_Listado(MPaisL, VPaisL);
        LISTADO_Control_Pais = CPaisL;

        /*EdicionCiudad*/
        airport_p3.Presentation.Ciudad.Edicion.Model_Ciudad_Edicion MCiudadE = new airport_p3.Presentation.Ciudad.Edicion.Model_Ciudad_Edicion();
        airport_p3.Presentation.Ciudad.Edicion.View_Ciudad_Edicion VCiudadE = new airport_p3.Presentation.Ciudad.Edicion.View_Ciudad_Edicion();
        airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion CCiudadE = new airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion(MCiudadE, VCiudadE);
        EDICION_Control_Ciudad = CCiudadE;

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
        
        /*edicionFechaVuelo*/
        airport_p3.Presentation.FechaVuelo.Edicion.Model_FechaVuelo_Edicion  MFechaVueloE = new airport_p3.Presentation.FechaVuelo.Edicion.Model_FechaVuelo_Edicion();
        airport_p3.Presentation.FechaVuelo.Edicion.View_FechaVuelo_Edicion  VFechaVueloE = new airport_p3.Presentation.FechaVuelo.Edicion.View_FechaVuelo_Edicion();
        airport_p3.Presentation.FechaVuelo.Edicion.Control_FechaVuelo_Edicion CFechaVueloE = new airport_p3.Presentation.FechaVuelo.Edicion.Control_FechaVuelo_Edicion(MFechaVueloE, VFechaVueloE);
        EDICION_Control_FechaVuelo = CFechaVueloE;

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
        airport_p3.Presentation.TipoAvion.Listado.Control cl = new airport_p3.Presentation.TipoAvion.Listado.Control(ml, vl);
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

        /*Cierre de MVC para Usuario*/
        
 /*INICIO DE MVC PARA ADMINISTRADOR/*
        
/*ListadoAvion*/
        airport_p3.Presentation.Avion.Listado.Model_Avion_Listado MAvion_Admi = new airport_p3.Presentation.Avion.Listado.Model_Avion_Listado();
        airport_p3.Presentation.Avion.Listado.View_Avion_Listado VAvion_Admi = new airport_p3.Presentation.Avion.Listado.View_Avion_Listado();
        airport_p3.Presentation.Avion.Listado.Control_Avion_Listado CAvion_Admi = new airport_p3.Presentation.Avion.Listado.Control_Avion_Listado(MAvion_Admi, VAvion_Admi);
        LISTADO_Control_Avion_Admi = CAvion_Admi;

        /*EdicionAvion*/
        airport_p3.Presentation.Avion.Edicion.Model_Avion_Edicion MAvionE_Admi = new airport_p3.Presentation.Avion.Edicion.Model_Avion_Edicion();
        airport_p3.Presentation.Avion.Edicion.View_Avion_Edicion VAvionE_Admi = new airport_p3.Presentation.Avion.Edicion.View_Avion_Edicion();
        airport_p3.Presentation.Avion.Edicion.Control_Avion_Edicion CAvionE_Admi = new airport_p3.Presentation.Avion.Edicion.Control_Avion_Edicion(MAvionE_Admi, VAvionE_Admi);
        EDICION_Control_Avion_Admi = CAvionE_Admi;

        /*EdicionPais*/
        airport_p3.Presentation.Pais.Edicion.Model_Pais_Edicion MPaisEAdmi = new airport_p3.Presentation.Pais.Edicion.Model_Pais_Edicion();
        airport_p3.Presentation.Pais.Edicion.View_Pais_Edicion VPaisEAdmi = new airport_p3.Presentation.Pais.Edicion.View_Pais_Edicion();
        airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion CPaisEAdmi = new airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion(MPaisEAdmi, VPaisEAdmi);
        EDICION_Control_Pais_Admi = CPaisEAdmi;

        /*ListadoPais*/
        airport_p3.Presentation.Pais.Listado.Model_Pais_Listado MPaisLAdmi = new airport_p3.Presentation.Pais.Listado.Model_Pais_Listado();
        airport_p3.Presentation.Pais.Listado.View_Pais_Listado VPaisLAdmi = new airport_p3.Presentation.Pais.Listado.View_Pais_Listado();
        airport_p3.Presentation.Pais.Listado.Control_Pais_Listado CPaisLAdmi = new airport_p3.Presentation.Pais.Listado.Control_Pais_Listado(MPaisLAdmi, VPaisLAdmi);
        LISTADO_Control_Pais_Admi = CPaisLAdmi;

        /*EdicionCiudad*/
        airport_p3.Presentation.Ciudad.Edicion.Model_Ciudad_Edicion MCiudadE_Admi = new airport_p3.Presentation.Ciudad.Edicion.Model_Ciudad_Edicion();
        airport_p3.Presentation.Ciudad.Edicion.View_Ciudad_Edicion VCiudadE_Admi = new airport_p3.Presentation.Ciudad.Edicion.View_Ciudad_Edicion();
        airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion CCiudadE_Admi = new airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion(MCiudadE_Admi, VCiudadE_Admi);
        EDICION_Control_Ciudad_Admi = CCiudadE_Admi;

        /*ListadoCiudad*/
        airport_p3.Presentation.Ciudad.Listado.Model_Ciudad_Listado MCiudadL_Admi = new airport_p3.Presentation.Ciudad.Listado.Model_Ciudad_Listado();
        airport_p3.Presentation.Ciudad.Listado.View_Ciudad_Listado VCiudadL_Admi = new airport_p3.Presentation.Ciudad.Listado.View_Ciudad_Listado();
        airport_p3.Presentation.Ciudad.Listado.Control_Ciudad_Listado CCiudadL_Admi = new airport_p3.Presentation.Ciudad.Listado.Control_Ciudad_Listado(MCiudadL_Admi, VCiudadL_Admi);
        LISTADO_Control_Ciudad_Admi = CCiudadL_Admi;

        /*EdicionFormaPago*/
        airport_p3.Presentation.FormaPago.Edicion.Model_FormaPago_Edicion MFormaPagoE_Admi = new airport_p3.Presentation.FormaPago.Edicion.Model_FormaPago_Edicion();
        airport_p3.Presentation.FormaPago.Edicion.View_FormaPago_Edicion VFormaPagoE_Admi = new airport_p3.Presentation.FormaPago.Edicion.View_FormaPago_Edicion();
        airport_p3.Presentation.FormaPago.Edicion.Control_FormaPago_Edicion CFormaPagoE_Admi = new airport_p3.Presentation.FormaPago.Edicion.Control_FormaPago_Edicion(MFormaPagoE_Admi, VFormaPagoE_Admi);
        EDICION_Control_FormaPago_Admi = CFormaPagoE_Admi;

        /*ListadoFormaPago*/
        airport_p3.Presentation.FormaPago.Listado.Model_FormaPago_Listado MFormaPagoL_Admi = new airport_p3.Presentation.FormaPago.Listado.Model_FormaPago_Listado();
        airport_p3.Presentation.FormaPago.Listado.View_FormaPago_Listado VFormaPagoL_Admi = new airport_p3.Presentation.FormaPago.Listado.View_FormaPago_Listado();
        airport_p3.Presentation.FormaPago.Listado.Control_FormaPago_Listado CFormaPagoL_Admi = new airport_p3.Presentation.FormaPago.Listado.Control_FormaPago_Listado(MFormaPagoL_Admi, VFormaPagoL_Admi);
        LISTADO_Control_FormaPago_Admi = CFormaPagoL_Admi;

        /*ListadoVuelo*/
        airport_p3.Presentation.Vuelo.Listado.Model_Vuelo MVuelo_Admi = new airport_p3.Presentation.Vuelo.Listado.Model_Vuelo();
        airport_p3.Presentation.Vuelo.Listado.View_Vuelo VVuelo_Admi = new airport_p3.Presentation.Vuelo.Listado.View_Vuelo();
        airport_p3.Presentation.Vuelo.Listado.Control_Vuelo CVuelo_Admi = new airport_p3.Presentation.Vuelo.Listado.Control_Vuelo(MVuelo_Admi, VVuelo_Admi);
        LISTADO_Control_Vuelo_Admi = CVuelo_Admi;

        /*ListadoFechaVuelo*/
        airport_p3.Presentation.FechaVuelo.Listado.Model_FechaVuelo MFechaVuelo_Admi = new airport_p3.Presentation.FechaVuelo.Listado.Model_FechaVuelo();
        airport_p3.Presentation.FechaVuelo.Listado.View_FechaVuelo VFechaVuelo_Admi = new airport_p3.Presentation.FechaVuelo.Listado.View_FechaVuelo();
        airport_p3.Presentation.FechaVuelo.Listado.Control_FechaVuelo CFechaVuelo_Admi = new airport_p3.Presentation.FechaVuelo.Listado.Control_FechaVuelo(MFechaVuelo_Admi, VFechaVuelo_Admi);
        LISTADO_Control_FechaVuelo_Admi = CFechaVuelo_Admi;

        /*ListadoHorario*/
        airport_p3.Presentation.Horario.Listado.Model_Horario MHorario_Admi = new airport_p3.Presentation.Horario.Listado.Model_Horario();
        airport_p3.Presentation.Horario.Listado.View_Horario VHorario_Admi = new airport_p3.Presentation.Horario.Listado.View_Horario();
        airport_p3.Presentation.Horario.Listado.Control_Horario CHorario_Admi = new airport_p3.Presentation.Horario.Listado.Control_Horario(MHorario_Admi, VHorario_Admi);
        LISTADO_Control_Horario_Admi = CHorario_Admi;

        /*EdicionHorario*/
        airport_p3.Presentation.Horario.Edicion.Model_Horario MHorarioE_Admi = new airport_p3.Presentation.Horario.Edicion.Model_Horario();
        airport_p3.Presentation.Horario.Edicion.View_Horario VHorarioE_Admi = new airport_p3.Presentation.Horario.Edicion.View_Horario();
        airport_p3.Presentation.Horario.Edicion.Control_Horario CHorarioE_Admi = new airport_p3.Presentation.Horario.Edicion.Control_Horario(MHorarioE_Admi, VHorarioE_Admi);
        EDICION_Control_Horario_Admi = CHorarioE_Admi;

        /*ListadoHorario*/
        airport_p3.Presentation.Reserva.Listado.Model_Reserva MReserva_Admi = new airport_p3.Presentation.Reserva.Listado.Model_Reserva();
        airport_p3.Presentation.Reserva.Listado.View_Reserva VReserva_Admi = new airport_p3.Presentation.Reserva.Listado.View_Reserva();
        airport_p3.Presentation.Reserva.Listado.Control_Reserva CReserva_Admi = new airport_p3.Presentation.Reserva.Listado.Control_Reserva(MReserva_Admi, VReserva_Admi);
        LISTADO_Control_Reserva_Admi = CReserva_Admi;

        /*ListadoHorario*/
        airport_p3.Presentation.Ruta.Listado.Model_Ruta MRuta_Admi = new airport_p3.Presentation.Ruta.Listado.Model_Ruta();
        airport_p3.Presentation.Ruta.Listado.View_Ruta VRuta_Admi = new airport_p3.Presentation.Ruta.Listado.View_Ruta();
        airport_p3.Presentation.Ruta.Listado.Control_Ruta CRuta_Admi = new airport_p3.Presentation.Ruta.Listado.Control_Ruta(MRuta_Admi, VRuta_Admi);
        LISTADO_Control_Ruta_Admi = CRuta_Admi;

        /*EdicionRuta*/
        airport_p3.Presentation.Ruta.Edicion.Model_Ruta MRutaE_Admi = new airport_p3.Presentation.Ruta.Edicion.Model_Ruta();
        airport_p3.Presentation.Ruta.Edicion.View_Ruta VRutaE_Admi = new airport_p3.Presentation.Ruta.Edicion.View_Ruta();
        airport_p3.Presentation.Ruta.Edicion.Control_Ruta CRutaE_Admi = new airport_p3.Presentation.Ruta.Edicion.Control_Ruta(MRutaE_Admi, VRutaE_Admi);
        EDICION_Control_Horario_Admi = CHorarioE_Admi;

        /*EdicionTipoAvion*/
        airport_p3.Presentation.TipoAvion.Edicion.Model MTipoAvionE_Admi = new airport_p3.Presentation.TipoAvion.Edicion.Model();
        airport_p3.Presentation.TipoAvion.Edicion.View VTipoAvionE_Admi = new airport_p3.Presentation.TipoAvion.Edicion.View();
        airport_p3.Presentation.TipoAvion.Edicion.Control CTipoAvionE_Admi = new airport_p3.Presentation.TipoAvion.Edicion.Control(MTipoAvionE_Admi, VTipoAvionE_Admi);
        EDICION_Control_TipoAvion_Admi = CTipoAvionE_Admi;

        /*ListadoTipoAvion*/
        airport_p3.Presentation.TipoAvion.Listado.Model ml_Admi = new airport_p3.Presentation.TipoAvion.Listado.Model();
        airport_p3.Presentation.TipoAvion.Listado.View vl_Admi = new airport_p3.Presentation.TipoAvion.Listado.View();
        airport_p3.Presentation.TipoAvion.Listado.Control cl_Admi = new airport_p3.Presentation.TipoAvion.Listado.Control(ml_Admi, vl_Admi);
        //EDICION_Control_TipoAvion = CTipoAvionE;

        /*ListadoTiquete*/
        airport_p3.Presentation.Tiquete.Listado.Model_Tiquete_Listado MTiquete_Admi = new airport_p3.Presentation.Tiquete.Listado.Model_Tiquete_Listado();
        airport_p3.Presentation.Tiquete.Listado.View_Tiquete_Listado VTiquete_Admi = new airport_p3.Presentation.Tiquete.Listado.View_Tiquete_Listado();
        airport_p3.Presentation.Tiquete.Listado.Control_Tiquete_Listado CTiquete_Admi = new airport_p3.Presentation.Tiquete.Listado.Control_Tiquete_Listado(MTiquete_Admi, VTiquete_Admi);
        LISTADO_Control_Tiquete_Admi = CTiquete_Admi;

        /*ListadoUsuario*/
        airport_p3.Presentation.Usuario.Listado.Model_Usuario MUsuario_Admi = new airport_p3.Presentation.Usuario.Listado.Model_Usuario();
        airport_p3.Presentation.Usuario.Listado.View_Usuario VUsuario_Admi = new airport_p3.Presentation.Usuario.Listado.View_Usuario();
        airport_p3.Presentation.Usuario.Listado.Control_Usuario CUsuario_Admi = new airport_p3.Presentation.Usuario.Listado.Control_Usuario(MUsuario_Admi, VUsuario_Admi);
        LISTADO_Control_Usuario_Admi = CUsuario_Admi;

        /*Cierre de MVC para Adminitrador*/
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
        appViewA.panel.add(VPaisEAdmi);
        appViewA.panel.add(VPaisLAdmi);

        /*Ciudad*/
        appViewA.panel.add(VCiudadE_Admi);
        appViewA.panel.add(VCiudadL_Admi);

        /*FormaPago*/
        appViewA.panel.add(VFormaPagoE_Admi);
        appViewA.panel.add(VFormaPagoL_Admi);

        /*Tiquete*/
        appViewA.panel.add(VTiquete_Admi);
        /*Avion*/
        appViewA.panel.add(VAvionE_Admi);
        appViewA.panel.add(VAvion_Admi);

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
        /*Fecha vuelo */
        appViewU.panel.add(VFechaVuelo);
        appViewU.panel.add(VFechaVueloE);
        

//       CTipoAvionE.show();
//       cl.show();
    }

    /* PARA USUARIO */
    public static airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion EDICION_Control_Pais;
    public static airport_p3.Presentation.Pais.Listado.Control_Pais_Listado LISTADO_Control_Pais;

    public static airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion EDICION_Control_Ciudad;
    public static airport_p3.Presentation.Ciudad.Listado.Control_Ciudad_Listado LISTADO_Control_Ciudad;

    public static airport_p3.Presentation.Avion.Edicion.Control_Avion_Edicion EDICION_Control_Avion;
    public static airport_p3.Presentation.Avion.Listado.Control_Avion_Listado LISTADO_Control_Avion;

    public static airport_p3.Presentation.FormaPago.Edicion.Control_FormaPago_Edicion EDICION_Control_FormaPago;
    public static airport_p3.Presentation.FormaPago.Listado.Control_FormaPago_Listado LISTADO_Control_FormaPago;
    public static airport_p3.Presentation.FechaVuelo.Listado.Control_FechaVuelo LISTADO_Control_FechaVuelo;
    public static airport_p3.Presentation.FechaVuelo.Edicion.Control_FechaVuelo_Edicion EDICION_Control_FechaVuelo;

    public static airport_p3.Presentation.Horario.Listado.Control_Horario LISTADO_Control_Horario;
    public static airport_p3.Presentation.Horario.Edicion.Control_Horario EDICION_Control_Horario;
    public static airport_p3.Presentation.Reserva.Listado.Control_Reserva LISTADO_Control_Reserva;
    public static airport_p3.Presentation.Ruta.Listado.Control_Ruta LISTADO_Control_Ruta;
    public static airport_p3.Presentation.TipoAvion.Edicion.Control EDICION_Control_TipoAvion;
    public static airport_p3.Presentation.Usuario.Listado.Control_Usuario LISTADO_Control_Usuario;
    public static airport_p3.Presentation.Tiquete.Listado.Control_Tiquete_Listado LISTADO_Control_Tiquete;

    public static airport_p3.Presentation.Vuelo.Edicion.Control_VueloEdcion EDICION_Control_Vuelo;
    public static airport_p3.Presentation.Vuelo.Listado.Control_Vuelo LISTADO_Control_Vuelo;

    /*Cierre para USUARIO*/
    /*INCIO PARA ADMINISTRADOR*/
    
    public static airport_p3.Presentation.Pais.Edicion.Control_Pais_Edicion EDICION_Control_Pais_Admi;
    public static airport_p3.Presentation.Pais.Listado.Control_Pais_Listado LISTADO_Control_Pais_Admi;

    public static airport_p3.Presentation.Ciudad.Edicion.Control_Ciudad_Edicion EDICION_Control_Ciudad_Admi;
    public static airport_p3.Presentation.Ciudad.Listado.Control_Ciudad_Listado LISTADO_Control_Ciudad_Admi;

    public static airport_p3.Presentation.Avion.Edicion.Control_Avion_Edicion EDICION_Control_Avion_Admi;
    public static airport_p3.Presentation.Avion.Listado.Control_Avion_Listado LISTADO_Control_Avion_Admi;

    public static airport_p3.Presentation.FormaPago.Edicion.Control_FormaPago_Edicion EDICION_Control_FormaPago_Admi;
    public static airport_p3.Presentation.FormaPago.Listado.Control_FormaPago_Listado LISTADO_Control_FormaPago_Admi;
    public static airport_p3.Presentation.FechaVuelo.Listado.Control_FechaVuelo LISTADO_Control_FechaVuelo_Admi;

    public static airport_p3.Presentation.Horario.Listado.Control_Horario LISTADO_Control_Horario_Admi;
    public static airport_p3.Presentation.Horario.Edicion.Control_Horario EDICION_Control_Horario_Admi;
    public static airport_p3.Presentation.Reserva.Listado.Control_Reserva LISTADO_Control_Reserva_Admi;
    public static airport_p3.Presentation.Ruta.Listado.Control_Ruta LISTADO_Control_Ruta_Admi;
    public static airport_p3.Presentation.TipoAvion.Edicion.Control EDICION_Control_TipoAvion_Admi;
    public static airport_p3.Presentation.Usuario.Listado.Control_Usuario LISTADO_Control_Usuario_Admi;
    public static airport_p3.Presentation.Tiquete.Listado.Control_Tiquete_Listado LISTADO_Control_Tiquete_Admi;

    public static airport_p3.Presentation.Vuelo.Edicion.Control_VueloEdcion EDICION_Control_Vuelo_Admi;
    public static airport_p3.Presentation.Vuelo.Listado.Control_Vuelo LISTADO_Control_Vuelo_Admi;

    /* Cierre para administrador*/
    
    
    public static airport_p3.Presentation.aplication.Administrador.Controller CONTROL_PANTALLA_ADMINISTRADOR;
    public static airport_p3.Presentation.aplication.Usuario.Controller CONTROL_PANTALLA_USUARIO;

}
