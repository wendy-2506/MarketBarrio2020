package IU;
import BEAN.*;
import DAO.*;
import UTIL.util;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmMantCliente extends javax.swing.JFrame {
    ClienteDAO clieDAO;
    DefaultTableModel dtm;
    int idClie;
    public FrmMantCliente() {
        clieDAO = new ClienteDAO();
        initComponents();
        dtm = (DefaultTableModel)this.tblBuscar.getModel();
        llenaTblBuscar(false, "");
    }  
    
    private void llenaTblBuscar(boolean s, String c){
        Vector<Cliente> listClie= clieDAO.ListaItem(s, c);
        if(dtm.getRowCount()>0){
            dtm.setRowCount(0);
        }
        for(int i=0;i<listClie.size();i++){
            Vector vecClie = new Vector();
            vecClie.addElement(listClie.get(i).getIdCliente());
            vecClie.addElement(listClie.get(i).getIdTipoCli());
            vecClie.addElement(listClie.get(i).getIdEmpReg());
            vecClie.addElement(listClie.get(i).getFechReg());
            vecClie.addElement(listClie.get(i).getIdEmpMod());
            vecClie.addElement(listClie.get(i).getCorreo_elect());
            vecClie.addElement(listClie.get(i).getTelefono());
            vecClie.addElement(listClie.get(i).getDireccion());
            dtm.addRow(vecClie);
        }
    }
    private boolean valida(){
        boolean sw = false;
        if(this.txtEstado.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Ingrese Estado");
        }else{
            if(this.txtIdTipoCli.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese ID Tipo Cliente");
            }else{
                if(this.txtIdEmpReg.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Ingrese Id Empleado Registrado");
                }else{
                    if(this.txtFechReg.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Ingrese Fecha Registro");
                    }else{
                        if(this.txtCorreo_Elect.getText().isEmpty()){
                            JOptionPane.showMessageDialog(this, "Ingrese Correo Electronico");}
                        else{sw = true;
                        } } }}}
            return sw;}
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtIdEmpReg = new javax.swing.JTextField();
        txtIdTipoCli = new javax.swing.JTextField();
        txtFechReg = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIdEmpMod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFechMod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo_Elect = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("MANTENIMIENTO CLIENTE");

        jLabel2.setText("Buscar:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Tipo Cliente", "Id EmpReg", "Fecha Registro", "Id EmplMod", "Fecha Modifi", "Correo Electronico", "Telefono", "Direccion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarMouseClicked(evt);
            }
        });
        tblBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblBuscarKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscar);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Búsqueda", jPanel1);

        jLabel3.setText("Id Cliente");

        jLabel4.setText("Id TipoCli:");

        jLabel5.setText("Id EmpReg:");

        jLabel6.setText("Fecha Reg:");

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel7.setText("Id EmpMod");

        jLabel8.setText("Fecha Modifi:");

        jLabel9.setText("Correo Electronico");

        jLabel10.setText("Telefono");

        jLabel11.setText("Direccion");

        jLabel12.setText("Estado");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdTipoCli))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtIdEmpReg))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdEmpMod, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFechMod)
                                .addComponent(txtCorreo_Elect)
                                .addComponent(txtTelefono)
                                .addComponent(txtDireccion)
                                .addComponent(txtEstado)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnGrabar)
                            .addGap(54, 54, 54)
                            .addComponent(btnLimpiar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechReg, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdTipoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdEmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFechReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtIdEmpMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFechMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCorreo_Elect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Mantenimiento", jPanel2);

        jButton3.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
            if(valida()==true){
            Cliente c = new Cliente();
            util u = new util();
            
            
            if(this.btnGrabar.getText().equals("Grabar")){
                this.idClie = u.idNext("Cliente", "IdCliente");
            
            }else{
                 this.idClie = Integer.parseInt(this.txtIdCliente.getText());
            }
            c.setIdCliente(idClie);
            c.setIdTipoCli(Integer.parseInt(this.txtIdTipoCli.getText()));
            c.setIdEmpReg(Integer.parseInt(this.txtIdEmpReg.getText()));
            c.setFechReg(this.txtFechReg.getText());
            c.setIdEmpMod(Integer.parseInt(this.txtIdEmpMod.getText()));
            c.setFechMod(this.txtFechMod.getText());
            c.setCorreo_elect(this.txtCorreo_Elect.getText());
            c.setTelefono(this.txtTelefono.getText());
            c.setDireccion(this.txtDireccion.getText());
            c.setEstado(Integer.parseInt(this.txtEstado.getText()));

            if(this.btnGrabar.getText().equals("Grabar")){
                clieDAO.procesaItem(c, "insert");
            }else{
                clieDAO.procesaItem(c, "update");
            }
            llenaTblBuscar(false, "");
            limpia();
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void tblBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBuscarKeyReleased


    
    }//GEN-LAST:event_tblBuscarKeyReleased

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed


        if(this.txtBuscar.getText().isEmpty()){
            
            llenaTblBuscar(false, "");
        }else{

            llenaTblBuscar(true, this.txtBuscar.getText());
        }        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void tblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarMouseClicked


    int fil = this.tblBuscar.getSelectedRow();
        this.txtIdCliente.setText(dtm.getValueAt(fil, 0).toString());
        this.txtIdTipoCli.setText(dtm.getValueAt(fil, 1).toString());
        this.txtIdEmpReg.setText(dtm.getValueAt(fil, 2).toString());
        this.txtFechReg.setText(dtm.getValueAt(fil, 3).toString());
        this.txtIdEmpMod.setText(dtm.getValueAt(fil, 4).toString());
        this.txtFechMod.setText(dtm.getValueAt(fil, 5).toString());
        this.txtCorreo_Elect.setText(dtm.getValueAt(fil, 6).toString());
        this.txtDireccion.setText(dtm.getValueAt(fil, 7).toString());
        this.txtTelefono.setText(dtm.getValueAt(fil, 8).toString());
        this.txtEstado.setText(dtm.getValueAt(fil, 9).toString());
        this.btnGrabar.setText("Actualizar");
        this.jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_tblBuscarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        this.txtIdCliente.setText("");
        this.txtIdTipoCli.setText("");
        this.txtIdEmpReg.setText("");
        this.txtFechReg.setText("");
        this.txtIdEmpMod.setText("");
        this.txtFechMod.setText("");
        this.txtCorreo_Elect.setText("");
        this.txtDireccion.setText("");
        this.txtTelefono.setText("");
        this.txtEstado.setText(""); 
        this.btnGrabar.setText("Grabar");
// TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

     private void limpia(){
        this.txtIdCliente.setText("");
        this.txtIdTipoCli.setText("");
        this.txtIdEmpReg.setText("");
        this.txtFechReg.setText("");
        this.txtIdEmpMod.setText("");
        this.txtFechMod.setText("");
        this.txtCorreo_Elect.setText("");
        this.txtDireccion.setText("");
        this.txtTelefono.setText("");
        this.txtEstado.setText("");
        this.btnGrabar.setText("Grabar");
        }
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMantCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo_Elect;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechMod;
    private javax.swing.JTextField txtFechReg;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdEmpMod;
    private javax.swing.JTextField txtIdEmpReg;
    private javax.swing.JTextField txtIdTipoCli;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
