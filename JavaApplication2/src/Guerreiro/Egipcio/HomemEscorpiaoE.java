/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Egipcio;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class HomemEscorpiaoE extends Egipcio{

    public HomemEscorpiaoE(String nome, int idade, double peso) {
        super(nome, idade, peso);

    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<Guerreiro> filaDefensor, ArrayList<Guerreiro> filaAtacante){
    
        
    
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<Guerreiro> filaDefensor){
        filaDefensor.remove(defender);
    }
    
}
