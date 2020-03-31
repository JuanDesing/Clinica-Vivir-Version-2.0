/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.net.URI;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import Clases.Area;
import Clases.Conexion;
import Clases.Doctor;
import Clases.Entrada_Salidaa;
import Clases.Paciente;
import static GUI.FPaciente.*;
import static GUI.Historialclinico.tabla;
import static GUI.LogIn.*;
import static GUI.Lista_Doctores.*;
import Mensajes.ErrorAlert;
import Mensajes.ErrorAlert1;
import Mensajes.ErrorAlertarea;
import Mensajes.ErrorAlertdoctor;
import Mensajes.ErrorAlertgrande;
import Mensajes.ErrorAlertgrande_login;
import Mensajes.WarningAlertCerrar1;
import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jrockit.jfr.tools.ConCatRepository;

public class LogIn extends javax.swing.JFrame {

    public static LinkedList<Area> areas = new LinkedList<Area>();
    public static LinkedList<Doctor> listadoctores = new LinkedList<>();
    public static LinkedList<Paciente> listapacientes = new LinkedList<>();
    public static LinkedList<Entrada_Salidaa> controlentsal = new LinkedList<>();
    public FArea ventanaArea = new FArea();
    public FPaciente ventanaPaciente = new FPaciente();
    public FDoctor ventanaDoctor = new FDoctor();
    public Historialclinico historialc = new Historialclinico();
    public Lista_Doctores listadoct = new Lista_Doctores();

    Control_Entrada ce;
    Control_Sallida cs;

    public static Entrada_Salidaa entsal;
    public static Area area;
    public static Paciente pac;
    public static Doctor d;

    public LogIn() {
        initComponents();

        this.setLocationRelativeTo(null);
        contenedormenuprincipal.setVisible(false);
        Contenedorreportes.setVisible(false);

        try {

            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("select * from usuario");

            tipousuario.addItem("Seleccione");
            while (rs.next()) {
                tipousuario.addItem(rs.getString(3));
            }

            logoprin.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*public JLabel acederjlbAsignarDoctor() {
     return this.jlbAsignarDoctor;
     }

     public JLabel acederjlbAsignarPaciente() {
     return this.jlbAsignarPaciente;
     }*/
    public void OpenInternet() {

        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        jlbInternet = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        tipousuario = new javax.swing.JComboBox();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        contenedormenuprincipal = new javax.swing.JPanel();
        jlbAsignarArea = new javax.swing.JLabel();
        jlbAsignarDoctor = new javax.swing.JLabel();
        jlbAsignarPaciente = new javax.swing.JLabel();
        controlentrada = new javax.swing.JLabel();
        reportes = new javax.swing.JLabel();
        controlsalida = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cerrarminimizar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        logoprin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        separadorclinicavivir = new javax.swing.JSeparator();
        clinicavivir = new javax.swing.JLabel();
        separadorclinicavivir1 = new javax.swing.JSeparator();
        Contenedorreportes = new javax.swing.JPanel();
        listadoareas = new javax.swing.JLabel();
        listadodoctores = new javax.swing.JLabel();
        Historialclinico = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpingreso.setBackground(new java.awt.Color(21, 27, 69));
        jpingreso.setForeground(new java.awt.Color(255, 255, 255));
        jpingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Password:");
        jpingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Usuario:");
        jpingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        jpingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 100, 100));
        jpingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 207, 17));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_32px_1.png"))); // NOI18N
        jpingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 33));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Key_32px.png"))); // NOI18N
        jpingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 38, 33));

        enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_OFF.png"))); // NOI18N
        enter.setToolTipText("Entrar");
        enter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enter.setBorderPainted(false);
        enter.setContentAreaFilled(false);
        enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        enter.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        enter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        enter.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                enterMouseMoved(evt);
            }
        });
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        enter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterKeyTyped(evt);
            }
        });
        jpingreso.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, 34));

        jlbInternet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbInternet.setForeground(new java.awt.Color(255, 255, 255));
        jlbInternet.setText("Cerrar sesión");
        jlbInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbInternet.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbInternetMouseMoved(evt);
            }
        });
        jlbInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbInternetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbInternetMouseEntered(evt);
            }
        });
        jpingreso.add(jlbInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 40, 120, 40));
        jpingreso.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 207, 17));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_32px_1.png"))); // NOI18N
        jpingreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 33));

        tipousuario.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tipousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipousuarioActionPerformed(evt);
            }
        });
        jpingreso.add(tipousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 170, 40));
        jpingreso.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 207, 17));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px.png"))); // NOI18N
        jLabel6.setToolTipText("Menu");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jpingreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setPreferredSize(new java.awt.Dimension(0, 15));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        jpingreso.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 173, 40));

        usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(153, 153, 153));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setBorder(null);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jpingreso.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 174, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Tipo usuario:");
        jpingreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        getContentPane().add(jpingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        contenedormenuprincipal.setBackground(new java.awt.Color(21, 27, 69));
        contenedormenuprincipal.setForeground(new java.awt.Color(255, 255, 255));
        contenedormenuprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbAsignarArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbAsignarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/asignar area.png"))); // NOI18N
        jlbAsignarArea.setToolTipText("");
        jlbAsignarArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbAsignarArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbAsignarAreaMouseMoved(evt);
            }
        });
        jlbAsignarArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbAsignarAreaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbAsignarAreaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbAsignarAreaMousePressed(evt);
            }
        });
        contenedormenuprincipal.add(jlbAsignarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 200, 140));

        jlbAsignarDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbAsignarDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/asignar doctor.png"))); // NOI18N
        jlbAsignarDoctor.setToolTipText("");
        jlbAsignarDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbAsignarDoctor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbAsignarDoctorMouseMoved(evt);
            }
        });
        jlbAsignarDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbAsignarDoctorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbAsignarDoctorMouseExited(evt);
            }
        });
        contenedormenuprincipal.add(jlbAsignarDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 200, 140));

        jlbAsignarPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbAsignarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paciente_1.png"))); // NOI18N
        jlbAsignarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbAsignarPaciente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbAsignarPacienteMouseMoved(evt);
            }
        });
        jlbAsignarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbAsignarPacienteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbAsignarPacienteMouseExited(evt);
            }
        });
        contenedormenuprincipal.add(jlbAsignarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 50, 190, 140));

        controlentrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        controlentrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/facturar Grande.png"))); // NOI18N
        controlentrada.setToolTipText("");
        controlentrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        controlentrada.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                controlentradaMouseMoved(evt);
            }
        });
        controlentrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlentradaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                controlentradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                controlentradaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                controlentradaMousePressed(evt);
            }
        });
        contenedormenuprincipal.add(controlentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 140));

        reportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/impresora.png"))); // NOI18N
        reportes.setToolTipText("");
        reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                reportesMouseMoved(evt);
            }
        });
        reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportesMouseExited(evt);
            }
        });
        contenedormenuprincipal.add(reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 190, 140));

        controlsalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        controlsalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/facturar Grande.png"))); // NOI18N
        controlsalida.setToolTipText("");
        controlsalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        controlsalida.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                controlsalidaMouseMoved(evt);
            }
        });
        controlsalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlsalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                controlsalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                controlsalidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                controlsalidaMousePressed(evt);
            }
        });
        contenedormenuprincipal.add(controlsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 200, 140));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Reportes");
        contenedormenuprincipal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, 30));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Asignar area");
        contenedormenuprincipal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 193, 110, 30));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Asignar doctor");
        contenedormenuprincipal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, 30));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Control entrada");
        contenedormenuprincipal.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 130, 30));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Control salida");
        contenedormenuprincipal.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 120, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Registrar paciente");
        contenedormenuprincipal.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        contenedormenuprincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 520));

        getContentPane().add(contenedormenuprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        cerrarminimizar.setBackground(new java.awt.Color(21, 27, 69));
        cerrarminimizar.setForeground(new java.awt.Color(255, 255, 255));
        cerrarminimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel16.setToolTipText("Cerrar");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        cerrarminimizar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel15.setToolTipText("Minimizar");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        cerrarminimizar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, 50));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMinimumSize(new java.awt.Dimension(5, 5));
        cerrarminimizar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        getContentPane().add(cerrarminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        logoprin.setBackground(new java.awt.Color(21, 27, 69));
        logoprin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondoclinica.png"))); // NOI18N
        logoprin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 50, 480, 450));

        separadorclinicavivir.setForeground(new java.awt.Color(204, 204, 204));
        separadorclinicavivir.setOrientation(javax.swing.SwingConstants.VERTICAL);
        logoprin.add(separadorclinicavivir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 530));

        clinicavivir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        clinicavivir.setForeground(new java.awt.Color(204, 204, 204));
        clinicavivir.setText("Clinica Vivir");
        logoprin.add(clinicavivir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 20));

        separadorclinicavivir1.setForeground(new java.awt.Color(204, 204, 204));
        logoprin.add(separadorclinicavivir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 510, 10));

        getContentPane().add(logoprin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        Contenedorreportes.setBackground(new java.awt.Color(21, 27, 69));
        Contenedorreportes.setForeground(new java.awt.Color(255, 255, 255));
        Contenedorreportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listadoareas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listadoareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/asignar area.png"))); // NOI18N
        listadoareas.setToolTipText("");
        listadoareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listadoareas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                listadoareasMouseMoved(evt);
            }
        });
        listadoareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoareasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listadoareasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listadoareasMousePressed(evt);
            }
        });
        Contenedorreportes.add(listadoareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 200, 140));

        listadodoctores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listadodoctores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/asignar doctor.png"))); // NOI18N
        listadodoctores.setToolTipText("");
        listadodoctores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listadodoctores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                listadodoctoresMouseMoved(evt);
            }
        });
        listadodoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadodoctoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listadodoctoresMouseExited(evt);
            }
        });
        Contenedorreportes.add(listadodoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 200, 140));

        Historialclinico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Historialclinico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paciente_1.png"))); // NOI18N
        Historialclinico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Historialclinico.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HistorialclinicoMouseMoved(evt);
            }
        });
        Historialclinico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialclinicoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialclinicoMouseExited(evt);
            }
        });
        Contenedorreportes.add(Historialclinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 179, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/volver-con-flecha-en-boton-cuadrado-solido.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        Contenedorreportes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 70, 50));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Menú principal");
        Contenedorreportes.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 140, 50));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Historial clínico");
        Contenedorreportes.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, 30));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Listado de areas");
        Contenedorreportes.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 193, 130, 30));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Listado de doctores");
        Contenedorreportes.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 30));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Contenedorreportes.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 530));

        getContentPane().add(Contenedorreportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //public static Entrada_Salida pacentsal;

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-100, 10, 10, 5, jlbInternet);

        AnimationClass internett = new AnimationClass();
        internett.jLabelXLeft(10, -100, 10, 5, jlbInternet);


    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        this.setState(LogIn.ICONIFIED);

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

//        int dialog = JOptionPane.YES_NO_OPTION;
//        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la ventana", "Exit", dialog);
//
//        if (result == 0) {
//            System.exit(0);
//        }
        WarningAlertCerrar1 close = new WarningAlertCerrar1(this, true);
        close.setVisible(true);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jlbAsignarAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarAreaMouseMoved

        jlbAsignarArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    }//GEN-LAST:event_jlbAsignarAreaMouseMoved

    private void jlbAsignarAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarAreaMouseExited

        jlbAsignarArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));

    }//GEN-LAST:event_jlbAsignarAreaMouseExited

    private void jlbAsignarDoctorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarDoctorMouseMoved

        //jlbAsignarDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jlbAsignarDoctor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    }//GEN-LAST:event_jlbAsignarDoctorMouseMoved

    private void jlbAsignarDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarDoctorMouseClicked

        if (jlbAsignarDoctor.isEnabled()) {
            if (ventanaDoctor.isVisible()) {
                ventanaDoctor.toFront();
                ventanaDoctor.requestFocus();
            } else {
                ventanaDoctor.setVisible(true);
            }
        }

    }//GEN-LAST:event_jlbAsignarDoctorMouseClicked

    private void jlbAsignarDoctorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarDoctorMouseExited
        jlbAsignarDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));
    }//GEN-LAST:event_jlbAsignarDoctorMouseExited

    private void jlbAsignarPacienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarPacienteMouseMoved

        //jlbAsignarPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jlbAsignarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jlbAsignarPacienteMouseMoved

    private void jlbAsignarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarPacienteMouseExited
        jlbAsignarPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));

    }//GEN-LAST:event_jlbAsignarPacienteMouseExited

    private void jlbAsignarAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarAreaMousePressed

    }//GEN-LAST:event_jlbAsignarAreaMousePressed

    private void jlbAsignarAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarAreaMouseClicked

        if (jlbAsignarArea.isEnabled()) {
            if (ventanaArea.isVisible()) {
                ventanaArea.toFront();
                ventanaArea.requestFocus();
            } else {
                ventanaArea.setVisible(true);
            }
        }


    }//GEN-LAST:event_jlbAsignarAreaMouseClicked

    private void jlbAsignarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAsignarPacienteMouseClicked

        if (jlbAsignarPaciente.isEnabled()) {
            if (ventanaPaciente.isVisible()) {
                ventanaPaciente.toFront();
                ventanaPaciente.requestFocus();
            } else {
                ventanaPaciente.setVisible(true);
            }
        }

    }//GEN-LAST:event_jlbAsignarPacienteMouseClicked

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();


            if (tipousuario.getSelectedIndex() == 0) {

                ErrorAlert1 obj = new ErrorAlert1(this, true);
                obj.t1.setText("¡¡POR FAVOR, SELECCIONE");
                obj.t1.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
                obj.t1.setForeground(new java.awt.Color(153, 153, 153));
                obj.t2.setText("EL TIPO DE USUARIO!!");
                obj.t2.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
                obj.t2.setForeground(new java.awt.Color(153, 153, 153));
                obj.setVisible(true);
            } else if (tipousuario.getSelectedIndex() != 0) {

                switch (tipousuario.getSelectedItem().toString()) {

                    case "Administrador":

                        ResultSet rs = con.consultar("select * from usuario where idusuario = 1");

                        while (rs.next()) {

                            if (usuario.getText().trim().equals(rs.getString(2)) && password.getText().trim().equals(rs.getString(4))) {
                                tipousuario.removeAllItems();
                                usuario.setText(null);
                                password.setText(null);
                                tipousuario.setEnabled(false);
                                usuario.setEnabled(false);
                                password.setEnabled(false);
                                enter.setEnabled(false);

                                jlbAsignarArea.setEnabled(true);
                                jlbAsignarDoctor.setEnabled(true);
                                jlbAsignarPaciente.setEnabled(true);
                                listadoareas.setEnabled(true);
                                listadodoctores.setEnabled(true);

                                contenedormenuprincipal.setVisible(true);

                            } else if (!usuario.getText().trim().equals(rs.getString(2)) && password.getText().trim().equals(rs.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                                ErrorAlert obj = new ErrorAlert(this, true);
                                obj.titulo1.setText("¡USUARIO INCORRECTO!");
                                obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                obj.setVisible(true);
                            } else if (usuario.getText().trim().equals(rs.getString(2)) && !password.getText().trim().equals(rs.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                                ErrorAlert obj = new ErrorAlert(this, true);
                                obj.titulo1.setText("¡CONTRASEÑA INCORRECTA!");
                                obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                obj.setVisible(true);
                            } else {
//            JOptionPane.showMessageDialog(null, "El usuario y la contraseña no son correctos"
//                    + "Rectifique!");
                                ErrorAlert obj = new ErrorAlert(this, true);
                                obj.titulo1.setText("¡USUARIO Y CONTRASEÑA INCORRECTOS!");
                                obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
                                obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                obj.setVisible(true);
                            }

                        }

                        break;
                    case "Doctor":

                        ResultSet rs2 = con.consultar("select * from usuario where idusuario = 2");

                        while (rs2.next()) {

                            if (usuario.getText().trim().equals(rs2.getString(2)) && password.getText().trim().equals(rs2.getString(4))) {

                                tipousuario.removeAllItems();
                                usuario.setText(null);
                                password.setText(null);
                                tipousuario.setEnabled(false);
                                usuario.setEnabled(false);
                                password.setEnabled(false);
                                enter.setEnabled(false);

                                jlbAsignarArea.setEnabled(false);
                                jlbAsignarDoctor.setEnabled(false);

                                listadoareas.setEnabled(false);
                                listadodoctores.setEnabled(false);

                                contenedormenuprincipal.setVisible(true);

                            } else if (!usuario.getText().trim().equals(rs2.getString(2)) && password.getText().trim().equals(rs2.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                                ErrorAlert obj = new ErrorAlert(this, true);
                                obj.titulo1.setText("¡USUARIO INCORRECTO!");
                                obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                obj.setVisible(true);
                            } else if (usuario.getText().trim().equals(rs2.getString(2)) && !password.getText().trim().equals(rs2.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                                ErrorAlert obj = new ErrorAlert(this, true);
                                obj.titulo1.setText("¡CONTRASEÑA INCORRECTA!");
                                obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                obj.setVisible(true);
                            } else {
//            JOptionPane.showMessageDialog(null, "El usuario y la contraseña no son correctos"
//                    + "Rectifique!");
                                ErrorAlert obj = new ErrorAlert(this, true);
                                obj.titulo1.setText("¡USUARIO Y CONTRASEÑA INCORRECTOS!");
                                obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
                                obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                obj.setVisible(true);
                            }

                        }

                        break;

                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_enterActionPerformed

    private void enterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseMoved


    }//GEN-LAST:event_enterMouseMoved

    private void listadoareasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoareasMouseMoved
        listadoareas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    }//GEN-LAST:event_listadoareasMouseMoved

    private void listadoareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoareasMouseClicked

        if (listadoareas.isEnabled()) {
            new Lista_Areas().setVisible(true);
        }


    }//GEN-LAST:event_listadoareasMouseClicked

    private void listadoareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoareasMouseExited

        listadoareas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));
    }//GEN-LAST:event_listadoareasMouseExited

    private void listadoareasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoareasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listadoareasMousePressed

    private void listadodoctoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadodoctoresMouseMoved
        listadodoctores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_listadodoctoresMouseMoved

    private void listadodoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadodoctoresMouseClicked

        if (listadodoctores.isEnabled()) {
            new Lista_Doctores().setVisible(true);
        }

    }//GEN-LAST:event_listadodoctoresMouseClicked

    private void listadodoctoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadodoctoresMouseExited

        listadodoctores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));
    }//GEN-LAST:event_listadodoctoresMouseExited

    private void HistorialclinicoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialclinicoMouseMoved
        Historialclinico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_HistorialclinicoMouseMoved

    private void HistorialclinicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialclinicoMouseClicked

        tabla.removeAll();
        new Historialclinico().setVisible(true);

    }//GEN-LAST:event_HistorialclinicoMouseClicked

    private void HistorialclinicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialclinicoMouseExited

        Historialclinico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));

    }//GEN-LAST:event_HistorialclinicoMouseExited

    private void reportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesMouseExited

        reportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));
    }//GEN-LAST:event_reportesMouseExited

    private void reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesMouseClicked

        Contenedorreportes.setVisible(true);
        contenedormenuprincipal.setVisible(false);
        logoprin.setVisible(false);
    }//GEN-LAST:event_reportesMouseClicked

    private void reportesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesMouseMoved
        reportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    }//GEN-LAST:event_reportesMouseMoved

    private void controlentradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlentradaMousePressed


    }//GEN-LAST:event_controlentradaMousePressed

    private void controlentradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlentradaMouseExited

        controlentrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));
    }//GEN-LAST:event_controlentradaMouseExited

    private void controlentradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlentradaMouseClicked

        if (controlentrada.isEnabled()) {

            try {

                ErrorAlertdoctor obj = new ErrorAlertdoctor(this, true);
                obj.titulo.setText("Ingrese la cedula del paciente:");
                obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
                obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
                obj.setVisible(true);

                Conexion con = new Conexion();
                con.ConexionPostgres();
                ResultSet tp = con.consultar("Select * from paciente where cedula_paciente = " + obj.idd.getText() + "  ");
                boolean estaentbpaciente = false, estaenlaclinica = false;

                if (tp.next()) {
                    //
                /**/
                    estaentbpaciente = true;

                } else {
                    ErrorAlertgrande_login ea1 = new ErrorAlertgrande_login(this, true);
                    ea1.t1.setText("No se le pude realizar la entrada a un paciente");
                    ea1.t2.setText("que no se encuentra registrado, REGISTRALO!!!!");
                    ea1.t1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
                    ea1.t2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
                    ea1.t1.setForeground(new java.awt.Color(153, 153, 153));
                    ea1.t2.setForeground(new java.awt.Color(153, 153, 153));
                    ea1.setVisible(true);

                    FPaciente fp = new FPaciente();

                    fp.cedula.setText(obj.idd.getText());
                    fp.setVisible(true);
//                JOptionPane.showMessageDialog(null, "Paciente no existe!");
                    con.cerrar();
                }

                if (estaentbpaciente == true) {
                    ResultSet tcesyp = con.consultar("select c.paciente_cedula_paciente, p.primer_nombre_paciente from control_entrada_salida c inner join paciente p on c.paciente_cedula_paciente = p.cedula_paciente where paciente_cedula_paciente = " + obj.idd.getText() + " and fecha_salida is null ");

                    if (!tcesyp.next()) {
                        estaenlaclinica = false;
                    } else {
                        ErrorAlertgrande_login ea1 = new ErrorAlertgrande_login(this, true);
                        ea1.t1.setText("Este paciente se encuentra en la clínica");
                        ea1.t2.setText("No se le puede hacer la entrada nuevamente!!!");
                        ea1.t1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
                        ea1.t2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
                        ea1.t1.setForeground(new java.awt.Color(153, 153, 153));
                        ea1.t2.setForeground(new java.awt.Color(153, 153, 153));
                        ea1.setVisible(true);
//                    JOptionPane.showMessageDialog(null, "Este paciente se encuentra en la clínica"
//                            + "\nNo se le puede hacer la entrada nuevamente!!!");
                        estaenlaclinica = true;
                    }

                    if (estaenlaclinica == false) {
                        ResultSet tp2 = con.consultar("Select * from paciente where cedula_paciente = " + obj.idd.getText() + "  ");

                        if (tp2.next()) {
                            Control_Entrada ce = new Control_Entrada();

                            ce.nombre.setText(tp2.getString(2));
                            ce.ced2.setText(tp2.getString(1));
                            ce.ced2.setEnabled(false);
                            ce.nombre.setEnabled(false);

                            ce.setVisible(true);
                        }
                    }

                }

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

        }

    }//GEN-LAST:event_controlentradaMouseClicked

    private void controlentradaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlentradaMouseMoved
        controlentrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_controlentradaMouseMoved

    private void controlentradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlentradaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_controlentradaMouseEntered

    private void controlsalidaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlsalidaMouseMoved
        controlsalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_controlsalidaMouseMoved

    private void controlsalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlsalidaMouseClicked

        if (controlsalida.isEnabled()) {
            try {

                Conexion con = new Conexion();
                con.ConexionPostgres();
                ErrorAlertarea obj = new ErrorAlertarea(this, true);
                obj.titulo.setText("Ingrese la cedula del paciente: ");
                obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
                obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
                obj.setVisible(true);
//                String cedpaciente = JOptionPane.showInputDialog("Ingrese la cedula del paciente "
//                        + "\npara realizarle la salida: ");

                ResultSet tp = con.consultar("Select * from paciente where cedula_paciente = " + obj.idd.getText() + "  ");
                boolean estaentbpaciente = false, estaenlaclinica = false;

                if (tp.next()) {
                    //
                /**/
                    estaentbpaciente = true;
                } else {
                    ErrorAlertgrande_login ea1 = new ErrorAlertgrande_login(this, true);
                    ea1.t1.setText("No se le pude realizar la salida a un paciente");
                    ea1.t2.setText("que no se encuentra registrado, REGISTRALO!!!!");
                    ea1.t1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
                    ea1.t2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
                    ea1.t1.setForeground(new java.awt.Color(153, 153, 153));
                    ea1.t2.setForeground(new java.awt.Color(153, 153, 153));
                    ea1.setVisible(true);
//                JOptionPane.showMessageDialog(null, "No se le pude realizar la salida a un paciente"
//                        + "\nque no se encuentra registrado, REGISTRALO!!!!");

                    FPaciente fp = new FPaciente();

                    fp.cedula.setText(obj.idd.getText());
                    fp.setVisible(true);
                    /*
                     Se debe crear un mensaje de alerta unico para esta opcion control salida
                     para cargar el formulario de registro del paciente correctamente desde el boton
                     aceptar de la alerta
                     */
                    con.cerrar();
                }

                if (estaentbpaciente == true) {
                    ResultSet tcesyp = con.consultar("select c.paciente_cedula_paciente, c.fecha_ingreso, c.doctor_cedula_doctor, c.estado_paciente_control_entrada, p.primer_nombre_paciente, d.primer_nombre_doctor from control_entrada_salida c inner join paciente p on c.paciente_cedula_paciente = p.cedula_paciente inner join doctor d on c.doctor_cedula_doctor = d.cedula_doctor where paciente_cedula_paciente = " + obj.idd.getText() + " and fecha_salida is null ");

                    if (tcesyp.next()) {
                        Control_Sallida cs = new Control_Sallida();

                        cs.nombre.setText(tcesyp.getString(5));
                        cs.ced2.setText(tcesyp.getString(1));
                        cs.Fechaingreso.setDate(tcesyp.getDate(2));
                        cs.estpaciente.setSelectedItem(tcesyp.getString(4));
                        cs.doctorasignado.setSelectedItem(tcesyp.getString(3) + " - " + tcesyp.getString(6));

                        cs.setVisible(true);
                        cs.nombre.setEnabled(false);
                        cs.ced2.setEnabled(false);
                        cs.Fechaingreso.setEnabled(false);
                        cs.estpaciente.setEnabled(false);
                        cs.doctorasignado.setEnabled(false);
                        cs.valor.setEnabled(false);
                    } else {
                        ErrorAlertgrande_login ea1 = new ErrorAlertgrande_login(this, true);
                        ea1.t1.setText("Ops! Este paciente nunca ha entrado");
                        ea1.t2.setText("a la clínica, REALÍCELE LA ENTRADA!!!");
                        ea1.t1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
                        ea1.t2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
                        ea1.t1.setForeground(new java.awt.Color(153, 153, 153));
                        ea1.t2.setForeground(new java.awt.Color(153, 153, 153));
                        ea1.setVisible(true);

//                    JOptionPane.showMessageDialog(null, "Este paciente nunca ha entrado"
//                            + "\na la clínica, REALÍCELE LA ENTRADA!!!");
                    }

                }

                con.cerrar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_controlsalidaMouseClicked

    private void controlsalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlsalidaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_controlsalidaMouseEntered

    private void controlsalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlsalidaMouseExited

        controlsalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 28, 71)));
    }//GEN-LAST:event_controlsalidaMouseExited

    private void controlsalidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlsalidaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_controlsalidaMousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        ce = new Control_Entrada();

        contenedormenuprincipal.setVisible(true);
        ce.registrarentrada.setEnabled(true);

    }//GEN-LAST:event_jLabel7MouseClicked

    private void enterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterKeyPressed

    }//GEN-LAST:event_enterKeyPressed

    private void enterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterKeyReleased

    }//GEN-LAST:event_enterKeyReleased

    private void enterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterKeyTyped

     }//GEN-LAST:event_enterKeyTyped

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                if (tipousuario.getSelectedIndex() == 0) {

                    ErrorAlert1 obj = new ErrorAlert1(this, true);
                    obj.t1.setText("¡¡POR FAVOR, SELECCIONE");
                    obj.t1.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
                    obj.t1.setForeground(new java.awt.Color(153, 153, 153));
                    obj.t2.setText("EL TIPO DE USUARIO!!");
                    obj.t2.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
                    obj.t2.setForeground(new java.awt.Color(153, 153, 153));
                    obj.setVisible(true);

                } else if (tipousuario.getSelectedIndex() != 0) {

                    switch (tipousuario.getSelectedItem().toString()) {

                        case "Administrador":

                            ResultSet rs = con.consultar("select * from usuario where idusuario = 1");

                            while (rs.next()) {

                                if (usuario.getText().trim().equals(rs.getString(2)) && password.getText().trim().equals(rs.getString(4))) {
                                    tipousuario.removeAllItems();
                                    usuario.setText(null);
                                    password.setText(null);
                                    tipousuario.setEnabled(false);
                                    usuario.setEnabled(false);
                                    password.setEnabled(false);

                                    contenedormenuprincipal.setVisible(true);

                                } else if (!usuario.getText().trim().equals(rs.getString(2)) && password.getText().trim().equals(rs.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                                    ErrorAlert obj = new ErrorAlert(this, true);
                                    obj.titulo1.setText("¡USUARIO INCORRECTO!");
                                    obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                    obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                    obj.setVisible(true);
                                } else if (usuario.getText().trim().equals(rs.getString(2)) && !password.getText().trim().equals(rs.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                                    ErrorAlert obj = new ErrorAlert(this, true);
                                    obj.titulo1.setText("¡CONTRASEÑA INCORRECTA!");
                                    obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                    obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                    obj.setVisible(true);
                                } else {
//            JOptionPane.showMessageDialog(null, "El usuario y la contraseña no son correctos"
//                    + "Rectifique!");
                                    ErrorAlert obj = new ErrorAlert(this, true);
                                    obj.titulo1.setText("¡USUARIO Y CONTRASEÑA INCORRECTOS!");
                                    obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
                                    obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                    obj.setVisible(true);
                                }

                            }

                            break;
                        case "Doctor":

                            ResultSet rs2 = con.consultar("select * from usuario where idusuario = 2");

                            while (rs2.next()) {

                                if (usuario.getText().trim().equals(rs2.getString(2)) && password.getText().trim().equals(rs2.getString(4))) {

                                    tipousuario.removeAllItems();
                                    usuario.setText(null);
                                    password.setText(null);
                                    tipousuario.setEnabled(false);
                                    usuario.setEnabled(false);
                                    password.setEnabled(false);

                                    jlbAsignarArea.setEnabled(false);
                                    jlbAsignarDoctor.setEnabled(false);

                                    listadoareas.setEnabled(false);
                                    listadoct.setEnabled(false);
                                    contenedormenuprincipal.setVisible(true);

                                } else if (!usuario.getText().trim().equals(rs2.getString(2)) && password.getText().trim().equals(rs2.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                                    ErrorAlert obj = new ErrorAlert(this, true);
                                    obj.titulo1.setText("¡USUARIO INCORRECTO!");
                                    obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                    obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                    obj.setVisible(true);
                                } else if (usuario.getText().trim().equals(rs2.getString(2)) && !password.getText().trim().equals(rs2.getString(4))) {
//            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                                    ErrorAlert obj = new ErrorAlert(this, true);
                                    obj.titulo1.setText("¡CONTRASEÑA INCORRECTA!");
                                    obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                                    obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                    obj.setVisible(true);
                                } else {
//            JOptionPane.showMessageDialog(null, "El usuario y la contraseña no son correctos"
//                    + "Rectifique!");
                                    ErrorAlert obj = new ErrorAlert(this, true);
                                    obj.titulo1.setText("¡USUARIO Y CONTRASEÑA INCORRECTOS!");
                                    obj.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
                                    obj.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                                    obj.setVisible(true);
                                }

                            }

                            break;
                    }
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_passwordKeyPressed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyReleased

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyTyped

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void jlbInternetMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInternetMouseMoved


    }//GEN-LAST:event_jlbInternetMouseMoved

    private void jlbInternetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInternetMouseEntered
        // TODO add your handling code here:


    }//GEN-LAST:event_jlbInternetMouseEntered

    private void jlbInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInternetMouseClicked
        // TODO add your handling code here:

        contenedormenuprincipal.setVisible(false);
        logoprin.setVisible(true);

        tipousuario.setEnabled(true);
        usuario.setEnabled(true);
        password.setEnabled(true);
        enter.setEnabled(true);

        try {

            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("select * from usuario");

            tipousuario.removeAllItems();
            tipousuario.addItem("Seleccione");
            while (rs.next()) {
                tipousuario.addItem(rs.getString(3));
            }

            Contenedorreportes.setVisible(false);
            logoprin.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }

        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-100, 10, 10, 5, jlbInternet);

        AnimationClass internett = new AnimationClass();
        internett.jLabelXLeft(10, -100, 10, 5, jlbInternet);

    }//GEN-LAST:event_jlbInternetMouseClicked

    private void tipousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipousuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipousuarioActionPerformed

    /*public static void main(String[] args) {
     LogIn clasePrincipal = new LogIn();
     clasePrincipal.setVisible(true);
     }*/
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedorreportes;
    public static javax.swing.JLabel Historialclinico;
    private javax.swing.JPanel cerrarminimizar;
    private javax.swing.JLabel clinicavivir;
    private javax.swing.JPanel contenedormenuprincipal;
    public static javax.swing.JLabel controlentrada;
    public static javax.swing.JLabel controlsalida;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlbAsignarArea;
    public static javax.swing.JLabel jlbAsignarDoctor;
    public static javax.swing.JLabel jlbAsignarPaciente;
    private javax.swing.JLabel jlbInternet;
    private javax.swing.JPanel jpingreso;
    private javax.swing.JLabel listadoareas;
    public static javax.swing.JLabel listadodoctores;
    private javax.swing.JPanel logoprin;
    private javax.swing.JPasswordField password;
    public static javax.swing.JLabel reportes;
    private javax.swing.JSeparator separadorclinicavivir;
    private javax.swing.JSeparator separadorclinicavivir1;
    private javax.swing.JComboBox tipousuario;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
