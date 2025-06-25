/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class SSJ2 implements LutadorState{
    protected Lutador perso;

    public SSJ2(Lutador perso) {
        this.perso = perso;
    }
        
    @Override
    public LutadorState atacar(){       
        if (perso.getAtaquesConsecutivos() >= 3) {
            System.out.println(perso.getNome() + " atacou com tanta fúria que ultrapassou seus limites!");
            System.out.println("Transformando-se espontaneamente para uma nova forma!");
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin Blue!");
            perso.setKi(300);
            perso.setAtaquesConsecutivos(0);
            return new SSJBlue(perso);
        }else if(perso.getKi() < 230){
            System.out.println(perso.getNome() + " está com o KI muito baixo para atacar!");
            return this;
        }else {
            perso.setAtaquesConsecutivos(perso.getAtaquesConsecutivos() + 1);
            System.out.println(perso.getNome() + " em SSJ2 usa Kamehameha com kaioken 2x!");
            perso.setKi(perso.getKi() - 30);
            return this;
        }
    }
    
    @Override
    public LutadorState carregarKI(){
        System.out.println("Carregando KI...");
        perso.setKi(perso.getKi() + 50);
        if (perso.getKi() >= 250) {
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin 3!");
            return new SSJ3(perso);
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
        if(perso.getKi() < 200 && perso.getKi() >= 0){
            System.out.println("Ki baixo! Voltando para forma SSJ1");
            return new SSJ1(perso);
        }else if (perso.getKi() < 0){
           return new Morte(perso);
        }else{
           return this; 
        }
    }
}
