/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3;

import airport_p3.datos.Database_relation;

/**
 *
 * @author Kevin Flores
 */
public class Airport_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Database_relation r = new Database_relation();
        String x = "insert into FormaPago (idFormaPago, nombre) values('003','edito')";
        System.out.println(r.executeUpdate(x));
    }
    
}
