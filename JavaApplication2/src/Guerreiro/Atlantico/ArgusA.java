/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Atlantico;

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
    public boolean atacar(){
    
        return false;
    }
    
}
