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
public class LoboFenrisN extends Nordico{
    
    public LoboFenrisN(String nome, int idade, double peso) {
        super(nome, idade, peso);
        
    }

    
    @Override
    public void atacar(Guerreiro defender, ArrayList<Guerreiro> filaDefensor, ArrayList<Guerreiro> filaAtacante) {
        int danobase = 40;
        for (int i = 1; i < filaAtacante.size(); i++) {
            if (filaAtacante.get(i) instanceof LoboFenrisN) {
                danobase += 8;
            }
        }
        
        defender.setEnergia(defender.getEnergia() - danobase);
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<Guerreiro> filaDefensor){
        filaDefensor.remove(defender);
    }
}
