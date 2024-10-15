/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpMe;

import Guerreiro.Atlantico.ArgusA;
import Guerreiro.Atlantico.PrometanoA;
import Guerreiro.Atlantico.SatiroA;
import Guerreiro.Egipcio.AnubitaE;
import Guerreiro.Egipcio.HomemEscorpiaoE;
import Guerreiro.Egipcio.MumiaE;
import Guerreiro.Gregos.CiclopeG;
import Guerreiro.Gregos.HidraG;
import Guerreiro.Gregos.ManticoraG;
import Guerreiro.Guerreiro;
import Guerreiro.Nordico.GigantePedraN;
import Guerreiro.Nordico.LoboFenrisN;
import Guerreiro.Nordico.ValquiriaN;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Leitura {

    public static void lerArquivo(int ladoEscolha, String arquivo, ArrayList<Guerreiro> lista) throws IOException {
        try {

            FileInputStream arq = new FileInputStream(arquivo);
            Scanner scan = new Scanner(arq);

            int lado, idade;
            String nome;
            double peso;

            while (scan.hasNext()) {
                lado = scan.nextInt();
                nome = scan.next();
                peso = scan.nextDouble();
                idade = scan.nextInt();
     

                if (ladoEscolha == 1) {
                    Guerreiro g = null;
                    switch (lado) {
                        case 1 ->
                            g = new CiclopeG(nome, idade, peso);
                        case 2 ->
                            g = new ManticoraG(nome, idade, peso);
                        case 3 ->
                            g = new HidraG(nome, idade, peso);
                        case 4 ->
                            g = new ValquiriaN(nome, idade, peso);
                        case 5 ->
                            g = new LoboFenrisN(nome, idade, peso);
                        case 6 ->
                            g = new GigantePedraN(nome, idade, peso);
                    }
                     lista.add(g);
                } else {
                    Guerreiro g = null;
                    switch (lado) {
                        case 1 ->
                            g = new PrometanoA (nome, idade, peso);
                        case 2 ->
                            g = new SatiroA (nome, idade, peso);
                        case 3 ->
                            g = new ArgusA (nome, idade, peso);
                        case 4 ->
                            g = new AnubitaE (nome, idade, peso);
                        case 5 ->
                            g = new HomemEscorpiaoE (nome, idade, peso);
                        case 6 ->
                            g = new MumiaE (nome, idade, peso);
                    }
                    lista.add(g);
                }
            }
            scan.close();
            arq.close();

        }catch (FileNotFoundException erro) {
            System.out.println("Erro na abertura do arquivo");
        }
    }
}
