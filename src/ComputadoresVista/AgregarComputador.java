/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ComputadoresVista;

import Computadores.ComputadoresController;
import DaoComputadores.DaoComputadores;
import MenuPrincipal.MenuPrincipal;
import MostrarCompus.MostrarCompus;
import java.applet.AudioClip;
import javax.swing.JOptionPane;

/**
 *
 * @author HUMBERTO
 */
public class AgregarComputador extends javax.swing.JFrame {
    
    private static AgregarComputador agregarcomputador;

  
    
    public AgregarComputador() {
        initComponents();
        
        //validacines de texto
        Validacion1.setVisible(false);
        Validacion2.setVisible(false);
  
    
    }
    public static AgregarComputador getInstance()
   {
       if (agregarcomputador == null)
       
           agregarcomputador = new AgregarComputador();
           
           agregarcomputador.porDefecto();
               
       return agregarcomputador;

      }
int cont=0;
   public void validar(){
       if(jTextFielCodigo.getText().equals("")){Validacion1.setVisible(true);cont++;}else
       {Validacion1.setVisible(false);}
       
        if(jTextFielMarca.getText().equals("")){Validacion2.setVisible(true);cont++;}else
       {Validacion2.setVisible(false);}
       
   }
   
    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        GrupoComputadores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFielCodigo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        rD_Portatil = new javax.swing.JRadioButton();
        rD_Escritorio = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFielMarca = new javax.swing.JTextField();
        Validacion1 = new javax.swing.JLabel();
        Validacion2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ch_Audifonos = new javax.swing.JCheckBox();
        ch_Mouse = new javax.swing.JCheckBox();
        ch_Usb = new javax.swing.JCheckBox();
        ch_Impresora = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 550, 50));

        jPanel2.setBackground(new java.awt.Color(172, 199, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "codigo computador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        jTextFielCodigo.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jTextFielCodigo.setText("Codigo");
        jTextFielCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFielCodigoMouseClicked(evt);
            }
        });
        jTextFielCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielCodigoActionPerformed(evt);
            }
        });
        jTextFielCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jTextFielCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFielCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 60));

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoComputadores.add(rD_Portatil);
        rD_Portatil.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        rD_Portatil.setText("Portatil");
        rD_Portatil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rD_PortatilActionPerformed(evt);
            }
        });
        jPanel5.add(rD_Portatil, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 18, 260, 27));

        GrupoComputadores.add(rD_Escritorio);
        rD_Escritorio.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        rD_Escritorio.setText("Escritorio");
        rD_Escritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rD_EscritorioActionPerformed(evt);
            }
        });
        jPanel5.add(rD_Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 18, 260, 27));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 530, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Guardar Computador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/regresar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marcas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 480, 90));

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca del computador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jTextFielMarca.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielMarca.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jTextFielMarca.setText("Marca");
        jTextFielMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFielMarcaMouseClicked(evt);
            }
        });
        jTextFielMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielMarcaActionPerformed(evt);
            }
        });
        jTextFielMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielMarcaKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFielMarca);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 370, 70));

        Validacion1.setBackground(new java.awt.Color(204, 255, 255));
        Validacion1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Validacion1.setForeground(new java.awt.Color(255, 0, 0));
        Validacion1.setText("*CAMPO REQUERIDO");
        getContentPane().add(Validacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        Validacion2.setBackground(new java.awt.Color(204, 255, 255));
        Validacion2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Validacion2.setForeground(new java.awt.Color(255, 0, 0));
        Validacion2.setText("*CAMPO REQUERIDO");
        getContentPane().add(Validacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 276, 180, 20));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accesorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        ch_Audifonos.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        ch_Audifonos.setText("Audifonos");
        ch_Audifonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_AudifonosActionPerformed(evt);
            }
        });

        ch_Mouse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        ch_Mouse.setText("Mouse");

        ch_Usb.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        ch_Usb.setText("Usb");

        ch_Impresora.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        ch_Impresora.setText("Impresora");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ch_Mouse)
                    .addComponent(ch_Audifonos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ch_Usb)
                    .addComponent(ch_Impresora))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_Audifonos)
                    .addComponent(ch_Usb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_Mouse)
                    .addComponent(ch_Impresora)))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 333, 300, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void porDefecto(){
        jTextFielCodigo.setText("Codigo");
        jTextFielMarca.setText("Marca");
        ch_Audifonos.setSelected(false);
        ch_Mouse.setSelected(false);
        ch_Usb.setSelected(false);
        ch_Impresora.setSelected(false);
        rD_Portatil.setSelected(false);
        rD_Escritorio.setSelected(false);
        
        
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          AudioClip sonido;
      sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/boton.wav"));
      sonido.play();
      
      
       cont=0; 
        validar();
        if(cont==0){
        JOptionPane.showMessageDialog(null,"se Ha llenado los campos ");
        }
                
        
        
         DaoComputadores compuCont = ComputadoresController .getInstance();
        String codigo = jTextFielCodigo.getText();
        String marca= jTextFielMarca.getText();
        String tipoComputador = "";
        
         if(ch_Audifonos.isSelected())
            tipoComputador+="Audifonos  ";
        if(ch_Mouse.isSelected())
            tipoComputador+="Mouse ";
        if(ch_Usb.isSelected())
            tipoComputador+="Usb ";
        if(ch_Impresora.isSelected())
            tipoComputador+="Impresora ";
        String Accesorios="";
        
        
        if (rD_Portatil.isSelected())
            Accesorios += "portatil";
        
         if (rD_Escritorio.isSelected())
            Accesorios += "escritorio";
        
        String [] computador = {codigo,marca,tipoComputador, Accesorios};
        
            if(compuCont.GuardarComputador(computador))
            
            JOptionPane.showMessageDialog(this, "Guardado exitoso");
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
          AudioClip sonido;
      sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/boton.wav"));
      sonido.play();
      
      
        MostrarCompus compuCont = MostrarCompus.getInstance();
        compuCont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rD_EscritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rD_EscritorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rD_EscritorioActionPerformed

    private void jTextFielCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielCodigoKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();
        
    }//GEN-LAST:event_jTextFielCodigoKeyTyped

    private void jTextFielCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFielCodigoMouseClicked
        // TODO add your handling code here:
        jTextFielCodigo.setText("");
    }//GEN-LAST:event_jTextFielCodigoMouseClicked

    private void jTextFielCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielCodigoActionPerformed

    private void jTextFielMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielMarcaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFielMarcaActionPerformed

    private void jTextFielMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielMarcaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielMarcaKeyTyped

    private void jTextFielMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFielMarcaMouseClicked
        // TODO add your handling code here:
        jTextFielMarca.setText("");
    }//GEN-LAST:event_jTextFielMarcaMouseClicked

    private void ch_AudifonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_AudifonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_AudifonosActionPerformed

    private void rD_PortatilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rD_PortatilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rD_PortatilActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoComputadores;
    private javax.swing.JLabel Validacion1;
    private javax.swing.JLabel Validacion2;
    private javax.swing.JCheckBox ch_Audifonos;
    private javax.swing.JCheckBox ch_Impresora;
    private javax.swing.JCheckBox ch_Mouse;
    private javax.swing.JCheckBox ch_Usb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextFielCodigo;
    private javax.swing.JTextField jTextFielMarca;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rD_Escritorio;
    private javax.swing.JRadioButton rD_Portatil;
    // End of variables declaration//GEN-END:variables
}
