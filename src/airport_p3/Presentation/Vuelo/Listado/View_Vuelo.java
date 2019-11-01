/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.Presentation.Vuelo.Listado;

import airport_p3.logica.Avion;
import airport_p3.logica.Ciudad;
import airport_p3.logica.Vuelo;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class View_Vuelo  extends javax.swing.JInternalFrame implements Observer {

    /**
     * Creates new form View_Vuelo
     */
    public View_Vuelo() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        LabelNumero = new javax.swing.JLabel();
        LabelOrigen = new javax.swing.JLabel();
        LabelDestino = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVuelo = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        ComboBoxDestino = new javax.swing.JComboBox<>();
        ComboBoxOrigen = new javax.swing.JComboBox<>();
        ComboBoxNumero = new javax.swing.JComboBox<>();
        buscarTodoasBotton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        LabelNumero.setText("Numero.");

        LabelOrigen.setText("Origen.");

        LabelDestino.setText("Destino.");

        TableVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableVuelo);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        buscarTodoasBotton.setText("Buscar Todos");
        buscarTodoasBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTodoasBottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu2.setText("File");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Atras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelOrigen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(LabelDestino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buscarTodoasBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelNumero)
                        .addComponent(LabelDestino)
                        .addComponent(Buscar)
                        .addComponent(ComboBoxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelOrigen)
                        .addComponent(ComboBoxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComboBoxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarTodoasBotton)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try {
          controller.buscar(toVuelo().getAvion(),toVuelo().getCiudad(),toVuelo().getCiudad1());
        } catch (Exception ex) {
            Logger.getLogger(View_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void buscarTodoasBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTodoasBottonActionPerformed
         try {
            controller.MostrarTodos();
        }  catch (Exception ex) {
            Logger.getLogger(View_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
      
        }
           // TODO add your handling code here:
    }//GEN-LAST:event_buscarTodoasBottonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
 private Vuelo toVuelo() {
        Vuelo c = new Vuelo();
        c.setAvion((Avion) ComboBoxNumero.getSelectedItem());
        c.setCiudad((Ciudad) ComboBoxOrigen.getSelectedItem());
        c.setCiudad1((Ciudad) ComboBoxDestino.getSelectedItem()); 
        return c;
    }
    
    
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
            java.util.logging.Logger.getLogger(View_Vuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Vuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Vuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Vuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Vuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<Ciudad> ComboBoxDestino;
    private javax.swing.JComboBox<Avion> ComboBoxNumero;
    private javax.swing.JComboBox<Ciudad> ComboBoxOrigen;
    private javax.swing.JLabel LabelDestino;
    private javax.swing.JLabel LabelNumero;
    private javax.swing.JLabel LabelOrigen;
    private javax.swing.JTable TableVuelo;
    private javax.swing.JButton buscarTodoasBotton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        this.TableVuelo.setModel(new TableModel_Vuelo(model.getVuelosDisponibles()));
        this.TableVuelo.setRowHeight(30);
        renderVuelo(model.getVueloFiltro());
        renderOrigen(model.getVueloFiltro());
        renderDestino(model.getVueloFiltro());
    }

    public void renderVuelo(Vuelo c) {
        this.ComboBoxNumero.setModel(new DefaultComboBoxModel<Avion>(model.getAvionesDisponibles().toArray(new Avion[0])));
        this.ComboBoxNumero.setSelectedItem(c.getAvion());
    }

    public void renderOrigen(Vuelo c) {
        this.ComboBoxOrigen.setModel(new DefaultComboBoxModel<Ciudad>(model.getCiudadesOrigen().toArray(new Ciudad[0])));
        this.ComboBoxOrigen.setSelectedItem(c.getCiudad());
    }

    public void renderDestino(Vuelo c) {
        this.ComboBoxDestino.setModel(new DefaultComboBoxModel<Ciudad>(model.getCiudadesDestino().toArray(new Ciudad[0])));
        this.ComboBoxDestino.setSelectedItem(c.getCiudad1());
    }

    Model_Vuelo model;
    Control_Vuelo controller;

    public Model_Vuelo getModel() {
        return model;
    }

    public void setModel(Model_Vuelo model) {
        this.model = model;
        model.addObserver(this);
    }

    public Control_Vuelo getController() {
        return controller;
    }

    public void setController(Control_Vuelo controller) {
        this.controller = controller;
    }

      public void interruption(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }

 
}
