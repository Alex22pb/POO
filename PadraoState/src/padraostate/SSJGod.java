/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class SSJGod implements LutadorState{
    protected Lutador perso;

    public SSJGod(Lutador perso) {
        this.perso = perso;
    }
    
    @Override
    public LutadorState atacar(){
        if (perso.getAtaquesConsecutivos() >= 3) {
            System.out.println(perso.getNome() + " liberou um ataque devastador além de seus limites!");
            System.out.println("O impacto foi tão grande que ele não conseguiu manter sua transformação...");
            System.out.println("Regredindo transformação!");
            perso.setKi(150);
            perso.setAtaquesConsecutivos(0);
            return new SSJ1(perso);
        }else if (perso.getKi() < 410){
            System.out.println(perso.getNome() + " está com o KI muito baixo para atacar!");
            return this;
        }else {
            perso.setAtaquesConsecutivos(perso.getAtaquesConsecutivos() + 1);
            System.out.println(perso.getNome() + " em SSJGod usa Kamehameha Divino!");
            perso.setKi(perso.getKi() - 60);
            return this;
        }
    }
    
    
    @Override
    public LutadorState carregarKI() {
        System.out.println("Carregando KI...");
        perso.setKi(perso.getKi() + 50);
        return this;
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
        if(perso.getKi() < 350 && perso.getKi() >= 0){
            System.out.println("Ki baixo! Voltando para forma SSJ Blue.");
            return new SSJBlue(perso);
        }else if (perso.getKi() < 0){
           return new Morte(perso);
        }else{
           return this; 
        }
    }
}
