/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TicTacToeRoundButtons;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Chathura
 */
public class TicTacToeRButton extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCounter = 0;
    private int oCounter = 0;

    /** Creates new form TicTacToeRButton */
    public TicTacToeRButton() {
        initComponents();
        gameScore();
    }
    private void gameScore()
    {
    jlblPlayerX.setText(String.valueOf(xCounter));
    jlblPlayerO.setText(String.valueOf(oCounter));
    
    }
    
    private void choose_a_player()
    {
      if (startGame.equalsIgnoreCase("X"))
      {
      startGame="O";
      }
      else 
      {
       startGame="X";
      }
    }
    private void WinningGame()
    {
     String b1 = jButton1.getText();
     String b2 = jButton2.getText();
     String b3 = jButton3.getText();
     
     String b4 = jButton4.getText();
     String b5 = jButton5.getText();
     String b6 = jButton6.getText();
     
     String b7 = jButton7.getText();
     String b8 = jButton8.getText();
     String b9 = jButton9.getText();
     
     if (b1 ==("X") && b2 == ("X") && b3 == ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton1.setBackground(Color.YELLOW);
       jButton2.setBackground(Color.YELLOW);
       jButton3.setBackground(Color.YELLOW);
     }
     
     if (b4 ==("X") && b5 == ("X") && b6 == ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton4.setBackground(Color.CYAN);
       jButton5.setBackground(Color.CYAN);
       jButton6.setBackground(Color.CYAN);
     }
     
     if (b7 ==("X") && b8 == ("X") && b9 == ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton7.setBackground(Color.red);
       jButton8.setBackground(Color.red);
       jButton9.setBackground(Color.red);
     }
     if (b1 ==("X") && b4 == ("X") && b7 == ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton1.setBackground(Color.MAGENTA);
       jButton4.setBackground(Color.MAGENTA);
       jButton7.setBackground(Color.MAGENTA);
     }
      if (b2 ==("X") && b5 == ("X") && b8== ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton2.setBackground(Color.PINK);
       jButton5.setBackground(Color.PINK);
       jButton8.setBackground(Color.PINK);
     }
       if (b3 ==("X") && b6 == ("X") && b9 == ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton3.setBackground(Color.MAGENTA);
       jButton6.setBackground(Color.MAGENTA);
       jButton9.setBackground(Color.MAGENTA);
     }
        if (b1 ==("X") && b5 == ("X") && b9 == ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton1.setBackground(Color.PINK);
       jButton5.setBackground(Color.PINK);
       jButton9.setBackground(Color.PINK);
     }
         if (b3 ==("X") && b5 == ("X") && b7 == ("X"))
     {
       JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       xCounter++;
       gameScore();
       jButton3.setBackground(Color.CYAN);
       jButton5.setBackground(Color.CYAN);
       jButton7.setBackground(Color.CYAN);
     }
         
         
          if (b1 ==("O") && b2 == ("O") && b3 == ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton1.setBackground(Color.YELLOW);
       jButton2.setBackground(Color.YELLOW);
       jButton3.setBackground(Color.YELLOW);
     }
     
     if (b4 ==("O") && b5 == ("O") && b6 == ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton4.setBackground(Color.CYAN);
       jButton5.setBackground(Color.CYAN);
       jButton6.setBackground(Color.CYAN);
     }
     
     if (b7 ==("O") && b8 == ("O") && b9 == ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton7.setBackground(Color.red);
       jButton8.setBackground(Color.red);
       jButton9.setBackground(Color.red);
     }
     if (b1 ==("O") && b4 == ("O") && b7 == ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton1.setBackground(Color.MAGENTA);
       jButton4.setBackground(Color.MAGENTA);
       jButton7.setBackground(Color.MAGENTA);
     }
      if (b2 ==("O") && b5 == ("O") && b8== ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton2.setBackground(Color.PINK);
       jButton5.setBackground(Color.PINK);
       jButton8.setBackground(Color.PINK);
     }
       if (b3 ==("O") && b6 == ("O") && b9 == ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton3.setBackground(Color.MAGENTA);
       jButton6.setBackground(Color.MAGENTA);
       jButton9.setBackground(Color.MAGENTA);
     }
        if (b1 ==("O") && b5 == ("O") && b9 == ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton1.setBackground(Color.PINK);
       jButton5.setBackground(Color.PINK);
       jButton9.setBackground(Color.PINK);
     }
         if (b3 ==("O") && b5 == ("O") && b7 == ("O"))
     {
       JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       oCounter++;
       gameScore();
       jButton3.setBackground(Color.CYAN);
       jButton5.setBackground(Color.CYAN);
       jButton7.setBackground(Color.CYAN);
     }
     
     
     
     
    }
            

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(857, 503));
        setMinimumSize(new java.awt.Dimension(857, 503));
        setPreferredSize(new java.awt.Dimension(857, 503));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 110));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, 110));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 160, 110));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 110));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, 110));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 160, 110));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 110));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 110));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 160, 110));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 160, 110));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 160, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Player O:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 190, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Player X:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 190, 50));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 100, 50));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 90, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Let's Play Tic Tac Toe");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 620, 110));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_solid_bright_44011_1364x768.jpg"))); // NOI18N
        getContentPane().add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
        
        
        
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton1.setForeground(Color.GREEN);
      }
      else 
      {
       jButton1.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         jButton2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton2.setForeground(Color.GREEN);
      }
      else 
      {
       jButton2.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jButton3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton3.setForeground(Color.GREEN);
      }
      else 
      {
       jButton3.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jButton4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton4.setForeground(Color.GREEN);
      }
      else 
      {
       jButton4.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         jButton5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton5.setForeground(Color.GREEN);
      }
      else 
      {
       jButton5.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton6.setForeground(Color.GREEN);
      }
      else 
      {
       jButton6.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton7.setForeground(Color.GREEN);
      }
      else 
      {
       jButton7.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         jButton8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton8.setForeground(Color.GREEN);
      }
      else 
      {
       jButton8.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         jButton9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
      {
      jButton9.setForeground(Color.GREEN);
      }
      else 
      {
       jButton9.setForeground(Color.BLUE);
      }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(TicTacToeRButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeRButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeRButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeRButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeRButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private rojerusan.RSLabelImage rSLabelImage1;
    // End of variables declaration//GEN-END:variables

}
