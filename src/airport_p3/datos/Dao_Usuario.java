package airport_p3.datos;
import airport_p3.logica.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public Usuario get(String id) throws Exception{
        String sql = "SELECT* FROM Usuario WHERE idUsuario='%s'";
        sql = String.format(sql,id);
        ResultSet rs = db.executeQuery(sql);
        if(rs.next()){

            return usuario(rs);
        }
        else{
            throw new Exception("Usuario no existe.");
        }
    }
    
    public List<Usuario> getAll() throws SQLException{
        List<Usuario> l = new ArrayList<>();
        String sql = "SELECT * FROM Usuario";
        sql = String.format(sql);
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            l.add(usuario(rs));
        }
        return l;
    }
    
    public List<Usuario> search(Usuario u) throws SQLException{
        List<Usuario> l = new ArrayList<>();
        String sql = "SELECT * FROM Usuario WHERE nombre like '%%%s%%' "
                    + "and apellido like '%%%s%%' and idUsuario like '%%%s%%'";
        sql = String.format(sql,u.getNombre(),u.getApellido(),u.getIdUsuario());
        ResultSet rs = db.executeQuery(sql);
        while(rs.next()){
            l.add(usuario(rs));
        }
        return l;
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
                p.getFechaNacimientoString(),
                p.getDireccion(),
                Integer.toString(p.getTelefonoTrabajo()),
                Integer.toString(p.getTelefonoCelular()));        
        if (db.executeUpdate(sql) == 0){
            throw new Exception("Usuario ya existe");
        }
    }

    public void update(Usuario p) throws Exception{
        String sql="update Usuario set nombre='%s',contraseña='%s', apellido='%s',correoElectronico='%s'"
                + ", fechaNacimiento='%s' ,direccion='%s', telefonoTrabajo=%s, telefonoCelular=%s"+
                " where idUsuario='%s'";
        sql=String.format(sql,
                p.getNombre(),
                p.getContraseña(),
                p.getApellido(),
                p.getCorreoElectronico(),
                p.getFechaNacimientoString(),
                p.getDireccion(),
                Integer.toString(p.getTelefonoTrabajo()),
                Integer.toString(p.getTelefonoCelular()),
                p.getIdUsuario());   
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
            p.setFechaNacimiento(rs.getDate("fechaNacimiento"));    
            p.setDireccion(rs.getString("direccion"));
            p.setTelefonoTrabajo(rs.getInt("telefonoTrabajo"));
            p.setTelefonoCelular(rs.getInt("telefonoCelular"));    
            return p;
        } catch (SQLException ex) {

            return null;
        }
    }
    
   public  void close(){
    }       
}
