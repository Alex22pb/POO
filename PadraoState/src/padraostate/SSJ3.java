/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class SSJ3 implements LutadorState{
    protected Lutador perso;

    public SSJ3(Lutador perso) {
        this.perso = perso;
    }
    
    @Override
    public LutadorState atacar(){        
        if (perso.getAtaquesConsecutivos() >= 3) {
            System.out.println(perso.getNome() + " atacou com tanta fúria que ultrapassou seus limites!");
            System.out.println("Transformando-se espontaneamente para uma nova forma!");
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin God!");
            perso.setKi(350);
            perso.setAtaquesConsecutivos(0);
            return new SSJGod(perso);
        }else if(perso.getKi() < 290){
            System.out.println(perso.getNome() + " está com o KI muito baixo para atacar!");
            return this;
        }else {
            perso.setAtaquesConsecutivos(perso.getAtaquesConsecutivos() + 1);
            System.out.println(perso.getNome() + " em SSJ3 usa Kamehameha kaioken 10x!");
            perso.setKi(perso.getKi() - 40);
            return this;
        }
    }
    
    @Override
    public LutadorState carregarKI(){
        System.out.println("Carregando KI...");
        perso.setKi(perso.getKi() + 50);
        if (perso.getKi() >= 300) {
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin Blue!");
            return new SSJBlue(perso);
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
        if(perso.getKi() < 250 && perso.getKi() >= 0){
            System.out.println("Ki baixo! Voltando para forma SSJ2");
            return new SSJBlue(perso);
        }else if (perso.getKi() < 0){
           return new Morte(perso);
        }else{
           return this; 
        }
    }
}
