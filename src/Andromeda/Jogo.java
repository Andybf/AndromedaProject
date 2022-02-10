/**
 * Andromeda Engine 1.0
 * 
 * Esta classe cria métodos para ativar o inicio do jogo, reiniciar a partida,
 * mostrar a tela de Game Over ou ativar o modo debug.
 * 
 * @author Anderson Bucchianico
 * @Data Criação: out/2016
 * @Data Modificação: 11/jan/2018
 */

package Andromeda;

import static Andromeda.Jogador.mov;
import static Andromeda.Contadores.ccp;
import static JFrames.Telap.DebugMode;
import static JFrames.Telap.Debugar;
import static JFrames.Telap.Lvidas;
import static JFrames.Telap.Mcontrole;
import static JFrames.Telap.Mdebug;
import static JFrames.Telap.PainelFinal;
import static JFrames.Telap.PainelInicial;
import static JFrames.Telap.Vvidas;
import static Andromeda.Contadores.ccv;
import static JFrames.Telap.LPontos;
import static JFrames.Telap.VPontos;

public class Jogo {
    
    Andromeda.Npc npc0 = new Andromeda.Npc();
    Andromeda.Npc npc1 = new Andromeda.Npc();
    Andromeda.Sons ms = new Andromeda.Sons();
    
    public void IniciarJogo(){//-----------------------------------------
        
        System.out.println("Iniciando jogo...");
        
        Debugar.setVisible(false);
        Debugar.setEnabled(false);
        
        System.out.println("Desativando Tela Inicial...");
        PainelInicial.setEnabled(false);  // Desativando o painel de boas-vindas
        PainelInicial.setVisible(false);  // faz a mesma coisa do de cima
        
        // Esse cod. abaixo ativa os labels e variáveis para mostrar as pontuações
        System.out.println("Criando placares de pontuação...");
        LPontos.setVisible(true);
        Lvidas.setVisible(true);
        Vvidas.setVisible(true);
        VPontos.setVisible(true);
        LPontos.setVisible(true);
        VPontos.setVisible(true);
        
        Mcontrole.setEnabled(true);  //Ativa o menu "controle" do jogo
        //ms.fundo();                //Ativa a Música de fundo
        
        //int npcX, int npcY, int direcao
        npc0.start();
    }
    
    public void FimdeJogo(){//--------------------------------------------------
        PainelFinal.setVisible(true);
        
        mov = false;
        
        npc0.LNpc.setVisible(false);
        npc1.LNpc.setVisible(false);
    }
    
    public void Reiniciar(){//--------------------------------------------------
        PainelFinal.setVisible(false);
        
        mov = true;
        
        npc0.LNpc.setVisible(true);
        npc1.LNpc.setVisible(false);
        
        ccv = 0;
        ccp = 0;
        
        Vvidas.setText("3");
        VPontos.setText("0");
    }
    
    static public void DebugMode(){//-------------------------------------------
        System.out.println("MODO DEBUG ATIVADO");
        Mdebug.setVisible(true);
        Mdebug.setEnabled(true);
        DebugMode = true;
        Debugar.setVisible(false);
        Debugar.setEnabled(false);
    }
}
