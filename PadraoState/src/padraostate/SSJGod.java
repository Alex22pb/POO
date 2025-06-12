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
        System.out.println(perso.getNome() + " em SSJGod usa Kamehameha Divino!");
        perso.setKi(perso.getKi() - 60);
        return this;
    }
    
    @Override
    public LutadorState carregarKi(){
        System.out.println("Nivel máximo de KI atingido");
        return this;
    }
    
    @Override
    public LutadorState transformar(){
        System.out.println("Nivel máximo de transformação atingido");
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
    public LutadorState descansar(){
        System.out.println("Descansando, recuperando vida...");
        perso.setVida(perso.getVida() + 10);
        return this;
    }
    
    @Override
    public LutadorState verificarKI(){
        if(perso.getKi() < 350){
            System.out.println("Ki baixo! Voltando para forma SSJ Blue.");
            return new SSJBlue(perso);
        }else{
           return this; 
        }
    }
}
