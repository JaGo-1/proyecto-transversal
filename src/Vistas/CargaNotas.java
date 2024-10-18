
package Vistas;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import Persistencia.alumnoData;
import Persistencia.inscripcionData;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class CargaNotas extends javax.swing.JInternalFrame {
    Inscripcion insc = new Inscripcion();
    inscripcionData id = new inscripcionData();
    alumnoData ad = new alumnoData();

    DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return c == 2;
        }
    };

    public CargaNotas() {
        initComponents();
        this.setResizable(false);
        this.setMaximizable(false);
        
        //internalFrame siempre maximizado
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CargaNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setFrameIcon(new ImageIcon());
        
        llenarCombo();
        crearCabecera();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        dni_texto = new javax.swing.JLabel();
        salir_btn = new javax.swing.JButton();
        guardar_btn = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        comboAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        materiasCursadas_jTable = new javax.swing.JTable();

        jButton4.setText("jButton1");

        bg.setBackground(new java.awt.Color(36, 37, 38));

        dni_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dni_texto.setText("Seleccione un alumno:");

        salir_btn.setBackground(new java.awt.Color(51, 51, 51));
        salir_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.setBorder(null);
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
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

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_titulo.setText("Carga de Notas");

        comboAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlumnosActionPerformed(evt);
            }
        });

        materiasCursadas_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(materiasCursadas_jTable);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_titulo)
                    .addComponent(dni_texto)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(comboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(label_titulo)
                .addGap(53, 53, 53)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni_texto)
                    .addComponent(comboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        if (materiasCursadas_jTable.isEditing()) {
            materiasCursadas_jTable.getCellEditor().stopCellEditing();
        }
        
        Alumno a = (Alumno) comboAlumnos.getSelectedItem();
        int id_alumno = a.getIdAlumno();
        
        for (int i = 0; i < tabla.getRowCount(); i++){
            int id_materia = (int) tabla.getValueAt(i, 0);
            double nota = Double.parseDouble(tabla.getValueAt(i,2).toString());
            
            id.actualizarNota(id_alumno, id_materia, nota);
        }

    }//GEN-LAST:event_guardar_btnActionPerformed

    private void comboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlumnosActionPerformed
        Alumno a = (Alumno)comboAlumnos.getSelectedItem();
        
        llenarTabla(a.getIdAlumno());
    }//GEN-LAST:event_comboAlumnosActionPerformed
        
    private void llenarCombo(){
        for (Alumno a : ad.obtenerAlumnos()){
            comboAlumnos.addItem(a);
        }
    }
    
    private void crearCabecera(){
        tabla.addColumn("Código");
        tabla.addColumn("Nombre");
        tabla.addColumn("Nota");
        materiasCursadas_jTable.setModel(tabla);
    }
    
    private void llenarTabla(int id_alumno){
        tabla.setRowCount(0);
        for (Materia m : id.obtenerMateriasCursadas(id_alumno)){
            tabla.addRow(new Object[]{m.getIdMateria(), m.getNombre(),0});
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<Alumno> comboAlumnos;
    private javax.swing.JLabel dni_texto;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTable materiasCursadas_jTable;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
