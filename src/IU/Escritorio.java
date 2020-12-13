package IU;

import javax.swing.JFrame;

public class Escritorio extends javax.swing.JFrame {
    
    public Escritorio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.loginpanel.setAlignmentX(CENTER_ALIGNMENT);
        this.loginpanel.setAlignmentY(CENTER_ALIGNMENT);
        this.jLabel1.setAlignmentX(CENTER_ALIGNMENT);
        this.jLabel1.setAlignmentY(CENTER_ALIGNMENT);
        this.jLabel1.setLocation(420, 50);
        this.loginpanel.setLocation(580, 200);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpasw = new javax.swing.JPasswordField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        subMenVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 20)); // NOI18N
        jLabel1.setText("Bienvenid@ al Escritorio de Market Barrio 2020");
        Escritorio.add(jLabel1);
        jLabel1.setBounds(30, 40, 560, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Iniciar Sesión");

        jLabel3.setText("Usuario:");

        jLabel4.setText("Contraseña:");

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpasw, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(txtuser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(76, 76, 76))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtpasw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        Escritorio.add(loginpanel);
        loginpanel.setBounds(210, 90, 250, 260);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Mantenimiento");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Producto");
        fileMenu.add(openMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Transacción");

        subMenVenta.setText("Venta");
        subMenVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenVentaActionPerformed(evt);
            }
        });
        editMenu.add(subMenVenta);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenVentaActionPerformed
        FrmVenta fventa = new FrmVenta();
        this.Escritorio.add(fventa);
        fventa.setVisible(true);
        fventa.setSize(548,766);
    }//GEN-LAST:event_subMenVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem subMenVenta;
    private javax.swing.JPasswordField txtpasw;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

}
