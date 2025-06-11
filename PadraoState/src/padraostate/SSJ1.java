/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class SSJ1 implements LutadorState{
    protected Lutador perso;

    public SSJ1(Lutador perso) {
        this.perso = perso;
    }
        
    @Override
    public LutadorState atacar(){
        System.out.println(perso.getNome() + " em SSJ1 usa Kamehameha!");
        perso.setKi(perso.getKi() - 20);
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
        if(perso.getKi() == 200){
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin 2!");
            return new SSJ2(perso);
        }else{
            System.out.println("KI insuficiente");
            return this; 
        } 
    }
    
    @Override
    public LutadorState levarDano(){
        return this;
    }
    
    @Override
    public LutadorState descansar(){
        System.out.println("Descansando, recuperando vida...");
        perso.setVida(perso.getVida() + 10);
        return this;
    }
    
    @Override
    public LutadorState verificarKI(){
        return this;
    }
}
