/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Archivo;
import Clases.Area;
import Clases.Conexion;
import Clases.Doctor;
import javax.swing.JOptionPane;
import static GUI.LogIn.*;
import Mensajes.ErrorAlert;

import Mensajes.ErrorAlertdoctor;
import Mensajes.SuccessAlert;
import Mensajes.WarningAlertCerrar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FDoctor extends javax.swing.JFrame {

    public FDoctor() {

        initComponents();
        this.setLocationRelativeTo(null);
        areadelprof.setEnabled(false);

        modificar.setEnabled(false);
        //JOptionPane.showMessageDialog(null, "Este es el tamaño del linkedlist: "+tama);
        //String vector[] = new String[a.obtenerContenedor().size()];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        primernombre = new javax.swing.JTextField();
        primerapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        areadelprof = new javax.swing.JComboBox<String>();
        Tipodemedico = new javax.swing.JComboBox<String>();
        correo = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 113)));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancelar2.png"))); // NOI18N
        jLabel16.setToolTipText("Cerrar");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/botón minimizar.png"))); // NOI18N
        jLabel8.setToolTipText("Minimizar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        jPanel2.setBackground(new java.awt.Color(224, 241, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 113)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 113));
        jLabel1.setText("Primer nombre: ");

        primernombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        primernombre.setForeground(new java.awt.Color(102, 102, 102));
        primernombre.setToolTipText("Primer nombre");
        primernombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 17, 113)));
        primernombre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                primernombreMouseMoved(evt);
            }
        });
        primernombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                primernombreMouseExited(evt);
            }
        });
        primernombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primernombreActionPerformed(evt);
            }
        });
        primernombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                primernombreKeyTyped(evt);
            }
        });

        primerapellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        primerapellido.setForeground(new java.awt.Color(102, 102, 102));
        primerapellido.setToolTipText("Primer apellido");
        primerapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 17, 113)));
        primerapellido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                primerapellidoMouseMoved(evt);
            }
        });
        primerapellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                primerapellidoMouseExited(evt);
            }
        });
        primerapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                primerapellidoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 113));
        jLabel6.setText("Primer apellido:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 113));
        jLabel5.setText("Cedula:");

        cedula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 102, 102));
        cedula.setToolTipText("Cedula");
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 17, 113)));
        cedula.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cedulaMouseMoved(evt);
            }
        });
        cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cedulaMouseExited(evt);
            }
        });
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        telefono.setForeground(new java.awt.Color(102, 102, 102));
        telefono.setToolTipText("Teléfono");
        telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 17, 113)));
        telefono.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                telefonoMouseMoved(evt);
            }
        });
        telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telefonoMouseExited(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 113));
        jLabel2.setText("Teléfono:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 113));
        jLabel7.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 113));
        jLabel3.setText("Tipo de Médico ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 113));
        jLabel4.setText("Area del profesional:");

        areadelprof.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        areadelprof.setForeground(new java.awt.Color(102, 102, 102));
        areadelprof.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        areadelprof.setToolTipText("Area del profesional");
        areadelprof.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 17, 113)));
        areadelprof.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                areadelprofMouseMoved(evt);
            }
        });
        areadelprof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                areadelprofMouseExited(evt);
            }
        });
        areadelprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areadelprofActionPerformed(evt);
            }
        });

        Tipodemedico.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Tipodemedico.setForeground(new java.awt.Color(102, 102, 102));
        Tipodemedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Médico Especialista", "Médico General" }));
        Tipodemedico.setToolTipText("Tipo de Médico");
        Tipodemedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 17, 113)));
        Tipodemedico.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TipodemedicoMouseMoved(evt);
            }
        });
        Tipodemedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipodemedicoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TipodemedicoMouseExited(evt);
            }
        });
        Tipodemedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipodemedicoActionPerformed(evt);
            }
        });

        correo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        correo.setForeground(new java.awt.Color(102, 102, 102));
        correo.setToolTipText("Correo");
        correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 17, 113)));
        correo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                correoMouseMoved(evt);
            }
        });
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                correoMouseExited(evt);
            }
        });
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 51, 113));
        buscar.setText("Buscar");
        buscar.setToolTipText("Buscar");
        buscar.setBorder(null);
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        listar.setBackground(new java.awt.Color(255, 255, 255));
        listar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        listar.setForeground(new java.awt.Color(0, 51, 113));
        listar.setText("Listar");
        listar.setToolTipText("Listar");
        listar.setBorder(null);
        listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(0, 51, 113));
        agregar.setText("Agregar");
        agregar.setToolTipText("Agregar");
        agregar.setBorder(null);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(0, 51, 113));
        modificar.setText("Modificar");
        modificar.setToolTipText("Modificar");
        modificar.setBorder(null);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(0, 51, 113));
        limpiar.setText("limpiar");
        limpiar.setToolTipText("Buscar");
        limpiar.setBorder(null);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5)
                        .addGap(103, 103, 103)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(Tipodemedico, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areadelprof, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(primerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(primernombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(listar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(primernombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(primerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipodemedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(areadelprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar))
                .addGap(11, 11, 11)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

//        long ced = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la cedula del doctor: "));
        ErrorAlertdoctor obj = new ErrorAlertdoctor(this, true);
        obj.titulo.setText("Digite la cedula del doctor: ");
        obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
        obj.setVisible(true);

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("select d.cedula_doctor, d.primer_nombre_doctor, d.primer_apellido_doctor, d.telefono_doctor, d.correo_doctor, d.tipomedico_doctor, \n"
                    + "d.area_id_area, a.nombre_area\n"
                    + "from doctor d\n"
                    + "inner join area a on cedula_doctor = " + obj.idd.getText() + " and a.id_area = d.area_id_area ");
            if (rs.next()) {

                if (rs.getString("tipomedico_doctor").equals("Médico Especialista")) {
                    cedula.setText(rs.getString(1));
                    primernombre.setText(rs.getString(2));
                    primerapellido.setText(rs.getString(3));
                    telefono.setText(rs.getString(4));
                    correo.setText(rs.getString(5));

                    modificar.setEnabled(true);
                    agregar.setEnabled(false);
                    cedula.setEnabled(false);
                    areadelprof.setEnabled(true);
                    Tipodemedico.setSelectedItem(rs.getString(6));
                    areadelprof.setSelectedItem(rs.getString(7) + " - " + rs.getString(8));
                } else {

                    cedula.setText(rs.getString(1));
                    primernombre.setText(rs.getString(2));
                    primerapellido.setText(rs.getString(3));
                    telefono.setText(rs.getString(4));
                    correo.setText(rs.getString(5));

                    modificar.setEnabled(true);
                    agregar.setEnabled(false);
                    cedula.setEnabled(false);

                    areadelprof.removeAllItems();
                    areadelprof.setEnabled(false);
                    Tipodemedico.setSelectedItem(rs.getString(6));
                    areadelprof.setSelectedItem(rs.getString(8));
                }
            } else {
//                JOptionPane.showMessageDialog(null, "DOCTOR NO EXISTE");
                WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
                wa.titulo.setText("DOCTOR NO REGISTRADO!");
                wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                wa.setVisible(true);
            }

            //ResultSet rs2 = con.consultar("Select * from doctor where cedula_doctor = " + ced + " ");
//            if (rs.next()) {
//
//            } else {
//                JOptionPane.showMessageDialog(null, "El doctor no esta registrado");
//            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buscarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed

//       JOptionPane.showMessageDialog(null, "Archivo Generado");
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("select * from doctor");

            String areaa = "Cedula \tPrimer Nombre \tPrimer Apellido \tTelefono \tCorreo \tTipo Médico \tId Area \n";

            while (rs.next()) {

                areaa += rs.getString("cedula_doctor") + "\t" + rs.getString("primer_nombre_doctor") + "\t" + rs.getString("primer_apellido_doctor") + "\t" + rs.getString("telefono_doctor") + "\t" + rs.getString("correo_doctor") + "\t" + rs.getString("tipomedico_doctor") + "\t" + rs.getString("area_id_area") + "\n";

            }

            Archivo.grabar("doctor.xls", areaa);

//        JOptionPane.showMessageDialog(null, "Archivo Generado");
            SuccessAlert sa = new SuccessAlert(this, true);
            sa.titulo.setText("ARCHIVO GENERADO!");
            sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
            sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            sa.setVisible(true);

            primernombre.setText("");
            primerapellido.setText("");
            cedula.setText("");
            telefono.setText("");
            correo.setText("");
            Tipodemedico.setSelectedIndex(0);
            areadelprof.removeAllItems();

            primerapellido.setEnabled(true);
            primernombre.setEnabled(true);
            cedula.setEnabled(true);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_listarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        if (cedula.getText().trim().equals("") || primernombre.getText().trim().equals("") || primerapellido.getText().trim().equals("")
                || telefono.getText().trim().equals("") || correo.getText().trim().equals("")
                || Tipodemedico.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Complete el espacio vacio!!");
            WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
            wa.titulo.setText("COMPLETE EL ESPACIO VACIO!");
            wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            wa.setVisible(true);
            modificar.setEnabled(false);

        } else {
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                int ced = Integer.parseInt(cedula.getText());
                String Nombre = primernombre.getText().trim().toUpperCase();
                String Apellido = primerapellido.getText().trim().toUpperCase();
                int telef = Integer.parseInt(telefono.getText().trim().toUpperCase());
                String correo1 = correo.getText();

                String aprof = null;
                if (Tipodemedico.getSelectedItem().equals("Médico Especialista")) {
                    StringTokenizer areaprof = new StringTokenizer(areadelprof.getSelectedItem() + " - ");
                    aprof = areaprof.nextToken();
                } else {
                    aprof = "TODAS";
                }

                ResultSet rs = con.consultar("Select * from doctor where cedula_doctor = '" + ced + "'");
                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null, "El Doctor está repetido");
                    ErrorAlert ea = new ErrorAlert(this, true);
                    ea.titulo1.setText("¡¡DOCTOR YA FUE REGISTRADO!!");
                    ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                    ea.setVisible(true);

                } else {
                    //registramos
                    con.actualizar("INSERT INTO doctor VALUES(" + ced + ",'"
                            + Nombre + "','" + Apellido
                            + "'," + telef + ",'" + correo1 + "','" + Tipodemedico.getSelectedItem().toString() + "','" + aprof + "')");
//                    JOptionPane.showMessageDialog(null, "Doctor Registrado");
                    SuccessAlert sa = new SuccessAlert(this, true);
                    sa.titulo.setText("DOCTOR ASIGNADO CON ÉXITO!");
                    sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
                    sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                    sa.setVisible(true);

                    primernombre.setText("");
                    primerapellido.setText("");
                    cedula.setText("");
                    telefono.setText("");
                    correo.setText("");
                    Tipodemedico.setSelectedIndex(0);
                    areadelprof.removeAllItems();
                    jlbAsignarPaciente.setEnabled(true);

                }
                con.cerrar();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (cedula.getText().trim().equals("") || primernombre.getText().trim().equals("") || primerapellido.getText().trim().equals("")
                || telefono.getText().trim().equals("") || correo.getText().trim().equals("")
                || Tipodemedico.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Complete el espacio vacio!!");
            WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
            wa.titulo.setText("COMPLETE EL ESPACIO VACIO!");
            wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            wa.setVisible(true);

            modificar.setEnabled(false);
        } else {

            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                String aprof = null;
                if (Tipodemedico.getSelectedItem().equals("Médico Especialista")) {
                    StringTokenizer areaprof = new StringTokenizer(areadelprof.getSelectedItem() + " - ");
                    aprof = areaprof.nextToken();
                } else {
                    aprof = "TODAS";
                }

                String sql = ("Update doctor set primer_nombre_doctor = '" + primernombre.getText() + "', primer_apellido_doctor = '" + primerapellido.getText() + "', telefono_doctor = " + telefono.getText() + ", correo_doctor = '" + correo.getText() + "', tipomedico_doctor = '" + Tipodemedico.getSelectedItem().toString() + "', area_id_area = '" + aprof + "' where cedula_doctor = " + cedula.getText() + " ");

                con.actualizar(sql);
//                JOptionPane.showMessageDialog(null, "INFORMACION MODIFICADA!");
                SuccessAlert sa = new SuccessAlert(this, true);
                sa.titulo.setText("INFORMACIÓN MODIFICADA!");
                sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                sa.setVisible(true);

                cedula.setText("");
                primernombre.setText("");
                primerapellido.setText("");
                telefono.setText("");
                correo.setText("");
                Tipodemedico.setSelectedIndex(0);
                areadelprof.removeAllItems();

                con.cerrar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            }

            modificar.setEnabled(false);
            cedula.setEnabled(true);
            agregar.setEnabled(true);
        }

    }//GEN-LAST:event_modificarActionPerformed

    private void TipodemedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipodemedicoActionPerformed

        if (Tipodemedico.getSelectedItem().equals("Médico Especialista")) {

            try {
                areadelprof.setEnabled(true);
//                areadelprof.removeAllItems();
                Conexion con = new Conexion();
                con.ConexionPostgres();
                String query = ("SELECT *  from area");

                ResultSet rs = con.consultar(query);
                areadelprof.removeAllItems();
                while (rs.next()) {

                    if (!rs.getString(1).equals("TODAS")) {
                        areadelprof.addItem(rs.getString(1) + " - " + rs.getString(2));
                    }

                }

                con.cerrar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            areadelprof.removeAllItems();
            areadelprof.setEnabled(false);
        }


    }//GEN-LAST:event_TipodemedicoActionPerformed

    private void TipodemedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipodemedicoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TipodemedicoMouseClicked

    private void primernombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primernombreMouseExited

        primernombre.setBackground(new java.awt.Color(255, 255, 255));
        primernombre.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_primernombreMouseExited

    private void primernombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primernombreMouseMoved

        primernombre.setBackground(new java.awt.Color(127, 170, 229));
        primernombre.setForeground(new java.awt.Color(11, 17, 113));

    }//GEN-LAST:event_primernombreMouseMoved

    private void primerapellidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerapellidoMouseExited

        primerapellido.setBackground(new java.awt.Color(255, 255, 255));
        primerapellido.setForeground(new java.awt.Color(102, 102, 102));

    }//GEN-LAST:event_primerapellidoMouseExited

    private void primerapellidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerapellidoMouseMoved

        primerapellido.setBackground(new java.awt.Color(127, 170, 229));
        primerapellido.setForeground(new java.awt.Color(11, 17, 113));

    }//GEN-LAST:event_primerapellidoMouseMoved

    private void cedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseExited

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setForeground(new java.awt.Color(102, 102, 102));


    }//GEN-LAST:event_cedulaMouseExited

    private void cedulaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseMoved

        cedula.setBackground(new java.awt.Color(127, 170, 229));
        cedula.setForeground(new java.awt.Color(11, 17, 113));
    }//GEN-LAST:event_cedulaMouseMoved

    private void telefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseExited

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setForeground(new java.awt.Color(102, 102, 102));


    }//GEN-LAST:event_telefonoMouseExited

    private void telefonoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseMoved

        telefono.setBackground(new java.awt.Color(127, 170, 229));
        telefono.setForeground(new java.awt.Color(11, 17, 113));

    }//GEN-LAST:event_telefonoMouseMoved

    private void correoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseMoved

        correo.setBackground(new java.awt.Color(127, 170, 229));
        correo.setForeground(new java.awt.Color(11, 17, 113));

    }//GEN-LAST:event_correoMouseMoved

    private void correoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseExited

        correo.setBackground(new java.awt.Color(255, 255, 255));
        correo.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_correoMouseExited

    private void TipodemedicoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipodemedicoMouseMoved

        Tipodemedico.setBackground(new java.awt.Color(127, 170, 229));
        Tipodemedico.setForeground(new java.awt.Color(11, 17, 113));

    }//GEN-LAST:event_TipodemedicoMouseMoved

    private void TipodemedicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipodemedicoMouseExited

        Tipodemedico.setBackground(new java.awt.Color(255, 255, 255));
        Tipodemedico.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_TipodemedicoMouseExited

    private void areadelprofMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areadelprofMouseMoved

        areadelprof.setBackground(new java.awt.Color(127, 170, 229));
        areadelprof.setForeground(new java.awt.Color(11, 17, 113));

    }//GEN-LAST:event_areadelprofMouseMoved

    private void areadelprofMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areadelprofMouseExited

        areadelprof.setBackground(new java.awt.Color(255, 255, 255));
        areadelprof.setForeground(new java.awt.Color(102, 102, 102));

        Tipodemedico.setForeground(new java.awt.Color(102, 102, 102));    }//GEN-LAST:event_areadelprofMouseExited

    private void areadelprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areadelprofActionPerformed


    }//GEN-LAST:event_areadelprofActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setState(LogIn.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void primernombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primernombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primernombreActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void primernombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primernombreKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || Character.isSpace(evt.getKeyChar())) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_primernombreKeyTyped

    private void primerapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerapellidoKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || Character.isSpace(evt.getKeyChar())) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_primerapellidoKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        //Character.isLetter(evt.getKeyChar()) && Character.isSpace(evt.getKeyChar()) == false
    }//GEN-LAST:event_correoKeyTyped

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        primernombre.setText("");
        primerapellido.setText("");
        cedula.setText("");
        telefono.setText("");
        correo.setText("");
        Tipodemedico.setSelectedIndex(0);
        areadelprof.removeAllItems();
        modificar.setEnabled(false);

        primerapellido.setEnabled(true);
        primernombre.setEnabled(true);
        cedula.setEnabled(true);
        agregar.setEnabled(true);


    }//GEN-LAST:event_limpiarActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FDoctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDoctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDoctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDoctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tipodemedico;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> areadelprof;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField primerapellido;
    private javax.swing.JTextField primernombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
