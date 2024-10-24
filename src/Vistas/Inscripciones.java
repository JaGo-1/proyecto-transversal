
package Vistas;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import Persistencia.alumnoData;
import Persistencia.inscripcionData;
import Persistencia.materiaData;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Inscripciones extends javax.swing.JInternalFrame {
    private List<Materia> listaM;
    private List<Alumno> listaA;
    private materiaData mData;
    private alumnoData aData;
    private inscripcionData inscData;
    
    private DefaultTableModel modelo;

   
    public Inscripciones() {
        initComponents();
        this.setResizable(false);
        this.setMaximizable(false);
        
        //internalFrame siempre maximizado
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inscripciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setFrameIcon(new ImageIcon());
                
        aData=new alumnoData();
        listaA= (ArrayList<Alumno>)aData.obtenerAlumnos();
        modelo=new DefaultTableModel();
        inscData=new inscripcionData();
        mData=new materiaData();
        
        cargaAlumnos();
       
        armarCabeceraTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        dni_texto = new javax.swing.JLabel();
        apellido_texto = new javax.swing.JLabel();
        salir_btn = new javax.swing.JButton();
        guardar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Radionoinscripta = new javax.swing.JRadioButton();
        Radioinscripta = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTmaterias = new javax.swing.JTable();

        jButton4.setText("jButton1");

        bg.setBackground(new java.awt.Color(36, 37, 38));

        dni_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dni_texto.setText("Seleccione un alumno:");

        apellido_texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        apellido_texto.setText("Listado de Materias");

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
        guardar_btn.setText("Inscribir");
        guardar_btn.setBorder(null);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setBackground(new java.awt.Color(122, 36, 24));
        eliminar_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminar_btn.setText("Anular Inscripción");
        eliminar_btn.setBorder(null);
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_titulo.setText("Formulario de Inscripción");

        Radionoinscripta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Radionoinscripta.setText("Materias no inscriptas");
        Radionoinscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadionoinscriptaActionPerformed(evt);
            }
        });

        Radioinscripta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Radioinscripta.setText("Materias inscriptas");
        Radioinscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioinscriptaActionPerformed(evt);
            }
        });

        jTmaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTmaterias);

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
                        .addComponent(apellido_texto)
                        .addGap(42, 42, 42)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(Radioinscripta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Radionoinscripta))))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_texto)
                    .addComponent(Radionoinscripta)
                    .addComponent(Radioinscripta))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        int filaseleccionada=jTmaterias.getSelectedRow();
        
        if (filaseleccionada != -1){
    
        Alumno a= (Alumno) jComboBox1.getSelectedItem();
        int id_materia=(Integer) modelo.getValueAt(filaseleccionada,0);
        String nombre= (String) modelo.getValueAt(filaseleccionada,1);
        int año=(Integer) modelo.getValueAt(filaseleccionada, 2);
        Materia m= new Materia(id_materia,nombre,año,true);
        Inscripcion i=new Inscripcion(a,m,0);
        inscData.guardarInscripcion(i);
            borrarfilas();
        }

    }//GEN-LAST:event_guardar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        int filaseleccionada=jTmaterias.getSelectedRow();
        if(filaseleccionada!=-1){
            Alumno a= (Alumno) jComboBox1.getSelectedItem();
            int id_materia=(Integer) modelo.getValueAt(filaseleccionada, 0);
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), id_materia);
            borrarfilas();
        }
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void RadioinscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioinscriptaActionPerformed
        borrarfilas();
        Radionoinscripta.setSelected(false);
        datosinscriptos();
        eliminar_btn.setEnabled(true);
        guardar_btn.setEnabled(false);
    }//GEN-LAST:event_RadioinscriptaActionPerformed

    private void RadionoinscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadionoinscriptaActionPerformed
        borrarfilas();
        Radioinscripta.setSelected(false);
        datosnoinscriptos();
        eliminar_btn.setEnabled(false);
        guardar_btn.setEnabled(true);
    }//GEN-LAST:event_RadionoinscriptaActionPerformed
    
    private void datosnoinscriptos(){
        Alumno selec=(Alumno)jComboBox1.getSelectedItem();
        listaM =(ArrayList )inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());

        for(Materia m: listaM){
            modelo.addRow(new Object[]{ m.getIdMateria(), m.getNombre(),m.getAnioMateria()});
        }
    }

    private void datosinscriptos(){
        Alumno selec=(Alumno)jComboBox1.getSelectedItem();
        List<Materia>listaM = inscData.obtenerMateriasCursadas(selec.getIdAlumno());

        for(Materia m: listaM){
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
        }
    }

    
    private void cargaAlumnos(){//carga el combo box//
        for (Alumno item:listaA){
            jComboBox1.addItem(item);
        }
    }
    
    private void borrarfilas(){
        int indice= modelo.getRowCount()-1;
        for(int i = indice;i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filacabecera = new ArrayList<>();
        filacabecera.add("ID");
        filacabecera.add("Nombre");
        filacabecera.add("Año");
        for(Object it : filacabecera){
            modelo.addColumn(it);
        }
        jTmaterias.setModel(modelo);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Radioinscripta;
    private javax.swing.JRadioButton Radionoinscripta;
    private javax.swing.JLabel apellido_texto;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel dni_texto;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTmaterias;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
