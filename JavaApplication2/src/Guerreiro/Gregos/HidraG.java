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
public class HidraG extends Grego{

    private int quantCabecas = 0;
    
    public HidraG(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public int getQuantCabecas() {
        return quantCabecas;
    }

    public void setQuantCabecas(int quantCabecas) {
        this.quantCabecas = quantCabecas;
    }
    
    
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef){
        this.setarEnergia();
        
        if (this instanceof Envenenavel) {
            ((Envenenavel) this).aplicarEfeitoEnvenenado();
        }

        int quantidadeCab = 0;
        int danoTotal = 40 + (5 * this.getQuantCabecas());
        
        defender.setEnergia(defender.getEnergia() - danoTotal);
        System.out.println("A " + this.getClass().getSimpleName() + " "  + this.getNome() + " atacou " + defender.getNome() + "\n");
        if(defender.getEnergia() <= 0){
            quantidadeCab++;
        }
        
        if(this.getEnergia() < 100){
            this.setEnergia(this.getEnergia() + 20);
        }
        this.setQuantCabecas(quantidadeCab);
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
       lista.get(posDef).remove(defender);
    }
}
