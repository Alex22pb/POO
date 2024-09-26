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
    
    public static void exibirDadosGuerreiros(ArrayList<Guerreiro> lista, int lado){
        if(lado == 1){
            System.out.println("\tGuerreiros Gregos e Nórdicos \n");
        }else{
            System.out.println("\tGuerreiros Atlanticos e Egípcios\n");
        }
        System.out.println("\n\tDados dos Guerreiros\n");
        for (Guerreiro g: lista){
            System.out.println("Nome: " + g.getNome() + "Idade: " + g.getIdade() + "Peso: " + g.getPeso() + "Energia: " + g.getEnergia());
        }
    }
    
    public static double somaPesos(ArrayList<Guerreiro> lista){
        double somaPeso = 0;
        for (Guerreiro g: lista){
            somaPeso+=g.getPeso();
        }
        return somaPeso;
    }
    
    public static Guerreiro percorrer(ArrayList<Guerreiro> vetor, Guerreiro g){
        for(Guerreiro g: vetor){
            if(idadeMaior < g.getIdade()){
                armazenarVelho = g;
            }
        }
        return g;
    }
    
    public static void maisVelho(ArrayList<Guerreiro> lista){
        Guerreiro armazenarVelho = new Guerreiro(lista.get(0).getNome(), lista.get(0).getIdade(), lista.get(0).getPeso());
        
        
        percorrer(lista, armazenarVelho);
        
        System.out.println("\tGuerreiro mais velho\n");
        System.out.println("Nome: " + armazenarVelho.getNome() + "Idade: " + armazenarVelho.getIdade() + "Peso: " + armazenarVelho.getPeso() + "Energia: " + armazenarVelho.getEnergia());
        
      
    }
    
}
