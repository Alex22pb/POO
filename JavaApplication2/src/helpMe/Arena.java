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
    public static ArrayList<Guerreiro> getLista11() {
        return ListaGuerreiro11;
    }

    public static ArrayList<Guerreiro> getLista12() {
        return ListaGuerreiro12;
    }

    public static ArrayList<Guerreiro> getLista13() {
        return ListaGuerreiro13;
    }

    public static ArrayList<Guerreiro> getLista14() {
        return ListaGuerreiro14;
    }

    public static ArrayList<Guerreiro> getLista21() {
        return ListaGuerreiro21;
    }

    public static ArrayList<Guerreiro> getLista22() {
        return ListaGuerreiro22;
    }

    public static ArrayList<Guerreiro> getLista23() {
        return ListaGuerreiro23;
    }

    public static ArrayList<Guerreiro> getLista24() {
        return ListaGuerreiro24;
    }

    public static ArrayList<ArrayList<Guerreiro>> getArena() {
        return VetorArena;
    }

    public static void iniciarArray() throws IOException {

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

    public static void comecarBatalha() {

        int tamVetor = VetorArena.size();
        boolean atkNG = false;
        boolean atkAE = false;
        
        
        System.out.println("\n\n=============================== |JOGO INICIADO| ===============================\n");
        try {
            while (tamVetor > 1) {
                if (Sorteio.realizarSorteio() == 1) {
                    if (atkNG == true) {
                        mudarPosicoes(VetorArena);
                        atkNG = false;
                    }
                    if (atkNG == false) {
                        chamarAtaqueNG(VetorArena);
                        atkNG = true;
                        verificarMortos(VetorArena);
                    }
                } else {
                    if (atkAE == true) {
                        mudarPosicoes(VetorArena);
                        atkAE = false;
                    }
                    if (atkAE == false) {
                        chamarAtaqueAE(VetorArena);
                        atkAE = true;
                        verificarMortos(VetorArena);

                    }

                }

                tamVetor = retornarTamanhoVetor(VetorArena);
            }
        } catch (FimFila ex) {
            ex.Imprimir();
        }
    
        System.out.println("\n\n=============================== |FIM DA PARTIDA| ===============================\n");
        for (int i = 0; i < VetorArena.size(); i++) {
            if (VetorArena.get(i).isEmpty()) {
                VetorArena.remove(i);
            }
        }

    }

    
    public static void verificarMortos(ArrayList<ArrayList<Guerreiro>> lista) throws FimFila{
        for(int i = 0; i < lista.size(); i++){
            ArrayList<Guerreiro> ListaInterna = lista.get(i);
            for(int j = 0; j < ListaInterna.size(); j++){
                if(i < 4){
                    gerenciarMortos(ListaInterna.get(j), ListaInterna, lista.get(i+4).get(ListaInterna.size()));
                }else{
                    gerenciarMortos(ListaInterna.get(j), ListaInterna, lista.get(i-4).get(ListaInterna.size()));
                }
            }
        }
    }
    
    public static void gerenciarMortos(Guerreiro defensor, ArrayList<Guerreiro> lista, Guerreiro atacante) throws FimFila{
            if(defensor.getEnergia() <= 0){
                lista.remove(defensor);
                if(lista.isEmpty()){
                    throw new FimFila(defensor, atacante);
                }
            }
    
    }
    
    public static void mudarPosicoes(ArrayList<ArrayList<Guerreiro>> lista){
        for(int i = 0; i<lista.size(); i++){
            lista.get(i).add(lista.get(i).getFirst());
            lista.get(i).remove(lista.get(i).getFirst());
        }
    }
    
    
    public static int retornarTamanhoVetor(ArrayList<ArrayList<Guerreiro>> lista){
        int contAux = lista.size();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isEmpty()) {
                contAux--;
            }
        }
        return contAux;
    }

    private static void chamarAtaqueNG(ArrayList<ArrayList<Guerreiro>> lista) {
        System.out.println("=======|ATAQUE|======");

        for (int i = 0; i < 4; i++) {

            if (!lista.get(i).isEmpty()) {
                int posDefensor = i+4;
                Guerreiro atacante = lista.get(i).getFirst();
                if(lista.get(i+4).isEmpty()){
                    posDefensor = encontrarDefensorEA(lista.get(i+4));
                }
                Guerreiro defensor = lista.get(posDefensor).getFirst();
                
                atacante.atacar(defensor, lista.get(posDefensor), lista.get(i));

            }
        }

    }
    
    private static int encontrarDefensorEA(ArrayList<Guerreiro> ListaDefensor){
        int posicao = ListaDefensor.indexOf(VetorArena);
        while (ListaDefensor.isEmpty()) {
            posicao = (posicao % 4) + 4; // Ciclo entre as filas do lado 2 (5 a 8)
            if(posicao > VetorArena.size()){
                posicao = 0;
            }
            ListaDefensor = VetorArena.get(posicao);
        }
        return posicao;
    }
    
    
    private static void chamarAtaqueAE(ArrayList<ArrayList<Guerreiro>> lista) {
        System.out.println("=======|ATAQUE|======");

        for (int i = lista.size(); i >= lista.size()/2; i--) {

            if (!lista.get(i).isEmpty()) {
                int posDefensor = i-4;
                Guerreiro atacante = lista.get(i).getFirst();
                if(lista.get(i-4).isEmpty()){
                    posDefensor = encontrarDefensorGN(lista.get(i-4));
                }
                Guerreiro defensor = lista.get(posDefensor).getFirst();
                
                atacante.atacar(defensor, lista.get(posDefensor), lista.get(i));

            }
        }

    }
    
    private static int encontrarDefensorGN(ArrayList<Guerreiro> ListaDefensor){
        int posicao = ListaDefensor.indexOf(VetorArena);
        while (ListaDefensor.isEmpty()) {
            posicao = (posicao % 4) - 4; // Ciclo entre as filas do lado 1 (1 a 4)
            if(posicao < 0){
                posicao = VetorArena.size();
            }
            ListaDefensor = VetorArena.get(posicao);
        }
        return posicao;
    }



}
