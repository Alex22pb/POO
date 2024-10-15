/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Nordico;

import Guerreiro.Guerreiro;

/**
 *
 * @author Usuario
 */
public abstract class Nordico extends Guerreiro{
    boolean envenenado = false;
    
    public Nordico(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    
    
    
}
