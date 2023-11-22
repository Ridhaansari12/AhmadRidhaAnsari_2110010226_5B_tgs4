
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        buttonPanel = new javax.swing.JPanel();
        Java1BT = new javax.swing.JButton();
        Java2BT = new javax.swing.JButton();
        Java3BT = new javax.swing.JButton();
        ExitBT = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        Java1LB = new javax.swing.JLabel();
        Java3LB = new javax.swing.JLabel();
        Java2LB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Java1BT.setText("JAVA 1");
        Java1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Java1BTActionPerformed(evt);
            }
        });
        buttonPanel.add(Java1BT);

        Java2BT.setText("JAVA 2");
        Java2BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Java2BTActionPerformed(evt);
            }
        });
        buttonPanel.add(Java2BT);

        Java3BT.setText("JAVA 3");
        Java3BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Java3BTActionPerformed(evt);
            }
        });
        buttonPanel.add(Java3BT);

        ExitBT.setText("EXIT");
        ExitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(ExitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        Java1LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java1.jpg"))); // NOI18N
        Java1LB.setText("jLabel1");
        imagePanel.add(Java1LB, "0");
        Java1LB.getAccessibleContext().setAccessibleName("0");
        Java1LB.getAccessibleContext().setAccessibleDescription("null");

        Java3LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java3.jpg"))); // NOI18N
        Java3LB.setText("jLabel1");
        imagePanel.add(Java3LB, "2");
        Java3LB.getAccessibleContext().setAccessibleDescription("null");

        Java2LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java2.jpg"))); // NOI18N
        Java2LB.setText("jLabel1");
        imagePanel.add(Java2LB, "1");
        Java2LB.getAccessibleContext().setAccessibleDescription("null");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Java1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Java1BTActionPerformed
       CardLayout cl =(CardLayout)(imagePanel.getLayout());
       cl.show(imagePanel,"0");
    }//GEN-LAST:event_Java1BTActionPerformed

    private void Java2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Java2BTActionPerformed
       CardLayout cl =(CardLayout)(imagePanel.getLayout());
       cl.show(imagePanel,"1");
    }//GEN-LAST:event_Java2BTActionPerformed

    private void Java3BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Java3BTActionPerformed
        CardLayout cl =(CardLayout)(imagePanel.getLayout());
       cl.show(imagePanel,"2");
    }//GEN-LAST:event_Java3BTActionPerformed

    private void ExitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitBTActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBT;
    private javax.swing.JButton Java1BT;
    private javax.swing.JLabel Java1LB;
    private javax.swing.JButton Java2BT;
    private javax.swing.JLabel Java2LB;
    private javax.swing.JButton Java3BT;
    private javax.swing.JLabel Java3LB;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    // End of variables declaration//GEN-END:variables

    private static class CardLayout {

        public CardLayout() {
        }

        private void show(JPanel imagePanel, String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class GraphicsEnvironment {

        public GraphicsEnvironment() {
        }
    }
}
