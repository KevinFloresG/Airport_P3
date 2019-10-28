
package airport_p3.datos;

import airport_p3.logica.Fechavuelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Flores
 * 
 */
public class Dao_FechaVuelo {
    
    private Database_relation db;

    public Dao_FechaVuelo() {
        this.db = new Database_relation();
    }

    public Dao_FechaVuelo(Database_relation db) {
        this.db = db;
    }
    
    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }
    
    public void add(Fechavuelo t) throws Exception{
        String sql = "INSERT INTO FechaVuelo "+
                     "VALUES('%s','%s','%s',%s,%s)"; 
        sql = String.format(sql,
                t.getIdFechaVuelo(),
                t.getVuelo().getIdVuelo(),
                t.getFechaString(),
                Integer.toString(t.getDisponibles()),
                Double.toString(t.getPrecio())
                );
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Fecha Vuelo ya Existe");
        }    
    }
 
    public void update(Fechavuelo t) throws Exception{
        String sql = "UPDATE FechaVuelo SET vuelo='%s', fecha='%s', disponibles=%s, "+
                     "precio=%s WHERE idFechaVuelo='%s'";
        sql = String.format(sql,
                t.getVuelo().getIdVuelo(),
                t.getFechaString(),
                Integer.toString(t.getDisponibles()),
                Double.toString(t.getPrecio()),
                t.getIdFechaVuelo()
                );
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Fecha Vuelo no existe");
        } 
    }
    
    public void delete(Fechavuelo t) throws Exception{
        String sql = "DELETE FROM FechaVuelo WHERE idFechaVuelo='%s'";
        sql = String.format(sql,t.getIdFechaVuelo());
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Fecha Vuelo no existe");
        }
    }
    
    public Fechavuelo get(String id) throws SQLException, Exception{
        String sql = "SELECT * FROM FechaVuelo where idFechaVuelo='%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        Dao_Vuelo dao = new Dao_Vuelo();
        if(rs.next()){
            Fechavuelo f = new Fechavuelo();
            f.setIdFechaVuelo(rs.getString("idFechaVuelo"));
            f.setFecha(rs.getDate("fecha"));
            f.setPrecio(rs.getDouble("precio"));
            f.setVuelo(dao.get(rs.getString("vuelo")));
            f.setDisponibles(rs.getInt("disponibles"));
            return f;
        }
        else{
            throw new Exception("Vuelo no Exite");
        }
    }
    
    public List<Fechavuelo> getAll() throws SQLException, Exception {
        List<Fechavuelo> l = new ArrayList<>();
        String sql = "SELECT * FROM Fechavuelo";
        Dao_Vuelo dao = new Dao_Vuelo();
        ResultSet rs = db.executeQuery(sql);
        while (rs.next()) {
            Fechavuelo t = new Fechavuelo();
            t.setIdFechaVuelo(rs.getString("idFechavuelo"));
            t.setVuelo(dao.get(rs.getString("vuelo")));
            t.setFecha(rs.getDate("fecha"));
            t.setDisponibles(rs.getInt("disponibles"));
            t.setPrecio(rs.getDouble("precio"));
            l.add(t);
        }
        return l;
    }

    public List<Fechavuelo> search(Fechavuelo t) throws SQLException, Exception {
        List<Fechavuelo> l = new ArrayList<>();
        Dao_Vuelo dao = new Dao_Vuelo();
        String sql = "select * from Fechavuelo where idFechaVuelo like '%%%s%%' "
                    + "and vuelo like '%%%s%%'"
                    + "and fecha like '%%%s%%'";
        sql = String.format(sql,
                    t.getIdFechaVuelo(),
                    t.getVuelo().getIdVuelo(),
                    t.getFechaString()
                    );
        ResultSet rs = db.executeQuery(sql);
        while (rs.next()) {
            Fechavuelo u = new Fechavuelo();
            u.setIdFechaVuelo(rs.getString("idFechavuelo"));
            u.setVuelo(dao.get(rs.getString("vuelo")));
            u.setFecha(rs.getDate("fecha"));
            u.setDisponibles(rs.getInt("disponibles"));
            u.setPrecio(rs.getDouble("precio"));
            l.add(u);
        }
        return l;
    }
}
