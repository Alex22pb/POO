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
public class MortoVivoE extends Egipcio{

    public MortoVivoE(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        if (defender.getEnergia() <= 0) {
            defender.morrer(defender, lista, posDef);
        } else {
            QuestoesTrabalho.morreuMatou(this, defender);
            if (((Egipcio) this).isProvocando()) {
                defender = lista.get(this.getIndiceQueProvocou()).get(0);
                this.ativarProvocacao(this.getIndiceQueProvocou(), lista, 5);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, this.getIndiceQueProvocou());
                }
            } else {
                defender.setEnergia(defender.getEnergia() - 5);
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
