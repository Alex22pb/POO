/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpMe;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class QuestoesTrabalho {
    
    public void exibirDadosGuerreiros(ArrayList<Guerreiro> lista){
        System.out.println("\tDados do Guerreiro\n");
        for (Guerreiro g: lista){
            System.out.println("Nome: " + g.getNome() + "Idade: " + g.getIdade() + "Peso: " + g.getPeso() + "Energia: " + g.getEnergia());
        }
    }
    
    public double somaPesos(ArrayList<Guerreiro> lista){
        double somaPeso = 0;
        for (Guerreiro g: lista){
            somaPeso+=g.getPeso();
        }
        return somaPeso;
    }
    
    public void maisVelho(ArrayList<Guerreiro> lista11, ArrayList<Guerreiro> lista12, ArrayList<Guerreiro> lista13, ArrayList<Guerreiro> lista14, ArrayList<Guerreiro> lista21, ArrayList<Guerreiro> lista22, ArrayList<Guerreiro> lista23, ArrayList<Guerreiro> lista24){
        Guerreiro armazenarVelho = new Guerreiro(lista11.get(0).getNome(), lista11.get(0).getIdade(), lista11.get(0).getPeso(), lista11.get(0).getEnergia());
        int idadeMaior = armazenarVelho.getIdade();
        
        
        for(Guerreiro g: lista11){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        for(Guerreiro g: lista12){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        for(Guerreiro g: lista13){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        for(Guerreiro g: lista14){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        for(Guerreiro g: lista21){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        for(Guerreiro g: lista22){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        for(Guerreiro g: lista23){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        for(Guerreiro g: lista24){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        
        System.out.println("\tGuerreiro mais velho\n");
        System.out.println("Nome: " + armazenarVelho.getNome() + "Idade: " + armazenarVelho.getIdade() + "Peso: " + armazenarVelho.getPeso() + "Energia: " + armazenarVelho.getEnergia());
        
      
    }
    
}
