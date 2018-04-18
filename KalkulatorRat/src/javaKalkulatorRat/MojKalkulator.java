/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaKalkulatorRat;
import java.lang.Math.*;
import static java.lang.Math.pow;
import java.text.*;


/**
 *
 * @author RF
 */
public class MojKalkulator extends javax.swing.JFrame {

    /**
     * Creates new form MojKalkulator
     */
    public MojKalkulator() {
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

        jPanel1 = new javax.swing.JPanel();
        policzButton = new javax.swing.JButton();
        kwotaKredytu = new javax.swing.JTextField();
        iloscRat = new javax.swing.JTextField();
        oprocentowanie = new javax.swing.JTextField();
        zamknij = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KalkulatorRat");

        policzButton.setText("Policz!");
        policzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policzButtonActionPerformed(evt);
            }
        });

        kwotaKredytu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kwotaKredytu.setText("Wpisz kwote kredytu");
        kwotaKredytu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kwotaKredytuMouseClicked(evt);
            }
        });
        kwotaKredytu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kwotaKredytuActionPerformed(evt);
            }
        });

        iloscRat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iloscRat.setText("Ilosc rat");
        iloscRat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iloscRatMouseClicked(evt);
            }
        });

        oprocentowanie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oprocentowanie.setText("Oprocentowanie");
        oprocentowanie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oprocentowanieMouseClicked(evt);
            }
        });

        zamknij.setText("Zamknij");
        zamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamknijActionPerformed(evt);
            }
        });

        jLabel1.setText("Kwota kredytu");

        jLabel2.setText("Ilosc rat");

        jLabel3.setText("Oprocentowanie kredytu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oprocentowanie, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(iloscRat, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kwotaKredytu, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                        .addComponent(policzButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zamknij)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kwotaKredytu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iloscRat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oprocentowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(policzButton)
                            .addComponent(zamknij))
                        .addGap(59, 59, 59))))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kwotaKredytuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kwotaKredytuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kwotaKredytuActionPerformed

    private void policzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policzButtonActionPerformed
        String kwotaKredytuString = kwotaKredytu.getText();
        String iloscRatString = iloscRat.getText();
        String oprocentowanieString = oprocentowanie.getText();
        double kwotaKredytuDouble= Double.parseDouble(kwotaKredytuString);
        double iloscRatDouble = Double.parseDouble(iloscRatString);
        double oprocentowanieDouble = Double.parseDouble(oprocentowanieString);
        double paramQ = (1.0f + (oprocentowanieDouble / 12.0f));
        double paramQN = pow(paramQ,iloscRatDouble);
        double kwotaRaty = kwotaKredytuDouble*paramQN*((paramQ-1)/(paramQN-1));
        DecimalFormat df = new DecimalFormat("0.00");
        String kwotaRatyString = df.format(kwotaRaty);
        
        for (int i = 1; i <= iloscRatDouble; i++) {
             jTextArea1.append(i + "  " + kwotaRatyString + '\n');
        }
       
       
        
        
        
        
                
    }//GEN-LAST:event_policzButtonActionPerformed

    private void zamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamknijActionPerformed
       System.exit(0);
    }//GEN-LAST:event_zamknijActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        jTextArea1.setText("");
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void kwotaKredytuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kwotaKredytuMouseClicked
        kwotaKredytu.setText("");
    }//GEN-LAST:event_kwotaKredytuMouseClicked

    private void iloscRatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iloscRatMouseClicked
        iloscRat.setText("");
    }//GEN-LAST:event_iloscRatMouseClicked

    private void oprocentowanieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oprocentowanieMouseClicked
        oprocentowanie.setText("");
    }//GEN-LAST:event_oprocentowanieMouseClicked

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
            java.util.logging.Logger.getLogger(MojKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MojKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MojKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MojKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MojKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iloscRat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField kwotaKredytu;
    private javax.swing.JTextField oprocentowanie;
    private javax.swing.JButton policzButton;
    private javax.swing.JButton zamknij;
    // End of variables declaration//GEN-END:variables
}
