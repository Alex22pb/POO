/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class SSJBlue implements LutadorState{
    protected Lutador perso;

    public SSJBlue(Lutador perso) {
        this.perso = perso;
    }
    
    @Override
    public LutadorState atacar(){       
        if (perso.getAtaquesConsecutivos() >= 3) {
            System.out.println(perso.getNome() + " liberou um ataque devastador além de seus limites!");
            System.out.println("O impacto foi tão grande que ele não conseguiu manter sua transformação...");
            System.out.println("Regredindo transformação!");
            perso.setKi(200);
            perso.setAtaquesConsecutivos(0);
            return new SSJ2(perso);
        }else if(perso.getKi() < 350){
            System.out.println(perso.getNome() + " está com o KI muito baixo para atacar!");
            return this;
        }else {
            perso.setAtaquesConsecutivos(perso.getAtaquesConsecutivos() + 1);
            System.out.println(perso.getNome() + " em SSJ2 usa Kamehameha com kaioken blue!");
            perso.setKi(perso.getKi() - 50);
            return this;
        }
    }
    
    @Override
    public LutadorState carregarKI(){
        System.out.println("Carregando KI...");
        perso.setKi(perso.getKi() + 50);
        if (perso.getKi() >= 350) {
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin God!");
            return new SSJGod(perso);
        } else {
            System.out.println("KI insuficiente para transformação");
            return this;
        } 
    }
    
    @Override
    public LutadorState levarDano(int dano){
        perso.setVida(perso.getVida()- dano);
        System.out.println(perso.getNome() + " recebeu " + dano + " de dano");
        if(perso.getVida() <= 0){
            return new Morte(perso);
        }else{
            return this;
        }
    }
    
    @Override
    public LutadorState verificarKI(){
        if(perso.getKi() < 300 && perso.getKi() >= 0){
            System.out.println("Ki baixo! Voltando para forma SSJ3.");
            return new SSJ3(perso);
        }else{
           return this; 
        }
    }
}
