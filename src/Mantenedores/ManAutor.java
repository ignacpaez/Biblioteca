/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenedores;

import BO.LibroBo;
import Clases.Autor;
import Clases.Libro;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnossur
 */
public class ManAutor extends javax.swing.JFrame {
    ArrayList<Autor>  listaautores= new ArrayList<>();
    private LibroBo libroBo= new LibroBo();

    /**
     * Creates new form ManAutor
     */
    public ManAutor() {
        initComponents();
        
        boolean conectado = libroBo.conectar();

        if(!conectado)//conectado == false;
            JOptionPane.showMessageDialog(null, "Falló conexion a BD");
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
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaAutores = new javax.swing.JTable();
        jButtonListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jTablaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Apellidos"
            }
        ));
        jScrollPane1.setViewportView(jTablaAutores);

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtnombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButtonAgregar)
                        .addGap(94, 94, 94)
                        .addComponent(jButtonListar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAtras)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonListar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
        String nombre = txtnombre.getText();
        String apellidos = txtapellidos.getText();
        
        
        Autor a = new Autor(nombre, apellidos);
    
        
        String msjAgregar = libroBo.agregar(a);
        listaautores.add(a);
    
        JOptionPane.showMessageDialog(null, msjAgregar);
        
       
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        DatosLibros DT = new DatosLibros();
        DT.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        
        DefaultTableModel Autor= new DefaultTableModel();
        JTable tabla= new JTable(Autor);
        
        Autor.addColumn("Nombre");
        Autor.addColumn("Apellidos");

        ResultSet rs= libroBo.listarau();
       try{
        while(rs.next()){
            Object [] fila= new Object [2];
             for(int i=0;i<2;i++){
                 fila[i]=rs.getObject(i+1);
             }
             Autor.addRow(fila);
        }     
       }catch(Exception ex){        
        }
       jTablaAutores.setModel(Autor);   
    }//GEN-LAST:event_jButtonListarActionPerformed

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
            java.util.logging.Logger.getLogger(ManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaAutores;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
