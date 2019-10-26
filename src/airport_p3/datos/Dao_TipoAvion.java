package airport_p3.datos;

import airport_p3.logica.Tipoavion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class Dao_TipoAvion {
    
    Database_relation db;

    public Dao_TipoAvion() {
        db = new Database_relation();
    }

    public Dao_TipoAvion(Database_relation db) {
        this.db = db;
    }

    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }
    
    public void delete(Tipoavion ta) throws Exception {
        String sql = "delete from TipoAvion where idTipoAvion='%s'";
        sql = String.format(sql, ta.getIdTipoAvion());
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Tipo de avion no existe");
        }
    }

    public void add(Tipoavion ta) throws Exception {
        String sql = "insert into TipoAvion (idTipoAvion, mondelo,cantidadAsientos,cantidadFilas,cantidadColumnas) "
                + "values('%s','%s',%s,%s,%s)";
        sql = String.format(sql, ta.getIdTipoAvion(), ta.getMondelo(),Integer.toString(ta.getCantidadAsientos()),
                Integer.toString(ta.getCantidadFilas()),Integer.toString(ta.getCantidadColumnas())); 
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Tipo Avion ya existe");
        }
    }

    public void update(Tipoavion ta) throws Exception {
        String sql = "update TipoAvion set mondelo='%s',cantidadAsientos=%s,cantidadFilas=%s,cantidadColumnas=%s"
                + " where idTipoAvion='%s'";
        sql = String.format(sql, ta.getMondelo(),Integer.toString(ta.getCantidadAsientos()), 
                Integer.toString(ta.getCantidadFilas()),Integer.toString(ta.getCantidadColumnas()),ta.getIdTipoAvion());
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Tipo de avion no existe");
        }
    }
    
    public Tipoavion get(String id) throws SQLException, Exception{
        String sql = "SELECT * FROM TipoAvion WHERE idTipoAvion='%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){
            Tipoavion t = new Tipoavion();
            t.setCantidadAsientos(rs.getInt("cantidadAsientos"));
            t.setIdTipoAvion(rs.getString("idTipoAvion"));
            t.setCantidadColumnas(rs.getInt("cantidadColumnas"));
            t.setCantidadFilas(rs.getInt("cantidadFilas"));
            t.setMondelo(rs.getString("mondelo"));
            return t;
        }
        else{
            throw new Exception("Tipo de avion no existe");
        }
    }
    
    public List<Tipoavion> getAll() throws SQLException{
        List<Tipoavion> l = new ArrayList<>();
        String sql = "SELECT * FROM TipoAvion";
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            Tipoavion t = new Tipoavion();
            t.setCantidadAsientos(rs.getInt("cantidadAsientos"));
            t.setIdTipoAvion(rs.getString("idTipoAvion"));
            t.setCantidadColumnas(rs.getInt("cantidadColumnas"));
            t.setCantidadFilas(rs.getInt("cantidadFilas"));
            t.setMondelo(rs.getString("mondelo"));
            l.add(t);
        }
        return l;
    }
    
    public List<Tipoavion> search(Tipoavion t) throws SQLException{
        List<Tipoavion> l = new ArrayList<>();
        String sql="select * from TipoAvion where mondelo like '%%%s%%' and idTipoAvion like '%%%s%%'";
        sql = String.format(sql, 
                t.getMondelo(),
                t.getIdTipoAvion());
        ResultSet rs = db.executeQuery(sql);
        if(rs != null){
            while(rs.next()){
                Tipoavion x = new Tipoavion();
                x.setCantidadAsientos(rs.getInt("cantidadAsientos"));
                x.setIdTipoAvion(rs.getString("idTipoAvion"));
                x.setCantidadColumnas(rs.getInt("cantidadColumnas"));
                x.setCantidadFilas(rs.getInt("cantidadFilas"));
                x.setMondelo(rs.getString("mondelo"));
                l.add(x);
            }
        }
        return l;
    }
    
}

