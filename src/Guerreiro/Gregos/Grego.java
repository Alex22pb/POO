/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Gregos;

import Guerreiro.Guerreiro;

/**
 *
 * @author Usuario
 */
public class Grego extends Guerreiro{
  
    public Grego(String nome, int idade, double peso, int energia) {
        super(nome, idade, peso, energia);
    }
    
    
    public void setarEnergia(){
        if(getEnergia()  > 100){
            setEnergia(100);
        }
    
    }
}
