/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinev;

import java.awt.Color;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author fband
 */
public class InterfazGestionFunciones extends javax.swing.JFrame {
    
  int xMouse, yMouse;
  private String rutaImagen; 
  private Conexion conexion = new Conexion();
    Connection con = conexion.establecerConexion();
    
    /**
     * Creates new form InterfazRegPeli
     */
    public InterfazGestionFunciones() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(menulbl,"src/main/java/images/Menu75.png");
        SetImageLabel(candylbl,"src/main/java/images/Store 75.png");
        SetImageLabel(ticlbl,"src/main/java/images/Ticket75.png");
        SetImageLabel(usulbl,"src/main/java/images/User75.png");
        SetImageLabel(whatsalbl,"src/main/java/images/Whats75.png");
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        menuF = new javax.swing.JPanel();
        menulbl = new javax.swing.JLabel();
        ticF = new javax.swing.JPanel();
        ticlbl = new javax.swing.JLabel();
        candyF = new javax.swing.JPanel();
        candylbl = new javax.swing.JLabel();
        usuF = new javax.swing.JPanel();
        usulbl = new javax.swing.JLabel();
        whatsaF = new javax.swing.JPanel();
        whatsalbl = new javax.swing.JLabel();
        prece = new javax.swing.JPanel();
        guardar = new javax.swing.JPanel();
        cerrarlbl = new javax.swing.JLabel();
        subTitulosHorarios = new javax.swing.JLabel();
        funcionesComboBox = new javax.swing.JComboBox<>();
        peliculasComboBox = new javax.swing.JComboBox<>();
        tituloGestion = new javax.swing.JLabel();
        subTituloFunciones = new javax.swing.JLabel();
        subtitulosPeliculas = new javax.swing.JLabel();
        horarioPanel = new javax.swing.JPanel();
        horarioTexto = new javax.swing.JTextField();
        subAnia = new javax.swing.JLabel();
        aniadirBtn = new javax.swing.JToggleButton();
        subAnia1 = new javax.swing.JLabel();
        funcionesParaModificarComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        paraNombrePeliculaLbl = new javax.swing.JLabel();
        subtitulosPeliculas1 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JToggleButton();
        eliminarBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(11, 23, 128));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(13, 20, 58));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(17, 27, 82));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuF.setBackground(new java.awt.Color(17, 27, 82));
        menuF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuFMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuFLayout = new javax.swing.GroupLayout(menuF);
        menuF.setLayout(menuFLayout);
        menuFLayout.setHorizontalGroup(
            menuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuFLayout.setVerticalGroup(
            menuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFLayout.createSequentialGroup()
                .addComponent(menulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(menuF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 70));

        ticF.setBackground(new java.awt.Color(17, 27, 82));
        ticF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ticF.setPreferredSize(new java.awt.Dimension(70, 70));
        ticF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ticFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ticFMouseExited(evt);
            }
        });

        ticlbl.setPreferredSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout ticFLayout = new javax.swing.GroupLayout(ticF);
        ticF.setLayout(ticFLayout);
        ticFLayout.setHorizontalGroup(
            ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ticFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ticlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ticFLayout.setVerticalGroup(
            ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ticFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ticlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(ticF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 70));

        candyF.setBackground(new java.awt.Color(17, 27, 82));
        candyF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        candyF.setPreferredSize(new java.awt.Dimension(70, 70));
        candyF.setRequestFocusEnabled(false);
        candyF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                candyFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                candyFMouseExited(evt);
            }
        });

        javax.swing.GroupLayout candyFLayout = new javax.swing.GroupLayout(candyF);
        candyF.setLayout(candyFLayout);
        candyFLayout.setHorizontalGroup(
            candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(candyFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(candylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        candyFLayout.setVerticalGroup(
            candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(candyFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(candylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(candyF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        usuF.setBackground(new java.awt.Color(17, 27, 82));
        usuF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuF.setPreferredSize(new java.awt.Dimension(70, 70));
        usuF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuFMouseExited(evt);
            }
        });

        javax.swing.GroupLayout usuFLayout = new javax.swing.GroupLayout(usuF);
        usuF.setLayout(usuFLayout);
        usuFLayout.setHorizontalGroup(
            usuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuFLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        usuFLayout.setVerticalGroup(
            usuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuFLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(usuF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 70));

        whatsaF.setBackground(new java.awt.Color(17, 27, 82));
        whatsaF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whatsaF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                whatsaFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                whatsaFMouseExited(evt);
            }
        });

        javax.swing.GroupLayout whatsaFLayout = new javax.swing.GroupLayout(whatsaF);
        whatsaF.setLayout(whatsaFLayout);
        whatsaFLayout.setHorizontalGroup(
            whatsaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whatsalbl, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        whatsaFLayout.setVerticalGroup(
            whatsaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whatsalbl, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu.add(whatsaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 70));

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 500));

        prece.setBackground(new java.awt.Color(13, 20, 58));
        prece.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                preceMouseDragged(evt);
            }
        });
        prece.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                preceMousePressed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(102, 0, 102));
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarMouseExited(evt);
            }
        });

        cerrarlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cerrarlbl.setForeground(new java.awt.Color(255, 255, 255));
        cerrarlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarlbl.setText("x");

        javax.swing.GroupLayout guardarLayout = new javax.swing.GroupLayout(guardar);
        guardar.setLayout(guardarLayout);
        guardarLayout.setHorizontalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        guardarLayout.setVerticalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout preceLayout = new javax.swing.GroupLayout(prece);
        prece.setLayout(preceLayout);
        preceLayout.setHorizontalGroup(
            preceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preceLayout.createSequentialGroup()
                .addGap(0, 691, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        preceLayout.setVerticalGroup(
            preceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preceLayout.createSequentialGroup()
                .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(prece, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 730, -1));

        subTitulosHorarios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subTitulosHorarios.setForeground(new java.awt.Color(255, 255, 255));
        subTitulosHorarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitulosHorarios.setText("Horario:");
        bg.add(subTitulosHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 140, 40));

        funcionesComboBox.setBackground(new java.awt.Color(102, 0, 102));
        funcionesComboBox.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        funcionesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        funcionesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        funcionesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionesComboBoxActionPerformed(evt);
            }
        });
        bg.add(funcionesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 30));

        peliculasComboBox.setBackground(new java.awt.Color(102, 0, 102));
        peliculasComboBox.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        peliculasComboBox.setForeground(new java.awt.Color(255, 255, 255));
        peliculasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        peliculasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculasComboBoxActionPerformed(evt);
            }
        });
        bg.add(peliculasComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 200, 30));

        tituloGestion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloGestion.setForeground(new java.awt.Color(255, 255, 255));
        tituloGestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloGestion.setText("Gestion de Funciones");
        bg.add(tituloGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 390, 40));

        subTituloFunciones.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subTituloFunciones.setForeground(new java.awt.Color(255, 255, 255));
        subTituloFunciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTituloFunciones.setText("Funciones:");
        bg.add(subTituloFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 180, 40));

        subtitulosPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subtitulosPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        subtitulosPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulosPeliculas.setText("Peliculas:");
        bg.add(subtitulosPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 140, 40));

        horarioPanel.setBackground(new java.awt.Color(102, 0, 102));

        horarioTexto.setBackground(new java.awt.Color(102, 0, 102));
        horarioTexto.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        horarioTexto.setForeground(java.awt.Color.gray);
        horarioTexto.setText("1500-1700");
        horarioTexto.setBorder(null);
        horarioTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                horarioTextoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout horarioPanelLayout = new javax.swing.GroupLayout(horarioPanel);
        horarioPanel.setLayout(horarioPanelLayout);
        horarioPanelLayout.setHorizontalGroup(
            horarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(horarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(horarioPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(horarioTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        horarioPanelLayout.setVerticalGroup(
            horarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(horarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(horarioPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(horarioTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(horarioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 150, 30));

        subAnia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subAnia.setForeground(new java.awt.Color(255, 255, 255));
        subAnia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subAnia.setText("Añadir Peliculas a Funciones:");
        bg.add(subAnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 390, 40));

        aniadirBtn.setBackground(new java.awt.Color(102, 0, 102));
        aniadirBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        aniadirBtn.setForeground(new java.awt.Color(255, 255, 255));
        aniadirBtn.setText("AÑADIR+");
        aniadirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aniadirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aniadirBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aniadirBtnMouseExited(evt);
            }
        });
        aniadirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirBtnActionPerformed(evt);
            }
        });
        bg.add(aniadirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 160, 40));

        subAnia1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subAnia1.setForeground(new java.awt.Color(255, 255, 255));
        subAnia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subAnia1.setText("Eliminar Peliculas:");
        bg.add(subAnia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 220, 40));

        funcionesParaModificarComboBox1.setBackground(new java.awt.Color(102, 0, 102));
        funcionesParaModificarComboBox1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        funcionesParaModificarComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        funcionesParaModificarComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        funcionesParaModificarComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionesParaModificarComboBox1ActionPerformed(evt);
            }
        });
        bg.add(funcionesParaModificarComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 160, 30));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        paraNombrePeliculaLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        paraNombrePeliculaLbl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraNombrePeliculaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraNombrePeliculaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 240, 40));

        subtitulosPeliculas1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subtitulosPeliculas1.setForeground(new java.awt.Color(255, 255, 255));
        subtitulosPeliculas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulosPeliculas1.setText("Peliculas:");
        bg.add(subtitulosPeliculas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 140, 40));

        buscarBtn.setBackground(new java.awt.Color(102, 0, 102));
        buscarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("BUSCAR");
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBtnMouseExited(evt);
            }
        });
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        bg.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 160, 40));

        eliminarBtn.setBackground(new java.awt.Color(102, 0, 102));
        eliminarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        eliminarBtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBtn.setText("ELIMINAR");
        eliminarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarBtnMouseExited(evt);
            }
        });
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        bg.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 160, 40));

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

    private void guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseEntered
       guardar.setBackground(Color.red);
    }//GEN-LAST:event_guardarMouseEntered

    private void guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseExited
        guardar.setBackground(new Color(102,0,102));
    }//GEN-LAST:event_guardarMouseExited

    private void preceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preceMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_preceMousePressed

    private void preceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preceMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_preceMouseDragged

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked

        System.exit(0);    }//GEN-LAST:event_guardarMouseClicked

    private void menuFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFMouseEntered
        menuF.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_menuFMouseEntered

    private void menuFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFMouseExited
       menuF.setBackground(new Color(17,27,82));
    }//GEN-LAST:event_menuFMouseExited

    private void ticFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticFMouseEntered
        ticF.setBackground(new Color(153,153,255)); 
    }//GEN-LAST:event_ticFMouseEntered

    private void ticFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticFMouseExited
       ticF.setBackground(new Color(17,27,82));
    }//GEN-LAST:event_ticFMouseExited

    private void candyFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candyFMouseEntered
        candyF.setBackground(new Color(153,153,255)); 
    }//GEN-LAST:event_candyFMouseEntered

    private void candyFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candyFMouseExited
        candyF.setBackground(new Color(17,27,82));
    }//GEN-LAST:event_candyFMouseExited

    private void usuFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuFMouseEntered
        usuF.setBackground(new Color(153,153,255)); 

    }//GEN-LAST:event_usuFMouseEntered

    private void usuFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuFMouseExited
       usuF.setBackground(new Color(17,27,82)); 
    }//GEN-LAST:event_usuFMouseExited

    private void whatsaFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsaFMouseEntered
        whatsaF.setBackground(new Color(153,153,255)); 
    }//GEN-LAST:event_whatsaFMouseEntered

    private void whatsaFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsaFMouseExited
         whatsaF.setBackground(new Color(17,27,82)); 
    }//GEN-LAST:event_whatsaFMouseExited

    private void funcionesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionesComboBoxActionPerformed

    private void peliculasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculasComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peliculasComboBoxActionPerformed

    private void horarioTextoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horarioTextoMousePressed
        if(horarioTexto.getText().equals("1500-1700")){
        horarioTexto.setText("");
       horarioTexto.setForeground(Color.white);
       }
    }//GEN-LAST:event_horarioTextoMousePressed

    private void aniadirBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirBtnMouseEntered
        aniadirBtn.setBackground(Color.green);
    }//GEN-LAST:event_aniadirBtnMouseEntered

    private void aniadirBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirBtnMouseExited
        aniadirBtn.setBackground(new Color(102,0,102));
    }//GEN-LAST:event_aniadirBtnMouseExited

    private void aniadirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirBtnActionPerformed

    private void funcionesParaModificarComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionesParaModificarComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionesParaModificarComboBox1ActionPerformed

    private void buscarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseEntered
        buscarBtn.setBackground(Color.blue);
    }//GEN-LAST:event_buscarBtnMouseEntered

    private void buscarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseExited
        buscarBtn.setBackground(new Color(102,0,102));
    }//GEN-LAST:event_buscarBtnMouseExited

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void eliminarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseEntered
        eliminarBtn.setBackground(Color.red);
    }//GEN-LAST:event_eliminarBtnMouseEntered

    private void eliminarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseExited
      eliminarBtn.setBackground(new Color(102,0,102));
    }//GEN-LAST:event_eliminarBtnMouseExited

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void menuFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFMouseClicked
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGestionPelis().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_menuFMouseClicked

      public static boolean esTextoNumerico(String texto) {
        // Si el texto es nulo o está vacío, no es numérico.
        if (texto == null || texto.equals("")) {
            return false;
        }

        // Recorremos cada carácter del texto.
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i); // Obtenemos el carácter en la posición actual.
            if (c < '0' || c > '9') { // Verificamos si no es un número.
                return false; // Si no es un número, devolvemos false.
            }
        }

        // Si todos los caracteres son números, devolvemos true.
        return true;
    }
     

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
            java.util.logging.Logger.getLogger(InterfazGestionFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGestionFunciones().setVisible(true);
            }
        });
    }
    private void SetImageLabel(JLabel labelName, String root){
        
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aniadirBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JToggleButton buscarBtn;
    private javax.swing.JPanel candyF;
    private javax.swing.JLabel candylbl;
    private javax.swing.JLabel cerrarlbl;
    private javax.swing.JToggleButton eliminarBtn;
    private javax.swing.JComboBox<String> funcionesComboBox;
    private javax.swing.JComboBox<String> funcionesParaModificarComboBox1;
    private javax.swing.JPanel guardar;
    private javax.swing.JPanel horarioPanel;
    private javax.swing.JTextField horarioTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuF;
    private javax.swing.JLabel menulbl;
    private javax.swing.JLabel paraNombrePeliculaLbl;
    private javax.swing.JComboBox<String> peliculasComboBox;
    private javax.swing.JPanel prece;
    private javax.swing.JLabel subAnia;
    private javax.swing.JLabel subAnia1;
    private javax.swing.JLabel subTituloFunciones;
    private javax.swing.JLabel subTitulosHorarios;
    private javax.swing.JLabel subtitulosPeliculas;
    private javax.swing.JLabel subtitulosPeliculas1;
    private javax.swing.JPanel ticF;
    private javax.swing.JLabel ticlbl;
    private javax.swing.JLabel tituloGestion;
    private javax.swing.JPanel usuF;
    private javax.swing.JLabel usulbl;
    private javax.swing.JPanel whatsaF;
    private javax.swing.JLabel whatsalbl;
    // End of variables declaration//GEN-END:variables
}
