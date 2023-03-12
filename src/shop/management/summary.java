/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shop.management;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hp
 */
public class summary extends javax.swing.JFrame {

    /**
     * Creates new form summary
     */
    public summary() {
        initComponents();
        table_update();
        sale();
//        gt();
//        date();
//        time();
    }
    Connection connect;
    PreparedStatement pst;
    PreparedStatement prestatement1;
    PreparedStatement prestatement2;
    PreparedStatement prestatement3;
    PreparedStatement prestatement4;
    PreparedStatement prestatement5;
    ResultSet rs;
    
     int sal = 0;
    public void sale(){
       
        

           try {
                Class.forName("com.mysql.jdbc.Driver");
                connect = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "");
                pst = connect.prepareStatement("select gt from gtotal where id=1");

           
                rs = pst.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "Grand Total Not Found");
                            jTextField1.setText("");
                } else {
                   //  String gg = rs.getString("ft");
                     String tprice = rs.getString("gt");
                     sal += Integer.parseInt(tprice.toString());
                 
           //          System.out.println(sal);
                     jTextField1.setText(String.valueOf(sal));

                 //   jTextField2.setText(pname.trim());
                  //  jTextField3.setText(tprice.trim());
                }
                
//                String total = jTextField5.getText();
//                sumtotal += Integer.parseInt(total.toString());
//                int invoice = String.valueOf(gg)
//                int kprice = Integer.parseInt(jTextField3.getText());
//
//                int tot = kqty * kprice;
////                jTextField4.setText(String.valueOf(tot)); //for int to String
////                jButton1.requestFocus();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    
    
    public void table_update()
    {
        try {
            int count;
            
            Class.forName("com.mysql.jdbc.Driver");
            connect = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/shop","root","");
            
            prestatement1 = connect.prepareStatement("select * from bill order by invoice desc");
            ResultSet rs = prestatement1.executeQuery();
            
            ResultSetMetaData rd =rs.getMetaData();
            
            count = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for (int i =1; i<= count; i++)
                {
                    v2.add(rs.getString("invoice"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("total"));
                    v2.add(rs.getString("seller"));
                    
                      
                      
                    
                }
                
                df.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Ex");
        } catch (SQLException ex) {
            System.out.println("ex");
        }
                
    }
    
    
//    void gt() throws ClassNotFoundException, SQLException{
//        Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","");
//            PreparedStatement ps;
//        try {
//            ps = con.prepareStatement("SELECT FROM bill(invoice,date,total,gt) values (?,?,?,?)");
//        } catch (SQLException ex) {
//            Logger.getLogger(summary.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            ps.setString(1, invoice);
//            ps.setString(2, date);
//            ps.setString(3, total);
//            ps.setString(4, String.valueOf(sumtotal));
//            
//       //  jTextField4.setText(String.valueOf(tot));
//       
//
//            ps.executeUpdate();
//    }
//    
//    

//    void date() {
//        Date d = new Date();
//        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
//        jLabel2.setText(s.format(d));
//
//    }
//
//    void time() {
//        new Timer(0, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Date d = new Date();
//                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
//                jLabel3.setText(s.format(d));
//                System.out.println(d);
//            }
//
//        }
//        ).start();
//    }

//    int tot;
//    summary(int sumtotal) {
//        initComponents();       
//        this.tot = sumtotal;
//        jLabel2.setText(String.valueOf(tot));
//        
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Summary");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1068, 58));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sale Summary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(328, 328, 328))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Sale");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setEnabled(false);

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Date", "Total", "Seller"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search By Anyting");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Taka");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Delete All History");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(365, 365, 365))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(350, 350, 350)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(386, 386, 386))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
          if (dialogResult == JOptionPane.YES_OPTION)
          {
            try {
                // String entry = txtEntry.getText();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/shop","root","");
                
             PreparedStatement ps = con.prepareStatement("TRUNCATE TABLE bill");

           
           
              ps.executeUpdate();
              JOptionPane.showMessageDialog(this, "Record deleted");
              
          
           jTextField2.requestFocus();
              table_update();
            } catch (ClassNotFoundException ex) {
                System.out.println("Ex");
            } catch (SQLException ex) {
                System.out.println("Ex");
            }
            
          }
          else{
              
          }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new summary().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
