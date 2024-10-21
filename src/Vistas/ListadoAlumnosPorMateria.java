
package Vistas;

import Modelo.Alumno;
import Modelo.Materia;
import Persistencia.inscripcionData;
import Persistencia.materiaData;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class ListadoAlumnosPorMateria extends javax.swing.JInternalFrame {
    
    private materiaData md = new materiaData();
    private inscripcionData id = new inscripcionData();
    
    DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
   
    public ListadoAlumnosPorMateria() {
        initComponents();
        this.setResizable(false);
        this.setMaximizable(false);
        
        //internalFrame siempre maximizado
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ListadoAlumnosPorMateria.class.getName()).log(Level.SEVERE, null, ex);
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
        label_titulo = new javax.swing.JLabel();
        materiaCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();

        jButton4.setText("jButton1");

        bg.setBackground(new java.awt.Color(36, 37, 38));

        dni_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dni_texto.setText("Seleccione una materia:");

        salir_btn.setBackground(new java.awt.Color(51, 51, 51));
        salir_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.setBorder(null);
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_titulo.setText("Listado de Alumnos por Materia");
        label_titulo.setToolTipText("");

        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMaterias);

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
                        .addComponent(materiaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(materiaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    private void llenarCombo(){
        materiaCombo.removeAllItems();
    
    List<Materia> materias = md.listarMaterias();
    
    for (Materia materia : materias) {
        materiaCombo.addItem(materia);
    }
    }
    
private void borrarFilasTabla() {
    int rowCount = tabla.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        tabla.removeRow(i);
    }
    
}
    private void cargarDatosTabla() {
    borrarFilasTabla();
    
    Materia materiaSeleccionada = (Materia) materiaCombo.getSelectedItem();
    
    if (materiaSeleccionada != null) {
        List<Alumno> alumnos = id.obtenerAlumnosXMateria(materiaSeleccionada.getIdMateria());
        
        for (Alumno alumno : alumnos) {
            Object[] fila = {
                alumno.getIdAlumno(),
                alumno.getDni(),
                alumno.getApellido(),
                alumno.getNombre()
            };
            tabla.addRow(fila);
        }
    }
}
    
    private void crearCabecera() {
        tabla.addColumn("ID");
        tabla.addColumn("DNI");
        tabla.addColumn("Apellido");
        tabla.addColumn("Nombre");
        tablaMaterias.setModel(tabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel dni_texto;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JComboBox<Materia> materiaCombo;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTable tablaMaterias;
    // End of variables declaration//GEN-END:variables
}
