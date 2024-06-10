/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginalumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author bryanlegrand
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginb = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Password");

        loginb.setText("Ingresar");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginb)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginb)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed
        // TODO add your handling code here:
        String usuario = jTextField1.getText();
        String password = jPasswordField1.getText();
        
        if("admin".equals(usuario)&&"admin".equals(password)){
            Admin a = null;
            Admin creacion = new Admin(a);
            creacion.setVisible(true);
            this.dispose();
        }
        else{
            boolean usuarioEncontrado = false;
            if(!usuarioEncontrado){
                for(Profesor profesorNuevo : Loginalumnos.usuarios){
                    if(profesorNuevo.getPasswordChars().equals(password) && profesorNuevo.getUsuario().equals(usuario)){
                        BenvenidaProfesor bienvenida = new BenvenidaProfesor(profesorNuevo);
                        bienvenida.setVisible(true);
                        usuarioEncontrado = true;
                        break;
                    }
                }
            }
            if(!usuarioEncontrado){
                for(alumno alumnoNuevo : Loginalumnos.usuarioalumno){
                    if(alumnoNuevo.getPassword().equals(password) && alumnoNuevo.getCarnet().equals(usuario)){
                        BienvenidoAlumno bienvenida = new BienvenidoAlumno(alumnoNuevo);
                        bienvenida.setVisible(true);
                        usuarioEncontrado = true;
                        break;
                    }
                }
            }
            if(usuarioEncontrado){
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Usuario o Password incorrecto.");
            }
        }

        
    }//GEN-LAST:event_loginbActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginb;
    // End of variables declaration//GEN-END:variables
}
