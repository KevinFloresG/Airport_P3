
package airport_p3.datos;

import airport_p3.logica.Ciudad;
import airport_p3.logica.Vuelo;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Dao_Vuelo {
    
    Database_relation db;

    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }

    public Dao_Vuelo() {
    }

    public Dao_Vuelo(Database_relation db) {
        this.db = db;
    }
    private static final Logger LOG = Logger.getLogger(Dao_Vuelo.class.getName());
    
    public void delete(Vuelo c) throws Exception {
        String sql = "delete from Vuelo where idVuelo='%s'";
        sql = String.format(sql, c.getIdVuelo());
        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Vuelo no existe");
        }
    }

    //----------------------------------------------OJOOO
    
    //METODO SEGUB CONSTRUC
   /* public void add(Vuelo c) throws Exception {
        String sql = "insert into Vuelo (idVuelo,dia,hora,duracion) "
                + "values('%s','%s',%s,%s)";
        sql = String.format(sql,
                c.getIdVuelo(),
                c.getDia(),
                c.getHora(),
                c.getDuracion()        
        );*/
    public void add(Vuelo c) throws Exception {
        String sql = "insert into Vuelo (idVuelo,dia,hora,avion,origen,destino,duracion) "
                + "values('%s','%s',%s,'%s','%s','%s',%s)";
        sql = String.format(sql,
                c.getIdVuelo(),
                c.getDia(),
                c.getHora(),
                c.getAvion(),
                c.getCiudad(),
                c.getCiudad1(),
                c.getDuracion()
        
        );
        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Vuelo ya existe");
        }
    }
    
    //METODO SEGUN CONTRUC
    /*public void update(Vuelo c) throws Exception {
        String sql = "update Vuela set dia='%s',hora=%s,Avion='%s',origen=%s,destino='%s',duracion=%s "
                + "where idCiudad='%s'";
            String sql = "update Vuela set dia='%s',hora=%s,duracion=%s "
               + "where idCiudad='%s'";

        sql = String.format(sql,c.getIdVuelo(),
                c.getDia(),
                c.getHora(),
                c.getAvion(),
                c.getOrigen(),
                c.getDestino(),
                c.getDuracion());
        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Avion no existe");
        }
    }*/


        public void update(Vuelo c) throws Exception {
        String sql = "update Vuela set dia='%s',hora=%s,Avion='%s',origen=%s,destino='%s',duracion=%s "
                + "where idCiudad='%s'";
        sql = String.format(sql,c.getIdVuelo(),
                c.getDia(),
                c.getHora(),
                c.getAvion(),
                c.getCiudad(),
                c.getCiudad1(),
                c.getDuracion());
        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Avion no existe");
        }
    }
}
