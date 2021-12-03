/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsDrive;

import hms.object.Reserve;
import hms.check.CheckSrc;
import hms.check.CheckOutSrc;
import hms.textfiles.CheckTextFiles;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class CheckOut extends javax.swing.JFrame {
    /**
     * Creates new form CheckInSrc
     */
    private ArrayList<Reserve> checkArrayList = new ArrayList<>();
    private CheckSrc check = new CheckSrc();
    private CheckOutSrc checkOut = new CheckOutSrc();
    private DefaultTableModel dTbl;
    
    public int num;
    
    public CheckOut() {
        initComponents();
        
        dTbl = (DefaultTableModel) CHECKIN_TABLE.getModel();
        checkArrayList = CheckTextFiles.getCheckListTxt();
        
        //테이블에 출력
        for (Reserve r : checkArrayList){
            dTbl.insertRow(dTbl.getRowCount(), new Object[]{
                r.getRoomNum(),
                r.getName(),
                r.getPhoneNum(),
                r.getPeopleNum(),
                r.getCheckInDate(),
                r.getCheckOutDate()
            });
        }
    }
    
    public CheckOut(int num) {
        this.num = num;
        initComponents();
        
        dTbl = (DefaultTableModel) CHECKIN_TABLE.getModel();
        checkArrayList = CheckTextFiles.getCheckListTxt();
        
        //테이블에 출력
        for (Reserve r : checkArrayList){
            dTbl.insertRow(dTbl.getRowCount(), new Object[]{
                r.getRoomNum(),
                r.getName(),
                r.getPhoneNum(),
                r.getPeopleNum(),
                r.getCheckInDate(),
                r.getCheckOutDate()
            });
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

        jLabel1 = new javax.swing.JLabel();
        SEARCH_FIELD = new javax.swing.JTextField();
        SEARCH_BTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CHECKIN_TABLE = new javax.swing.JTable();
        CHECKOUT_BTN = new javax.swing.JButton();
        PRE_BTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel1.setText("체크아웃");

        SEARCH_BTN.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        SEARCH_BTN.setText("검색");
        SEARCH_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_BTNActionPerformed(evt);
            }
        });

        jLabel3.setText("예약자 명 또는 객실 번호:");

        CHECKIN_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "호실", "예약자명", "전화번호", "인원 수", "체크인 날짜", "체크아웃 날짜"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CHECKIN_TABLE);

        CHECKOUT_BTN.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        CHECKOUT_BTN.setText("체크아웃");
        CHECKOUT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKOUT_BTNActionPerformed(evt);
            }
        });

        PRE_BTN.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        PRE_BTN.setText("이전");
        PRE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRE_BTNActionPerformed(evt);
            }
        });

        jMenu1.setText("메뉴");

        jMenuItem1.setText("뒤로가기");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("종료");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SEARCH_FIELD)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SEARCH_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CHECKOUT_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PRE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEARCH_FIELD, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(SEARCH_BTN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHECKOUT_BTN)
                    .addComponent(PRE_BTN))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //체크아웃 검색 버튼
    private void SEARCH_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_BTNActionPerformed
    
        try{
            String search = SEARCH_FIELD.getText();
            DefaultTableModel searchTbl;
            searchTbl = (DefaultTableModel) CHECKIN_TABLE.getModel();
            searchTbl.setRowCount(0);
            
            //체크인 목록 검색
            checkArrayList = check.check(search.trim(), 2);  //1: 체크인 2: 체크아웃

            //존재하지 않는 고객일 경우
            if(checkArrayList.isEmpty()){
                JOptionPane.showMessageDialog(null, "존재하지 않는 고객입니다.");
            } else{
            //테이블에 검색 목록 출력
                for (Reserve r : checkArrayList){
                    searchTbl.insertRow(searchTbl.getRowCount(), new Object[]{
                         r.getRoomNum(),
                         r.getName(),
                         r.getPhoneNum(),
                         r.getPeopleNum(),
                         r.getCheckInDate(),
                         r.getCheckOutDate()
                        });
                }
            }
            
        } catch(IOException ex){
           Logger.getLogger(RoomService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SEARCH_BTNActionPerformed
    
   
  
    //상단 메뉴바 뒤로가기 버튼
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Check ch = new Check(num);
        ch.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //상단 메뉴바 종료 버튼
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //체크아웃 버튼
    private void CHECKOUT_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKOUT_BTNActionPerformed
        DefaultTableModel dTable;
        dTable = (DefaultTableModel) CHECKIN_TABLE.getModel();
        int row = -1;
        
        row = CHECKIN_TABLE.getSelectedRow();
        
        if (row == -1){
            JOptionPane.showMessageDialog(null, "체크인할 객실을 선택해주십시오.");
        }else{
            String checkInIdx = (String) dTable.getValueAt(row, 0);
        
            //체크아웃 실행
            try {
                checkArrayList = check.check(checkInIdx.trim(),2);  //1: 체크인 2: 체크아웃
                checkOut.checkOut(checkArrayList);
                int[] feeArray = checkOut.pay(checkArrayList);
            
                new Pay(num, feeArray).setVisible(true);  //결제
                dispose();
            
            } catch (IOException ex) {
                Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CHECKOUT_BTNActionPerformed

    private void PRE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRE_BTNActionPerformed
        // TODO add your handling code here:
        Check pre = new Check(num);
        pre.setVisible(true);
        dispose();
    }//GEN-LAST:event_PRE_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOutSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CHECKIN_TABLE;
    private javax.swing.JButton CHECKOUT_BTN;
    private javax.swing.JButton PRE_BTN;
    private javax.swing.JButton SEARCH_BTN;
    private javax.swing.JTextField SEARCH_FIELD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
