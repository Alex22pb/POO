/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Nordico;

/**
 *
 * @author Usuario
 */
public class GigantePedraN extends Nordico{

    public GigantePedraN(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(300);
    }
    
    public boolean atacar(){
    
        return false;
    
    }
}
