/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Atlantico;

import Guerreiro.Guerreiro;
import helpMe.QuestoesTrabalho;
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
        if (defender.getEnergia() <= 0) {
            defender.morrer(defender, lista, posDef);
        } else {
            QuestoesTrabalho.morreuMatou(this, defender);
            if (((AtlanticoA) this).isProvocando()) {
                ArrayList<Guerreiro> filaDefensor = lista.get(this.getIndiceQueProvocou());

                for(int i = 0; i <filaDefensor.size(); i++){
                    Guerreiro g = filaDefensor.get(i);
                    g.setEnergia(g.getEnergia() - 10);
                    System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + g.getNome() + "\n");
                    if(g.getEnergia()<= 0){
                        g.morrer(g, lista, lista.indexOf(filaDefensor));
                    }
                }
            } else {
                ArrayList<Guerreiro> filaDefensor = lista.get(posDef);

                for(int i = 0; i <filaDefensor.size(); i++){
                    Guerreiro g = filaDefensor.get(i);
                    g.setEnergia(g.getEnergia() - 10);
                    System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + g.getNome() + "\n");
                    if(g.getEnergia() <= 0){
                        g.morrer(g, lista, posDef);
                    }
                }
            }
        }

    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
        
}
