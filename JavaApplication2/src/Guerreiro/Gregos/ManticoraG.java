/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Gregos;

import Guerreiro.Guerreiro;
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
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef){
        this.setarEnergia();
        
        if (this instanceof Envenenavel) {
            ((Envenenavel) this).aplicarEfeitoEnvenenado();
        }

        ArrayList<Guerreiro> filaDefensor = lista.get(posDef);
        
        int danoPrincipal = 30;
        int danoAdjacente = 15;
        
        defender.setEnergia(defender.getEnergia() - danoPrincipal);
        System.out.println("A " + this.getClass().getSimpleName() + " "  + this.getNome() + " atacou " + defender.getNome() + "\n");
        
        int posFila = lista.indexOf(filaDefensor);
        
        if(posFila == 4){
            if (!lista.get(posFila + 1).isEmpty()) {
                Guerreiro defensorAdjacente = lista.get(posFila + 1 ).getFirst();
                defensorAdjacente.setEnergia(defensorAdjacente.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defensorAdjacente.getNome());
            }
        }else if(posFila == 5){
            if(!lista.get(posFila + 1).isEmpty()){
                Guerreiro defensorAdjacente2 = lista.get(posFila + 1 ).getFirst();
                defensorAdjacente2.setEnergia(defensorAdjacente2.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacaou " + defensorAdjacente2.getNome());
            }
            
            if(!lista.get(posFila - 1).isEmpty()){
                Guerreiro defensorAdjacente1 = lista.get(posFila - 1 ).getFirst();
                defensorAdjacente1.setEnergia(defensorAdjacente1.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacaou " + defensorAdjacente1.getNome());
            }
        }else if(posFila == 6){
            if(!lista.get(posFila + 1).isEmpty()){
                Guerreiro defensorAdjacente2 = lista.get(posFila + 1 ).getFirst();
                defensorAdjacente2.setEnergia(defensorAdjacente2.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacaou " + defensorAdjacente2.getNome());
            }
            
            if(!lista.get(posFila - 1).isEmpty()){
                Guerreiro defensorAdjacente1 = lista.get(posFila - 1 ).getFirst();
                defensorAdjacente1.setEnergia(defensorAdjacente1.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacaou " + defensorAdjacente1.getNome());
            }
        }else if(posFila == 3){
            if(!lista.get(posFila + 1).isEmpty()){
                Guerreiro defensorAdjacente2 = lista.get(posFila + 1 ).getFirst();
                defensorAdjacente2.setEnergia(defensorAdjacente2.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacaou " + defensorAdjacente2.getNome());
            }
            
            if(!lista.get(posFila - 1).isEmpty()){
                Guerreiro defensorAdjacente1 = lista.get(posFila - 1 ).getFirst();
                defensorAdjacente1.setEnergia(defensorAdjacente1.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacaou " + defensorAdjacente1.getNome());
            }
        }else{
           if(!lista.get(posFila - 1).isEmpty()){
                Guerreiro defensorAdjacente = lista.get(posFila - 1 ).getFirst();
                defensorAdjacente.setEnergia(defensorAdjacente.getEnergia() - danoAdjacente);
                System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " atacaou " + defensorAdjacente.getNome());
            }
        }
    }
    
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
}
