/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.sql.ResultSet;

/**
 *
 * @author Abhay John
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        selectque();
    }
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    public void selectque()
    {
        try
        {
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
          stmt=con.createStatement();
          rs=stmt.executeQuery("Select sub_id,sub_name from subject");
     
         admin_panel.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
         DefaultTableModel model=(DefaultTableModel)admin_panel.getModel();
         int index=admin_panel.getSelectedRow();
         sid.setText(model.getValueAt(index, 0).toString());
         sname.setText(model.getValueAt(index, 1).toString());
         qid.setText(model.getValueAt(index, 2).toString());
        // ques.setText(model.getValueAt(index, 3).toString());
        // category.s(model.getValueAt(index, 3).toString());
        }
        catch(Exception e)
        {
        }
        try
        {
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
          stmt=con.createStatement();
          rs=stmt.executeQuery("Select sub_id,qid,ques,ans from questions");
          quiz.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
         DefaultTableModel model=(DefaultTableModel)quiz.getModel();
         int index=quiz.getSelectedRow();
        }
        catch(Exception e){}
        
        
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        qid = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admin_panel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        quiz = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("SUBJECTS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 15, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Subject ID:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 46, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Subject name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, -1, -1));
        jPanel2.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 46, 273, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 204));
        jLabel8.setText("Questions");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Question ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 147, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setText("Question:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 187, -1, -1));

        qid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qidActionPerformed(evt);
            }
        });
        jPanel2.add(qid, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 143, 273, -1));

        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 431, -1, -1));

        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 431, -1, -1));

        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 460, -1, -1));

        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 460, -1, -1));

        jLabel11.setText("Answer:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 401, -1, -1));
        jPanel2.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 390, 272, 30));
        jPanel2.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 82, 273, -1));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane3.setViewportView(textarea);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 260, 190));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 400, 510));

        jPanel3.setBackground(new java.awt.Color(204, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 204));
        jLabel2.setText("TABLE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 6, 73, -1));

        admin_panel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Subject ID", "Subject name"
            }
        ));
        admin_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_panelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admin_panel);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 386, 190));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("TABLE");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 6, 97, -1));

        quiz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sub_ID", "Q_ID", "Question", "Answer"
            }
        ));
        quiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quizMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(quiz);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 246, 386, 244));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 400, 510));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("ADMIN PANEL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 51));
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void qidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qidActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      admin_login l=new admin_login();
      l.show();
      dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
try{ 
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");

            PreparedStatement add=con.prepareStatement("insert into questions values(?,?,?,?)");
            add.setString(1,qid.getText());
            add.setString(2,sid.getText());
            add.setString(3,textarea.getText());
             add.setString(4,ans.getText());

            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this," Added Successfully");
              selectque();
            con.close();
}
catch(Exception e)
{
    e.printStackTrace();
}
try
        {
         Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
            PreparedStatement add=con.prepareStatement("insert into subject values(?,?)");
            add.setString(1,sid.getText());
            add.setString(2,sname.getText());
            
            
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this," Added Successfully");
            con.close();
           selectque();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }//GEN-LAST:event_addMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        sid.setText(" ");
        //qid.setText(" ");
        //opt.setText(" ");
       // sid.setText(" ");
        
    }//GEN-LAST:event_clearActionPerformed

    private void admin_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_panelMouseClicked
       DefaultTableModel model=(DefaultTableModel)admin_panel.getModel();
      int myindex=admin_panel.getSelectedRow();
     // admin_panel.setText(model.getValueAt(myindex,0 ).toString());
      sid.setText(model.getValueAt(myindex,0 ).toString());
      sname.setText(model.getValueAt(myindex,1 ).toString());
      //qid.setText(model.getValueAt(myindex,2 ).toString());   
      //ques.setText(model.getValueAt(myindex, 3).toString());
    }//GEN-LAST:event_admin_panelMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
 
            try
            {
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
                String query="update question set ques='"+textarea.getText()+"'"+",ans='"+ans.getText()+"'";
                
                Statement add=con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this," Updated");
                selectque();
              
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }           
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
try
{
     String rid=sid.getText();
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
   String query1="delete from subject where sub_id="+rid;
                Statement add=con.createStatement();
                add.executeQuery(query1);
                selectque();
                JOptionPane.showMessageDialog(this, "subject deleted succesfully");
                
}
catch(Exception e){}
try
{
   String pid=qid.getText();
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
   String query="delete from questions where qid="+pid;
                Statement add=con.createStatement();
                add.executeQuery(query);
                selectque();
                JOptionPane.showMessageDialog(this, "Question deleted succesfully");
}
catch(Exception e)
{
    
}
       
    }//GEN-LAST:event_deleteMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        sid.setText("");
        sname.setText("");
        qid.setText("");
        textarea.setText("");
        
    }//GEN-LAST:event_clearMouseClicked

    private void quizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizMouseClicked
         DefaultTableModel model=(DefaultTableModel)quiz.getModel();
      int myindex=quiz.getSelectedRow();
     // admin_panel.setText(model.getValueAt(myindex,0 ).toString());
      sid.setText(model.getValueAt(myindex,0 ).toString());
      qid.setText(model.getValueAt(myindex,1 ).toString());
       textarea.setText(model.getValueAt(myindex,2 ).toString());
        ans.setText(model.getValueAt(myindex,3 ).toString());
    }//GEN-LAST:event_quizMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTable admin_panel;
    private javax.swing.JTextField ans;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField qid;
    private javax.swing.JTable quiz;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTextArea textarea;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
