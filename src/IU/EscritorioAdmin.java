package IU;

import DAO.EmpleadoDAO;
import UTIL.dbBean;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

public class EscritorioAdmin extends javax.swing.JFrame {
    EmpleadoDAO e;
    public EscritorioAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jLabel1.setAlignmentX(CENTER_ALIGNMENT);
        this.jLabel1.setAlignmentY(CENTER_ALIGNMENT);
        this.jLabel1.setLocation(60, 25);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        e=new EmpleadoDAO();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        reporteemp = new javax.swing.JMenuItem();
        repempresa = new javax.swing.JMenuItem();
        repclieper = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 20)); // NOI18N
        jLabel1.setText("Bienvenid@ Gerente");
        Escritorio.add(jLabel1);
        jLabel1.setBounds(30, 40, 380, 29);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Mantenimientos");
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMenuMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Mantenimiento Empleados");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setText("Mantenimiento Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        jMenuItem4.setText("Mantenimiento Producto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem4);

        jMenuItem5.setText("Mantenimiento Tienda");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem5);

        menuBar.add(fileMenu);

        jMenu1.setText("Ventas");

        jMenuItem3.setText("Form Ventas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        menuBar.add(jMenu1);

        jMenu2.setText("Reportes");

        reporteemp.setText("Reporte de Empleados");
        reporteemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteempActionPerformed(evt);
            }
        });
        jMenu2.add(reporteemp);

        repempresa.setText("Reporte de Cliente Empresa");
        repempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repempresaActionPerformed(evt);
            }
        });
        jMenu2.add(repempresa);

        repclieper.setText("Reporte de Cliente Persona");
        repclieper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repclieperActionPerformed(evt);
            }
        });
        jMenu2.add(repclieper);

        menuBar.add(jMenu2);

        cerrar.setText("Cerrar Sesión");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        menuBar.add(cerrar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseClicked
        
    }//GEN-LAST:event_fileMenuMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        Escritorio esc = new Escritorio();
        esc.setVisible(true);
        //esc.setSize(1366, 768);
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrmVenta fven = new FrmVenta();
        this.Escritorio.add(fven);
        Escritorio.moveToFront(fven);
        fven.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FmrMantEmpleado femple = new FmrMantEmpleado();
        this.Escritorio.add(femple);
        Escritorio.moveToFront(femple);
        femple.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          FrmMantCliente clie = new FrmMantCliente();
        clie.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmMantProduct pro = new FrmMantProduct();
        pro.setVisible(true); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrmMantTienda ftien = new FrmMantTienda();
        this.Escritorio.add(ftien);
        Escritorio.moveToFront(ftien);
        ftien.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void reporteempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteempActionPerformed
        try{
            String r="src/REPORTES/repEmpleados.jasper";
            dbBean db = new dbBean();
            db.connectRep(r, null, false);
        }catch(SQLException ex){
            ex.printStackTrace();        
        }catch(JRException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_reporteempActionPerformed

    private void repempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repempresaActionPerformed
        try{
            String r="src/REPORTES/repEmpresas.jasper";
            dbBean db = new dbBean();
            db.connectRep(r, null, false);
        }catch(SQLException ex){
            ex.printStackTrace();        
        }catch(JRException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_repempresaActionPerformed

    private void repclieperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repclieperActionPerformed
        try{
            String r="src/REPORTES/repPersonas.jasper";
            dbBean db = new dbBean();
            db.connectRep(r, null, false);
        }catch(SQLException ex){
            ex.printStackTrace();        
        }catch(JRException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_repclieperActionPerformed
        
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
            java.util.logging.Logger.getLogger(EscritorioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritorioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritorioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritorioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritorioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu cerrar;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem repclieper;
    private javax.swing.JMenuItem repempresa;
    private javax.swing.JMenuItem reporteemp;
    // End of variables declaration//GEN-END:variables

}