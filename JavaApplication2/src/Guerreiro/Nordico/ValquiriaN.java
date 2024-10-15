/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Nordico;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ValquiriaN extends Nordico{

    public ValquiriaN(String nome, int idade, double peso) {
        super(nome, idade, peso);
        
    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        ArrayList<Guerreiro> filaAtacante = lista.get(posAtk);
        if (this instanceof Envenenavel) {
            ((Envenenavel) this).aplicarEfeitoEnvenenado();
        }
        defender.setEnergia(defender.getEnergia() - 20);
        System.out.println("" + this.getNome() + " atacou " + defender.getNome() + "\n");
        Guerreiro curarGuerreiro = filaAtacante.get(1);
        curarGuerreiro.setEnergia(curarGuerreiro.getEnergia() + 20);
        System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " curou " + curarGuerreiro.getNome() + "\n");
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
}
