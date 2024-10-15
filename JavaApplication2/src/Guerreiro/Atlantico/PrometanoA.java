/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Atlantico;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PrometanoA extends AtlanticoA{
   
    public PrometanoA(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    @Override
    public void atacar(Guerreiro defender, ArrayList<Guerreiro> filaDefensor, ArrayList<Guerreiro> filaAtacante){
        defender.setEnergia(defender.getEnergia() - 10);
    }
        
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<Guerreiro> filaDefensor){
        if(defender.getEnergia() < 1 && defender.getEnergia() <= 0 ){
            Guerreiro filho1 = new PrometanoA(defender.getNome() + "1", defender.getIdade(), defender.getPeso());
            Guerreiro filho2 = new PrometanoA(defender.getNome() + "2", defender.getIdade(), defender.getPeso());
            
            filho1.setEnergia(filho1.getEnergia()/2);
            filho1.setEnergia(filho2.getEnergia()/2);
            
            filaDefensor.add(filho1);
            filaDefensor.add(filho2);
            filaDefensor.remove(defender);
            
        }else if(defender.getEnergia() <=0 || defender.getEnergia() == 1){
            filaDefensor.remove(defender);
        }
    
    }
}
