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
public class SatiroA extends AtlanticoA{
    
    public SatiroA(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {

        if (((AtlanticoA) this).isProvocando()) {
           ArrayList<Guerreiro> filaDefensor = lista.get(this.getIndiceQueProvocou());

            for (Guerreiro g : filaDefensor) {
                g.setEnergia(g.getEnergia() - 10);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + g.getNome() + "\n");
            }
        } else {
            ArrayList<Guerreiro> filaDefensor = lista.get(posDef);

            for (Guerreiro g : filaDefensor) {
                g.setEnergia(g.getEnergia() - 10);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + g.getNome() + "\n");
            }
        }

    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
        
}
