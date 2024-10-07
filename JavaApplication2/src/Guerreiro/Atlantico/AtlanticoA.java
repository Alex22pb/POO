/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Atlantico;

import Guerreiro.Guerreiro;

/**
 *
 * @author Usuario
 */
public abstract class AtlanticoA extends Guerreiro{
    private String classe = "Atlantico";

    public AtlanticoA(String nome, int idade, double peso) {
        super(nome, idade, peso);
    } 

    public String getClasse() {
        return classe;
    }
    
}
