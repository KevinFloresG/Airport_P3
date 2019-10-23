package airport_p3.datos;

import airport_p3.logica.Pais;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */

public class Dao_Pais {

    Database_relation db;

    public Dao_Pais() {
        db = new Database_relation();
    }

    public Dao_Pais(Database_relation db) {
        this.db = db;
    }

    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }
    
    public Pais get(String id) throws Exception {
        String sql = "select * "
                + "from Pais p "
                + "where p.idPais='%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        if (rs.next()) {
            return pais(rs);
        } else {
            throw new Exception("País no Existe");
        }
    }

    public void delete(Pais p) throws Exception {
        String sql = "delete from Pais where id='%s'";
        sql = String.format(sql, p.getIdPais());
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("País no existe");
        }
    }

    public void add(Pais p) throws Exception {
        String sql = "insert into Pais (idPais, nombre) "
                + "values('%s','%s')";
        sql = String.format(sql, p.getIdPais(), p.getNombre());
        
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("País ya existe");
        }
    }

    public void update(Pais p) throws Exception {
        String sql = "update Pais set nombre='%s'"
                + "where idPais='%s'";
        sql = String.format(sql, p.getNombre(), p.getIdPais());

        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("País no existe");
        }
    }


    private Pais pais(ResultSet rs) {
        try {
            Pais p = new Pais();
            p.setIdPais(rs.getString("idPais"));
            p.setNombre(rs.getString("nombre"));
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }

    public void close() {
    }
}
