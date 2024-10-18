/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Gregos;

import Guerreiro.Envenenavel;
import Guerreiro.Guerreiro;
import helpMe.QuestoesTrabalho;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CiclopeG extends Grego{

    public CiclopeG(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {

        this.setarEnergia();

        if (this instanceof Envenenavel) {
            ((Envenenavel) this).aplicarEfeitoEnvenenado();
        }

        if (this.getEnergia() <= 0) {
            System.out.println("A " + this.getClass().getSimpleName() + " "  + this.getNome() + " morreu envenenado\n");
            this.morrer(this, lista, posAtk);
        } else {
            if (defender.getEnergia() <= 0) {
                defender.morrer(defender, lista, posDef);
            } else {
                QuestoesTrabalho.morreuMatou(this, defender);

                ArrayList<Guerreiro> filaDefensor = lista.get(posDef);
                defender.setEnergia(defender.getEnergia() - 35);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");

                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, posDef);
                } else {
                    filaDefensor.remove(defender);
                    filaDefensor.add(defender);
                }
            }
        }

    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
}
