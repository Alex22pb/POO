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
public class MumiaE extends Egipcio{

    public MumiaE(String nome, int idade, double peso) {
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
                this.ativarProvocacao(this.getIndiceQueProvocou(), lista, 50);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    Guerreiro Zumbi = new MortoVivoE(defender.getNome(), defender.getIdade(), defender.getPeso());
                    lista.get(posAtk).add(Zumbi);
                    defender.morrer(defender, lista, this.getIndiceQueProvocou());
                }
            } else {
                defender.setEnergia(defender.getEnergia() - 50);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender.getEnergia() <= 0) {
                    Guerreiro Zumbi = new MortoVivoE(defender.getNome(), defender.getIdade(), defender.getPeso());
                    lista.get(posAtk).add(Zumbi);
                    defender.morrer(defender, lista, posDef);
                }
                
            }
        }
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){

        for(int i = lista.size()/2; i < lista.size(); i++ ){
           Guerreiro Vingador = new AnubitaE(defender.getNome(),0, 60);
           lista.get(i).add(Vingador);
        }
        lista.get(posDef).remove(defender);
    }
}
