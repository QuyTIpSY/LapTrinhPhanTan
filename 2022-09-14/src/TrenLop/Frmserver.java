package TrenLop;


import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author quang
 */
public class Frmserver extends javax.swing.JFrame {

    public class TuyenNhan extends Thread{
        public static long gt(int n) {
            long s = 1;
            for (int i = 1; i <= n; i++)
                s *= i;
            return s;
        }
        public static long C(int k, int n) {
            return  gt(n) / (gt(k)*gt(n - k));
        }
        
        public void run(){
            try {
                 while(true){
                    String st = gn.Nhan();
                    String [] ds = st.split("[:]");
                    String ipclient = ds[0];
                    String cp = ds[1];
                    Runtime r = Runtime.getRuntime();
                    
                    // Gửi trả lại dong chữ "XLPT"
                    if(cp.equals("/tm"))
                        gn.Gui("XLPT", ipclient, 12);
                    list1.add(st);
                    list1.select(list1.getItemCount()-1);
                    // Mở notepad
                    if(cp.equals("/notepad"))
                        r.exec("notepad");
                    // Mở file excel
                    if(cp.equals("/excel"))
                        r.exec("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
                    // Hiển thị tên Server
                    if(cp.equals("/ht"))
                        gn.Gui(InetAddress.getLocalHost().getHostName(), ipclient, 12);
                    // Kết quả XSKT
                    if(cp.equals("/xskt")) {
                        FileReader f = new FileReader("xoso.txt");
                        BufferedReader b = new BufferedReader(f);
                        while(true) {
                            String st1 = b.readLine();
                            if(st1=="" || st1==null) break;
                            gn.Gui(st1, ipclient, 12);
                        }
                        b.close();
                        f.close();
                    }
                    // Dãy số
                    String[] t = cp.split("[;]");
                    if(t[0].equals("/+")){
                        int max = Integer.parseInt(t[1]);
                        int min = Integer.parseInt(t[1]);
                        int tong=Integer.parseInt(t[1]);
                        int sl = t.length-1;
                        for(int i=2; i<t.length; i++) {
                            tong+=Integer.parseInt(t[i]);
                            if(max<Integer.parseInt(t[i])) max=Integer.parseInt(t[i]);
                            if(min>Integer.parseInt(t[i])) min=Integer.parseInt(t[i]);
                        }
                        gn.Gui("Tong: " + tong, ipclient, 1261);
                        gn.Gui("So lon nhat: " + max, ipclient, 1261);
                        gn.Gui("So nho nhat: " + min, ipclient, 1261);
                        gn.Gui("So chu so Client gui len: " + sl + " so", ipclient, 1261);
                    }
                    // Tính kết quả tổ hợp k chập n
                    if(t[0].equals("/C")) {
                        int k = Integer.parseInt(t[1]);
                        int n = Integer.parseInt(t[2]);
                        gn.Gui("To hop bang: " + C(k, n), ipclient, 1261);
                    }
                    
                    
                    
                 }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Frmserver() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtip = new javax.swing.JTextField();
        txtport = new javax.swing.JTextField();
        txtsend = new javax.swing.JTextField();
        bnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        jLabel1.setText("IP");

        jLabel2.setText("PORT");

        txtport.setText("1261");
        txtport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtportActionPerformed(evt);
            }
        });

        bnt.setText("Send");
        bnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtsend, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtip)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtport, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    GuiNhan gn = new GuiNhan();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            gn.MoCong(1260);
//            gn.Nhan();
            TuyenNhan tn = new TuyenNhan();
            tn.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void txtportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtportActionPerformed

    private void bntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActionPerformed
        // TODO add your handling code here:
        try {
            String ipsever=txtip.getText();
            int cong=Integer.parseInt(txtport.getText());
            String iplocal=InetAddress.getLocalHost().getHostAddress();
            String data=iplocal + ":" + txtsend.getText();
            gn.Gui(data, ipsever, cong);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bntActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmserver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.List list1;
    private javax.swing.JTextField txtip;
    private javax.swing.JTextField txtport;
    private javax.swing.JTextField txtsend;
    // End of variables declaration//GEN-END:variables
}
