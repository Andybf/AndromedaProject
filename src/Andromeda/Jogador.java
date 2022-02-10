/**
 * Andromeda Engine
 * 
 * Métodos e atributos para o objeto "Jogador".
 * 
 * @author Anderson Bucchianico
 * @Data Criação: out/2016
 * @Data Modificação: 11/jan/2018
 */

package Andromeda;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Component;
import static JFrames.Telap.campoChegTopo;
import static JFrames.Telap.PainelPrincipal;
import static Andromeda.SelecaoSkins.id;
import javax.swing.JLabel;

public class Jogador extends Thread implements KeyListener{

    public static int key, jogX, jogY  = 0;
    boolean estado = true;
    public static boolean mov = true, tcPress = false;
    
    /* 1: Virado para o Leste
     * 2: Virado para o Sul
     * 3: Virado para o Oeste
     */ public static int DirecaoCarro = 3;
     
    public static JLabel LJogador;
    
    Andromeda.Sons ms = new Andromeda.Sons();
    Andromeda.Jogo jg = new Andromeda.Jogo();
    
    @Override
    public void run(){//--------------------------------------------------------
        System.out.println("Iniciando método 'Jogador'...");
        SelecaoSkins ss = new SelecaoSkins();
        Contadores cc = new Contadores();
        
        CriarJogador();
        
        System.out.println("posição do jogador: " + LJogador.getX() + ", " + LJogador.getY());
        
        System.out.println("Selecionando skin para o jogador...");
        ss.AleatorizarSkin(DirecaoCarro, LJogador);
        while(true){
            try{sleep(17);}catch(Exception erro){System.out.println("Erro cód: 4, Erro fatal no Thread ´Jogador´");}
            if(colisao(LJogador , Andromeda.Npc.LNpc)){
                System.out.println("cdcd");
                ms.batida();
                reset();
                cc.ContadorVidas();
            }
            /*
            if(colisao(LJogador,CampoChegBaixo)){
                cb.ContadorPontos();
                ms.chegada();
                LJogador.setLocation(370,550);
            }
            */
            if(colisao(LJogador,campoChegTopo)){
                LJogador.setLocation(370,550);
                ms.chegada();
                cc.ContadorPontos();
            }
            
            if(LJogador.getY() <= -92){
            reset();
            }
            
            if(LJogador.getY() >= 700){
            reset();
            }
        }
    }
    
    private void CriarJogador(){//----------------------------------------------
        LJogador = new JLabel();
        PainelPrincipal.add(LJogador);
        LJogador.setBounds(370, 550, 62, 92);
    }
    
    public static boolean colisao(Component a, Component b) {//-----------------------
		int aX = a.getX();
		int aY = a.getY();
		int ladoDireitoA = aX+a.getWidth();
		int ladoEsquerdoA= aX;
		int ladoBaixoA= aY+a.getHeight();
		int ladoCimaA= aY;
		
		int bX = b.getX();
		int bY = b.getY();
		int ladoDireitoB = bX+b.getWidth();
		int ladoEsquerdoB= bX;
		int ladoBaixoB= bY+b.getHeight();
		int ladoCimaB= bY;
		
		boolean colisao = false;
		
		boolean cDireita=false;
		boolean cCima=false;
		boolean cBaixo=false;
		boolean cEsquerda=false;
		
		if(ladoDireitoA>=ladoEsquerdoB) {
			cDireita=true;
		}
		if(ladoCimaA<=ladoBaixoB) {
			cCima=true;
		}
		if(ladoBaixoA>=ladoCimaB) {
			cBaixo=true;
		}
		if(ladoEsquerdoA<=ladoDireitoB) {
			cEsquerda=true;
		}
		
		if(cDireita && cEsquerda && cBaixo && cCima) {
			colisao = true;
		}
			
		return colisao;
	}
   
    public static void reset(){ //serie de acoontecimentos depois da colisão ---------
        mov=false;
        LJogador.setLocation(370,550);
        for(int i=0; i<10; i++){
            try{sleep(100);}catch(Exception erro){}
            LJogador.setEnabled(false);
            try{sleep(100);}catch(Exception erro){}
            LJogador.setEnabled(true);
        }
        mov=true;
   }

    @Override
    public void keyPressed(KeyEvent e){
        key = e.getKeyCode();
        
        jogX = LJogador.getX();
        jogY = LJogador.getY();
        if(mov == true){
        
        if (key == KeyEvent.VK_LEFT) {
            jogX = jogX - 4;
            LJogador.setLocation(jogX, jogY);
        }

        if (key == KeyEvent.VK_RIGHT) {
            jogX = jogX + 4;
            LJogador.setLocation(jogX, jogY);
        }
        
        if (key == KeyEvent.VK_UP) {
            jogY = jogY - 8;
            LJogador.setLocation(jogX, jogY);
        }

        if (key == KeyEvent.VK_DOWN) {
            jogY = jogY + 8;
            LJogador.setLocation(jogX, jogY);
        }
        
        if (key == KeyEvent.VK_SPACE) {
            if(id == 4){
                ms.sirene();
            }
            else{
                ms.buzina();
            }
        }
    }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
    
    