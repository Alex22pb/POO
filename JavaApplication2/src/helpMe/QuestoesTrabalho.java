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

    public static void exibirDadosGuerreiros(ArrayList<Guerreiro> lista, int lado) {
        for(Guerreiro g : lista) {
            System.out.println("Nome: " + g.getNome() + " Idade: " + g.getIdade() + " Peso: " + g.getPeso() + " Energia: " + g.getEnergia());
        }
    }

    public static double somaPesos(ArrayList<Guerreiro> lista) {
        double somaPeso = 0;
        for (Guerreiro g : lista) {
            somaPeso += g.getPeso();
        }
        return somaPeso;
    }

    public static Guerreiro percorrer(ArrayList<ArrayList<Guerreiro>> vetor, Guerreiro g) {
        Guerreiro maisVelho = g;
        int idadeMaior = maisVelho.getIdade();
        for (ArrayList<Guerreiro> lista : vetor) {
            for (Guerreiro warrior : lista) {
                if (idadeMaior < warrior.getIdade()) {
                    maisVelho = warrior;
                    idadeMaior = maisVelho.getIdade();
                }
            }
        }
        return maisVelho;
    }

    public static void maisVelho(ArrayList<ArrayList<Guerreiro>> lista) {
        Guerreiro armazenarVelho = new Guerreiro(lista.get(0).get(0).getNome(), lista.get(0).get(0).getIdade(), lista.get(0).get(0).getPeso());

        armazenarVelho = percorrer(lista, armazenarVelho);

        System.out.println("\nGuerreiro mais velho\n");
        System.out.println("Nome: " + armazenarVelho.getNome() + " Idade: " + armazenarVelho.getIdade() + " Peso: " + armazenarVelho.getPeso() + " Energia: " + armazenarVelho.getEnergia());

    }

}
