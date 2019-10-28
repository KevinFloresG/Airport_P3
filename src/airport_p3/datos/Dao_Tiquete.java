
package airport_p3.datos;

import airport_p3.logica.Tiquete;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Flores
 */
public class Dao_Tiquete {
    
    private Database_relation db;

    public Dao_Tiquete() {
        this.db = new Database_relation();
    }

    public Dao_Tiquete(Database_relation db) {
        this.db = db;
    }
    
    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }
    
    public void add(Tiquete t) throws Exception{
        String sql = "INSERT INTO Tiquete (asiento,reserva) "+
                     "VALUES('%s',%s)"; 
        sql = String.format(sql,t.getAsiento(),
                Integer.toString(t.getReserva().getIdReserva()));
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Tiquete ya vendido");
        }    
    }
    
    public void update(Tiquete t) throws Exception{
        String sql = "UPDATE Tiquete SET reserva=%s, asiento='%s' "+
                     "WHERE idTiquete=%s";
        sql = String.format(sql,
                Integer.toString(t.getReserva().getIdReserva()),
                t.getAsiento(),
                Integer.toString(t.getIdTiquete()));
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Tiquete no existe");
        } 
    }
    
    public void delete(Tiquete t) throws Exception{
        String sql = "DELETE FROM Tiquete WHERE idTiquete=%s";
        sql = String.format(sql,Integer.toString(t.getIdTiquete()));
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Tiquete no existe");
        }
    }
    
    public Tiquete get(String id) throws SQLException, Exception{
        String sql = "SELECT * FROM Tiquete where id=%s";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){
            Dao_Reserva dao = new Dao_Reserva();
            Tiquete t = new Tiquete();
            t.setAsiento(rs.getString("asiento"));
            t.setIdTiquete(rs.getInt("idTiquete"));
            t.setReserva(dao.get(rs.getInt("reserva")));
            return t;
        }
        else{
            throw new Exception("Tiquete no Existe");
        }
    }
    
    public List<Tiquete> search(Tiquete y) throws SQLException, Exception{
        List<Tiquete> l = new ArrayList<>();
        String sql = "SELECT * FROM Tiquete where reserva like %s";
        sql = String.format(sql, Integer.toString(y.getReserva().getIdReserva()));
        ResultSet rs = db.executeQuery(sql);
        Dao_Reserva dao = new Dao_Reserva();
        while(rs.next()){      
            Tiquete t = new Tiquete();
            t.setAsiento(rs.getString("asiento"));
            t.setIdTiquete(rs.getInt("idTiquete"));
            t.setReserva(dao.get(rs.getInt("reserva")));
            l.add(t);
        }
        return l;
    }
    
    public List<Tiquete> getAll() throws SQLException, Exception{
        List<Tiquete> l = new ArrayList<>();
        String sql = "SELECT * FROM Tiquete";
        ResultSet rs = db.executeQuery(sql);
        Dao_Reserva dao = new Dao_Reserva();
        while(rs.next()){      
            Tiquete t = new Tiquete();
            t.setAsiento(rs.getString("asiento"));
            t.setIdTiquete(rs.getInt("idTiquete"));
            t.setReserva(dao.get(rs.getInt("reserva")));
            l.add(t);
        }
        return l;
    }
}
