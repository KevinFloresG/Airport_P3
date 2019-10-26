
package airport_p3;

import airport_p3.datos.*;
import airport_p3.logica.*;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Kevin Flores
 */
public class Airport_P3 {

    public static void main(String[] args) throws Exception {
        /*
        
        // Algunos TIME
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        // vuelo.setFecha(sdf.parse(rs.getTime().toString()));
        Date hora = sdf.parse("8:30:0"); // 08:30:00
        Date duracion = sdf.parse("2:45:00"); // 02:45:00
        
        // Un DATE
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Date oks = sdf2.parse("14/9/1999"); // yyyy-MM-dd
        
        // Variables que ya existen en la base de datos
        Avion a = new Avion("Boe60");
        
        Ciudad ci = new Ciudad("DFM", "Alajuela");
        
        Ciudad ca = new Ciudad("NY", "Liberia");
        
        Vuelo v = new Vuelo("A-222","Jueves",hora,duracion,a,ci,ca);
        
        Formapago f = new Formapago("003", "Tarjeta de Debito");
        
        Usuario us = new Usuario("Kefin****","Kevin","Matenme","Flores G", "kevinfg1413@gmail.com",
        oks, "La verga", 11110000, 82223456
        );
        
        Fechavuelo fv = new Fechavuelo("A1",oks,60,350000.75);
        fv.setVuelo(v);
        
        Reserva re = new Reserva(us,fv,f);
        re.setIdReserva(3);
        
        Tiquete t = new Tiquete(4,"A3");
        t.setReserva(re);*/
        Dao_Avion av = new Dao_Avion();
        Avion n = av.get("Boe60");
        System.out.println("FIN");
    }
    
}
