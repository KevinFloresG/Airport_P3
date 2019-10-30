package airport_p3.Presentation.Ciudad.Edicion;

import airport_p3.Presentation.Pais.Edicion.*;
import airport_p3.logica.Ciudad;
import java.util.Observable;
import java.util.Observer;
import javafx.scene.paint.Color;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import airport_p3.logica.Pais;

/**
 *
 * @author Carlos Naranjo
 *
 */
public class View_Ciudad_Edicion extends javax.swing.JInternalFrame implements Observer {

    public View_Ciudad_Edicion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idCiudad = new javax.swing.JTextField();
        nombreCiudad = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pais = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("EdicionCiudad");
        setMinimumSize(new java.awt.Dimension(361, 215));

        jLabel1.setText("Id de la Ciudad");

        jLabel2.setText(" Pais");

        idCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCiudadActionPerformed(evt);
            }
        });

        nombreCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCiudadActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre de Ciudad");

        pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(modificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Eliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(consultar)
                            .addGap(29, 29, 29)
                            .addComponent(agregar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(idCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(pais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar)
                    .addComponent(Eliminar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        controller.consultar(idCiudad.getText());
    }//GEN-LAST:event_consultarActionPerformed

    private Ciudad toCiudad() {
        Ciudad c = new Ciudad();
        c.setIdCiudad(idCiudad.getText());
        c.setNombre(nombreCiudad.getText());
        c.setPais((Pais) pais.getSelectedItem());
        return c;
    }

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        controller.agregar(this.toCiudad());
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        controller.modificar(this.toCiudad());
    }//GEN-LAST:event_modificarActionPerformed

    private void idCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCiudadActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        controller.eliminar(this.toCiudad());
    }//GEN-LAST:event_EliminarActionPerformed

    private void nombreCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCiudadActionPerformed

    private void paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_Ciudad_Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Ciudad_Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Ciudad_Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Ciudad_Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Ciudad_Edicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField idCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombreCiudad;
    private javax.swing.JComboBox<Pais> pais;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        renderCiudad(model.getCiudad());
    }

    public void renderCiudad(Ciudad c) {
        idCiudad.setText(c.getIdCiudad());
        nombreCiudad.setText(c.getNombre());
        this.pais.setModel(new DefaultComboBoxModel<Pais>(model.getPaises().toArray(new Pais[0])));
        this.pais.setSelectedItem(c.getPais());
    }

    Model_Ciudad_Edicion model;
    Control_Ciudad_Edicion controller;

    public Model_Ciudad_Edicion getModel() {
        return model;
    }

    public void setModel(Model_Ciudad_Edicion model) {
        this.model = model;
        model.addObserver(this);
    }

    public Control_Ciudad_Edicion getController() {
        return controller;
    }

    public void setController(Control_Ciudad_Edicion controller) {
        this.controller = controller;
    }

}
