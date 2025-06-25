/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class Morte implements LutadorState{
    protected Lutador perso;

    public Morte(Lutador perso) {
        this.perso = perso;
    }
        
    @Override
    public LutadorState atacar(){
        System.out.println(perso.getNome() + " morreu");
        return null;
    }
    
    @Override
    public LutadorState carregarKI(){
        System.out.println(perso.getNome() + " morreu");
        return null;
    }
    
    @Override
    public LutadorState levarDano(int dano){
        System.out.println(perso.getNome() + " morreu");
        return null;
    }
    
    @Override
    public LutadorState verificarKI(){
        System.out.println(perso.getNome() + " morreu");
        return null;
    }
}
