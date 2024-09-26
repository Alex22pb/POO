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
public class ArraisListas {
    
    public static void iniciarArray(){
        ArrayList<Guerreiro> ListaGuerreiro11 = new ArrayList<Guerreiro>();
        ArrayList<Guerreiro> ListaGuerreiro12 = new ArrayList<Guerreiro>();
        ArrayList<Guerreiro> ListaGuerreiro13 = new ArrayList<Guerreiro>();
        ArrayList<Guerreiro> ListaGuerreiro14 = new ArrayList<Guerreiro>();
        
        ArrayList<Guerreiro> ListaGuerreiro21 = new ArrayList<Guerreiro>();
        ArrayList<Guerreiro> ListaGuerreiro22 = new ArrayList<Guerreiro>();
        ArrayList<Guerreiro> ListaGuerreiro23 = new ArrayList<Guerreiro>();
        ArrayList<Guerreiro> ListaGuerreiro24 = new ArrayList<Guerreiro>();
        
        Leitura.lerArquivo(1, "fila11.txt", ListaGuerreiro11);
        Leitura.lerArquivo(1, "fila12.txt", ListaGuerreiro11);
        Leitura.lerArquivo(1, "fila13.txt", ListaGuerreiro11);
        Leitura.lerArquivo(1, "fila14.txt", ListaGuerreiro11);
        
        Leitura.lerArquivo(2, "fila21.txt", ListaGuerreiro11);
        Leitura.lerArquivo(2, "fila22.txt", ListaGuerreiro11);
        Leitura.lerArquivo(2, "fila23.txt", ListaGuerreiro11);
        Leitura.lerArquivo(2, "fila24.txt", ListaGuerreiro11);
    }
}
