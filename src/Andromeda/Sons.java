/**
 * Andromeda Engine
 * 
 * Métodos para criar efeitos de som dentro de um jogo.
 * 
 * @author Anderson Bucchianico
 * @Data Criação: out/2016
 * @Data Modificação: 11/jan/2018
 */

package Andromeda;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sons extends Thread{
    
    public static boolean onOff = true, sirene = false;
    
    public void desativar(){onOff = false;System.out.println("Som: " + onOff);}
    
    public void ativar(){onOff = true;System.out.println("Som: " + onOff);}
    
    public void buzina(){//-----------------------------------------------------
        if(onOff == true){
            URL caminhoA = getClass().getResource("/Sons/buz.wav");
            AudioClip audioA = Applet.newAudioClip(caminhoA);
            audioA.play();
        }
    }
    
    public void batida(){//-----------------------------------------------------
        if(onOff == true){
            URL caminhoB = getClass().getResource("/Sons/car.wav");
            AudioClip audioB = Applet.newAudioClip(caminhoB);
            audioB.play();
        }
    }
    
    public void chegada(){//----------------------------------------------------
        if(onOff == true){
            URL caminhoC = getClass().getResource("/Sons/cgd.wav");
            AudioClip audioC = Applet.newAudioClip(caminhoC);
            audioC.play();
        }
    }
    
    public void sirene(){//-----------------------------------------------------
        if(onOff == true){
            URL caminhoD = getClass().getResource("/Sons/pol.wav");
            AudioClip audioD = Applet.newAudioClip(caminhoD);
            audioD.play();
        }
    }
    
    public void pop(){//--------------------------------------------------------
        if(onOff == true){
            URL caminhoE = getClass().getResource("/Sons/pop.wav");
            AudioClip audioE = Applet.newAudioClip(caminhoE);
            audioE.play();
        }
    }
}
