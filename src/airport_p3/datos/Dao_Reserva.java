
package airport_p3.datos;

import airport_p3.logica.Reserva;
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
    
    
}
