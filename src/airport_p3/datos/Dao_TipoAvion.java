package airport_p3.datos;

import airport_p3.logica.Tipoavion;

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
    
}

