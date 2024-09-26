/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpMe;

import Guerreiro.Gregos.CiclopeG;
import Guerreiro.Gregos.HidraG;
import Guerreiro.Gregos.ManticoraG;
import Guerreiro.Guerreiro;
import Guerreiro.Nordico.GigantePedraN;
import Guerreiro.Nordico.LoboFenrisN;
import Guerreiro.Nordico.ValquiriaN;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Leitura {

    public static void lerArquivo(int ladoEscolha, String arquivo, ArrayList<Guerreiro> lista) {
        try {

            FileInputStream arq = new FileInputStream(arquivo);
            Scanner scan = new Scanner(arq);

            int lado, idade;
            String nome;
            double peso;

            while (scan.hasNext()) {
                lado = scan.nextInt();
                nome = scan.next();
                idade = scan.nextInt();
                peso = scan.nextDouble();

                if (ladoEscolha == 1) {
                    Guerreiro g;
                    switch (lado) {
                        case 1 ->
                            g = new CiclopeG(nome, idade, peso, 100);
                        case 2 ->
                            g = new ManticoraG(nome, idade, peso, 100);
                        case 3 ->
                            g = new HidraG(nome, idade, peso, 100);
                        case 4 ->
                            g = new ValquiriaN(nome, idade, peso, 100);
                        case 5 ->
                            g = new LoboFenrisN(nome, idade, peso, 100);
                        case 6 ->
                            g = new GigantePedraN(nome, idade, peso, 300);
                    }
                } else {
                    Guerreiro g;
                    switch (lado) {
                        case 1 ->
                            g = new CiclopeG(nome, idade, peso, 100);
                        case 2 ->
                            g = new ManticoraG(nome, idade, peso, 100);
                        case 3 ->
                            g = new HidraG(nome, idade, peso, 100);
                        case 4 ->
                            g = new ValquiriaN(nome, idade, peso, 100);
                        case 5 ->
                            g = new LoboFenrisN(nome, idade, peso, 100);
                        case 6 ->
                            g = new GigantePedraN(nome, idade, peso, 300);
                    }
                }
            }

        }catch (FileNotFoundException erro) {
            System.out.println("Erro na abertura do arquivo");
        }
    }
}
