/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainDesign;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class ViewDetail extends javax.swing.JFrame {

    /**
     * Creates new form VirewDetail
     */
    public ViewDetail() {
        initComponents();
    }
public void get(String name,String date)
{int x=0,y=0;
    
    tcb.setText("Name:- "+name);
d.setText("Date:- "+date);
System.out.println(date);
    //String[] parts = date.split("-");
String part1 =date.substring(0, 4);// parts[0]; // 004
String part2 = date.substring(5, 7);
String part3=date.substring(8,10);
try{
    Connect cd=new Connect();
String table=name+"_"+part3+"_"+part2+"_"+part1  ;
String sql="select * from "+table;
cd.st=cd.con.createStatement();
cd.rs=cd.st.executeQuery(sql);
while(cd.rs.next()==true)
{
    
    JLabel l1=new JLabel(cd.rs.getString(1));
     JLabel l2=new JLabel(cd.rs.getString(2)); 
     JLabel l3=new JLabel(cd.rs.getString(3));
      JLabel l4=new JLabel(cd.rs.getString(4));
      j1.add(l1);
      l1.setLocation(x+10, y+20);
      l1.setSize(75, 25);
      j2.add(l2);
      l2.setLocation(x+10, y+20);
      l2.setSize(75, 25);
      j3.add(l3);
      l3.setLocation(x+10, y+20);
      l3.setSize(75, 25);
      j4.add(l4);
      l4.setLocation(x+10, y+20);
      l4.setSize(75, 25);
      
      y=y+30;
      
     
     

}



}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this, e);
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

        tcb = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        j4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        j2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        j3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        j1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(420, 175));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tcb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcb.setText("Transaction By:                              ");
        getContentPane().add(tcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 81, -1, -1));

        d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        d.setText("Date:                              ");
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 81, 136, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        j4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel4.setText("Total");

        javax.swing.GroupLayout j4Layout = new javax.swing.GroupLayout(j4);
        j4.setLayout(j4Layout);
        j4Layout.setHorizontalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        j4Layout.setVerticalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 80, 310));

        j2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel2.setText("Rate per Unit");

        javax.swing.GroupLayout j2Layout = new javax.swing.GroupLayout(j2);
        j2.setLayout(j2Layout);
        j2Layout.setHorizontalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );
        j2Layout.setVerticalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, 310));

        j3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel3.setText("How Much");

        javax.swing.GroupLayout j3Layout = new javax.swing.GroupLayout(j3);
        j3.setLayout(j3Layout);
        j3Layout.setHorizontalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        j3Layout.setVerticalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        j1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel1.setText("Iteam");

        javax.swing.GroupLayout j1Layout = new javax.swing.GroupLayout(j1);
        j1.setLayout(j1Layout);
        j1Layout.setHorizontalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 310));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Detail View");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);

Main.block=1;// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d;
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JPanel j3;
    private javax.swing.JPanel j4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel tcb;
    // End of variables declaration//GEN-END:variables
}
