/**
 * Andromeda Engine
 * 
 * Metodo contador de números inteiros.
 * 
 * @author Anderson Bucchianico
 * @Data Criação: out/2016
 * @Data Criação: 12/jan/2018
 */
package Andromeda;

import static JFrames.Telap.Vvidas;
import static JFrames.Telap.VPontos;

public class Contadores {
    public static int ccv = 3, ccp, ccn = 0; // contador de vidas, pontos e nivel
    
    Jogo go = new Jogo();
    
    public void ContadorVidas(){
        ccv--;
        Vvidas.setText(Integer.toString(ccv));
        System.out.println("ccb (Contador Vidas): " + ccv);
        
        if(ccv == 0){
            go.FimdeJogo();
            System.out.println("fim do jogo");
        }
    }
    
    public void ContadorPontos(){
        ccn ++;
        VPontos.setText(Integer.toString(ccn));
    
    }
}
