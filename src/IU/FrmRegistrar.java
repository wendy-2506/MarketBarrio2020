/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import BEAN.Cliente;
import BEAN.Cliente_Empresa;
import BEAN.Cliente_Persona;
import DAO.CliEmpresaDAO;
import DAO.CliPersonaDAO;
import DAO.ClienteDAO;
import UTIL.util;

/**
 *
 * @author DANIEL
 */
public class FrmRegistrar extends javax.swing.JFrame {
    int idCliente;
    CliEmpresaDAO cliEDAO;
    CliPersonaDAO cliPDAO;
    ClienteDAO clie;
    
    public FrmRegistrar() {
        initComponents();
        lokeo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbNatural = new javax.swing.JRadioButton();
        rbEmpresa = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApelR = new javax.swing.JTextField();
        txtNombreR = new javax.swing.JTextField();
        txtDNIR = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRazSocR = new javax.swing.JTextField();
        txtRepreR = new javax.swing.JTextField();
        txtRUCR = new javax.swing.JTextField();
        txtidClienteR = new javax.swing.JTextField();
        txtCorreoR = new javax.swing.JTextField();
        txtTLFR = new javax.swing.JTextField();
        txtDirecR = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Registrar Cliente");

        jLabel2.setText("idCliente");

        jLabel3.setText("E-mail");

        jLabel4.setText("Telefono");

        jLabel5.setText("Direccion");

        buttonGroup1.add(rbNatural);
        rbNatural.setText("Natural");
        rbNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNaturalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEmpresa);
        rbEmpresa.setText("Empresa");
        rbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmpresaActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido");

        jLabel7.setText("Nombre");

        jLabel8.setText("DNI");

        txtDNIR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDNIRKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApelR)
                    .addComponent(txtNombreR)
                    .addComponent(txtDNIR, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApelR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDNIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Natural", jPanel1);

        jLabel9.setText("Razon Social");

        jLabel10.setText("Representante");

        jLabel11.setText("RUC");

        txtRUCR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRUCRKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRazSocR)
                    .addComponent(txtRepreR)
                    .addComponent(txtRUCR, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtRazSocR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtRepreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRUCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empresa", jPanel2);

        txtDirecR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecRKeyReleased(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtidClienteR)
                            .addComponent(txtCorreoR)
                            .addComponent(txtTLFR)
                            .addComponent(txtDirecR, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(rbNatural)
                        .addGap(86, 86, 86)
                        .addComponent(rbEmpresa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addComponent(txtidClienteR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorreoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTLFR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDirecR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNatural)
                    .addComponent(rbEmpresa))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnBorrar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNaturalActionPerformed
        this.txtDNIR.setEnabled(true);
        this.txtNombreR.setEnabled(true);
        this.txtApelR.setEnabled(true);
        this.txtRazSocR.setText("");
        this.txtRepreR.setText("");
        this.txtRUCR.setText("");
        this.rbEmpresa.setSelected(false);
        this.jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_rbNaturalActionPerformed

    private void rbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmpresaActionPerformed
    this.txtRazSocR.setEnabled(true);
    this.txtRepreR.setEnabled(true);
    this.txtRUCR.setEnabled(true);
    this.txtDNIR.setText("");
    this.txtNombreR.setText("");
    this.txtApelR.setText("");
    this.rbNatural.setSelected(false);
    this.jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_rbEmpresaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.txtDNIR.setText("");
        this.txtNombreR.setText("");
        this.txtApelR.setText("");
        this.txtRazSocR.setText("");
        this.txtRepreR.setText("");
        this.txtRUCR.setText("");
        this.btnRegistrar.setText("");
        this.txtCorreoR.setText("");
        this.txtTLFR.setText("");
        this.txtDirecR.setText("");
        this.rbEmpresa.setSelected(false);
        this.rbNatural.setSelected(false);
        this.btnRegistrar.setText("Registrar");
        lokeo();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String fech;
        util u = new util();
        
        //natural = 1; Empresa = 2
        if(this.rbEmpresa.isSelected()){
            
            Cliente c= new Cliente ();
            this.idCliente = u.idNext("Cliente", "idCliente");
            fech = u.obtenerFecha();
            c.setFechReg(fech);
            c.setIdCliente(idCliente);
            c.setIdTipoCli(2);
            c.setIdEmpMod(1);
            c.setIdEmpReg(1);
            c.setFechMod(fech);
            c.setCorreo_elect(this.txtCorreoR.getText());
            c.setTelefono(this.txtTLFR.getText());
            c.setDireccion(this.txtDirecR.getText());
            c.setEstado(1);
            this.clie.procesaItem(c,"insert");
            
            Cliente_Empresa ce = new Cliente_Empresa();           
            ce.setIdCliente(idCliente);
            ce.setRazon_Social(this.txtRazSocR.getText());
            ce.setRepresentante(this.txtRepreR.getText());
            ce.setRuc(this.txtRUCR.getText());
            this.cliEDAO.procesaItem(ce, "insert");
        
        }else if(this.rbNatural.isSelected()){
            
            Cliente c= new Cliente ();
            this.idCliente = u.idNext("Cliente", "idCliente");
            fech = u.obtenerFecha();
            c.setFechReg(fech);
            c.setIdCliente(idCliente);
            c.setIdTipoCli(1);
            c.setIdEmpMod(1);
            c.setIdEmpReg(1);
            c.setFechMod(fech);
            c.setCorreo_elect(this.txtCorreoR.getText());
            c.setTelefono(this.txtTLFR.getText());
            c.setDireccion(this.txtDirecR.getText());
            c.setEstado(1);
            
            this.clie.procesaItem(c,"insert");
            
            Cliente_Persona cp = new Cliente_Persona();            
            cp.setIdCliente(idCliente);
            cp.setApell(this.txtApelR.getText());
            cp.setNomb(this.txtNombreR.getText());
            cp.setDni(this.txtDNIR.getText());
            this.cliPDAO.procesaItem(cp, "insert");
        }  
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDirecRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecRKeyReleased
    this.rbEmpresa.setEnabled(true);
    this.rbNatural.setEnabled(true);
    }//GEN-LAST:event_txtDirecRKeyReleased

    private void txtDNIRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIRKeyReleased
        if(valida()==true){
            this.btnRegistrar.setEnabled(true);
        }
    }//GEN-LAST:event_txtDNIRKeyReleased

    private void txtRUCRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCRKeyReleased
    if(valida()==true){
            this.btnRegistrar.setEnabled(true);
        }
    }//GEN-LAST:event_txtRUCRKeyReleased
  
    
    
    public boolean valida(){
       boolean aux= false;
       if(!this.txtCorreoR.getText().isEmpty()&&!this.txtDirecR.getText().isEmpty()&&!this.txtTLFR.getText().isEmpty()){
            if(this.rbNatural.isSelected() &&!this.txtNombreR.getText().isEmpty()&&!this.txtApelR.getText().isEmpty()
                    && !this.txtDNIR.getText().isEmpty()){
                    aux=true;
            }else if(this.rbEmpresa.isSelected() && !this.txtRazSocR.getText().isEmpty()&&!this.txtRepreR.getText().isEmpty()
                    && !this.txtRUCR.getText().isEmpty() ){
                      aux=true;
            }
       }
       return aux;
   }
    
    
    
    
    
    public void lokeo(){
        this.txtidClienteR.setEnabled(false);
        this.txtDNIR.setEnabled(false);
        this.txtNombreR.setEnabled(false);
        this.txtApelR.setEnabled(false);
        this.txtRazSocR.setEnabled(false);
        this.txtRepreR.setEnabled(false);
        this.txtRUCR.setEnabled(false);
        this.btnRegistrar.setEnabled(false);
        this.jTabbedPane1.setEnabled(false);
        this.rbEmpresa.setEnabled(false);
    this.rbNatural.setEnabled(false);
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
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbEmpresa;
    private javax.swing.JRadioButton rbNatural;
    private javax.swing.JTextField txtApelR;
    private javax.swing.JTextField txtCorreoR;
    private javax.swing.JTextField txtDNIR;
    private javax.swing.JTextField txtDirecR;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtRUCR;
    private javax.swing.JTextField txtRazSocR;
    private javax.swing.JTextField txtRepreR;
    private javax.swing.JTextField txtTLFR;
    private javax.swing.JTextField txtidClienteR;
    // End of variables declaration//GEN-END:variables
}
