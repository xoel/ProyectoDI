/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxectobufetabogados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Main extends javax.swing.JFrame {
    private static final  Conector conector = new Conector();
      /**
     * Creates new form Clientes
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        //actualizar();
        
    }
    
    private void actualizar(){
        conector.connect();
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Statement consulta = conector.connect.createStatement();
            ResultSet rs = consulta.executeQuery("Select * from Clientes");
            
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            
            while(rs.next()){
                Object [] datos = new Object[3];
                datos[1]=rs.getInt(1);
                datos[2]=rs.getString(2);
                datos[3]=rs.getString(3);
                model.addRow(datos);
            }
            
            
        } catch (SQLException ex) {
            System.err.println("Error "+ex);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrolTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnTareas = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        itemClose = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        itemAddCliente = new javax.swing.JMenuItem();
        itemNewTask = new javax.swing.JMenuItem();
        itemNewCategory = new javax.swing.JMenuItem();
        itemNewService = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Dni/Cif", "Nombre", "Apellidos", "Razon Social", "Email", "Telefono", "Direccion", "Ciudad", "Provincia", "Cod.Postal", "Fecha Nac.", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrolTabla.setViewportView(tabla);

        btnTareas.setText("Mostrar Tareas");

        btnFactura.setText("Emitir Factura");

        jMenuFile.setText("File");

        itemClose.setText("Salir");
        itemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCloseActionPerformed(evt);
            }
        });
        jMenuFile.add(itemClose);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");

        itemAddCliente.setText("Nuevo Cliente");
        itemAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddClienteActionPerformed(evt);
            }
        });
        jMenuEdit.add(itemAddCliente);

        itemNewTask.setText("Nueva Tarea");
        itemNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewTaskActionPerformed(evt);
            }
        });
        jMenuEdit.add(itemNewTask);

        itemNewCategory.setText("Nueva Categoria");
        itemNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewCategoryActionPerformed(evt);
            }
        });
        jMenuEdit.add(itemNewCategory);

        itemNewService.setText("Nuevo Servicio");
        itemNewService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewServiceActionPerformed(evt);
            }
        });
        jMenuEdit.add(itemNewService);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTareas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFactura)
                        .addContainerGap(669, Short.MAX_VALUE))
                    .addComponent(scrolTabla, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTareas)
                    .addComponent(btnFactura))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCloseActionPerformed
        // TODO salir
        dispose();
    }//GEN-LAST:event_itemCloseActionPerformed

    private void itemAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddClienteActionPerformed
        //TODO LANZAR VENTANA CLIENTES        
        AddCliente addCliente = new AddCliente();
        addCliente.setVisible(true);     
        
    }//GEN-LAST:event_itemAddClienteActionPerformed

    private void itemNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewTaskActionPerformed
        //Lanzamos tarea nueva
        AddTarea addTarea = new AddTarea();
        addTarea.setVisible(true);
       
    }//GEN-LAST:event_itemNewTaskActionPerformed

    private void itemNewServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewServiceActionPerformed
        //Lanzamos nuevo servicio
        AddServicio addServicio = new AddServicio(conector);
        addServicio.setVisible(true);
    }//GEN-LAST:event_itemNewServiceActionPerformed

    private void itemNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewCategoryActionPerformed
        //Lanzamos nueva categoria
        AddCategoria addCategoria = new AddCategoria(conector);
        addCategoria.setVisible(true);
    }//GEN-LAST:event_itemNewCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        conector.connect();        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnTareas;
    private javax.swing.JMenuItem itemAddCliente;
    private javax.swing.JMenuItem itemClose;
    private javax.swing.JMenuItem itemNewCategory;
    private javax.swing.JMenuItem itemNewService;
    private javax.swing.JMenuItem itemNewTask;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JScrollPane scrolTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
