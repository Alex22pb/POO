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
    public void atacar(){
        System.out.println(perso.getNome() + "morreu");
    }
    
    @Override
    public void carregarKi(){
        System.out.println(perso.getNome() + "morreu");
    }
    
    @Override
    public LutadorState transformar(){
        System.out.println(perso.getNome() + "morreu");
        return null;
    }
    
    @Override
    public LutadorState levarDano(){
        System.out.println(perso.getNome() + "morreu");
        return null;
    }
    
    @Override
    public void descansar(){
        System.out.println(perso.getNome() + "morreu");
    }
    
    @Override
    public LutadorState verificarKI(){
        System.out.println(perso.getNome() + "morreu");
        return null;
    }
}
