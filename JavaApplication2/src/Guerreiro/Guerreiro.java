/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Guerreiro {

    private String nome;
    private int idade;
    private double peso;
    private int energia;

    public Guerreiro(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.energia = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public abstract void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef);
    
    public abstract void morrer(Guerreiro defensor, ArrayList<ArrayList<Guerreiro>> lista, int posDef);
    
    public void imprimir() {
        System.out.println("Nome: " +this.getNome() + " Idade: " + this.getIdade() + " Peso: " + this.getPeso());
    }
 
}

    
