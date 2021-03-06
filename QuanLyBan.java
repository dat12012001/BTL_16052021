/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLCoffeeShop;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HIEU
 */
public class QuanLyBan extends javax.swing.JFrame {
    public static int dem;
    private DefaultTableModel tableModel;
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    List<Ban> dsBan = new ArrayList<>();
    
    
   

    /**
     * Creates new form QuanLyBan
     * @throws java.sql.SQLException
     */
    public QuanLyBan() throws SQLException {
        initComponents();

        showBan();
        showBanTrong();
    }
    //Show dữ liệu bàn (chạy)
    private void showBan() throws SQLException {
        //Khởi tạo bảng hiện thị bàn
        tableModel = (DefaultTableModel) tbban.getModel();
        dsBan = QLBan.findALLBan();

        tableModel.setRowCount(0);

        dsBan.forEach(b -> {
            tableModel.addRow(new Object[]{
                b.getMaBan(),
                b.getSucChua(),
                b.getTinhTrang()
            });
        });
    }
    //Show dữ liệu bàn trống (chạy)
    private void showBanTrong() throws SQLException {
        //Khởi tạo bảng hiện thị bàn trống
        tableModel = (DefaultTableModel) tbbantrong.getModel();
        dsBan = QLBan.findBanTrong();

        tableModel.setRowCount(0);

        dsBan.forEach(b1 -> {
            tableModel.addRow(new Object[]{
              
                b1.getMaBan(),
                b1.getSucChua(),
                b1.getTinhTrang()
            });
        });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbban = new javax.swing.JTable();
        btnthemban = new javax.swing.JButton();
        btncapnhatban = new javax.swing.JButton();
        btnxoaban = new javax.swing.JButton();
        btntimkiemban = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbbantrong = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Bàn", "Sức Chứa", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbban);

        btnthemban.setText("Thêm Bàn");
        btnthemban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthembanActionPerformed(evt);
            }
        });

        btncapnhatban.setText("Cập Nhật Bàn");
        btncapnhatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatbanActionPerformed(evt);
            }
        });

        btnxoaban.setText("Xóa Bàn");
        btnxoaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoabanActionPerformed(evt);
            }
        });

        btntimkiemban.setText("Tìm Kiếm Bàn");
        btntimkiemban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiembanActionPerformed(evt);
            }
        });

        jLabel2.setText("Danh Sách Tất Cả Các Bàn");

        jLabel3.setText("Danh Sách Các Bàn Trống");

        tbbantrong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Bàn", "Sức Chứa", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbbantrong);

        jButton1.setText("Đặt Bàn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncapnhatban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnxoaban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnthemban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntimkiemban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnthemban)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncapnhatban)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnxoaban)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntimkiemban)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Button thêm bàn (chạy) <thêm thẳng vào CSDL>
    private void btnthembanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthembanActionPerformed
        try {
//            String inputmaBan = JOptionPane.showInputDialog(this, "Nhập mã bàn");
            int inputsc = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Nhập sức chứa"));
            String inputtinhTrang = JOptionPane.showInputDialog(this, "Nhập tình trạng");
            
            //Chọn phương thức khởi tạo không ID vì ID là khóa chính của bảng
            Ban b = new Ban(true, inputsc, inputtinhTrang);
            
            QLBan.themBan(b);
            showBan();
            showBanTrong();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnthembanActionPerformed

    private void btncapnhatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatbanActionPerformed
        //Lấy ra vị trí index khi click chuột
        int selectedIndex = tbban.getSelectedRow();
        String row = tbban.getModel().getValueAt(selectedIndex, 0).toString();

        try {
            int inputsc = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Nhập sức chứa"));
            String inputTinhTrang = JOptionPane.showInputDialog(this, "Nhập tình trạng");

            Ban b = new Ban(inputsc, inputTinhTrang);
            QLBan.capnhatBan(b);
            showBan();
            showBanTrong();

//            QLBan.capnhatBan(b);
//            showBan();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btncapnhatbanActionPerformed
    //Button xóa bàn (Chạy)
    private void btnxoabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoabanActionPerformed
        //mousePressed
        //Lấy ra vị trí index khi click chuột
        
        
        int selectedIndex = tbban.getSelectedRow();
        String row = tbban.getModel().getValueAt(selectedIndex, 0).toString();
//        if (selectedIndex >= 0) { //Đúng
//            Ban b = dsBan.get(selectedIndex);
            //Hiển thị một Pop-up Panel xác nhận xóa, sau khi nhấn Delete
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa bàn này?");
            System.out.println("option: " + option);  
            //Ouput => Yes: 0, No: 1, Cancel: 2
            if (option == 0) {
                try {
                    QLBan.xoaBan(row);//Xóa Bàn
                    try {
                        showBan(); //Hiện thị danh sách nhân viên sau khi xóa
                        showBanTrong();
                    } catch (SQLException ex) {
                        Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_btnxoabanActionPerformed
    //Button tìm kiếm bàn theo sức chứa (Chạy)
    private void btntimkiembanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiembanActionPerformed
        int input = Integer.parseInt(JOptionPane.showInputDialog(this, 
                "Nhập sức chứa"));
        if(input > 0){
            try {
                dsBan = QLBan.timKiemBan(input);
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            tableModel.setRowCount(0);
            
            dsBan.forEach(b -> {
                tableModel.addRow(new Object[]{tableModel.getRowCount() + 1,
                    b.getMaBan(),
                    b.getSucChua(),
                    b.getTinhTrang()
                });
            });
        }
    }//GEN-LAST:event_btntimkiembanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new QuanLyBan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhatban;
    private javax.swing.JButton btnthemban;
    private javax.swing.JButton btntimkiemban;
    private javax.swing.JButton btnxoaban;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbban;
    private javax.swing.JTable tbbantrong;
    // End of variables declaration//GEN-END:variables
}
