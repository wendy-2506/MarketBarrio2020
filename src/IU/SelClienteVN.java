
package IU;

import BEAN.*;
import DAO.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelClienteVN extends javax.swing.JInternalFrame {
    CliPersonaDAO clieDao;
    DefaultTableModel dtm;
    Cliente_Persona clie;
    public SelClienteVN(){
        clieDao = new CliPersonaDAO();
        initComponents();
        clie = new Cliente_Persona();
        dtm = (DefaultTableModel)this.tblClientePer.getModel();
        listaCliente(false,"");
    }
     private void listaCliente(boolean sw, String cad){
        Vector<Cliente_Persona> listaCli = clieDao.ListaItem(sw, cad);
        if(dtm.getRowCount()>0){
            dtm.setRowCount(0);
        }
        
        for (int i=0;i<listaCli.size();i++){
            Vector vec = new Vector();
            vec.addElement(listaCli.get(i).getIdCliente());
            vec.addElement(listaCli.get(i).getApell());
            vec.addElement(listaCli.get(i).getNomb());
            vec.addElement(listaCli.get(i).getDni());
            dtm.addRow(vec);
        }
    }
    
    
    public Cliente_Persona devCliente(){
        return clie;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientePer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Selecciona Cliente");

        jLabel2.setText("Buscar");

        tblClientePer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idCliente", "Apell", "Nombre", "DNI"
            }
        ));
        tblClientePer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientePerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientePer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(46, 46, 46)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientePerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientePerMouseClicked
    int i;
        i = this.tblClientePer.getSelectedRow();
        clie.setIdCliente(Integer.parseInt(dtm.getValueAt(i,0).toString()));
        clie.setApell(dtm.getValueAt(i,1).toString());
        clie.setNomb(dtm.getValueAt(i,2).toString());
        clie.setDni(dtm.getValueAt(i,3).toString());
        this.dispose();
    }//GEN-LAST:event_tblClientePerMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientePer;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
