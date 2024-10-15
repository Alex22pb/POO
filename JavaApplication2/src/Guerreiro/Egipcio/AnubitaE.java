/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Egipcio;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class AnubitaE extends Egipcio{

    public AnubitaE(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef){
        if (((Egipcio)this).isProvocando()) {
            ArrayList<Guerreiro> filaDefensor = lista.get(this.getIndiceQueProvocou());
            
            defender = filaDefensor.getFirst();
            defender.setEnergia(defender.getEnergia() - 15);
            System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
            Guerreiro ultimoDefensor = filaDefensor.getLast();
            ultimoDefensor.setEnergia(ultimoDefensor.getEnergia() - 15);
            System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + ultimoDefensor.getNome() + "\n");
        }else{
            ArrayList<Guerreiro> filaDefensor = lista.get(posDef);

            defender.setEnergia(defender.getEnergia() - 15);
            System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
            Guerreiro ultimoDefensor = filaDefensor.getLast();
            ultimoDefensor.setEnergia(ultimoDefensor.getEnergia() - 15);
            System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + ultimoDefensor.getNome() + "\n");
        }

    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
}
