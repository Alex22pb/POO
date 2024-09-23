/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testejava;
import Guerreiro.Guerreiro;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TesteJava {

    /**
     * @param args the command line arguments
     */
    
    public static void imprimirGuerreiro(ArrayList<Guerreiro> guerreiro) {
    for (Guerreiro g : guerreiro) {
        System.out.println("nome: " + g.getNome() + 
                           ", idade: " + g.getIdade() + 
                           ", peso: " + g.getPeso() + 
                           " e energia: " + g.getEnergia());
    }
}
    
    public static void main(String[] args) throws IOException {
        ArrayList<Guerreiro> guerreiro = new ArrayList <Guerreiro>();
        FileInputStream arq = new FileInputStream("Guerreiro.txt");
        Scanner scan = new Scanner(arq);
        while(scan.hasNext()){
            
            String nome = scan.next();
            int idade = scan.nextInt();
            int peso = scan.nextInt();
            Guerreiro g1 = new Guerreiro(nome, idade, peso);
            guerreiro.add(g1);
        }
        
        scan.close();
        arq.close();
        
        imprimirGuerreiro(guerreiro);
        
    }
    
}
