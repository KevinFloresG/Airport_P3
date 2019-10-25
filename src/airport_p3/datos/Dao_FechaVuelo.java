
package airport_p3.datos;

import airport_p3.logica.Fechavuelo;

/**
 *
 * @author Kevin Flores
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
}
