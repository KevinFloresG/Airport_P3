
package airport_p3.datos;

import airport_p3.logica.Reserva;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class Dao_Reserva {
        
    Database_relation db;

    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }

    public Dao_Reserva(Database_relation db) {
        this.db = db;
    }

    public Dao_Reserva() {
        this.db = new Database_relation();
    }

    public void add(Reserva t) throws Exception{
        String sql = "INSERT INTO Reserva(usuario, fechaVuelo, formaPago)"+
                " VALUES('%s','%s','%s')"; 
        sql = String.format(sql,
                t.getUsuario().getIdUsuario(),
                t.getFechavuelo().getIdFechaVuelo(),
                t.getFormapago().getIdFormaPago());
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Reserva ya existente");
        }    
    }
    
    public void update(Reserva t) throws Exception{
        String sql = "UPDATE Reserva SET usuario='%s', fechaVuelo='%s',"+
                " formaPago='%s' WHERE idReserva=%s"; 
        sql = String.format(sql,
                t.getUsuario().getIdUsuario(),
                t.getFechavuelo().getIdFechaVuelo(),
                t.getFormapago().getIdFormaPago(),
                Integer.toString(t.getIdReserva())
        );
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Reserva no existente");
        } 
    }
    
    public void delete(Reserva t) throws Exception{
        String sql = "DELETE FROM Reserva WHERE idReserva=%s";
        sql = String.format(sql,Integer.toString(t.getIdReserva()));
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Reserva no existe");
        }
    }
    
    public Reserva get(int id) throws SQLException, Exception{
        String sql = "SELECT * FROM Reserva where idReserva=%s";
        sql = String.format(sql, Integer.toString(id));
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){
            Dao_FormaPago dao = new Dao_FormaPago();
            Dao_FechaVuelo dao1 = new Dao_FechaVuelo();
            Dao_Usuario dao2 = new Dao_Usuario();
            Reserva r = new Reserva();
            r.setFechavuelo(dao1.get(rs.getString("fechaVuelo")));
            r.setFormapago(dao.get(rs.getString("formaPago")));
            r.setIdReserva(rs.getInt("idReserva"));
            r.setUsuario(dao2.get(rs.getString("usuario")));
            return r;
        }
        else{
            throw new Exception("Reserva no Existe");
        }
    }
    
    public List<Reserva> getAll() throws SQLException, Exception{
        List<Reserva> l = new ArrayList<>();
        String sql = "SELECT * FROM Reserva";
        ResultSet rs = db.executeQuery(sql);
        Dao_FormaPago dao = new Dao_FormaPago();
        Dao_FechaVuelo dao1 = new Dao_FechaVuelo();
        Dao_Usuario dao2 = new Dao_Usuario();
        while(rs.next()){
            Reserva r = new Reserva();
            r.setFechavuelo(dao1.get(rs.getString("fechaVuelo")));
            r.setFormapago(dao.get(rs.getString("formaPago")));
            r.setIdReserva(rs.getInt("idReserva"));
            r.setUsuario(dao2.get(rs.getString("usuario")));           
            l.add(r);
        }
        return l;
    }
    
    public List<Reserva> search(Reserva x) throws SQLException, Exception{
        List<Reserva> l = new ArrayList<>();
        String sql = "SELECT * FROM Reserva where usuario like '%%%s%%'";
        sql = String.format(sql, x.getUsuario().getIdUsuario());
        ResultSet rs = db.executeQuery(sql);
        Dao_FormaPago dao = new Dao_FormaPago();
        Dao_FechaVuelo dao1 = new Dao_FechaVuelo();
        Dao_Usuario dao2 = new Dao_Usuario();
        while(rs.next()){
            Reserva r = new Reserva();
            r.setFechavuelo(dao1.get(rs.getString("fechaVuelo")));
            r.setFormapago(dao.get(rs.getString("formaPago")));
            r.setIdReserva(rs.getInt("idReserva"));
            r.setUsuario(dao2.get(rs.getString("usuario")));           
            l.add(r);
        }
        return l;
    }
    
}
