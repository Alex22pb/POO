/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Nordico;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ValquiriaN extends Nordico{

    public ValquiriaN(String nome, int idade, double peso) {
        super(nome, idade, peso);
        
    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<Guerreiro> filaDefensor, ArrayList<Guerreiro> filaAtacante){
        defender.setEnergia(defender.getEnergia() - 20);
        Guerreiro curarGuerreiro = filaAtacante.get(1);
        curarGuerreiro.setEnergia(curarGuerreiro.getEnergia() + 20);   
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<Guerreiro> filaDefensor){
        filaDefensor.remove(defender);
    }
}
