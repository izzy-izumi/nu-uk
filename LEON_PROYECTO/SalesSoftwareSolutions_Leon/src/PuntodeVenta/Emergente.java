/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntodeVenta;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import DesignSoftware.FrameDesign;

/*
 *@author Shary Yareli Chuc Ku
 *Versión: 2.0
 *Fecha última modificación: 06-12-14
 */
//  Clase que permite visualizar la informacion del usuario seleccionado.
public class Emergente extends javax.swing.JFrame {

    private int x = 0, y = 0;
    private FrameDesign img;
    private String busqueda;
    String URL = "../Images/loginImages/";

    /**
     * Creates new form Emergente
     */
//    Constructor: pasa el parametro de busqueda
    public Emergente(String busqueda) {
        this.busqueda = busqueda;
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        cargar();

    }

//    Carga diseño a los botones.
    public void cargar() {
        img = new FrameDesign(URL + "buttonMinimize.png");
        img.addButton(btnMinimizar);
        img = new FrameDesign(URL + "buttonClose.png");
        img.addButton(btnCerrar);
        llenar();
    }
//Método que llena los campos de texto con la busqueda.

    public void llenar() {
        String[] cadena = busqueda.split(",");
        if ("1".equals(cadena[0])) {
            txtPermiso.setText("ADMINISTRADOR");
        } else {
            txtPermiso.setText("VENDEDOR");
        }
        txtNombre.setText(cadena[1]);
        txtUser.setText(cadena[2]);
        txtPassword.setText(cadena[3]);
        txtEmail.setText(cadena[4]);
        txtObservacion.setText(cadena[5]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        menuUsuarios = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPermiso = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lbPermiso = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        lbEmailk = new javax.swing.JLabel();
        lbNotas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 32, 32));

        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 32, 32));

        menuUsuarios.setBackground(new java.awt.Color(116, 16, 30));
        menuUsuarios.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        menuUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuUsuarios.setText("   INFORMACIÓN DETALLADA DE USUARIO");
        menuUsuarios.setDoubleBuffered(true);
        menuUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuUsuarios.setOpaque(true);
        menuUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseDragged(evt);
            }
        });
        menuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuUsuariosMousePressed(evt);
            }
        });
        getContentPane().add(menuUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        txtUser.setEditable(false);
        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtUser.setPreferredSize(new java.awt.Dimension(10, 25));
        txtUser.setSelectionColor(new java.awt.Color(91, 137, 193));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));

        txtPermiso.setEditable(false);
        txtPermiso.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtPermiso.setPreferredSize(new java.awt.Dimension(10, 25));
        txtPermiso.setSelectionColor(new java.awt.Color(91, 137, 193));
        txtPermiso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPermisoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPermisoFocusLost(evt);
            }
        });
        getContentPane().add(txtPermiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 30));

        txtPassword.setEditable(false);
        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(10, 25));
        txtPassword.setSelectionColor(new java.awt.Color(91, 137, 193));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 190, 30));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(10, 25));
        txtEmail.setSelectionColor(new java.awt.Color(91, 137, 193));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 190, 30));

        txtObservacion.setEditable(false);
        txtObservacion.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtObservacion.setPreferredSize(new java.awt.Dimension(10, 25));
        txtObservacion.setSelectionColor(new java.awt.Color(91, 137, 193));
        txtObservacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtObservacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionFocusLost(evt);
            }
        });
        getContentPane().add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 190, 30));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(10, 25));
        txtNombre.setSelectionColor(new java.awt.Color(91, 137, 193));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 30));

        lbPermiso.setBackground(new java.awt.Color(255, 255, 255));
        lbPermiso.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lbPermiso.setText("Permiso Usuario");
        lbPermiso.setOpaque(true);
        getContentPane().add(lbPermiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 20));

        lbNombre.setBackground(new java.awt.Color(255, 255, 255));
        lbNombre.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lbNombre.setText("Nombre");
        lbNombre.setOpaque(true);
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 20));

        lbUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbUsuario.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lbUsuario.setText("Usuario");
        lbUsuario.setOpaque(true);
        getContentPane().add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 20));

        lbPass.setBackground(new java.awt.Color(255, 255, 255));
        lbPass.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lbPass.setText("Contraseña");
        lbPass.setOpaque(true);
        getContentPane().add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 190, 20));

        lbEmailk.setBackground(new java.awt.Color(255, 255, 255));
        lbEmailk.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lbEmailk.setText("E-mail");
        lbEmailk.setOpaque(true);
        getContentPane().add(lbEmailk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 190, 20));

        lbNotas.setBackground(new java.awt.Color(255, 255, 255));
        lbNotas.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lbNotas.setText("Observaciones");
        lbNotas.setOpaque(true);
        getContentPane().add(lbNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 190, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 400, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_menuUsuariosMousePressed

    private void menuUsuariosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_menuUsuariosMouseDragged

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPermisoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPermisoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPermisoFocusGained

    private void txtPermisoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPermisoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPermisoFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtObservacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionFocusGained

    private void txtObservacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionFocusLost

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreFocusLost

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        try {
            img = new FrameDesign(URL + "buttonMinimize1.png");
            img.addButton(btnMinimizar);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        try {
            img = new FrameDesign(URL + "buttonMinimize.png");
            img.addButton(btnMinimizar);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        try {
            img = new FrameDesign(URL + "buttonClose1.png");
            img.addButton(btnCerrar);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        try {
            img = new FrameDesign(URL + "buttonClose.png");
            img.addButton(btnCerrar);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.hide();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbEmailk;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNotas;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPermiso;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel menuUsuarios;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPermiso;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
