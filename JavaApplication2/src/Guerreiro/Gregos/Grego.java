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
public abstract class Grego extends Guerreiro{
    private boolean envenenado = false;
  
    public Grego(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    
    public void setarEnergia(){
        if(getEnergia()  > 100){
            setEnergia(100);
        }
    
    }

    public boolean getEnvenenado() {
        return this.envenenado;
    }
  
    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    private void envenenado(){
        if(envenenado == true){
            this.setEnergia(getEnergia() - 5);
        }
    }
}

