/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.datos;

import airport_p3.logica.Tiquete;

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
        String sql = "UPDATE Tiquete SET reserva='%s', asiento=%s "+
                     "WHERE idTiquete=%s";
        sql = String.format(sql,Integer.toString(t.getReserva().getIdReserva()),t.getAsiento(),
                Integer.toString(t.getIdTiquete()));
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Tiquete no existe");
        } 
    }
    
    public void delete(Tiquete t) throws Exception{
        String sql = "DELETE Tiquete WHERE idTiquete=%s";
        sql = String.format(sql,Integer.toString(t.getIdTiquete()));
        if(db.executeUpdate(sql) == 0){
            throw new Exception("Tiquete no existe");
        }
    }
    
}
