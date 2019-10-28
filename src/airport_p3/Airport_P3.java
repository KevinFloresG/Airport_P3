package airport_p3;

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
 */
public class Airport_P3 {

    public static void main(String[] args) throws Exception {
        Usuario s = new Usuario();
        s.setApellido("");
        s.setNombre("");
        s.setIdUsuario("");
        Dao_Usuario dao = new Dao_Usuario();
        s = dao.get("Kefin****");
        
        System.out.println(s.getFechaNacimientoString());
    }

}
