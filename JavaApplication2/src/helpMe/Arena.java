/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpMe;

import Guerreiro.Guerreiro;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Arena {
    
        private static ArrayList<Guerreiro> ListaGuerreiro11 = new ArrayList<Guerreiro>(); //Definição dos Arrays
        private static ArrayList<Guerreiro> ListaGuerreiro12 = new ArrayList<Guerreiro>();
        private static ArrayList<Guerreiro> ListaGuerreiro13 = new ArrayList<Guerreiro>();
        private static ArrayList<Guerreiro> ListaGuerreiro14 = new ArrayList<Guerreiro>();
        
        private static ArrayList<Guerreiro> ListaGuerreiro21 = new ArrayList<Guerreiro>();
        private static ArrayList<Guerreiro> ListaGuerreiro22 = new ArrayList<Guerreiro>();
        private static ArrayList<Guerreiro> ListaGuerreiro23 = new ArrayList<Guerreiro>();
        private static ArrayList<Guerreiro> ListaGuerreiro24 = new ArrayList<Guerreiro>();
        
        private static ArrayList<ArrayList<Guerreiro>> VetorArena = new ArrayList<ArrayList<Guerreiro>>();
        
        //Criação dos métodos da para acessar os Arrays
        public static ArrayList<Guerreiro> getLista11(){return ListaGuerreiro11;}
        public static ArrayList<Guerreiro> getLista12(){return ListaGuerreiro12;}
        public static ArrayList<Guerreiro> getLista13(){return ListaGuerreiro13;}
        public static ArrayList<Guerreiro> getLista14(){return ListaGuerreiro14;}
        
        public static ArrayList<Guerreiro> getLista21(){return ListaGuerreiro21;}
        public static ArrayList<Guerreiro> getLista22(){return ListaGuerreiro22;}
        public static ArrayList<Guerreiro> getLista23(){return ListaGuerreiro23;}
        public static ArrayList<Guerreiro> getLista24(){return ListaGuerreiro24;}
        
        public static ArrayList<ArrayList<Guerreiro>> getArena(){return VetorArena;}
        
        
        public static void iniciarArray() throws IOException{

            Leitura.lerArquivo(1, "arquivos/fila11.txt", getLista11());
            Leitura.lerArquivo(1, "arquivos/fila12.txt", getLista12());
            Leitura.lerArquivo(1, "arquivos/fila13.txt", getLista13());
            Leitura.lerArquivo(1, "arquivos/fila14.txt", getLista14());

            Leitura.lerArquivo(2, "arquivos/fila21.txt", getLista21());
            Leitura.lerArquivo(2, "arquivos/fila22.txt", getLista22());
            Leitura.lerArquivo(2, "arquivos/fila23.txt", getLista23());
            Leitura.lerArquivo(2, "arquivos/fila24.txt", getLista24());
            
            VetorArena.add(getLista11());
            VetorArena.add(getLista12());
            VetorArena.add(getLista13());
            VetorArena.add(getLista14());
            
            VetorArena.add(getLista21());
            VetorArena.add(getLista22());
            VetorArena.add(getLista23());
            VetorArena.add(getLista24());
            
        }

    
}
