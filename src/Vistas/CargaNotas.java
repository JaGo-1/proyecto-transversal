package Vistas;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import Persistencia.alumnoData;
import Persistencia.inscripcionData;
import Persistencia.materiaData;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CargaNotas extends javax.swing.JInternalFrame {

    private Alumno alumno;
    private alumnoData alumnoData;
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private materiaData materiaData;
    private inscripcionData inscripcion;
    private DefaultTableModel modelo;

    public CargaNotas() {
         initComponents();
        modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
        alumnoData= new alumnoData();
        materiaData = new materiaData();
        alumno = new Alumno();
        inscripcion= new inscripcionData();
        armarTabla();
        cargarCombo();
      
        //internalFrame siempre maximizado
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CargaNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setFrameIcon(new ImageIcon());

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
        jTable1 = new javax.swing.JTable();
        nota_jft = new javax.swing.JTextField();

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

        comboAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAlumnosItemStateChanged(evt);
            }
        });
        comboAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlumnosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        nota_jft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota_jftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_titulo)
                            .addComponent(dni_texto)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(comboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(nota_jft, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(nota_jft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        // TODO add your handling code here:
        alumno = (Alumno) comboAlumnos.getSelectedItem();
        int filaSelected = jTable1.getSelectedRow();

        int idm = (int) jTable1.getValueAt(filaSelected, 0);
        System.out.println(idm);
        try {
            double nota = Double.parseDouble(nota_jft.getText());
            if (nota > 10 || nota < 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un numero entre 0 y 10");

            } else {
                inscripcion.actualizarNota(alumno.getIdAlumno(), idm, nota);
                JOptionPane.showMessageDialog(this, "La nota ha sido actualizada!");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor Ingrese un numero");

        } finally {
            guardar_btn.setEnabled(false);
            borrarFilas();

            obtenerMaterias();
            nota_jft.setText("");
        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void nota_jftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota_jftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota_jftActionPerformed

    private void comboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAlumnosActionPerformed

    private void comboAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAlumnosItemStateChanged
        // TODO add your handling code here:
        borrarFilas();
        obtenerMaterias();
        
    }//GEN-LAST:event_comboAlumnosItemStateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
                    guardar_btn.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void cargarCombo() {
        listaAlumnos = (ArrayList<Alumno>) alumnoData.obtenerAlumnos();

        for (Alumno alu : listaAlumnos) {
            comboAlumnos.addItem(alu);
        }
    }

    private void obtenerMaterias() {
        ArrayList<Materia> listaMateria = new ArrayList<>();
        ArrayList<Inscripcion> listaInscripcion = new ArrayList<>();
        int i = 0;
        alumno = (Alumno) comboAlumnos.getSelectedItem();
        listaMateria = (ArrayList<Materia>) inscripcion.obtenerMateriasCursadas(alumno.getIdAlumno());
        for (Materia mat : listaMateria) {
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre()});
        }

        listaInscripcion = (ArrayList<Inscripcion>) inscripcion.obtenerInscripcionesPorAlumno(alumno.getIdAlumno());

        for (Inscripcion ins : listaInscripcion) {
            modelo.setValueAt(ins.getNota(), i, 2);
            i++;
        }
    }

    public void borrarFilas() {
        int index = modelo.getRowCount() - 1;

        for (int i = index; i >= 0; i--) {

            modelo.removeRow(i);
        }

    }

    private void armarTabla() {
        ArrayList<Object> filaTabla = new ArrayList<>();
        filaTabla.add("ID");
        filaTabla.add("Nombre");
        filaTabla.add("Nota");
        for (Object it : filaTabla) {
            modelo.addColumn(it);
        }

        jTable1.setModel(modelo);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<Alumno> comboAlumnos;
    private javax.swing.JLabel dni_texto;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField nota_jft;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
