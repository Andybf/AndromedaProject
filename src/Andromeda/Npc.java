/**
 * Andromeda Engine
 * 
 * Criação de personagens não jogáveis (NPC's)
 * 
 * @author Anderson Bucchianico
 * @Data Criação: 16/out/2016
 * @Data Criação: 11/jan/2018
 */

package Andromeda;

import static JFrames.Telap.EntValor;  // Valor padrão: 17
import static JFrames.Telap.EntValorb;
import static JFrames.Telap.PainelPrincipal;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;

public class Npc extends Thread{
    
    // Declaração de atributos
    public static boolean execucao = true;
    public static JLabel LNpc;
    
    @Override
    public void run(){
        
    }
    
    public void executar(int npcX, int npcY, int direcao){
                /* Variável Direção:
         * 0 (false): Direita
         * 1 (true) : Esquerda
         */
        
        LNpc = new JLabel();
        PainelPrincipal.add(LNpc);
        LNpc.setBounds(npcX, npcY, 92, 62);
        while(execucao == true && direcao == 1){                                //Npc's que vao da esquerda para direita
            System.out.println("npcX " + npcX + " npcY " + npcY + " Direção " + direcao);
            SelecaoSkins ss = new SelecaoSkins();                               //Selecionando skin aleatoria para o npc
            ss.AleatorizarSkin(direcao, LNpc);
            while(LNpc.getX() >= -92 && execucao == true){                      //Iniciando movimentação do npc na tela
                try{sleep(EntValor);}catch(Exception erro){}
                npcX = npcX - EntValorb;
                LNpc.setLocation(npcX, 380);
            }
            LNpc.setLocation(660, 380);                                         //Voltando npc a posição original
            npcX = 660;
        }
    }
}
