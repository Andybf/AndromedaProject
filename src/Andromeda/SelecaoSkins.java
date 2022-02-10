/**
 * Andromeda Engine
 * 
 * Metodo para selecionar skins aleatoriamente para um objeto.
 * 
 * @author Anderson Bucchianico
 * @Data Criação: out/2016
 * @Data Criação: 08/jan/2018
 */

package Andromeda;

import javax.swing.JLabel;

public class SelecaoSkins {
    
    public static int id;
    
    public void AleatorizarSkin(int dirImg, JLabel objCarro){
        id = (int) (Math.random() * 5 +1);
        skinCarro(dirImg, objCarro);
    }
    
    public void Selecionarskin(int imgType, JLabel LJogador, int idnovo){
        id = idnovo;
        skinCarro(imgType, LJogador);}
    
    private void skinCarro(int dirImg, JLabel objCarro){ //responsável por alterar as imagens dos carros
        if(dirImg == 0){
        switch (id) { // Skins virados para direita
            case 1:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl1d.png")));
            break;
            case 2:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl2d.png")));
            break;
            case 3:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl3d.png")));
            break;
            case 4:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/pold.png")));
            break;
            case 5:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/txid.png")));
            break;
        }
        }
        
        if(dirImg == 1){
        switch (id) { // Skins virados para esquerda
            case 1:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl1e.png")));
            break;
            case 2:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl2e.png")));
            break;
            case 3:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl3e.png")));
            break;
            case 4:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/pole.png")));
            break;
            case 5:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/txie.png")));
            break;
        }
        }
        
        if(dirImg == 2){
        switch (id) { // skins virados para o sul
            case 1:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl1.png")));
            break;
            case 2:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl2.png")));
            break;
            case 3:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl3.png")));
            break;
            case 4:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/pol.png")));
            break;
            case 5:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/txi.png")));
            break;
        }
        }
        
        if(dirImg == 3){
        switch (id) { // skins virados para o norte
            case 1:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl1c.png")));
            break;
            case 2:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl2c.png")));
            break;
            case 3:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/cvl3c.png")));
            break;
            case 4:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/polc.png")));
            break;
            case 5:
                objCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros/txic.png")));
            break;
        }
        }
    }
}
