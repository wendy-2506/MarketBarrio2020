package IU;

import BEAN.*;
import DAO.*;
import UTIL.util;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmSelProducto extends javax.swing.JInternalFrame {
    ProductoDAO prodDAO;
    DefaultTableModel dtm;
    Producto prod;
    
    CategoriaDAO catDAO;
    DefaultTableModel dtm2;
    Categoria cat;
    
    
    
    int idPred;
    public FrmSelProducto() {
        prodDAO = new ProductoDAO();
        catDAO  = new CategoriaDAO();
        initComponents();
        prod=new Producto();
        dtm = (DefaultTableModel)this.tblBuscarCat.getModel();
        dtm2= (DefaultTableModel)this.tblBuscarProd.getModel();
        llenaTblBuscarCate(false,"");
        cat=new Categoria();
    }  

private void llenaTblBuscarCate(boolean s, String c){
    Vector<Categoria> listCat = catDAO.ListaItem(s, c);
    if(dtm.getRowCount()>0){
        dtm.setRowCount(0);
    }
    for(int i=0;i<listCat.size();i++){
        Vector vecCat=new Vector();
        vecCat.addElement(listCat.get(i).getIdCategoria());
        vecCat.addElement(listCat.get(i).getDescrip());
        dtm.addRow(vecCat);
    }
    
}

public Producto devProd(){
    return prod;
} 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarCat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscarCat = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuscarProd = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Categoria"));

        jLabel2.setText("BUSCAR:");

        txtBuscarCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCatKeyReleased(evt);
            }
        });

        tblBuscarCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Categoria", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBuscarCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarCatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscarCat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(txtBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Producto"));

        tblBuscarProd.setFont(new java.awt.Font("MS UI Gothic", 0, 10)); // NOI18N
        tblBuscarProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Descripcion", "ID Categoria", "ID Marca", "PrecioUnit", "Unidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBuscarProd.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblBuscarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarProdMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBuscarProd);
        if (tblBuscarProd.getColumnModel().getColumnCount() > 0) {
            tblBuscarProd.getColumnModel().getColumn(0).setMinWidth(50);
            tblBuscarProd.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblBuscarProd.getColumnModel().getColumn(0).setMaxWidth(50);
            tblBuscarProd.getColumnModel().getColumn(1).setMinWidth(150);
            tblBuscarProd.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblBuscarProd.getColumnModel().getColumn(1).setMaxWidth(150);
            tblBuscarProd.getColumnModel().getColumn(2).setMinWidth(55);
            tblBuscarProd.getColumnModel().getColumn(2).setPreferredWidth(55);
            tblBuscarProd.getColumnModel().getColumn(2).setMaxWidth(55);
            tblBuscarProd.getColumnModel().getColumn(3).setMinWidth(55);
            tblBuscarProd.getColumnModel().getColumn(3).setPreferredWidth(55);
            tblBuscarProd.getColumnModel().getColumn(3).setMaxWidth(55);
            tblBuscarProd.getColumnModel().getColumn(4).setMinWidth(75);
            tblBuscarProd.getColumnModel().getColumn(4).setPreferredWidth(75);
            tblBuscarProd.getColumnModel().getColumn(4).setMaxWidth(75);
            tblBuscarProd.getColumnModel().getColumn(5).setMinWidth(100);
            tblBuscarProd.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblBuscarProd.getColumnModel().getColumn(5).setMaxWidth(100);
            tblBuscarProd.getColumnModel().getColumn(6).setMinWidth(50);
            tblBuscarProd.getColumnModel().getColumn(6).setPreferredWidth(50);
            tblBuscarProd.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Categoria");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("SELECCIONE PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarCatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCatKeyReleased
        if(this.txtBuscarCat.getText().isEmpty()){
            llenaTblBuscarCate(false,"");
        }else{

            llenaTblBuscarCate(true, this.txtBuscarCat.getText());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCatKeyReleased

    private void tblBuscarCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarCatMouseClicked
        int idCat, fil;
        fil=this.tblBuscarCat.getSelectedRow();
        idCat=Integer.parseInt(dtm.getValueAt(fil, 0).toString());
        cat.setIdCategoria(idCat);
        cat.setDescrip(dtm.getValueAt(fil, 1).toString());
        if(dtm2.getRowCount()>0){
            dtm2.setRowCount(0);
        }
        Vector<Producto> listProd = this.prodDAO.ListaItem(true, dtm.getValueAt(fil, 0).toString());
    if(listProd.size()>0){
        for(int i=0;i<listProd.size();i++){
            Vector vecPro = new Vector();
            vecPro.addElement(listProd.get(i).getIdProducto());
            vecPro.addElement(listProd.get(i).getDescripcion());
            vecPro.addElement(listProd.get(i).getIdCategoria());
            vecPro.addElement(listProd.get(i).getIdMarca());
            vecPro.addElement(listProd.get(i).getPrecioUnit());
            vecPro.addElement(listProd.get(i).getUnidMed());
            vecPro.addElement(listProd.get(i).getEstado());
            dtm2.addRow(vecPro);
        }
    }else{
            JOptionPane.showMessageDialog(this, "La categoria no tiene Productos registrados");
        } 
    }//GEN-LAST:event_tblBuscarCatMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblBuscarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarProdMouseClicked
        int i;
        i=this.tblBuscarProd.getSelectedRow();
        prod.setIdProducto(Integer.parseInt(dtm2.getValueAt(i, 0).toString()));
        prod.setDescripcion(dtm2.getValueAt(i, 1).toString());
        prod.setIdCategoria(Integer.parseInt(dtm2.getValueAt(i, 2).toString()));
        prod.setIdMarca(Integer.parseInt(dtm2.getValueAt(i, 3).toString()));
        prod.setPrecioUnit(Double.parseDouble(dtm2.getValueAt(i, 4).toString()));
        prod.setUnidMed(dtm2.getValueAt(i, 5).toString());
        prod.setEstado(Integer.parseInt(dtm2.getValueAt(i, 6).toString()));
        this.dispose();
    }//GEN-LAST:event_tblBuscarProdMouseClicked

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBuscarCat;
    private javax.swing.JTable tblBuscarProd;
    private javax.swing.JTextField txtBuscarCat;
    // End of variables declaration//GEN-END:variables
}
