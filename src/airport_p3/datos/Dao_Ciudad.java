/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.datos;

import airport_p3.logica.Ciudad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */

public class Dao_Ciudad {
        
    Database_relation db;

    public Dao_Ciudad() {
        db = new Database_relation();
    }

    public Dao_Ciudad(Database_relation db) {
        this.db = db;
    }

    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }
    

    public void delete(Ciudad c) throws Exception {
        String sql = "delete from Ciudad where idCiudad='%s'";
        sql = String.format(sql, c.getIdCiudad());
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Ciudad no existe");
        }
    }

    public void add(Ciudad c) throws Exception {
        String sql = "insert into Ciudad (idCiudad, pais,nombre) "
                + "values('%s','%s','%s')";
        sql = String.format(sql, c.getIdCiudad(), c.getPais().getIdPais(),c.getNombre());
        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Ciudad ya existe");
        }
    }

    public void update(Ciudad c) throws Exception {
        String sql = "update Ciudad set pais='%s',nombre='%s' "
                + "where idCiudad='%s'";
        sql = String.format(sql,c.getPais().getIdPais(),c.getNombre(),c.getIdCiudad());

        int count = db.executeUpdate(sql);
        if (count == 0) {
            throw new Exception("Avion no existe");
        }
    }
    
    public Ciudad get(String id) throws SQLException, Exception{
        String sql="SELECT * FROM Ciudad WHERE idCiudad='%s'";
        sql = String.format(sql, id);
        Dao_Pais dao = new Dao_Pais(); 
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){
            Ciudad a = new Ciudad();
            a.setIdCiudad(rs.getString("idCiudad"));
            a.setNombre(rs.getString("nombre"));
            a.setPais(dao.get(rs.getString("pais")));
            return a;
        }
        else{
            throw new Exception("Ciudad no existe");
        }
    }
    
    public List<Ciudad> getAll() throws SQLException, Exception{
        List<Ciudad> l = new ArrayList<>();
        String sql = "SELECT * FROM Ciudad";
        Dao_Pais dao = new Dao_Pais();
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            Ciudad a = new Ciudad();
            a.setIdCiudad(rs.getString("idCiudad"));
            a.setNombre(rs.getString("nombre"));
            a.setPais(dao.get(rs.getString("pais")));
            l.add(a);
        }
        return l;
    }
    
    public List<Ciudad> search(Ciudad c) throws SQLException, Exception{
        List<Ciudad> l = new ArrayList<>();
        Dao_Pais dao = new Dao_Pais();
        String sql = "SELECT * FROM Ciudad where idCiudad like '%%%s%%' and "+
                "nombre like '%%%s%%'";
        sql = String.format(sql, c.getIdCiudad(), c.getNombre());
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            Ciudad a = new Ciudad();
            a.setIdCiudad(rs.getString("idCiudad"));
            a.setNombre(rs.getString("nombre"));
            a.setPais(dao.get(rs.getString("pais")));
            l.add(a);
        }
        return l;  
    }

    
}
