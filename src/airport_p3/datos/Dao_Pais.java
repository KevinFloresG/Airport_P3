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
    
    public void delete(Pais p) throws Exception {
        String sql = "delete from Pais where idPais='%s'";
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
    
    public Pais get(String id) throws Exception{
        String sql = "SELECT * FROM Pais  WHERE idPais='%s'";
        sql = String.format(sql,id);
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){
            Pais pais = new Pais();
            pais.setIdPais(rs.getString("idPais"));
            pais.setNombre(rs.getString("nombre"));
            return pais;
        }
        else{
            throw new Exception("Pais no existe");
        }
        
    }
    
    public List<Pais> getAll() throws SQLException{
        List<Pais> l =  new ArrayList<>();
        String sql = "SELECT * FROM Pais";
        sql = String.format(sql);
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            Pais pais = new Pais();
            pais.setIdPais(rs.getString("idPais"));
            pais.setNombre(rs.getString("nombre"));
            l.add(pais);
        }
    
        return l;
    }
    
    public List<Pais> search(Pais p) throws SQLException{
        List<Pais> l =  new ArrayList<>();
        String sql = "SELECT * FROM Pais WHERE nombre like '%%%s%%'";
        sql = String.format(sql,p.getNombre());
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            Pais pais = new Pais();
            pais.setIdPais(rs.getString("idPais"));
            pais.setNombre(rs.getString("nombre"));
            l.add(pais);
        }
    
        return l;
    }
}
