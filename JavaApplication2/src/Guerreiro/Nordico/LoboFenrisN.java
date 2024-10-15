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
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        ArrayList<Guerreiro> filaAtacante = lista.get(posAtk);
        if (this instanceof Envenenavel) {
            ((Envenenavel) this).aplicarEfeitoEnvenenado();
        }
        int danobase = 40;
        for (int i = 1; i < filaAtacante.size(); i++) {
            if (filaAtacante.get(i) instanceof LoboFenrisN) {
                danobase += 8;
            }
        }
        
        defender.setEnergia(defender.getEnergia() - danobase);
        System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
}
