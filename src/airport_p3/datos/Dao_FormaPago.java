package airport_p3.datos;

import airport_p3.logica.Formapago;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 * 
 */

 
public class Dao_FormaPago {
    
    Database_relation db;
    
    public Dao_FormaPago(){
        db= new Database_relation();
    }

    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }

    public Dao_FormaPago(Database_relation db) {
        this.db = db;
    }
    
    public void delete(Formapago p) throws Exception{
        String sql="delete from FormaPago where idFormaPago='%s'";
        sql = String.format(sql,p.getIdFormaPago());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Forma de pago no existente");
        }
    }

    public void add(Formapago p) throws Exception{
        String sql="insert into FormaPago (idFormaPago, nombre) "+
                "values('%s','%s')";
        sql=String.format(sql,p.getIdFormaPago(),p.getNombre());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Forma de pago ya existente");
        }
    }

    public void update(Formapago p) throws Exception{
        String sql="update FormaPago set nombre='%s' "+
                "where idFormaPago='%s'";
        sql=String.format(sql,p.getNombre(), p.getIdFormaPago());
        
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Forma de pago no existente");
        }
    }
    
    public List<Formapago> search(Formapago f) throws SQLException{
        List<Formapago> resultado = new ArrayList<>();
        String sql="select * "+
                "from FormaPago p "+
                "where p.nombre like '%%%s%%'";
        sql=String.format(sql,f.getNombre());
        ResultSet rs =  db.executeQuery(sql);
        while (rs.next()) {
            resultado.add(formapago(rs));
        }
        return resultado;
    }
    
    public Formapago get(String id) throws SQLException, Exception{
        String sql = "SELECT * FROM formapago WHERE idFormaPago='%s'";
        sql = String.format(sql, id);
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){
            return formapago(rs);
        }
        else{
            throw new Exception("Forma de pago no existe");
        }    
    }
    
    public List<Formapago> getAll() throws SQLException{
        List<Formapago> l = new ArrayList<>();
        String sql = "SELECT * FROM formapago";
        sql = String.format(sql);
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            l.add(formapago(rs));
        }
        return l;
    }
    
    private Formapago formapago(ResultSet rs){
        try {
            Formapago p= new Formapago();
            p.setIdFormaPago(rs.getString("idFormaPago"));
            p.setNombre(rs.getString("nombre"));
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }

   public  void close(){
    }
}

