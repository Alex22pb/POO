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
public class PrometanoA extends AtlanticoA{
   
    public PrometanoA(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        if (defender.getEnergia() <= 0) {
            defender.morrer(defender, lista, posDef);
        } else {
            QuestoesTrabalho.morreuMatou(this, defender);
            if (((AtlanticoA) this).isProvocando()) {
                defender = lista.get(this.getIndiceQueProvocou()).getFirst();
                this.ativarProvocacao(this.getIndiceQueProvocou(), lista, 10);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, this.getIndiceQueProvocou());
                }
            } else {
                defender.setEnergia(defender.getEnergia() - 10);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, posDef);
                }
            }
        }

    }
        
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        ArrayList<Guerreiro> filaDefensor = lista.get(posDef);
        if(defender.getEnergia() < 1 && defender.getEnergia() <= 0 ){
            int indiceString = defender.getNome().length();
            if (defender.getNome().charAt(indiceString - 1) == '1' || defender.getNome().charAt(indiceString - 1) == '2') {
                Guerreiro filho1 = new PrometanoA(defender.getNome() + ".1", defender.getIdade(), defender.getPeso());
                Guerreiro filho2 = new PrometanoA(defender.getNome() + ".2", defender.getIdade(), defender.getPeso());

                filho1.setEnergia(filho1.getEnergia() / 2);
                filho1.setEnergia(filho2.getEnergia() / 2);

                filaDefensor.add(filho1);
                filaDefensor.add(filho2);
                filaDefensor.remove(defender);
            } else {
                Guerreiro filho1 = new PrometanoA(defender.getNome() + "1", defender.getIdade(), defender.getPeso());
                Guerreiro filho2 = new PrometanoA(defender.getNome() + "2", defender.getIdade(), defender.getPeso());

                filho1.setEnergia(filho1.getEnergia() / 2);
                filho1.setEnergia(filho2.getEnergia() / 2);

                filaDefensor.add(filho1);
                filaDefensor.add(filho2);
                filaDefensor.remove(defender);
            }
  
        }else if(defender.getEnergia() <=0 || defender.getEnergia() == 1){
            defender.setEnergia(0);
        }
    
    }
}
