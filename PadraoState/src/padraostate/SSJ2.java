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
    public void atacar(){
        System.out.println(perso.getNome() + " em SSJ2 usa Kamehameha com kaioken 2x!");
        perso.setKi(perso.getKi() - 30);
    }
    
    @Override
    public void carregarKi(){
        System.out.println("Carregando KI...");
        perso.setKi(perso.getKi() + 50);
    }
    
    @Override
    public LutadorState transformar(){
        if (perso.getKi() == 250) {
            System.out.println("AAAAAAH! " + perso.getNome() + " vira Super Saiyajin 3!");
            return new SSJ3(perso);
        } else {
            System.out.println("KI insuficiente");
            return this;
        }
    }
    
   @Override
    public LutadorState levarDano(){
        return this;
    }
    
    @Override
    public void descansar(){
        System.out.println("Descansando, recuperando vida...");
        perso.setVida(perso.getVida() + 10);
    }
    
    @Override
    public LutadorState verificarKI(){
        return this;
    }
}
