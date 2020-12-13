package IU;

import BEAN.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmVenta extends javax.swing.JFrame {
    DefaultTableModel dtm1;
    int idFilProd;
    double TOTAL;
    public FrmVenta() {
        initComponents();
        dtm1 = (DefaultTableModel)this.tblProdSel.getModel();
        lock();
        idFilProd = -1;
    }
    private boolean validProd(){
        boolean sw = false;
        if (this.txtIDProd.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto");
        }else{
            if(this.txtCantidad.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe registrar cantidad");
            }else{
                sw = true;
            }
        }
        return sw;
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        rbEmpresa = new javax.swing.JRadioButton();
        rbNatural = new javax.swing.JRadioButton();
        tpTipo = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        txtRazSoc = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdSel = new javax.swing.JTable();
        txtIDProd = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtCat = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtTOTTOTAL = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        BuscarClienteComprador = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 18)); // NOI18N
        jLabel1.setText("CAJERO \"MARKET BARRIO\"");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel2.setText("Id_Cliente");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtIdCliente.setEditable(false);

        buttonGroup1.add(rbEmpresa);
        rbEmpresa.setText("Empresa");
        rbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmpresaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNatural);
        rbNatural.setText("Natural");
        rbNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNaturalActionPerformed(evt);
            }
        });

        jLabel17.setText("Nombre");

        jLabel18.setText("Apellido");

        jLabel19.setText("DNI");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel19)))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtApellidos)
                    .addComponent(txtDNI))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(41, 41, 41))
        );

        tpTipo.addTab("Natural", jPanel7);

        jLabel22.setText("Representante");

        jLabel23.setText("RUC");

        jLabel26.setText("Raz Soc");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel23))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRepresentante)
                    .addComponent(txtRUC)
                    .addComponent(txtRazSoc, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(29, 29, 29))
        );

        tpTipo.addTab("Empresa", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeleccionar)
                .addGap(130, 130, 130))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(rbNatural)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbEmpresa)
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEmpresa)
                    .addComponent(rbNatural))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        jLabel9.setText("Id_Producto");

        jLabel10.setText("Descripción");

        jLabel11.setText("Categoria");

        jLabel12.setText("Marca");

        jLabel13.setText("Precio");

        jLabel14.setText("Cantidad");

        tblProdSel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "Descripcion", "Categoria", "Precio unitario", "Cantidad"
            }
        ));
        tblProdSel.setToolTipText("");
        tblProdSel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdSelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdSel);

        txtIDProd.setEditable(false);
        txtIDProd.setEnabled(false);
        txtIDProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProdActionPerformed(evt);
            }
        });

        txtDesc.setEditable(false);
        txtDesc.setEnabled(false);

        txtCat.setEditable(false);
        txtCat.setEnabled(false);

        txtMarca.setEditable(false);
        txtMarca.setEnabled(false);

        txtPrecio.setEditable(false);
        txtPrecio.setEnabled(false);

        jButton3.setText("Seleccionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(txtIDProd)
                                    .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(txtMarca)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIDProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        txtTOTTOTAL.setEditable(false);
        txtTOTTOTAL.setBackground(new java.awt.Color(255, 255, 51));
        txtTOTTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTOTTOTALActionPerformed(evt);
            }
        });

        btnPagar.setText("Pagar");

        jLabel16.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 14)); // NOI18N
        jLabel16.setText("TOTAL A PAGAR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTOTTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPagar)
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTOTTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(btnPagar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Venta", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda Cliente"));

        jLabel15.setText("Buscar");

        jRadioButton1.setText("ID");

        jRadioButton2.setText("Nombre");

        jRadioButton3.setText("Apellido");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCliente", "Apelldios", "Nombres", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3))
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione Transaccion"));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Venta", "Id_Cliente", "Fecha", "Estado"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BuscarClienteCompradorLayout = new javax.swing.GroupLayout(BuscarClienteComprador);
        BuscarClienteComprador.setLayout(BuscarClienteCompradorLayout);
        BuscarClienteCompradorLayout.setHorizontalGroup(
            BuscarClienteCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarClienteCompradorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        BuscarClienteCompradorLayout.setVerticalGroup(
            BuscarClienteCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarClienteCompradorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(BuscarClienteCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar", BuscarClienteComprador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
    if(this.rbEmpresa.isSelected()){
        Cliente_Empresa ce;
        SelClienteVE dialog = new SelClienteVE(new javax.swing.JFrame(), true);//Si es empresa
        dialog.setVisible(true);
        ce= dialog.devCliente();
        if(ce==null){
            this.txtIdCliente.setText("");
            this.rbEmpresa.setSelected(false);
            this.rbNatural.setSelected(false);
            this.tpTipo.setEnabled(false);
        }else{
            this.txtIdCliente.setText(String.valueOf(ce.getIdCliente()));
            this.txtRazSoc.setText(String.valueOf(ce.getRazon_Social()));
            this.txtRepresentante.setText(String.valueOf(ce.getRepresentante()));
            this.txtRUC.setText(String.valueOf(ce.getRuc()));
            this.rbEmpresa.setSelected(true);
        }
    }else if (this.rbNatural.isSelected()){
        Cliente_Persona cp;
        SelClienteVN dialog = new SelClienteVN(new javax.swing.JFrame(), true);//Si es persona
        dialog.setVisible(true);
        cp= dialog.devCliente();
        if(cp==null){
            this.txtIdCliente.setText("");
            this.rbEmpresa.setSelected(false);
            this.rbNatural.setSelected(false);
            this.tpTipo.setEnabled(false);
        }else{
            this.txtIdCliente.setText(String.valueOf(cp.getIdCliente()));
            this.txtApellidos.setText(String.valueOf(cp.getApell()));
            this.txtNombre.setText(String.valueOf(cp.getNomb()));
            this.txtDNI.setText(String.valueOf(cp.getDni()));
        }
    }
        
        
       
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void rbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmpresaActionPerformed
    this.tpTipo.setSelectedIndex(1);  
    limpia();
    }//GEN-LAST:event_rbEmpresaActionPerformed
    
    
    
    public void lock(){
        this.tpTipo.setEnabled(false);
        this.txtIdCliente.setEnabled(false);

        this.txtNombre.setEnabled(false);
        this.txtApellidos.setEnabled(false);
        this.txtRepresentante.setEnabled(false);
        this.txtRUC.setEnabled(false);

        this.txtRazSoc.setEnabled(false);
        this.txtDNI.setEnabled(false);
    }

    
    private void rbNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNaturalActionPerformed
        this.tpTipo.setSelectedIndex(0);
        limpia();
    }//GEN-LAST:event_rbNaturalActionPerformed
    public void limpia(){
        this.txtIdCliente.setText("");

        this.txtNombre.setText("");
        this.txtApellidos.setText("");
        this.txtRepresentante.setText("");
        this.txtRUC.setText("");

        this.txtRazSoc.setText("");
        this.txtDNI.setText("");
    
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
    limpia();
        FrmRegistrar reg = new FrmRegistrar();
    reg.setVisible(true);
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Producto p;
        FrmSelProducto dialogP=new FrmSelProducto(new javax.swing.JFrame(), true);
        dialogP.setVisible(true);
        p=dialogP.devProd();
        
        if(p==null){
            this.txtIDProd.setText("");
            this.txtDesc.setText("");
            this.txtCat.setText("");
            this.txtMarca.setText("");
            this.txtPrecio.setText("");

        }else{
            this.txtIDProd.setText(String.valueOf(p.getIdProducto()));
            this.txtDesc.setText(String.valueOf(p.getDescripcion()));
            this.txtCat.setText(String.valueOf(p.getIdCategoria()));
            this.txtMarca.setText(String.valueOf(p.getIdMarca()));
            this.txtPrecio.setText(String.valueOf(p.getPrecioUnit()));

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIDProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProdActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if (validProd() == true){
            verifPreReg(Integer.parseInt(this.txtIDProd.getText()));
            Vector vecP = new Vector();
            vecP.addElement(this.txtIDProd.getText());
            vecP.addElement(this.txtDesc.getText());
            vecP.addElement(this.txtCat.getText());
            vecP.addElement(this.txtPrecio.getText());
            vecP.addElement(this.txtCantidad.getText());

            this.dtm1.addRow(vecP);
            limpiaProd();
            sacaTotal();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.idFilProd>-1){
            dtm1.removeRow(this.idFilProd);
            idFilProd = -1;
            sacaTotal();
        }else{
            JOptionPane.showMessageDialog(this,"SELECCIONE UN PRODUCTO PARA ELIMINARLO");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblProdSelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdSelMouseClicked
        if(dtm1.getRowCount()>-1){
            this.idFilProd = this.tblProdSel.getSelectedRow();
        }
    }//GEN-LAST:event_tblProdSelMouseClicked

    private void txtTOTTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTOTTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTOTTOTALActionPerformed
    private void verifPreReg(int idP){
        if(this.tblProdSel.getRowCount()>0){
            for(int i=0;i<this.tblProdSel.getRowCount();i++){
                if(idP == Integer.parseInt(dtm1.getValueAt(i, 0).toString())){
                    dtm1.removeRow(i);
                    break;
                }
            }
        }
    }
    
    private void limpiaProd(){
        this.txtIDProd.setText("");
        this.txtDesc.setText("");
        this.txtCat.setText("");
        this.txtMarca.setText("");
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");
    }
    private void sacaTotal(){
        if(this.tblProdSel.getRowCount()>0){
            Double acum=0.0;
            for(int i=0;i<this.tblProdSel.getRowCount();i++){
                double p;
                double c;
                p=Double.parseDouble(this.dtm1.getValueAt(i, 3).toString());
                c=Double.parseDouble(this.dtm1.getValueAt(i, 4).toString());
                acum=acum+(p*c);
            }
            TOTAL=acum;
            this.txtTOTTOTAL.setText(String.valueOf(TOTAL));
        }
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
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuscarClienteComprador;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JRadioButton rbEmpresa;
    private javax.swing.JRadioButton rbNatural;
    private javax.swing.JTable tblProdSel;
    private javax.swing.JTabbedPane tpTipo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtIDProd;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazSoc;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtTOTTOTAL;
    // End of variables declaration//GEN-END:variables
}
