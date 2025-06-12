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
        System.out.println(perso.getNome() + " em SSJ2 usa Kamehameha com kaioken blue!");
        perso.setKi(perso.getKi() - 50);
        return this;
    }
    
    @Override
    public LutadorState carregarKi(){
        System.out.println("Carregando KI...");
        perso.setKi(perso.getKi() + 50);
        return this;
    }
    
    @Override
    public LutadorState transformar(){
        if (perso.getKi() >= 350) {
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin God!");
            return new SSJGod(perso);
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
    public LutadorState descansar(){
        System.out.println("Descansando, recuperando vida...");
        perso.setVida(perso.getVida() + 10);
        return this;
    }
    
    @Override
    public LutadorState verificarKI(){
        if(perso.getKi() < 300){
            System.out.println("Ki baixo! Voltando para forma SSJ3.");
            return new SSJ3(perso);
        }else{
           return this; 
        }
    }
}
