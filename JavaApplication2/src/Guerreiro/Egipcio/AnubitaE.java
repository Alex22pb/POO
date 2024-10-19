/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Egipcio;

import Guerreiro.Guerreiro;
import helpMe.QuestoesTrabalho;
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
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        if (defender.getEnergia() <= 0) {
            defender.morrer(defender, lista, posDef);
        } else {
            QuestoesTrabalho.morreuMatou(this, defender);
            if (((Egipcio) this).isProvocando()) {
                ArrayList<Guerreiro> filaDefensor = lista.get(this.getIndiceQueProvocou());

                defender = filaDefensor.get(0);
                defender.setEnergia(defender.getEnergia() - 15);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, this.getIndiceQueProvocou());
                }
                if (!filaDefensor.isEmpty()) {
                    Guerreiro ultimoDefensor = filaDefensor.get(filaDefensor.size() - 1);
                    ultimoDefensor.setEnergia(ultimoDefensor.getEnergia() - 15);
                    System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + ultimoDefensor.getNome() + "\n");
                    if (ultimoDefensor.getEnergia() <= 0) {
                        ultimoDefensor.morrer(ultimoDefensor, lista, this.getIndiceQueProvocou());
                    }
                }

            } else {
                ArrayList<Guerreiro> filaDefensor = lista.get(posDef);

                defender.setEnergia(defender.getEnergia() - 15);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, posDef);
                }
                if (!filaDefensor.isEmpty()) {
                    Guerreiro ultimoDefensor = filaDefensor.get(filaDefensor.size() - 1);
                    ultimoDefensor.setEnergia(ultimoDefensor.getEnergia() - 15);
                    System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + ultimoDefensor.getNome() + "\n");
                    if (ultimoDefensor.getEnergia() <= 0) {
                        ultimoDefensor.morrer(ultimoDefensor, lista, posDef);
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
