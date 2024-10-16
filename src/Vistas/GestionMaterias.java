
package Vistas;

import Modelo.Materia;
import Persistencia.materiaData;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GestionMaterias extends javax.swing.JInternalFrame {
    private Materia m = null;
    private materiaData md = new materiaData();
   
    public GestionMaterias() {
        initComponents();

        this.setResizable(false);
        this.setMaximizable(false);
        
        //internalFrame siempre maximizado
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setFrameIcon(new ImageIcon());
         }                                         
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        codigo_texto = new javax.swing.JLabel();
        nombre_jTextField = new javax.swing.JTextField();
        codigo_jTextField = new javax.swing.JTextField();
        anio_jTextField = new javax.swing.JTextField();
        estado_texto = new javax.swing.JLabel();
        nombre_texto = new javax.swing.JLabel();
        anio_texto = new javax.swing.JLabel();
        buscar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        nuevo_btn = new javax.swing.JButton();
        guardar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        estado_jRadioBtn = new javax.swing.JRadioButton();

        jButton4.setText("jButton1");

        bg.setBackground(new java.awt.Color(36, 37, 38));

        codigo_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigo_texto.setText("Código:");

        nombre_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        codigo_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        anio_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        estado_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estado_texto.setText("Estado:");

        nombre_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre_texto.setText("Nombre:");

        anio_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        anio_texto.setText("Año:");

        buscar_btn.setBackground(new java.awt.Color(36, 37, 38));
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda.png"))); // NOI18N
        buscar_btn.setBorder(null);
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        salir_btn.setBackground(new java.awt.Color(51, 51, 51));
        salir_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.setBorder(null);
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        nuevo_btn.setBackground(new java.awt.Color(34, 84, 139));
        nuevo_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nuevo_btn.setText("Nuevo");
        nuevo_btn.setBorder(null);
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });

        guardar_btn.setBackground(new java.awt.Color(53, 82, 0));
        guardar_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guardar_btn.setText("Guardar");
        guardar_btn.setBorder(null);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setBackground(new java.awt.Color(122, 36, 24));
        eliminar_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminar_btn.setText("Eliminar");
        eliminar_btn.setBorder(null);
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_titulo.setText("Gestión de Materias");

        estado_jRadioBtn.setText("Activo");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_titulo)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo_texto)
                            .addComponent(nombre_texto)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado_texto)
                                    .addComponent(anio_texto))
                                .addGap(164, 164, 164)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anio_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigo_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estado_jRadioBtn))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(label_titulo)
                .addGap(97, 97, 97)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigo_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codigo_texto)))
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_texto))
                .addGap(36, 36, 36)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anio_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anio_texto))
                .addGap(48, 48, 48)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_texto)
                    .addComponent(estado_jRadioBtn))
                .addGap(156, 156, 156)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_salir_btnActionPerformed

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
        // TODO add your handling code here:
        codigo_jTextField.setText("");  
        nombre_jTextField.setText("");  
        estado_jRadioBtn.setSelected(true);
    }//GEN-LAST:event_nuevo_btnActionPerformed


    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
       
        try{
            String codigo = codigo_jTextField.getText();
            String nombre = nombre_jTextField.getText();
            int anio = Integer.parseInt(anio_jTextField.getText());
            if (nombre.isEmpty() || codigo.isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Los campos no pueden estar vacios.");
                return;
            }
            Boolean estado = estado_jRadioBtn.isSelected();
            System.out.println(m);
            if (m == null){
                m = new Materia(nombre, anio, estado);
                md.guardarMateria(m);
                JOptionPane.showMessageDialog(null, "Materia guardada correctamente");
            } else{
                m.setNombre(nombre);
                m.setAnioMateria(anio);
                m.setActivo(estado);
                md.actualizarMateria(m);
                JOptionPane.showMessageDialog(null, "Materia actualizada correctamente");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Verifique los datos ingresados");
        }
        
        
        
        
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        // TODO add your handling code here:
        String codigoText = codigo_jTextField.getText().trim();
          
        if (codigoText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El código no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int codigo = Integer.parseInt(codigoText);  // Conversión de texto a número
        
            md.eliminarMateria(codigo);
            JOptionPane.showMessageDialog(this, "Materia eliminada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
            codigo_jTextField.setText("");
            nombre_jTextField.setText("");
            anio_jTextField.setText("");
            estado_jRadioBtn.setSelected(true);
        
        
        } catch (NumberFormatException e) {
        // Si no se puede convertir el texto a número, mostramos un error
            JOptionPane.showMessageDialog(this, "Por favor ingrese un código numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Capturamos cualquier otro error (base de datos, etc.)
            JOptionPane.showMessageDialog(this, "Error al eliminar la materia: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void documento_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documento_jTextFieldActionPerformed
       
        
    }//GEN-LAST:event_documento_jTextFieldActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
         try{
            int cod = Integer.parseInt(codigo_jTextField.getText());
            m = md.buscarMateria(cod);
        
            if (m != null){
                nombre_jTextField.setText(m.getNombre());
                anio_jTextField.setText(m.getAnioMateria()+"");
                estado_jRadioBtn.setSelected(m.isActivo());
            
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un código válido");
        }
    }//GEN-LAST:event_buscar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio_jTextField;
    private javax.swing.JLabel anio_texto;
    private javax.swing.JPanel bg;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField codigo_jTextField;
    private javax.swing.JLabel codigo_texto;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JRadioButton estado_jRadioBtn;
    private javax.swing.JLabel estado_texto;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField nombre_jTextField;
    private javax.swing.JLabel nombre_texto;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables

}
