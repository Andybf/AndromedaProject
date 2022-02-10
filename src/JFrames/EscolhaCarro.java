/**
 * Projeto Andromeda
 * 
 * Tela de opções para escolher skin do jogador.
 * 
 * @author Anderson Bucchianico
 * @Data Criação: out/2016
 * @Data Criação: 11/jan/2018
 */

package JFrames;

import static Andromeda.Jogador.LJogador;

public class EscolhaCarro extends javax.swing.JFrame {
    
    static int id = 0;
    static int imgType = 2;
    Andromeda.Sons ms = new Andromeda.Sons();
    Andromeda.SelecaoSkins ss = new Andromeda.SelecaoSkins();
    

    public EscolhaCarro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lcvl1 = new javax.swing.JButton();
        lcvl2 = new javax.swing.JButton();
        lcvl3 = new javax.swing.JButton();
        lpol = new javax.swing.JButton();
        ltxi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Escolher Carro");
        setLocation(new java.awt.Point(575, 250));
        setMinimumSize(new java.awt.Dimension(500, 192));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 192));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 192));
        jPanel1.setOpaque(false);

        lcvl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl1.png"))); // NOI18N
        lcvl1.setBorderPainted(false);
        lcvl1.setContentAreaFilled(false);
        lcvl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcvl1ActionPerformed(evt);
            }
        });

        lcvl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl2.png"))); // NOI18N
        lcvl2.setBorderPainted(false);
        lcvl2.setContentAreaFilled(false);
        lcvl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcvl2ActionPerformed(evt);
            }
        });

        lcvl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl3.png"))); // NOI18N
        lcvl3.setBorderPainted(false);
        lcvl3.setContentAreaFilled(false);
        lcvl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcvl3ActionPerformed(evt);
            }
        });

        lpol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/pol.png"))); // NOI18N
        lpol.setBorderPainted(false);
        lpol.setContentAreaFilled(false);
        lpol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpolActionPerformed(evt);
            }
        });

        ltxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/txi.png"))); // NOI18N
        ltxi.setBorderPainted(false);
        ltxi.setContentAreaFilled(false);
        ltxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltxiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha o novo modelo de carro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lcvl1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lcvl2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lcvl3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lpol, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ltxi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lcvl1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcvl2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcvl3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lpol, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltxi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 192));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/misc/fundo-esc-c.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 192));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lcvl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcvl1ActionPerformed
        id = 1;
        ms.pop();
        ss.Selecionarskin(imgType,LJogador,id);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_lcvl1ActionPerformed

    private void lcvl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcvl2ActionPerformed
        id = 2;
        ms.pop();
        ss.Selecionarskin(imgType,LJogador,id);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_lcvl2ActionPerformed

    private void lcvl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcvl3ActionPerformed
        id = 3;
        ms.pop();
        ss.Selecionarskin(imgType,LJogador,id);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_lcvl3ActionPerformed

    private void lpolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpolActionPerformed
        id = 4;
        ms.pop();
        ss.Selecionarskin(imgType,LJogador,id);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_lpolActionPerformed

    private void ltxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltxiActionPerformed
        id = 5;
        ms.pop();
        ss.Selecionarskin(imgType,LJogador,id);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_ltxiActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscolhaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lcvl1;
    private javax.swing.JButton lcvl2;
    private javax.swing.JButton lcvl3;
    private javax.swing.JButton lpol;
    private javax.swing.JButton ltxi;
    // End of variables declaration//GEN-END:variables
}
