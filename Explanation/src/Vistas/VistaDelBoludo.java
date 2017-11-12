/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.GestorProducto;
import Model.GestorTipo;
import Model.Producto;
import Model.TipoProducto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VistaDelBoludo extends javax.swing.JFrame {

    /**
     * Creates new form VistaDelBoludo
     */
    int y = -1;
    GestorProducto gp = new GestorProducto();
    GestorTipo gt = new GestorTipo();

    public VistaDelBoludo() {
        initComponents();
        cargarComboTipo();
    }

    VistaDelBoludo(int x) {

        initComponents();
        cargarComboTipo();
        y = x;
        gp = new GestorProducto();
        Producto p = gp.obtenerProducto(y);
        txtCodigo.setText("" + p.getCodigoProducto());
        txtNombre.setText("" + p.getNombre());
        txtPrecio.setText("" + p.getPrecio());
        TipoProducto tp = new TipoProducto();
        gt = new GestorTipo();
        ArrayList<TipoProducto> tipos = gt.obtenerTodosTipos();
        for (TipoProducto tipo : tipos) {
            if (tipo.getCodigoTipo() == p.getTipoProducto()) {
                cmbTipo.setSelectedIndex(tipos.indexOf(tipo));
            }
        }
        chkDevolucion.setSelected(p.isDevolucion());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        chkDevolucion = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Tipo");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        chkDevolucion.setText("Acepta Devolución");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(chkDevolucion)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(73, 73, 73)
                        .addComponent(btnConsulta)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkDevolucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnConsulta))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (valido()) {
            Producto p = new Producto();
            p.setCodigoProducto(Integer.parseInt(txtCodigo.getText()));
            p.setNombre(txtNombre.getText());
            p.setPrecio(Double.parseDouble(txtPrecio.getText()));
            p.setTipoProducto(((TipoProducto) cmbTipo.getSelectedItem()).getCodigoTipo());
            p.setDevolucion(chkDevolucion.isSelected());
            if (y == -1) {
                gp = new GestorProducto();
                gp.agregarProducto(p);
                JOptionPane.showMessageDialog(null, "Se ha insertado un nuevo registro");
            } else {
                gp = new GestorProducto();
                gp.modificarProducto(p);
                JOptionPane.showMessageDialog(null, "Se ha modificado el registro correctamente");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        VistaDelSalame ventana = new VistaDelSalame();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaDelBoludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDelBoludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDelBoludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDelBoludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDelBoludo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkDevolucion;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void cargarComboTipo() {
        gt = new GestorTipo();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (TipoProducto obtenerTodosTipo : gt.obtenerTodosTipos()) {
            model.addElement(obtenerTodosTipo);
        }
        cmbTipo.setModel(model);
    }

    private boolean valido() {

        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo código no puede estar vacío");
            return false;
        }
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo nombre no puede estar vacío");
            return false;
        }
        if (txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo precio no puede estar vacío");
            return false;
        }
        if (cmbTipo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar algo");
            return false;
        }
        try {
            Integer.parseInt(txtCodigo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Como te vas a equivocar boludo!!!");
            return false;
        }
        try {
            Double.parseDouble(txtPrecio.getText());
            if (Double.parseDouble(txtPrecio.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "El campo precio debe ser un número positivo");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Como te vas a equivocar boludasoo!!!");
            return false;
        }
        return true;
    }
}
