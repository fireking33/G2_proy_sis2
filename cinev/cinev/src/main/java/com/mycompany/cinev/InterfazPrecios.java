/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinev;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author fband
 */
public class InterfazPrecios extends javax.swing.JFrame {
    
  int xMouse, yMouse;
  private String rutaImagen; 
  private Conexion conexion = new Conexion();
    Connection con = conexion.establecerConexion();
    private double[] precios;
    
    /**
     * Creates new form InterfazRegPeli
     */
    public InterfazPrecios() {
        initComponents();
        this.setLocationRelativeTo(this);
     precios = new double[3];
        desactBtn.setEnabled(false);
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
        formatoCombo = new javax.swing.JComboBox<>();
        menu = new javax.swing.JPanel();
        prece = new javax.swing.JPanel();
        guardar = new javax.swing.JPanel();
        cerrarlbl = new javax.swing.JLabel();
        aceptarBtn = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        precioText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menuF = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        desactBtn = new javax.swing.JButton();
        activarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(11, 23, 128));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(13, 20, 58));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formatoCombo.setBackground(new java.awt.Color(102, 0, 102));
        formatoCombo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        formatoCombo.setForeground(new java.awt.Color(255, 255, 255));
        formatoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2D", "3D", "4D" }));
        formatoCombo.setBorder(null);
        formatoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatoComboActionPerformed(evt);
            }
        });
        bg.add(formatoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 150, 30));

        menu.setBackground(new java.awt.Color(17, 27, 82));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

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
            .addGroup(guardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrarlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        guardarLayout.setVerticalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrarlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout preceLayout = new javax.swing.GroupLayout(prece);
        prece.setLayout(preceLayout);
        preceLayout.setHorizontalGroup(
            preceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preceLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        preceLayout.setVerticalGroup(
            preceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(prece, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 460, -1));

        aceptarBtn.setBackground(java.awt.Color.green);
        aceptarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        aceptarBtn.setText("ACEPTAR");
        aceptarBtn.setToolTipText("");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        bg.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bs.");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 60, 40));

        cancelarBtn.setBackground(java.awt.Color.red);
        cancelarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cancelarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBtn.setText("CANCELAR");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        bg.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 160, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("2x1:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, 30));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        precioText.setBackground(new java.awt.Color(102, 0, 102));
        precioText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        precioText.setForeground(new java.awt.Color(255, 255, 255));
        precioText.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 108, 100, -1));

        jPanel2.setBackground(new java.awt.Color(13, 20, 58));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 320));

        menuF.setBackground(new java.awt.Color(17, 27, 82));
        menuF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuFMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuFMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ");

        javax.swing.GroupLayout menuFLayout = new javax.swing.GroupLayout(menuF);
        menuF.setLayout(menuFLayout);
        menuFLayout.setHorizontalGroup(
            menuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuFLayout.setVerticalGroup(
            menuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        bg.add(menuF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Establecer Precios");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 390, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Formatos:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        desactBtn.setBackground(java.awt.Color.red);
        desactBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        desactBtn.setForeground(new java.awt.Color(255, 255, 255));
        desactBtn.setText("DESACTIVAR");
        desactBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desactBtnActionPerformed(evt);
            }
        });
        bg.add(desactBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 160, 50));

        activarBtn.setBackground(java.awt.Color.blue);
        activarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        activarBtn.setForeground(new java.awt.Color(255, 255, 255));
        activarBtn.setText("ACTIVAR");
        activarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarBtnActionPerformed(evt);
            }
        });
        bg.add(activarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
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

    
    
    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
 
       if (precioText.getText().trim().isEmpty()) {  
    JOptionPane.showMessageDialog(null, "-Por favor llene el campo de texto", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return; // Evita continuar si el campo está vacío
}

String precioIngresado = precioText.getText().trim(); // Eliminar espacios antes de usarlo

if (!esSoloNumeros(precioIngresado)) {
    JOptionPane.showMessageDialog(null, "-Por favor llene los datos solo con números", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return; // Evita continuar si no son solo números
}

// Obtener formato seleccionado SIN espacios
String formatoSeleccionado = formatoCombo.getSelectedItem().toString().trim();

switch (formatoSeleccionado) {
    case "2D":
        gestionarPrecios(precios, 0, Double.parseDouble(precioIngresado));
        System.out.println("2D "+precioIngresado);
        break;
    case "3D":
        gestionarPrecios(precios, 1, Double.parseDouble(precioIngresado));
        System.out.println("3D "+precioIngresado);
        break;
    case "4D":
        gestionarPrecios(precios, 2, Double.parseDouble(precioIngresado));
        System.out.println("4D "+precioIngresado);
        break;
    default:
        JOptionPane.showMessageDialog(null, "Formato no válido", "Error", JOptionPane.ERROR_MESSAGE);
        break;
}

 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
          this.setVisible(false);
    }//GEN-LAST:event_aceptarBtnActionPerformed
 
    public  boolean esSoloNumeros(String texto) {
        // Verificar si el texto es nulo o está vacío
        if (texto == null || texto.isEmpty()) {
            return false;
        }

        // Verificar que cada caracter sea un número del 0 al 9
        for (char c : texto.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // Si encuentra un carácter no numérico, retorna false
            }
        }

        return true; // Si todos son números, retorna true
    }
  
    private void formatoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatoComboActionPerformed

    private void desactBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desactBtnActionPerformed
        activarBtn.setEnabled(true);
        desactBtn.setEnabled(false);
         DecimalFormat df =new DecimalFormat("#.##");
        double p1 = precios[0];
       double p11 = Double.parseDouble(df.format(p1*2));
      gestionarPrecios(precios,0,p11);
       double p2 = precios[1];
       double p12 = Double.parseDouble(df.format(p2*2));
      gestionarPrecios(precios,1,p12);
       double p3 = precios[2];
       double p13 = Double.parseDouble(df.format(p3*2));
      gestionarPrecios(precios,2,p13);
      for(int i=0;i<3;i++){
          System.out.println(precios[i]+" Posicion: "+i);
      }
    }//GEN-LAST:event_desactBtnActionPerformed

    private void activarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarBtnActionPerformed
       activarBtn.setEnabled(false);
       desactBtn.setEnabled(true);
        DecimalFormat df =new DecimalFormat("#.##");
        double p1 = precios[0];
       double p11 = Double.parseDouble(df.format(p1/2).replace(",","."));
      gestionarPrecios(precios,0,p11);
       double p2 = precios[1];
       double p12 = Double.parseDouble(df.format(p2/2).replace(",","."));
      gestionarPrecios(precios,1,p12);
       double p3 = precios[2];
       double p13 = Double.parseDouble(df.format(p3/2).replace(",","."));
      gestionarPrecios(precios,2,p13);
        for(int i=0;i<3;i++){
          System.out.println(precios[i]+" Posicion: "+i);
      }
    }//GEN-LAST:event_activarBtnActionPerformed

    private void menuFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFMousePressed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
          this.setVisible(false);
    }//GEN-LAST:event_menuFMousePressed

     public double[] getVector() {
        return precios;
    }

    
    public void gestionarPrecios(double[] p,int posicion, double nuevoValor){
            p[posicion] = nuevoValor;
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
            java.util.logging.Logger.getLogger(InterfazPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrecios().setVisible(true);
            }
        });
    }
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aceptarBtn;
    private javax.swing.JButton activarBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel cerrarlbl;
    private javax.swing.JButton desactBtn;
    private javax.swing.JComboBox<String> formatoCombo;
    private javax.swing.JPanel guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuF;
    private javax.swing.JPanel prece;
    private javax.swing.JTextField precioText;
    // End of variables declaration//GEN-END:variables
}
