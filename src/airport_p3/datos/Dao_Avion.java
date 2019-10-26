
package airport_p3.datos;

import airport_p3.logica.Avion;
import airport_p3.logica.Tipoavion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author carlos
 * 
 */
public class Dao_Avion {
    
    Database_relation db;

    public Dao_Avion() {
        db = new Database_relation();
    }

    public Dao_Avion(Database_relation db) {
        this.db = db;
    }

    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }
    

    public void delete(Avion p) throws Exception {
        String sql = "delete from Avion where idAvion='%s'";
        sql = String.format(sql, p.getIdAvion());
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Avion no existe");
        }
    }

    public void add(Avion p) throws Exception {
        String sql = "insert into Avion (idAvion, tipoAvion) "
                + "values('%s','%s')";
        sql = String.format(sql, p.getIdAvion(), p.getTipoavion().getIdTipoAvion());
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Avion ya existe");
        }
    }

    public void update(Avion p) throws Exception {
        String sql = "update Avion set tipoAvion='%s'"
                + "where idAvion='%s'";
        sql = String.format(sql,p.getTipoavion().getIdTipoAvion(),p.getIdAvion());

        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Avion no existe");
        }
    }
    
    public Avion get(String id) throws SQLException, Exception{
        String sql="SELECT * FROM Avion WHERE idAvion='%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){
            Avion a = new Avion();
            Dao_TipoAvion dao = new Dao_TipoAvion(); // con esto sirve pero hay que hacer un singleton 
                                                     // de todos los daos mejor...
            a.setIdAvion(rs.getString("idAvion"));
            a.setTipoavion(dao.get(rs.getString("tipoAvion")));
            return a;
        }
        else{
            throw new Exception("Avion no existe");
        }
    
    }


}
