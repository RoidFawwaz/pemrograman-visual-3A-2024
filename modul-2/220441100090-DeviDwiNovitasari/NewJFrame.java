
import javax.swing.Icon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class NewJFrame extends javax.swing.JFrame {
    
    Icon iconBoba = new javax.swing.ImageIcon(getClass().getResource("boba.png"));
    Icon iconUang = new javax.swing.ImageIcon(getClass().getResource("uang.png"));
    double hargaMinuman,hargaTopping;
    int jumlahPesanan;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        btnGMinuman = new javax.swing.ButtonGroup();
        btnGTopping = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbMOriginal = new javax.swing.JRadioButton();
        rbMCoklat = new javax.swing.JRadioButton();
        rbMStoberi = new javax.swing.JRadioButton();
        rbMMelon = new javax.swing.JRadioButton();
        rbMTaro = new javax.swing.JRadioButton();
        rbMMacha = new javax.swing.JRadioButton();
        rbMKopi = new javax.swing.JRadioButton();
        rbMCino = new javax.swing.JRadioButton();
        rbMBluberi = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbTNon = new javax.swing.JRadioButton();
        rbBoba = new javax.swing.JRadioButton();
        rbGula = new javax.swing.JRadioButton();
        rbCincau = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnMin = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        textJumlah = new javax.swing.JTextField();
        textCash = new javax.swing.JTextField();
        textTotal = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textKembalian = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Delight Coffee", 0, 45)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Drink");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setPreferredSize(new java.awt.Dimension(20, 18));

        jLabel2.setFont(new java.awt.Font("Midspicy", 2, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Good Mood");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bubble-tea.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boba.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Lovely Bubbles", 0, 12)); // NOI18N
        jLabel3.setText("Menu Minuman");

        btnGMinuman.add(rbMOriginal);
        rbMOriginal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMOriginal.setText("Original - 5K");

        btnGMinuman.add(rbMCoklat);
        rbMCoklat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMCoklat.setText("Chocolate - 6K");

        btnGMinuman.add(rbMStoberi);
        rbMStoberi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMStoberi.setText("Strawberry - 6K");

        btnGMinuman.add(rbMMelon);
        rbMMelon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMMelon.setText("Melon-6K");

        btnGMinuman.add(rbMTaro);
        rbMTaro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMTaro.setText("Taro - 6K");

        btnGMinuman.add(rbMMacha);
        rbMMacha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMMacha.setText("Matcha - 6K");

        btnGMinuman.add(rbMKopi);
        rbMKopi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMKopi.setText("Coffe - 6K");

        btnGMinuman.add(rbMCino);
        rbMCino.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMCino.setText("Cappucino - 6K");

        btnGMinuman.add(rbMBluberi);
        rbMBluberi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbMBluberi.setText("Blueberry - 6K");

        jLabel6.setText("=========================================================");

        btnGTopping.add(rbTNon);
        rbTNon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbTNon.setText("No Topping");

        btnGTopping.add(rbBoba);
        rbBoba.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbBoba.setText("Bobble - 4K");

        btnGTopping.add(rbGula);
        rbGula.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbGula.setText("Brown sugar - 2K");

        btnGTopping.add(rbCincau);
        rbCincau.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbCincau.setText("Grass jelly - 3K");

        jLabel7.setFont(new java.awt.Font("Lovely Bubbles", 0, 12)); // NOI18N
        jLabel7.setText("TOPPING");

        jLabel8.setText("=========================================================");

        btnMin.setText("-");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        btnMax.setText("+");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lovely Bubbles", 0, 12)); // NOI18N
        jLabel9.setText("Jumlah");

        jLabel10.setFont(new java.awt.Font("Lovely Bubbles", 0, 12)); // NOI18N
        jLabel10.setText("Total");

        jLabel11.setFont(new java.awt.Font("Lovely Bubbles", 0, 12)); // NOI18N
        jLabel11.setText("cash");

        jLabel12.setFont(new java.awt.Font("Lovely Bubbles", 0, 12)); // NOI18N
        jLabel12.setText("Kembalian");

        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbMOriginal)
                            .addComponent(rbMCoklat)
                            .addComponent(rbMStoberi))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbMMelon)
                            .addComponent(rbMTaro)
                            .addComponent(rbMMacha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbMBluberi)
                            .addComponent(rbMCino)
                            .addComponent(rbMKopi))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBatal)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbCincau)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbTNon)
                                .addGap(75, 75, 75)
                                .addComponent(rbBoba)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbGula)
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCash, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTotal))
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textTotal)
                                .addComponent(jLabel10)
                                .addComponent(textKembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMOriginal)
                    .addComponent(rbMMelon)
                    .addComponent(rbMKopi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMCoklat)
                    .addComponent(rbMTaro)
                    .addComponent(rbMCino))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMStoberi)
                    .addComponent(rbMMacha)
                    .addComponent(rbMBluberi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTNon)
                    .addComponent(rbBoba)
                    .addComponent(rbGula))
                .addGap(18, 18, 18)
                .addComponent(rbCincau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMax)
                                .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnReset))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
        if (jumlahPesanan > 0){
            jumlahPesanan--;
            textJumlah.setText(String.valueOf(jumlahPesanan));
        }
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        // TODO add your handling code here:
        jumlahPesanan++;
        textJumlah.setText(String.valueOf(jumlahPesanan));
    }//GEN-LAST:event_btnMaxActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        btnGMinuman.clearSelection();
        btnGTopping.clearSelection();
        textJumlah.setText("");
        textCash.setText("");
        textKembalian.setText("");
        textTotal.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        if(!rbMOriginal.isSelected() && !rbMCoklat.isSelected() && !rbMStoberi.isSelected() && !rbMMelon.isSelected() 
                && !rbMTaro.isSelected() && !rbMMacha.isSelected() && !rbMKopi.isSelected() && !rbMCino.isSelected() 
                && !rbMBluberi.isSelected()){
            JOptionPane.showMessageDialog(this, "Harap pilih Minuman terlebih dahulu", "Peringatan", JOptionPane.INFORMATION_MESSAGE, iconBoba);
            return;
        }
        if(!rbTNon.isSelected() && !rbBoba.isSelected() && !rbGula.isSelected() && !rbCincau.isSelected()){
            JOptionPane.showMessageDialog(this, "Harap pilih Topping terlebih dahulu", "Peringatan", JOptionPane.INFORMATION_MESSAGE, iconBoba);
            return;
        }
  
        if(rbMOriginal.isSelected()){
            hargaMinuman = 5000;
        }else if(rbMCoklat.isSelected()){
            hargaMinuman = 6000;
        }else if(rbMStoberi.isSelected()){
            hargaMinuman = 6000;
        }else if(rbMMelon.isSelected()){
            hargaMinuman = 6000;
        }else if(rbMTaro.isSelected()){
            hargaMinuman = 6000;
        }else if(rbMMacha.isSelected()){
            hargaMinuman = 6000;
        }else if(rbMKopi.isSelected()){
            hargaMinuman = 6000;
        }else if(rbMCino.isSelected()){
            hargaMinuman = 6000;
        }else if(rbMBluberi.isSelected()){
            hargaMinuman = 6000;
        }


        if(rbTNon.isSelected()){
            hargaTopping = 0;
        }else if(rbBoba.isSelected()){
            hargaTopping = 4000;
        }else if(rbGula.isSelected()){
            hargaTopping = 2000;
        }else if(rbCincau.isSelected()){
            hargaTopping = 3000;
        }

        
        double totalHarga = (hargaMinuman + hargaTopping) * jumlahPesanan;

        
        if(totalHarga > 100000){
            totalHarga = totalHarga * 0.95;
        }

        
        textTotal.setText(String.format("Rp %.2f", totalHarga));
        textTotal.setEditable(false);

        
        if(textCash.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this, "Masukkan Uang Terlebih Dahulu", "Information", JOptionPane.INFORMATION_MESSAGE, iconUang);
        }

        try {
            double uangPembeli = Double.parseDouble(textCash.getText());
            double kembalian = uangPembeli - totalHarga;
            textKembalian.setText(String.format("Rp %.2f", kembalian));
            if(kembalian < 0) {
                JOptionPane.showMessageDialog(this, "Uang yang anda masukkan kurang", "Information", JOptionPane.INFORMATION_MESSAGE, iconUang);
            }
           textKembalian.setEditable(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uang yang anda inputkan tidak Valid", "Information", JOptionPane.INFORMATION_MESSAGE, iconUang);
        }  
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.ButtonGroup btnGMinuman;
    private javax.swing.ButtonGroup btnGTopping;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JRadioButton rbBoba;
    private javax.swing.JRadioButton rbCincau;
    private javax.swing.JRadioButton rbGula;
    private javax.swing.JRadioButton rbMBluberi;
    private javax.swing.JRadioButton rbMCino;
    private javax.swing.JRadioButton rbMCoklat;
    private javax.swing.JRadioButton rbMKopi;
    private javax.swing.JRadioButton rbMMacha;
    private javax.swing.JRadioButton rbMMelon;
    private javax.swing.JRadioButton rbMOriginal;
    private javax.swing.JRadioButton rbMStoberi;
    private javax.swing.JRadioButton rbMTaro;
    private javax.swing.JRadioButton rbTNon;
    private javax.swing.JTextField textCash;
    private javax.swing.JTextField textJumlah;
    private javax.swing.JTextField textKembalian;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}
