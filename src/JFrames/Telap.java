/**
 * Projeto Andromeda
 * 
 * Tela principal do jogo, todos os métodos são chamados nesta jenela.
 * 
 * @author Anderson Bucchianico
 * @Data Criação: out/2016
 * @Data Criação: 11/jan/2018
 */

package JFrames;

import javax.swing.JOptionPane;
import static Andromeda.Sons.onOff;

public class Telap extends javax.swing.JFrame{
    
    Andromeda.Jogo go = new Andromeda.Jogo();          // Criando objeto para janela do game over
    Andromeda.Jogador jog = new Andromeda.Jogador();   // Criando objeto para iniciar o jogador
    Andromeda.Npc npc = new Andromeda.Npc();           // Criando objetos NPC's
    Andromeda.Sons ms = new Andromeda.Sons();          // Criando objeto para reprodução de sons
    
    public static int EntValor = 22;                   //Funções DEBUG
    public static int EntValorb = 5;
    public static boolean DebugMode = false;
    
    public Telap() {
        initComponents();
        
        this.setFocusable(true);       // Deixa a jenela em foco no sistema
        
        PainelFinal.setVisible(false); // Esconde tela "Game over"
        Mdebug.setVisible(false);
        Mdebug.setEnabled(false);      // Modo debug configurado para "Falso"
        LPontos.setVisible(false);     // Label "Nivel" será ocultada
        Lvidas.setVisible(false);      // Label "vidas" será ocultada
        Vvidas.setVisible(false);      // Label/Variável "vidas" será ocultada
        VPontos.setVisible(false);     // Label/Variável "Nivel" será ocultada

    }
    @SuppressWarnings("unchecked")
    
    
    
    // <-- 42 É A RESPOSTA PARA A VIDA, UNIVERSO E TUDO MAIS!
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        campoChegTopo = new javax.swing.JLabel();
        Vvidas = new javax.swing.JLabel();
        Lvidas = new javax.swing.JLabel();
        LPontos = new javax.swing.JLabel();
        VPontos = new javax.swing.JLabel();
        PainelInicial = new javax.swing.JPanel();
        ImgSetasTeclado = new javax.swing.JLabel();
        Lmovimento = new javax.swing.JLabel();
        BotaoIniciar = new javax.swing.JButton();
        PainelFinal = new javax.swing.JPanel();
        LmsgFinal = new javax.swing.JLabel();
        LFimDeJogo = new javax.swing.JLabel();
        BotaoReiniciar = new javax.swing.JButton();
        ImgFundo = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        Mcontrole = new javax.swing.JMenu();
        AudioChk = new javax.swing.JCheckBoxMenuItem();
        Separador = new javax.swing.JPopupMenu.Separator();
        Reiniciar = new javax.swing.JMenuItem();
        EscolhCar = new javax.swing.JMenuItem();
        Separador2 = new javax.swing.JPopupMenu.Separator();
        Sair = new javax.swing.JMenuItem();
        Mdebug = new javax.swing.JMenu();
        time = new javax.swing.JMenuItem();
        posx = new javax.swing.JMenuItem();
        Majuda = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        Debugar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Andrômeda");
        setBounds(new java.awt.Rectangle(652, 673, 673, 673));
        setLocation(new java.awt.Point(500, 100));
        setMinimumSize(new java.awt.Dimension(652, 673));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelPrincipal.setOpaque(false);
        PainelPrincipal.setPreferredSize(new java.awt.Dimension(652, 673));
        PainelPrincipal.setLayout(null);

        campoChegTopo.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        campoChegTopo.setForeground(new java.awt.Color(51, 51, 51));
        campoChegTopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PainelPrincipal.add(campoChegTopo);
        campoChegTopo.setBounds(180, -20, 290, 25);

        Vvidas.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Vvidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vvidas.setText("3");
        PainelPrincipal.add(Vvidas);
        Vvidas.setBounds(0, 70, 125, 34);

        Lvidas.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Lvidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lvidas.setText("Vidas");
        PainelPrincipal.add(Lvidas);
        Lvidas.setBounds(0, 20, 125, 34);

        LPontos.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        LPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LPontos.setText("Pontuação:");
        PainelPrincipal.add(LPontos);
        LPontos.setBounds(520, 20, 125, 34);

        VPontos.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        VPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VPontos.setText("0");
        PainelPrincipal.add(VPontos);
        VPontos.setBounds(520, 70, 125, 34);

        getContentPane().add(PainelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 650));

        PainelInicial.setOpaque(false);
        PainelInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImgSetasTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/misc/setas.png"))); // NOI18N
        PainelInicial.add(ImgSetasTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 250, -1, -1));

        Lmovimento.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        Lmovimento.setForeground(new java.awt.Color(51, 51, 51));
        Lmovimento.setText("Movimentar-se:");
        PainelInicial.add(Lmovimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        BotaoIniciar.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        BotaoIniciar.setForeground(new java.awt.Color(51, 51, 51));
        BotaoIniciar.setText("Entendi!");
        BotaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIniciarActionPerformed(evt);
            }
        });
        PainelInicial.add(BotaoIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 400, 192, 50));

        getContentPane().add(PainelInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 650));

        PainelFinal.setOpaque(false);
        PainelFinal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LmsgFinal.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        LmsgFinal.setForeground(new java.awt.Color(255, 255, 255));
        LmsgFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LmsgFinal.setText("Obrigado por jogar!");
        LmsgFinal.setFocusable(false);
        LmsgFinal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LmsgFinal.setName(""); // NOI18N
        PainelFinal.add(LmsgFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 250, 256, 128));

        LFimDeJogo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        LFimDeJogo.setForeground(new java.awt.Color(51, 51, 51));
        LFimDeJogo.setText("FIM DE JOGO!");
        PainelFinal.add(LFimDeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        BotaoReiniciar.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        BotaoReiniciar.setForeground(new java.awt.Color(51, 51, 51));
        BotaoReiniciar.setText("Reiniciar");
        BotaoReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoReiniciarActionPerformed(evt);
            }
        });
        PainelFinal.add(BotaoReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 400, 192, 50));

        getContentPane().add(PainelFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 650));

        ImgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ruas/rua-cruz.png"))); // NOI18N
        getContentPane().add(ImgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        Mcontrole.setText("Controle");
        Mcontrole.setEnabled(false);

        AudioChk.setSelected(true);
        AudioChk.setText("Habilitar Sons");
        AudioChk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AudioChkItemStateChanged(evt);
            }
        });
        Mcontrole.add(AudioChk);
        Mcontrole.add(Separador);

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        Mcontrole.add(Reiniciar);

        EscolhCar.setText("Escolher Carro");
        EscolhCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolhCarActionPerformed(evt);
            }
        });
        Mcontrole.add(EscolhCar);
        Mcontrole.add(Separador2);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Mcontrole.add(Sair);

        BarraMenu.add(Mcontrole);

        Mdebug.setText("Debug");
        Mdebug.setEnabled(false);

        time.setText("Time.sleep npcs");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        Mdebug.add(time);

        posx.setText("pos X/s npcs");
        posx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posxActionPerformed(evt);
            }
        });
        Mdebug.add(posx);

        BarraMenu.add(Mdebug);

        Majuda.setText("Ajuda");

        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        Majuda.add(Sobre);

        Debugar.setText("Debugar");
        Debugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebugarActionPerformed(evt);
            }
        });
        Majuda.add(Debugar);

        BarraMenu.add(Majuda);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        ms.pop();
        JOptionPane.showMessageDialog(null,
                "<html><center><i>Criado Por:</i><br><b>Anderson Bucchianico</b><br><br>"
                + "Versão: 2.0 (Beta) <br>"
                + "jan/2018<br><br>"
                + "<i>Proibido realizar engenharia reversa de qualquer natureza neste Software<i></center></html>");
    }//GEN-LAST:event_SobreActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0); // Fecha o jogo imediatamente.
    }//GEN-LAST:event_SairActionPerformed

    private void BotaoReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoReiniciarActionPerformed
        go.Reiniciar(); // Reinicia o jogo imediatamente
    }//GEN-LAST:event_BotaoReiniciarActionPerformed

    private void EscolhCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolhCarActionPerformed
        ms.pop();
        new EscolhaCarro().setVisible(true); // Abre janela para escolher skin de carro
    }//GEN-LAST:event_EscolhCarActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        try{EntValor = Integer.parseInt(JOptionPane.showInputDialog(
                "<html>try{sleep(<b>Novo Valor</b>);}catch(Exception erro){}<br>Min: 0, Máx: 1.000<br>Atual:"+ EntValor +"</html>"));}
        catch(Exception e){System.out.println("Erro tipo: 3, Não foi possível abrir ou aplicar valores em JOptionPane");}
    }//GEN-LAST:event_timeActionPerformed

    private void posxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posxActionPerformed
        try{EntValorb = Integer.parseInt(JOptionPane.showInputDialog(
                "<html>iniX = iniX + <b>Novo Valor</b>;<br>Min: 0, Máx: 100<br>Atual:"+ EntValorb +"</html>"));}
        catch(Exception e){System.out.println("Erro tipo: 3, Não foi possível abrir ou aplicar valores em JOptionPane");}
    }//GEN-LAST:event_posxActionPerformed

    private void AudioChkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AudioChkItemStateChanged
        ms.pop();  //reproduz um som
        if(onOff == true){ // Codigozinho para ativar/desativar o som do jogo
            ms.desativar();
        }else{
           ms.ativar(); 
        }
    }//GEN-LAST:event_AudioChkItemStateChanged

    private void BotaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIniciarActionPerformed
        ms.pop();
        go.IniciarJogo();
        jog.start();
    }//GEN-LAST:event_BotaoIniciarActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        ms.pop();
        go.Reiniciar();
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void DebugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebugarActionPerformed
        ms.pop();
        Andromeda.Jogo.DebugMode();
    }//GEN-LAST:event_DebugarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        jog.keyPressed(evt);
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        jog.keyReleased(evt);
    }//GEN-LAST:event_formKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem AudioChk;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton BotaoIniciar;
    private javax.swing.JButton BotaoReiniciar;
    public static javax.swing.JMenuItem Debugar;
    private javax.swing.JMenuItem EscolhCar;
    public static javax.swing.JLabel ImgFundo;
    private javax.swing.JLabel ImgSetasTeclado;
    private javax.swing.JLabel LFimDeJogo;
    public static javax.swing.JLabel LPontos;
    private javax.swing.JLabel Lmovimento;
    private javax.swing.JLabel LmsgFinal;
    public static javax.swing.JLabel Lvidas;
    private javax.swing.JMenu Majuda;
    public static javax.swing.JMenu Mcontrole;
    public static javax.swing.JMenu Mdebug;
    public static javax.swing.JPanel PainelFinal;
    public static javax.swing.JPanel PainelInicial;
    public static javax.swing.JPanel PainelPrincipal;
    private javax.swing.JMenuItem Reiniciar;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JPopupMenu.Separator Separador;
    private javax.swing.JPopupMenu.Separator Separador2;
    private javax.swing.JMenuItem Sobre;
    public static javax.swing.JLabel VPontos;
    public static javax.swing.JLabel Vvidas;
    public static javax.swing.JLabel campoChegTopo;
    private javax.swing.JMenuItem posx;
    private javax.swing.JMenuItem time;
    // End of variables declaration//GEN-END:variables

}
