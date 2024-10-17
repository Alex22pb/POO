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
public class ArgusA extends AtlanticoA{

    public ArgusA(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(60);    
    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        if (defender.getEnergia() <= 0) {
            defender.morrer(defender, lista, posDef);
        } else {
            QuestoesTrabalho.morreuMatou(this, defender);
            if (((AtlanticoA) this).isProvocando()) {
                defender = lista.get(this.getIndiceQueProvocou()).getFirst();
                this.ativarProvocacao(this.getIndiceQueProvocou(), lista, defender.getEnergia());
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, this.getIndiceQueProvocou());
                }
            } else {
                defender.setEnergia(0);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, posDef);
                }
            }
        }
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }     
    
}
