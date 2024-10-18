/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Egipcio;

import Guerreiro.Guerreiro;
import Guerreiro.Provocavel;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Egipcio extends Guerreiro implements Provocavel{
    boolean forcarSerAtk = false;
    int indiceQueProvocou = -1;
    
    
    public Egipcio(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

     @Override
     public void ativarProvocacao(int indiceFila, ArrayList<ArrayList<Guerreiro>> lista, int valorAtk ) {
        Guerreiro defender = lista.get(indiceFila).get(0);
        defender.setEnergia(defender.getEnergia() - valorAtk);
    }

    @Override
    public boolean isProvocando() {
        return forcarSerAtk;
    }

    public void setForcarSerAtk(boolean forcarSerAtk) {
        this.forcarSerAtk = forcarSerAtk;
    }
    
    public int getIndiceQueProvocou() {
        return indiceQueProvocou;
    }
    
    public void setIndiceQueProvocou(int indiceQueProvocou) {
        this.indiceQueProvocou = indiceQueProvocou;
    }

    
   
}
