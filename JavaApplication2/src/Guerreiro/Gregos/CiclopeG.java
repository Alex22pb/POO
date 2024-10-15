/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Gregos;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CiclopeG extends Grego{

    public CiclopeG(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<Guerreiro> filaDefensor, ArrayList<Guerreiro> filaAtacante){
        this.setarEnergia();
        defender.setEnergia(defender.getEnergia() - 35);
        
        filaDefensor.remove(defender);
        filaDefensor.add(defender);
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<Guerreiro> filaDefensor){
        filaDefensor.remove(defender);
    }
}
