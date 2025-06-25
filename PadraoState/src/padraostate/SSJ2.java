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
        System.out.println(perso.getNome() + " em SSJ2 usa Kamehameha com kaioken 2x!");
        perso.setKi(perso.getKi() - 30);
        return this;
    }
    
    @Override
    public LutadorState transformar(){
        if (perso.getKi() >= 250) {
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin 3!");
            return new SSJ3(perso);
        } else {
            System.out.println("KI insuficiente");
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
        if(perso.getKi() < 200){
            System.out.println("Ki baixo! Voltando para forma SSJ1");
            return new SSJ1(perso);
        }else{
           return this; 
        }
    }
}
