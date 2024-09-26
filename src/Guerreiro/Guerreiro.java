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
public class Guerreiro {

    String nome;
    int idade;
    double peso;
    int energia;

    public Guerreiro(String nome, int idade, double peso, int energia) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    

    public static void atacar(){
        
    }
    
    public void imprimir() {
        System.out.println("Nome: " +this.getNome() + " Idade: " + this.getIdade() + " Peso: " + this.getPeso());
    }
}

    
