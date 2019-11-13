package frame;

import application.Sorting;
import java.awt.Color;
import java.io.IOException;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public Sorting sorting;
    
    public MainFrame() {
        initComponents();  
        this.sorting = new Sorting();
        radio1000.setSelected(true);
        valCres.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        grupoTam = new javax.swing.ButtonGroup();
        grupoMet = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnExecutar = new javax.swing.JButton();
        metodoDois = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valCres = new javax.swing.JRadioButton();
        radio100000 = new javax.swing.JRadioButton();
        radio10000 = new javax.swing.JRadioButton();
        metodoUm = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radio1000 = new javax.swing.JRadioButton();
        valAle = new javax.swing.JRadioButton();
        radio1000000 = new javax.swing.JRadioButton();
        valDec = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        grupoTam.add(radio1000);
        grupoTam.add(radio10000);
        grupoTam.add(radio100000);
        grupoTam.add(radio1000000);

        grupoMet.add(valCres);
        grupoMet.add(valDec);
        grupoMet.add(valAle);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 253, 217));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExecutar.setBackground(new java.awt.Color(255, 255, 255));
        btnExecutar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExecutar.setText("Executar");
        btnExecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExecutar.setFocusPainted(false);
        btnExecutar.setOpaque(false);
        btnExecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExecutarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExecutarMouseExited(evt);
            }
        });
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });
        jPanel1.add(btnExecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 150, 35));

        metodoDois.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        metodoDois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection-Sort", "Insertion-Sort", "Bubble-Sort", "Shell-Sort", "Quick-Sort" }));
        metodoDois.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(metodoDois, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Algoritmo 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 195, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Algoritmo 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 195, -1));

        valCres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valCres.setText("Valores em ordem crescente");
        valCres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valCres.setFocusPainted(false);
        valCres.setOpaque(false);
        jPanel1.add(valCres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 330, -1));

        radio100000.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radio100000.setText("100000");
        radio100000.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio100000.setFocusPainted(false);
        radio100000.setOpaque(false);
        jPanel1.add(radio100000, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        radio10000.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radio10000.setText("10000");
        radio10000.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio10000.setFocusPainted(false);
        radio10000.setOpaque(false);
        jPanel1.add(radio10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        metodoUm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        metodoUm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection-Sort", "Insertion-Sort", "Bubble-Sort", "Shell-Sort", "Quick-Sort" }));
        metodoUm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(metodoUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Arquivo a ser usado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 386, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Quantidade de nós");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 406, -1));

        radio1000.setBackground(new java.awt.Color(255, 255, 255));
        radio1000.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radio1000.setText("1000");
        radio1000.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio1000.setFocusPainted(false);
        radio1000.setOpaque(false);
        jPanel1.add(radio1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        valAle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valAle.setText("Valores em ordem aleatória");
        valAle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valAle.setFocusPainted(false);
        valAle.setOpaque(false);
        jPanel1.add(valAle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 330, -1));

        radio1000000.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radio1000000.setText("1000000");
        radio1000000.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio1000000.setFocusPainted(false);
        radio1000000.setOpaque(false);
        jPanel1.add(radio1000000, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        valDec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valDec.setText("Valores em ordem decrescente");
        valDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valDec.setFocusPainted(false);
        valDec.setOpaque(false);
        jPanel1.add(valDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 330, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Comparação de Algoritmos de Ordenação");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 406, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 152, 360, 0));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 105));
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 420, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecutarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExecutarMouseEntered
        btnExecutar.setBackground(new Color(255, 255, 105));
    }//GEN-LAST:event_btnExecutarMouseEntered

    private void btnExecutarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExecutarMouseExited
        btnExecutar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnExecutarMouseExited

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        if(metodoUm.getSelectedIndex() == metodoDois.getSelectedIndex()) {
            JOptionPane.showMessageDialog(null, "Por favor selecione dois métodos distintos");
        }
        else {   
            try {                
                int metodo1 = metodoUm.getSelectedIndex();
                int metodo2 = metodoDois.getSelectedIndex();
                int ordem = Integer.parseInt(getSelectedButtonText(grupoMet));
                int tam = Integer.parseInt(getSelectedButtonText(grupoTam));                            
                this.sorting.sort(metodo1, ordem, tam).printValues();
                System.out.println();
                this.sorting.sort(metodo2, ordem, tam).printValues();
                System.out.println();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnExecutarActionPerformed

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        int i = 0;
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();            
            if (button.isSelected()) {
                if(buttonGroup == grupoTam) {                    
                    return button.getText();
                }
                else {
                    return String.valueOf(i);
                }
            }
            i++;
        }

        return null;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {        
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.ButtonGroup grupoMet;
    private javax.swing.ButtonGroup grupoTam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> metodoDois;
    private javax.swing.JComboBox<String> metodoUm;
    private javax.swing.JRadioButton radio1000;
    private javax.swing.JRadioButton radio10000;
    private javax.swing.JRadioButton radio100000;
    private javax.swing.JRadioButton radio1000000;
    private javax.swing.JRadioButton valAle;
    private javax.swing.JRadioButton valCres;
    private javax.swing.JRadioButton valDec;
    // End of variables declaration//GEN-END:variables
}
