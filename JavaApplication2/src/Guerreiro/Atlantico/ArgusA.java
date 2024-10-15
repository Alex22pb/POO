/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Atlantico;

import Guerreiro.Guerreiro;
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
    public void atacar(Guerreiro defender, ArrayList<Guerreiro> filaDefensor, ArrayList<Guerreiro> filaAtacante){
        defender.setEnergia(0);    
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<Guerreiro> filaDefensor){
        filaDefensor.remove(defender);
    }
    
    
    
}
