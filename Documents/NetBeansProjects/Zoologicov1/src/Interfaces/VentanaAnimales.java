/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Objetos.Animal;
import Objetos.Aves;
import Objetos.Mamiferos;
import Objetos.Reptiles;
import Utilidades.EstilosUtil;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import Utilidades.BuscadorUtil;


/**
 *
 * @author joseg
 */
public class VentanaAnimales extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAnimales
     */
private DefaultTableModel modelo;
private ArrayList<Animal> listaAnimales;
private JTextField txtBuscar;
private JComboBox<String> comboFiltro;


public VentanaAnimales() {
    initComponents();
    ComboTipoAnimal.addActionListener(e -> actualizarEtiquetaCaracteristica());
    inicializarTabla();
    cargarDatosEjemplo();
    limpiarCampos();
}

private void inicializarTabla() {
    modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer la tabla no editable
        }
    };
    
    // Configurar columnas
    String[] columnas = {"Tipo", "Nombre", "Edad", "Alimentación", "Sexo", "Peso", "Especie", "Característica"};
    modelo.setColumnIdentifiers(columnas);
    
    // Aplicar estilos a la tabla
    jTable1.setModel(modelo);
    EstilosUtil.aplicarEstiloTabla(jTable1);
    
    // Centrar contenido de las celdas
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
}


private void limpiarCampos() {
    ComboTipoAnimal.setSelectedIndex(0);
    txtNombre.setText("");
    txtEdad.setText("");
    txtAlimentacion.setText("");
    txtSexo.setText("");
    txtPeso.setText("");
    txtEspecie.setText("");
    txtCaracteristica.setText("");
}

private void actualizarEtiquetaCaracteristica() {
    String tipoSeleccionado = (String) ComboTipoAnimal.getSelectedItem();
                txtCaracteristica.setVisible(false);

    //Removemos el campo actual antes de cambiarlo

    
    switch (tipoSeleccionado) {
        case "Mamiferos":
            jLabel9.setText("Tipo de Pelo");
            txtCaracteristica.setVisible(true);
                        checkBoxCaracteristica.setVisible(false);

            break;
        case "Aves":
            jLabel9.setText("Tamaño Alas");
            txtCaracteristica.setVisible(true);
            checkBoxCaracteristica.setVisible(false);

            break;
        case "Reptiles":
            jLabel9.setText("Venenoso");
            txtCaracteristica.setVisible(false);
            checkBoxCaracteristica.setVisible(true);
            break;
        default:
            jLabel9.setText("Característica");
            txtCaracteristica.setVisible(true);
                        checkBoxCaracteristica.setVisible(false);


    }
    
    txtCaracteristica.setText(""); // Limpiar el campo cuando cambia la selección
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboTipoAnimal = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtAlimentacion = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        checkBoxCaracteristica = new javax.swing.JCheckBox();
        txtCaracteristica = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Animales");

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("Sans Serif Collection", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.darkGray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE ANIMALES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTable1.setBackground(java.awt.Color.white);
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jTable1.setFont(new java.awt.Font("Sans Serif Collection", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Nombre", "Edad", "Alimentación", "Sexo", "Peso", "Especie", "Característica"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(30);
        jTable1.setRowMargin(5);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jSplitPane1.setRightComponent(jScrollPane1);

        jPanel3.setMinimumSize(new java.awt.Dimension(300, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.darkGray);
        jLabel2.setText("Tipo de Animal:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.darkGray);
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.darkGray);
        jLabel4.setText("Edad:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.darkGray);
        jLabel5.setText("Alimentación:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 174, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.darkGray);
        jLabel6.setText("Sexo:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 228, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.darkGray);
        jLabel7.setText("Peso:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 282, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.darkGray);
        jLabel8.setText("Especie");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 336, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.darkGray);
        jLabel9.setText("Característica");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 390, -1, -1));

        ComboTipoAnimal.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        ComboTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Mamiferos", "Reptiles", "Aves" }));
        ComboTipoAnimal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.add(ComboTipoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 6, -1, -1));

        txtNombre.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 64, 165, -1));

        txtEdad.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        txtEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 118, 165, -1));

        txtAlimentacion.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        txtAlimentacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.add(txtAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 172, 165, -1));

        txtSexo.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        txtSexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });
        jPanel3.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 226, 165, -1));

        txtPeso.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        txtPeso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 280, 165, -1));

        txtEspecie.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        txtEspecie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 334, 165, -1));
        jPanel3.add(checkBoxCaracteristica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        txtCaracteristica.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        txtCaracteristica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.add(txtCaracteristica, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 388, 165, -1));

        jButton1.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 483, -1, -1));

        jButton2.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 483, -1, -1));

        jButton3.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jButton3.setText("EDITAR");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 483, 73, -1));

        jSplitPane1.setLeftComponent(jPanel3);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
        // Validar que no haya campos vacíos
        if (ComboTipoAnimal.getSelectedIndex() == 0 || 
            txtNombre.getText().trim().isEmpty() ||
            txtEdad.getText().trim().isEmpty() ||
            txtAlimentacion.getText().trim().isEmpty() ||
            txtSexo.getText().trim().isEmpty() ||
            txtPeso.getText().trim().isEmpty() ||
            txtEspecie.getText().trim().isEmpty() ||
            txtCaracteristica.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, 
                "Por favor, complete todos los campos", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Agregar datos a la tabla
        modelo.addRow(new Object[] {
            ComboTipoAnimal.getSelectedItem(),
            txtNombre.getText(),
            txtEdad.getText(),
            txtAlimentacion.getText(),
            txtSexo.getText(),
            txtPeso.getText(),
            txtEspecie.getText(),
            txtCaracteristica.getText()
        });

        // Limpiar campos después de agregar
        limpiarCampos();
        
        JOptionPane.showMessageDialog(this, 
            "Animal agregado correctamente", 
            "Éxito", 
            JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al agregar el animal: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un animal para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    modelo.removeRow(filaSeleccionada);
    listaAnimales.remove(filaSeleccionada);


    }//GEN-LAST:event_jButton2MouseClicked
private void aplicarEstilos() {
        // Aplicar estilos a los botones
        EstilosUtil.aplicarEstiloBoton(jButton1, "AGREGAR");
        EstilosUtil.aplicarEstiloBoton(jButton2, "ELIMINAR");
        EstilosUtil.aplicarEstiloBoton(jButton3, "EDITAR");
        
        // Aplicar estilos a los campos de texto
        JTextField[] campos = {txtNombre, txtEdad, txtPeso, txtEspecie, txtCaracteristica};
        for (JTextField campo : campos) {
            EstilosUtil.aplicarEstiloCampoTexto(campo);
        }
        
        // Aplicar estilos a la tabla
        EstilosUtil.aplicarEstiloTabla(jTable1);
        
        // Configurar el panel principal
        jPanel1.setBackground(EstilosUtil.COLOR_FONDO);
        
        // Configurar título
        jLabel1.setFont(EstilosUtil.FUENTE_TITULO);
        jLabel1.setForeground(EstilosUtil.COLOR_PRIMARIO);
    }
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un animal para editar", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    ComboTipoAnimal.setSelectedItem(modelo.getValueAt(filaSeleccionada, 0));
    txtNombre.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
    txtEdad.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
    txtAlimentacion.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
    txtSexo.setText(modelo.getValueAt(filaSeleccionada, 4).toString());
    txtPeso.setText(modelo.getValueAt(filaSeleccionada, 5).toString());
    txtEspecie.setText(modelo.getValueAt(filaSeleccionada, 6).toString());
    txtCaracteristica.setText(modelo.getValueAt(filaSeleccionada, 7).toString());

    modelo.removeRow(filaSeleccionada);
    listaAnimales.remove(filaSeleccionada);


    }//GEN-LAST:event_jButton3MouseClicked
    
    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAnimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTipoAnimal;
    private javax.swing.JCheckBox checkBoxCaracteristica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAlimentacion;
    private javax.swing.JTextField txtCaracteristica;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosEjemplo() {
        listaAnimales = Animal.cargarAnimalesEjemplo();
    
    for (Animal animal : listaAnimales) {
        String tipo = animal.getClass().getSimpleName();
        String caracteristica = "";
        
        if (animal instanceof Mamiferos) {
            caracteristica = ((Mamiferos) animal).getTipoPelo();
        } else if (animal instanceof Aves) {
            caracteristica = "Tamaño alas: " + ((Aves) animal).getTamañoAlas() + " m";
        } else if (animal instanceof Reptiles) {
            caracteristica = "Venenoso: " + (((Reptiles) animal).isEsVenenoso() ? "Sí" : "No");
        }
        
        modelo.addRow(new Object[] {
            tipo,
            animal.getNombre(),
            animal.getEdad(),
            animal.getAlimentacion(),
            animal.getSexo(),
            animal.getPeso(),
            animal.getEspecie(),
            caracteristica,
        });
    }

        }
}// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    

