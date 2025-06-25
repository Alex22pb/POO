/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class FormaNormal implements LutadorState{
    protected Lutador perso;

    public FormaNormal(Lutador perso) {
        this.perso = perso;
    }
    
    @Override
    public LutadorState atacar() {
        if (perso.getAtaquesConsecutivos() >= 3) {
            System.out.println(perso.getNome() + " atacou com tanta fúria que ultrapassou seus limites!");
            System.out.println("Transformando-se espontaneamente para uma nova forma!");
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin 2!");
            perso.setKi(200);
            perso.setAtaquesConsecutivos(0);
            return new SSJ2(perso);
        } else {
            perso.setAtaquesConsecutivos(perso.getAtaquesConsecutivos() + 1);
            System.out.println(perso.getNome() + " ataque com socos rápidos");
            perso.setKi(perso.getKi() - 10);
            return this;
        }
    }
    
    @Override
    public LutadorState transformar(){
        if(perso.getKi() >= 150){
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin 1!");
            return new SSJ1(perso);
        }else{
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
        if (perso.getKi() < 0){
           return new Morte(perso);
        }else{
           return this; 
        }
    }
}
