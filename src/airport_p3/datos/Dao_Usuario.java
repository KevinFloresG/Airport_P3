package airport_p3.datos;
import airport_p3.logica.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Dao_Usuario {    
        Database_relation db;

    public Dao_Usuario(Database_relation db) {
        this.db = db;
    }

    public Dao_Usuario() {
        this.db = new Database_relation();
    }
               
    public Database_relation getDb() {
        return db;
    }

    public void setDb(Database_relation db) {
        this.db = db;
    }
         
    public void delete(Usuario p) throws Exception{
        String sql="DELETE from Usuario WHERE idUsuario='%s'";
        sql = String.format(sql, p.getIdUsuario());
        if (db.executeUpdate(sql) == 0){
            throw new Exception("Usuario no existe");
        }
    }
    
    public void add(Usuario p) throws Exception{
        String sql="INSERT INTO Usuario (idUsuario,"
                + " nombre, contraseña, apellido,correoElectronico,"
                + "fechaNacimiento,direccion,telefonoTrabajo,telefonoCelular) "+
                "VALUES('%s','%s','%s','%s','%s','%s','%s',%s,%s)";
        sql=String.format(sql,
                p.getIdUsuario(),
                p.getNombre(),
                p.getContraseña(),
                p.getApellido(),
                p.getCorreoElectronico(),
                p.getFechaNacimientoString(),/*OJO COMO HACER DE TIPO DATE*/
                p.getDireccion(),
                Integer.toString(p.getTelefonoTrabajo()),
                Integer.toString(p.getTelefonoCelular()));        
        if (db.executeUpdate(sql) == 0){
            throw new Exception("Usuario ya existe");
        }
    }

    public void update(Usuario p) throws Exception{
        String sql="update Usuario set nombre='%s',contraseña='%s', apellido='%s'"
                + ",correoElectronico='%s', fechaNacimiento='%s' ,direccion='%s', telefonoCelular='%s'"+
                "where idUsuario='%s'";
        sql=String.format(sql,p.getIdUsuario(),
                p.getNombre(),
                p.getContraseña(),
                p.getApellido(),
                p.getCorreoElectronico(),
                p.getFechaNacimiento(),/*OJO COMO HACER DE TIPO DATE*/
                p.getDireccion(),
                p.getTelefonoCelular());
        if (db.executeUpdate(sql) == 0){
            throw new Exception("Usuario no existe");
        }
    }

    private Usuario usuario(ResultSet rs){
        try {
            Usuario p= new Usuario();
            
            p.setIdUsuario(rs.getString("idUsuario"));
            p.setNombre(rs.getString("nombre"));
            p.setContraseña(rs.getString("contraseña"));
            p.setApellido(rs.getString("apellido"));            
            p.setCorreoElectronico(rs.getString("correoElectronico"));
            p.setFechaNacimiento(rs.getDate("fechaNacimiento"));    //OJO
            p.setDireccion(rs.getString("direccion"));
            p.setTelefonoCelular(rs.getByte("telefonoCelular"));    //OJO
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }
    
   public  void close(){
    }    
    
    
}
