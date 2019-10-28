
package airport_p3.datos;

import airport_p3.logica.Vuelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        this.db = new Database_relation();
    }

    public Dao_Vuelo(Database_relation db) {
        this.db = db;
    }
    
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
                + "values('%s','%s','%s','%s','%s','%s','%s')";
        sql = String.format(sql,
                c.getIdVuelo(),
                c.getDia(),
                c.getHoraString(),
                c.getAvion().getIdAvion(),
                c.getCiudad().getIdCiudad(),
                c.getCiudad1().getIdCiudad(),
                c.getDuracionString()
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
        String sql = "update Vuelo set dia='%s',hora='%s',Avion='%s',origen='%s',destino='%s',duracion='%s' "
                + "where idVuelo='%s'";
        sql = String.format(sql,
                c.getDia(),
                c.getHoraString(),
                c.getAvion().getIdAvion(),
                c.getCiudad().getIdCiudad(),
                c.getCiudad1().getIdCiudad(),
                c.getDuracionString(),
                c.getIdVuelo());
        if (db.executeUpdate(sql) == 0) {
            throw new Exception("Vuelo no existe");
        }
    }
    
    public Vuelo get(String id) throws SQLException, Exception{
        String sql = "SELECT * FROM Vuelo WHERE idVuelo='%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        Dao_Avion dao = new Dao_Avion();
        Dao_Ciudad dao2 = new Dao_Ciudad();
        if (rs.next()) {
            Vuelo t = new Vuelo();
            t.setIdVuelo(rs.getString("idVuelo"));
            t.setDia(rs.getString("dia"));
            t.setAvion(dao.get(rs.getString("avion")));
            t.setCiudad(dao2.get(rs.getString("origen")));
            t.setCiudad1(dao2.get(rs.getString("destino")));
            t.setDuracion(rs.getTime("duracion"));
            t.setHora(rs.getTime("hora"));
            return t;
        } else {
            throw new Exception("Tipo de avion no existe");
        }
    }

    public List<Vuelo> getAll() throws Exception {
        List<Vuelo> l = new ArrayList<>();
        Dao_Avion dao = new Dao_Avion();
        Dao_Ciudad dao2 = new Dao_Ciudad();
        try {
            String sql = "SELECT * FROM Vuelo";
            sql = String.format(sql);
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                Vuelo u = new Vuelo();
                u.setIdVuelo(rs.getString("idVuelo"));
                u.setDia(rs.getString("dia"));
                u.setAvion(dao.get(rs.getString("avion")));
                u.setCiudad(dao2.get(rs.getString("origen")));
                u.setCiudad1(dao2.get(rs.getString("destino")));
                u.setDuracion(rs.getTime("duracion"));
                u.setHora(rs.getTime("hora"));
                l.add(u);
            }
        } catch (SQLException ex) {
        }
        return l;
    }

    public List<Vuelo> search(Vuelo u) throws Exception {
        List<Vuelo> l = new ArrayList<>();
        Dao_Avion dao = new Dao_Avion();
        Dao_Ciudad dao2 = new Dao_Ciudad();
        try {
            String sql = "SELECT * FROM Vuelo WHERE idVuelo like '%%%s%%' "
                    + "and dia like '%%%s%%' and origen like '%%%s%%'"
                    + "and destino like '%%%s%%'";
            sql = String.format(sql,
                    u.getIdVuelo(),
                    u.getDia(),
                    u.getCiudad().getIdCiudad(),
                    u.getCiudad1().getIdCiudad());
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                Vuelo t = new Vuelo();
                t.setIdVuelo(rs.getString("idVuelo"));
                t.setDia(rs.getString("dia"));
                t.setAvion(dao.get(rs.getString("avion")));
                t.setCiudad(dao2.get(rs.getString("origen")));
                t.setCiudad1(dao2.get(rs.getString("destino")));
                t.setDuracion(rs.getTime("duracion"));
                t.setHora(rs.getTime("hora"));
                l.add(t);
            }
        } catch (SQLException ex) {
            throw new Exception("Error SQL");
        }
        return l;
    }
}
