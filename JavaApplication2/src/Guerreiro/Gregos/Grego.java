/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Gregos;

import Guerreiro.Guerreiro;
import Guerreiro.Envenenavel;

/**
 *
 * @author Usuario
 */
public abstract class Grego extends Guerreiro implements Envenenavel{
    private boolean envenenado = false;
  
    public Grego(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    
    public void setarEnergia(){
        if(getEnergia()  > 100){
            setEnergia(100);
        }
    }

    public boolean isEnvenenado() {
        return envenenado;
    }
  
    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    @Override
    public void aplicarEfeitoEnvenenado() {
        if (this.envenenado) {
            this.setEnergia(this.getEnergia() - 5);
            System.out.println(this.getNome() + " perdeu 5 de energia devido ao veneno!");
        }
    }

}

