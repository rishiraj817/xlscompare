/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainDesign;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static mainDesign.Main.block;

/**
 *
 * @author Hp
 */
public class ViewPaymentDone extends javax.swing.JFrame {

    /**
     * Creates new form ViewPaymentDone
     */
    public ViewPaymentDone() {
        initComponents();
    }

    public void get(String name)
    {int x=0,y=0;
    Connect cd=new Connect();
    try{
        String s1="select * from people where name='"+name+"'";
        cd.st=cd.con.createStatement();
      cd.rs=  cd.st.executeQuery(s1);
      while(cd.rs.next()==true)
      {
        lname.setText("Name:- "+cd.rs.getString(1));
        mob.setText("Mob :- "+cd.rs.getString(2));
    
      }
    
    }
    catch(Exception e)
    {JOptionPane.showMessageDialog(this, e);
    }
         try{ 
             String s1="select *from "+name;
             cd.st=cd.con.createStatement();
      cd.rs=  cd.st.executeQuery(s1);
      while(cd.rs.next()==true){
          String date=cd.rs.getString(1);
   JLabel l1=new JLabel(cd.rs.getString(1)); 
   JButton b1=new JButton("View Detail");
   JLabel l2=new JLabel(cd.rs.getString(2)); 
     j1.add(l1);
    l1.setLocation(x+5, y+25);
    l1.setSize(75, 25);
    j2.add(b1);
    b1.setLocation(x+70, y+25);
    b1.setSize(100, 30);
    
      b1.addActionListener((ActionEvent e) -> {
        ViewDetail vd=new ViewDetail();
        vd.get(name, date);
        
       vd.setVisible(true);
            
        
});
   
    
   j3.add(l2);
   l2.setLocation(x+5, y+25);
    l2.setSize(75, 25);
    y=y+30;
    
      }
    
    
         }
         catch (Exception e1)
         {
         
         JOptionPane.showMessageDialog(this, e1);
         
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jLabel1 = new javax.swing.JLabel();
        mob = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        j1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        j2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        j3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(400, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Your Detail Hear");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 11, -1, -1));

        mob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mob.setText("Mob   :");
        getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 75, 135, -1));

        lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname.setText("Name:");
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 78, 128, -1));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        j1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Date");

        javax.swing.GroupLayout j1Layout = new javax.swing.GroupLayout(j1);
        j1.setLayout(j1Layout);
        j1Layout.setHorizontalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, 311));

        j2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.gray));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Particular");

        javax.swing.GroupLayout j2Layout = new javax.swing.GroupLayout(j2);
        j2.setLayout(j2Layout);
        j2Layout.setHorizontalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel4)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        j2Layout.setVerticalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 121, -1, 311));

        j3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Total");

        javax.swing.GroupLayout j3Layout = new javax.swing.GroupLayout(j3);
        j3.setLayout(j3Layout);
        j3Layout.setHorizontalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        j3Layout.setVerticalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 291, Short.MAX_VALUE))
        );

        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 121, -1, 310));

        jButton2.setText("More...");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);

Main.block=1;// TODO add your handling code here:
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPaymentDone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPaymentDone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPaymentDone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPaymentDone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPaymentDone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JPanel j3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel mob;
    // End of variables declaration//GEN-END:variables
}
