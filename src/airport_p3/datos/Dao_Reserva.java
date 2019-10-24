package airport_p3.datos;
import airport_p3.logica.Reserva;
import java.util.logging.Logger;
/**
 *
 * @author Daniel
 */
public class Dao_Reserva {
        
    Database_relation db;
    private static final Logger LOG = Logger.getLogger(Dao_Reserva.class.getName());

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
    }

        public void add(Reserva t) throws Exception{
        String sql = "INSERT INTO Reserva (idReserva,asiento,reserva) "+
                     "VALUES(%s,'%s',%s)"; 
        sql = String.format(sql,Integer.toString(t.getIdReserva()),t.getUsuario(),t.getFormapago());
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Reserva ya existente");
        }    
    }
    
    public void update(Reserva t) throws Exception{
        String sql = "UPDATE Reserva SET reserva='%s', asiento=%s "+
                     "WHERE idReserva=%s";
        sql = String.format(sql,Integer.toString(t.getIdReserva()),t.getIdReserva(),t.getUsuario(),t.getFormapago());
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Reserva no existe");
        } 
    }
    
    public void delete(Reserva t) throws Exception{
        String sql = "DELETE Reserva WHERE idReserva=%s";
        sql = String.format(sql,Integer.toString(t.getIdReserva()));
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Reserva no existe");
        }
    }
    
    
}
