/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Gregos;

import Guerreiro.Guerreiro;
import helpMe.QuestoesTrabalho;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ManticoraG extends Grego{
    
    public ManticoraG(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
        
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {

        this.setarEnergia();

        if (this instanceof Envenenavel) {
            ((Envenenavel) this).aplicarEfeitoEnvenenado();
        }

        if (this.getEnergia() <= 0) {
            System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " morreu envenenado\n");
            this.morrer(this, lista, posAtk);
        } else {
            if (defender.getEnergia() <= 0) {
                defender.morrer(defender, lista, posDef);
            } else {
                QuestoesTrabalho.morreuMatou(this, defender);
                ArrayList<Guerreiro> filaDefensor = lista.get(posDef);

                int danoPrincipal = 30;
                int danoAdjacente = 15;

                defender.setEnergia(defender.getEnergia() - danoPrincipal);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");

                int posFila = lista.indexOf(filaDefensor);

                switch (posFila) {
                    case 4 -> {
                        if (!lista.get(posFila + 1).isEmpty()) {
                            Guerreiro defensorAdjacente = lista.get(posFila + 1).get(0);
                            atacarManticora(defensorAdjacente, danoAdjacente, this);
                            if (defensorAdjacente.getEnergia() <= 0) {
                                defensorAdjacente.morrer(defensorAdjacente, lista, posDef);
                            }
                        }
                    }
                    case 5 -> {
                        if (!lista.get(posFila + 1).isEmpty()) {
                            Guerreiro defensorAdjacente2 = lista.get(posFila + 1).get(0);
                            atacarManticora(defensorAdjacente2, danoAdjacente, this);              
                            if (defensorAdjacente2.getEnergia() <= 0) {
                                defensorAdjacente2.morrer(defensorAdjacente2, lista, posDef);
                            }
                        }
                        if (!lista.get(posFila - 1).isEmpty()) {
                            Guerreiro defensorAdjacente1 = lista.get(posFila - 1).get(0);
                            atacarManticora(defensorAdjacente1, danoAdjacente, this);
                            if (defensorAdjacente1.getEnergia() <= 0) {
                                defensorAdjacente1.morrer(defensorAdjacente1, lista, posDef);
                            }
                        }
                    }
                    case 6 -> {
                        if (!lista.get(posFila + 1).isEmpty()) {
                            Guerreiro defensorAdjacente2 = lista.get(posFila + 1).get(0);
                            atacarManticora(defensorAdjacente2, danoAdjacente, this);
                            if (defensorAdjacente2.getEnergia() <= 0) {
                                defensorAdjacente2.morrer(defensorAdjacente2, lista, posDef);
                            }
                        }
                        if (!lista.get(posFila - 1).isEmpty()) {
                            Guerreiro defensorAdjacente1 = lista.get(posFila - 1).get(0);
                            atacarManticora(defensorAdjacente1, danoAdjacente, this);
                            if (defensorAdjacente1.getEnergia() <= 0) {
                                defensorAdjacente1.morrer(defensorAdjacente1, lista, posDef);
                            }
                        }
                    }
                    default -> {
                        if (!lista.get(posFila - 1).isEmpty()) {
                            Guerreiro defensorAdjacente = lista.get(posFila - 1).get(0);
                            atacarManticora(defensorAdjacente, danoAdjacente, this);
                            if (defensorAdjacente.getEnergia() <= 0) {
                                defensorAdjacente.morrer(defensorAdjacente, lista, posDef);
                            }
                        }
                    }
                }
            }

        }
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
    
    public static void atacarManticora(Guerreiro defensorAdjacente, int danoAdjacente, Guerreiro gAtk) {
        defensorAdjacente.setEnergia(defensorAdjacente.getEnergia() - danoAdjacente);
        System.out.println("A " + gAtk.getClass().getSimpleName() + " " + gAtk.getNome() + " atacaou " + defensorAdjacente.getNome());
    }
}
