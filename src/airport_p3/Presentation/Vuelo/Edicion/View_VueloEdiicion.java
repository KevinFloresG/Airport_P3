/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Vuelo.Edicion;

import airport_p3.Presentation.Vuelo.Listado.TableModel_Vuelo;
import airport_p3.Presentation.Vuelo.Listado.View_Vuelo;
import airport_p3.logica.Avion;
import airport_p3.logica.Ciudad;
import airport_p3.logica.Vuelo;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Daniel
 */
public class View_VueloEdiicion extends javax.swing.JInternalFrame implements Observer {

    /**
     * Creates new form View_VueloEdicion
     */
    public View_VueloEdiicion() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    private Vuelo toVuelo() throws ParseException {
        Vuelo c = new Vuelo();
        c.setIdVuelo(TextFieldID.getText());
        c.setDia(TextFieldDia.getText());
        c.setHora(ParseFecha(TextFieldHora.getText()));
        c.setAvion((Avion) ComboBoxAvion.getSelectedItem());
        c.setCiudad((Ciudad) ComboBoxOrigen.getSelectedItem());
        c.setCiudad1((Ciudad) ComboBoxDestino.getSelectedItem());
        c.setDuracion(ParseFecha2(TextFieldDuracion.getText()));
        return c;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel7 = new javax.swing.JLabel();
        TextFieldDuracion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ButtonModficiar = new javax.swing.JButton();
        TextFieldID = new javax.swing.JTextField();
        ButtonConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ButtonEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ButtonModifica = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxAvion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxDestino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxOrigen = new javax.swing.JComboBox<>();
        TextFieldDia = new javax.swing.JTextField();
        TextFieldHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel7.setText("Duracion");

        TextFieldDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDuracionActionPerformed(evt);
            }
        });

        ButtonModficiar.setText("Modficiar");
        ButtonModficiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModficiarActionPerformed(evt);
            }
        });

        TextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIDActionPerformed(evt);
            }
        });

        ButtonConsultar.setText("Consultar(ID)");
        ButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Dia");

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Hora (HH:mm:ss)");

        ButtonModifica.setText("Agregar");
        ButtonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificaActionPerformed(evt);
            }
        });

        jLabel4.setText("Avion");

        ComboBoxAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAvionActionPerformed(evt);
            }
        });

        jLabel5.setText("Origen");

        ComboBoxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDestinoActionPerformed(evt);
            }
        });

        jLabel6.setText("Destino");

        jLabel1.setText("Id delvuelo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextFieldDia)
                    .addComponent(TextFieldID)
                    .addComponent(TextFieldHora)
                    .addComponent(ComboBoxAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxDestino, javax.swing.GroupLayout.Alignment.TRAILING, 0, 128, Short.MAX_VALUE)
                    .addComponent(ComboBoxOrigen, 0, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonModficiar)
                    .addComponent(ButtonModifica)
                    .addComponent(ButtonEliminar)
                    .addComponent(ButtonConsultar))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEliminar))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ButtonConsultar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonModficiar)
                        .addComponent(ComboBoxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ButtonModifica)
                    .addComponent(ComboBoxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu4.setText("Salir");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem1.setText("Atras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(61, 61, 61)
                .addComponent(TextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAvionActionPerformed

    private void ComboBoxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDestinoActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        try {
            controller.eliminar(this.toVuelo());        // TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(View_VueloEdiicion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonModficiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModficiarActionPerformed
        try {
            controller.modificar(this.toVuelo());        // TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(View_VueloEdiicion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonModficiarActionPerformed

    private void ButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificaActionPerformed
        try {
            controller.agregar(this.toVuelo());        // TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(View_VueloEdiicion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonModificaActionPerformed

    private void ButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarActionPerformed
        try {
            controller.consultar(toVuelo().getIdVuelo());
        } catch (Exception ex) {
            Logger.getLogger(View_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:     // TODO add your handling code here:
    }//GEN-LAST:event_ButtonConsultarActionPerformed

    private void TextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void TextFieldDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDuracionActionPerformed

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
            java.util.logging.Logger.getLogger(View_VueloEdiicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_VueloEdiicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_VueloEdiicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_VueloEdiicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_VueloEdiicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConsultar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonModficiar;
    private javax.swing.JButton ButtonModifica;
    private javax.swing.JComboBox<Avion> ComboBoxAvion;
    private javax.swing.JComboBox<Ciudad> ComboBoxDestino;
    private javax.swing.JComboBox<Ciudad> ComboBoxOrigen;
    private javax.swing.JTextField TextFieldDia;
    private javax.swing.JTextField TextFieldDuracion;
    private javax.swing.JTextField TextFieldHora;
    private javax.swing.JTextField TextFieldID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    Model_VueloEdicion model;
    Control_VueloEdcion controller;

    @Override
    public void update(Observable o, Object o1) {
        renderAvion(model.getVuelo());
        renderOrigen(model.getVuelo());
        renderDestino(model.getVuelo());
        renderVuelo(model.getVuelo());
    }

    public void renderVuelo(Vuelo c) {
        TextFieldID.setText(c.getIdVuelo());
        TextFieldDia.setText(c.getDia());
//        TextFieldHora.setText(c.getHoraString());
//        this.jComboBox1.setModel(new DefaultComboBoxModel<Avion>(model.getAvionesDisponibles().toArray(new Avion[0])));
//        this.jComboBox1.setSelectedItem(c.getAvion());
//        this.jComboBox3.setModel(new DefaultComboBoxModel<Ciudad>(model.getCiudadesOrigen().toArray(new Ciudad[0])));
//        this.jComboBox3.setSelectedItem(c.getCiudad());
//        this.jComboBox2.setModel(new DefaultComboBoxModel<Ciudad>(model.getCiudadesDestino().toArray(new Ciudad[0])));
//        this.jComboBox2.setSelectedItem(c.getCiudad1());
//        TextFieldDuracion.setText(c.getDuracionString());
    }

    public void renderAvion(Vuelo c) {
        this.ComboBoxAvion.setModel(new DefaultComboBoxModel<Avion>(model.getAvionesDisponibles().toArray(new Avion[0])));
        this.ComboBoxAvion.setSelectedItem(c.getAvion());
    }

    public void renderOrigen(Vuelo c) {
        this.ComboBoxOrigen.setModel(new DefaultComboBoxModel<Ciudad>(model.getCiudadesOrigen().toArray(new Ciudad[0])));
        this.ComboBoxOrigen.setSelectedItem(c.getCiudad());
    }

    public void renderDestino(Vuelo c) {
        this.ComboBoxDestino.setModel(new DefaultComboBoxModel<Ciudad>(model.getCiudadesDestino().toArray(new Ciudad[0])));
        this.ComboBoxDestino.setSelectedItem(c.getCiudad1());
    }

    public Model_VueloEdicion getModel() {
        return model;
    }

    public void setModel(Model_VueloEdicion model) {
        this.model = model;
        model.addObserver(this);
    }

    public Control_VueloEdcion getController() {
        return controller;
    }

    public void setController(Control_VueloEdcion controller) {
        this.controller = controller;
    }
    public static Date ParseFecha2(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
}
