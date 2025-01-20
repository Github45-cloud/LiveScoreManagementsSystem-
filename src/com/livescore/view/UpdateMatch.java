/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.livescore.view;
import com.livescore.model.Match;
import com.livescore.model.Match;
import com.livescore.model.MatchData;
import com.livescore.model.MatchData;
/**
 *
 * @author Lenovo
 */
public class UpdateMatch extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMatch
     */
    public UpdateMatch() {
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

        jLabel7 = new javax.swing.JLabel();
        t1score = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        t2score = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        UpdateSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Match Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, 27));

        t1score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1scoreActionPerformed(evt);
            }
        });
        getContentPane().add(t1score, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 196, -1));

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 196, -1));

        t2score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2scoreActionPerformed(evt);
            }
        });
        getContentPane().add(t2score, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 196, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Update Match");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 217, 240, 50));

        UpdateSubmit.setBackground(new java.awt.Color(0, 102, 153));
        UpdateSubmit.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        UpdateSubmit.setForeground(new java.awt.Color(204, 204, 204));
        UpdateSubmit.setText("Submit");
        UpdateSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 100, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Match Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, 27));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Team 2 Score");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, 27));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Team 1 Score");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, 27));

        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });
        getContentPane().add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 196, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 135, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/livescore/resources/updatem.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1270, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1scoreActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void t2scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2scoreActionPerformed

    private void UpdateSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSubmitActionPerformed
        // TODO add your handling code here:
                                           
    // Fetch inputs from the text fields
    String matchId = mid.getText().trim();  // Match ID from the text field
    String team1ScoreStr = t1score.getText().trim();  // Team 1 score
    String team2ScoreStr = t2score.getText().trim();  // Team 2 score
    String matchStatus = status.getText().trim();  // Match status from text field

    // Input validation
    if (matchId.isEmpty() || team1ScoreStr.isEmpty() || team2ScoreStr.isEmpty() || matchStatus.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    int team1Score, team2Score;
    try {
        // Parse numeric scores
        team1Score = Integer.parseInt(team1ScoreStr);
        team2Score = Integer.parseInt(team2ScoreStr);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Team scores must be numeric!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Find the match using MatchData
    Match matchToUpdate = MatchData.getMatchById(matchId);
    if (matchToUpdate != null) {
        // Update match details using setter methods
        matchToUpdate.setTeam1Score(team1Score);  // Update team 1 score
        matchToUpdate.setTeam2Score(team2Score);  // Update team 2 score
        matchToUpdate.setStatus(matchStatus);    // Update match status

        // Notify the user about the successful update
        javax.swing.JOptionPane.showMessageDialog(this, "Match updated successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Notify the user if the match was not found
        javax.swing.JOptionPane.showMessageDialog(this, "Match ID not found. Update failed.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_UpdateSubmitActionPerformed

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new homepage().setVisible(true);
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
            java.util.logging.Logger.getLogger(UpdateMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField status;
    private javax.swing.JTextField t1score;
    private javax.swing.JTextField t2score;
    // End of variables declaration//GEN-END:variables
}
