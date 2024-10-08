package Vistas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        
        //Calcula el tamaño de la pantalla para que el frame ocupe siempre el 75% 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width * 0.75);
        int height = (int) (screenSize.height * 0.75);

        setSize(width, height);
        setResizable(false);

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sideBar_bg = new javax.swing.JPanel();
        bienvenido_texto = new javax.swing.JLabel();
        nombre_texto = new javax.swing.JLabel();
        alumno_texto = new javax.swing.JLabel();
        formMateria_btn = new javax.swing.JButton();
        materia_texto = new javax.swing.JLabel();
        formAlum_btn = new javax.swing.JButton();
        adm_texto = new javax.swing.JLabel();
        alumPorMateria_btn = new javax.swing.JButton();
        manejoInsc_btn = new javax.swing.JButton();
        consultas_texto = new javax.swing.JLabel();
        manipNotas_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jdesktopPane_bg = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        alumnos_jMenu = new javax.swing.JMenu();
        formAlumnos_jMenuItem = new javax.swing.JMenuItem();
        materia_jMenu = new javax.swing.JMenu();
        formMateria_jMenuItem = new javax.swing.JMenuItem();
        administracion_jMenu = new javax.swing.JMenu();
        manejoInsc_jMenuItem = new javax.swing.JMenuItem();
        manipNotas_jMenuItem = new javax.swing.JMenuItem();
        consultas_jMenu = new javax.swing.JMenu();
        alumPorMateria_jMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(51, 51, 51));

        sideBar_bg.setBackground(new java.awt.Color(51, 51, 51));

        bienvenido_texto.setText("Bienvenido");

        nombre_texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombre_texto.setText("Administrador");

        alumno_texto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alumno_texto.setText("Alumno");

        formMateria_btn.setBackground(new java.awt.Color(51, 51, 51));
        formMateria_btn.setText("Formulario de Materia");
        formMateria_btn.setBorder(null);
        formMateria_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formMateria_btnActionPerformed(evt);
            }
        });

        materia_texto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        materia_texto.setText("Materia");

        formAlum_btn.setBackground(new java.awt.Color(51, 51, 51));
        formAlum_btn.setText("Formulario de Alumno");
        formAlum_btn.setBorder(null);
        formAlum_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlum_btnActionPerformed(evt);
            }
        });

        adm_texto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adm_texto.setText("Administracion");

        alumPorMateria_btn.setBackground(new java.awt.Color(51, 51, 51));
        alumPorMateria_btn.setText("Alumnos por Materia");
        alumPorMateria_btn.setBorder(null);
        alumPorMateria_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumPorMateria_btnActionPerformed(evt);
            }
        });

        manejoInsc_btn.setBackground(new java.awt.Color(51, 51, 51));
        manejoInsc_btn.setText("   Manejo de Inscripciones");
        manejoInsc_btn.setBorder(null);
        manejoInsc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejoInsc_btnActionPerformed(evt);
            }
        });

        consultas_texto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        consultas_texto.setText("Consultas");

        manipNotas_btn.setBackground(new java.awt.Color(51, 51, 51));
        manipNotas_btn.setText("Manipulacion de notas");
        manipNotas_btn.setBorder(null);
        manipNotas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manipNotas_btnActionPerformed(evt);
            }
        });

        salir_btn.setBackground(new java.awt.Color(51, 51, 51));
        salir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        salir_btn.setBorder(null);

        javax.swing.GroupLayout sideBar_bgLayout = new javax.swing.GroupLayout(sideBar_bg);
        sideBar_bg.setLayout(sideBar_bgLayout);
        sideBar_bgLayout.setHorizontalGroup(
            sideBar_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBar_bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(adm_texto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sideBar_bgLayout.createSequentialGroup()
                .addGroup(sideBar_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBar_bgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(sideBar_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_texto)
                            .addComponent(bienvenido_texto)
                            .addComponent(alumno_texto)))
                    .addGroup(sideBar_bgLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(consultas_texto))
                    .addGroup(sideBar_bgLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(materia_texto)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sideBar_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBar_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alumPorMateria_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(sideBar_bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(sideBar_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formAlum_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formMateria_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manejoInsc_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(manipNotas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sideBar_bgLayout.setVerticalGroup(
            sideBar_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBar_bgLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(bienvenido_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_texto)
                .addGap(103, 103, 103)
                .addComponent(alumno_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formAlum_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(materia_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formMateria_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adm_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manejoInsc_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(manipNotas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultas_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alumPorMateria_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jdesktopPane_bg.setBackground(new java.awt.Color(36, 37, 38));

        javax.swing.GroupLayout jdesktopPane_bgLayout = new javax.swing.GroupLayout(jdesktopPane_bg);
        jdesktopPane_bg.setLayout(jdesktopPane_bgLayout);
        jdesktopPane_bgLayout.setHorizontalGroup(
            jdesktopPane_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        jdesktopPane_bgLayout.setVerticalGroup(
            jdesktopPane_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );

        escritorio.setLayer(jdesktopPane_bg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdesktopPane_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdesktopPane_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sideBar_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorio)
        );

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        alumnos_jMenu.setText("Alumno");

        formAlumnos_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        formAlumnos_jMenuItem.setText("Formulario de Alumno");
        formAlumnos_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlumnos_jMenuItemActionPerformed(evt);
            }
        });
        alumnos_jMenu.add(formAlumnos_jMenuItem);

        jMenuBar1.add(alumnos_jMenu);

        materia_jMenu.setText("Materia");

        formMateria_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        formMateria_jMenuItem.setText("Formulario de Materia");
        formMateria_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formMateria_jMenuItemActionPerformed(evt);
            }
        });
        materia_jMenu.add(formMateria_jMenuItem);

        jMenuBar1.add(materia_jMenu);

        administracion_jMenu.setText("Administración");

        manejoInsc_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        manejoInsc_jMenuItem.setText("Manejo de Inscripciones");
        manejoInsc_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejoInsc_jMenuItemActionPerformed(evt);
            }
        });
        administracion_jMenu.add(manejoInsc_jMenuItem);

        manipNotas_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        manipNotas_jMenuItem.setText("Manipulación de notas");
        manipNotas_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manipNotas_jMenuItemActionPerformed(evt);
            }
        });
        administracion_jMenu.add(manipNotas_jMenuItem);

        jMenuBar1.add(administracion_jMenu);

        consultas_jMenu.setText("Consultas");

        alumPorMateria_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        alumPorMateria_jMenuItem.setText("Alumnos por Materia");
        alumPorMateria_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumPorMateria_jMenuItemActionPerformed(evt);
            }
        });
        consultas_jMenu.add(alumPorMateria_jMenuItem);

        jMenuBar1.add(consultas_jMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAlumnos_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlumnos_jMenuItemActionPerformed
        abrirInternalFrame(new GestionAlumnos());
    }//GEN-LAST:event_formAlumnos_jMenuItemActionPerformed

    private void formMateria_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formMateria_jMenuItemActionPerformed
        abrirInternalFrame(new GestionMaterias());
    }//GEN-LAST:event_formMateria_jMenuItemActionPerformed

    private void formAlum_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlum_btnActionPerformed
        abrirInternalFrame(new GestionAlumnos());

    }//GEN-LAST:event_formAlum_btnActionPerformed

    private void formMateria_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formMateria_btnActionPerformed
        abrirInternalFrame(new GestionMaterias());    }//GEN-LAST:event_formMateria_btnActionPerformed

    private void manejoInsc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejoInsc_btnActionPerformed
        abrirInternalFrame(new Inscripciones());
    }//GEN-LAST:event_manejoInsc_btnActionPerformed

    private void manejoInsc_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejoInsc_jMenuItemActionPerformed
        abrirInternalFrame(new Inscripciones());
    }//GEN-LAST:event_manejoInsc_jMenuItemActionPerformed

    private void manipNotas_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manipNotas_jMenuItemActionPerformed
        abrirInternalFrame(new CargaNotas());
    }//GEN-LAST:event_manipNotas_jMenuItemActionPerformed

    private void alumPorMateria_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumPorMateria_jMenuItemActionPerformed
        abrirInternalFrame(new ListadoAlumnosPorMateria());
    }//GEN-LAST:event_alumPorMateria_jMenuItemActionPerformed

    private void manipNotas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manipNotas_btnActionPerformed
        abrirInternalFrame(new CargaNotas());
    }//GEN-LAST:event_manipNotas_btnActionPerformed

    private void alumPorMateria_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumPorMateria_btnActionPerformed
        abrirInternalFrame(new ListadoAlumnosPorMateria());
    }//GEN-LAST:event_alumPorMateria_btnActionPerformed

    private void abrirInternalFrame(JInternalFrame iframe){
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
    
        escritorio.add(iframe);
        iframe.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adm_texto;
    private javax.swing.JMenu administracion_jMenu;
    private javax.swing.JButton alumPorMateria_btn;
    private javax.swing.JMenuItem alumPorMateria_jMenuItem;
    private javax.swing.JLabel alumno_texto;
    private javax.swing.JMenu alumnos_jMenu;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenido_texto;
    private javax.swing.JMenu consultas_jMenu;
    private javax.swing.JLabel consultas_texto;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton formAlum_btn;
    private javax.swing.JMenuItem formAlumnos_jMenuItem;
    private javax.swing.JButton formMateria_btn;
    private javax.swing.JMenuItem formMateria_jMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jdesktopPane_bg;
    private javax.swing.JButton manejoInsc_btn;
    private javax.swing.JMenuItem manejoInsc_jMenuItem;
    private javax.swing.JButton manipNotas_btn;
    private javax.swing.JMenuItem manipNotas_jMenuItem;
    private javax.swing.JMenu materia_jMenu;
    private javax.swing.JLabel materia_texto;
    private javax.swing.JLabel nombre_texto;
    private javax.swing.JButton salir_btn;
    private javax.swing.JPanel sideBar_bg;
    // End of variables declaration//GEN-END:variables
}
