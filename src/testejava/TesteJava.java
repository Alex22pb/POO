/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testejava;

import Guerreiro.Guerreiro;
import helpMe.ArraisListas;
import static helpMe.ArraisListas.iniciarArray;
import helpMe.Leitura;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import helpMe.QuestoesTrabalho;


/**
 *
 * @author Usuario
 */

public class TesteJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        try {        
            
            iniciarArray(); // Certifique-se de que isso inicializa todas as listas de guerreiros necessárias

            // Chamadas para exibir dados de guerreiros, maior peso e guerreiro mais velho
            AparecerQuestoes.exibirDados();
            AparecerQuestoes.exibirPeso();
            QuestoesTrabalho.maisVelho(ArraisListas.getLista11(), ArraisListas.getLista12(), ArraisListas.getLista13(), ArraisListas.getLista14(), ArraisListas.getLista21(),ArraisListas.getLista22(), ArraisListas.getLista23(), ArraisListas.getLista24()); 
            

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao inicializar ou exibir os dados dos guerreiros: " + e.getMessage());
        }
    }

}
