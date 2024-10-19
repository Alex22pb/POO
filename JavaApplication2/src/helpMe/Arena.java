
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpMe;

import Guerreiro.Atlantico.AtlanticoA;
import Guerreiro.Egipcio.Egipcio;
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

//        int tamVetor = VetorArena.size();
        boolean atkNG = false;
        boolean atkAE = false;
        boolean fimDaPartida = false;

        System.out.println("\n\n=============================== |JOGO INICIADO| ===============================\n");

        while (!fimDaPartida) {
//            
            if (Sorteio.realizarSorteio() == 1) {
                if (atkNG == true) {
                    mudarPosicoes(VetorArena);
                    atkNG = false;
                }
                if (atkNG == false) {
                    System.out.println("=======|ATAQUE DOS GREGOS E NÓRDICOS|======\n");
                    fimDaPartida = chamarAtaqueNG(VetorArena);
                    atkNG = true;
                    if (atkAE == true) {
                        atkAE = false;
                    }
                    verificarMortos(VetorArena);
                    fimDaPartida = retornarTamanhoVetor(VetorArena);
                }
            } else {
                if (atkAE == true) {
                    mudarPosicoes(VetorArena);
                    atkAE = false;
                }
                if (atkAE == false) {
                    System.out.println("=======|ATAQUE DOS ATLÁTICOS E EGÍPCIOS|======\n");
                    fimDaPartida = chamarAtaqueAE(VetorArena);
                    atkAE = true;
                    if (atkNG == true) {
                        atkNG = false;
                    }
                    verificarMortos(VetorArena);
                    fimDaPartida = retornarTamanhoVetor(VetorArena);

                }

            }

        }
        System.out.println("\n\n=============================== |FIM DA PARTIDA| ===============================\n");
    }

    public static void verificarMortos(ArrayList<ArrayList<Guerreiro>> lista) {
        for (int i = 0; i < lista.size(); i++) {
            ArrayList<Guerreiro> ListaInterna = lista.get(i);
            for (int j = 0; j < ListaInterna.size(); j++) {
                Guerreiro defensor = ListaInterna.get(j);
                if (defensor.getEnergia() <= 0) {
                    defensor.morrer(defensor, lista, i);
                    ListaInterna.remove(defensor);
                }
            }
        }
    }

    public static void mudarPosicoes(ArrayList<ArrayList<Guerreiro>> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).isEmpty()) {
                if (lista.get(i).get(0) instanceof AtlanticoA || lista.get(i).get(0) instanceof Egipcio) {
                    verificarProvocar(lista.get(i).get(0));
                }
                lista.get(i).add(lista.get(i).get(0));
                lista.get(i).remove(0);
            }
        }
    }

    public static void verificarProvocar(Guerreiro g) {
        if (g instanceof AtlanticoA atlas) {
            if (atlas.isProvocando()) {
                atlas.setForcarSerAtk(false);
            }
        } else {
            Egipcio egito = (Egipcio) g;
            if (egito.isProvocando()) {
                egito.setForcarSerAtk(false);
            }
        }
    }

    public static boolean retornarTamanhoVetor(ArrayList<ArrayList<Guerreiro>> lista) {
        int contNG = 0;
        int contAE = 0;
        for (int i = 0; i < lista.size() / 2; i++) {
            if (!lista.get(i).isEmpty()) {
                contNG++;
            }
        }

        for (int i = lista.size() / 2; i < lista.size(); i++) {
            if (!lista.get(i).isEmpty()) {
                contAE++;
            }
        }

        return contAE == 0 || contNG == 0;
    }

    private static boolean chamarAtaqueNG(ArrayList<ArrayList<Guerreiro>> lista) {

        for (int i = 0; i < 4; i++) {

            if (!lista.get(i).isEmpty()) {
                int posDefensor = i + 4;
                Guerreiro atacante = lista.get(i).get(0);
                if (lista.get(posDefensor).isEmpty()) {
                    posDefensor = encontrarDefensorEA(posDefensor);
                }

                if (posDefensor >= 4 && posDefensor < lista.size()) {
                    Guerreiro defensor = lista.get(posDefensor).get(0);
                    atacante.atacar(defensor, lista, i, posDefensor);

                } else {
                    return true;
                }
            }
        }
        return false;
    }

    private static int encontrarDefensorEA(int posDefensor) {
        ArrayList<Guerreiro> ListaDefensor = VetorArena.get(posDefensor);
        boolean reset = false;
        while (ListaDefensor.isEmpty()) {
            posDefensor++;
            if (posDefensor == VetorArena.size() && !reset) {
                posDefensor = VetorArena.size() / 2;
                reset = true;
            } else if (posDefensor == VetorArena.size() && reset) {
                return -1;
            }
            ListaDefensor = VetorArena.get(posDefensor);

        }
        return posDefensor;
    }

    private static boolean chamarAtaqueAE(ArrayList<ArrayList<Guerreiro>> lista) {

        for (int i = lista.size() / 2; i < lista.size(); i++) {

            if (!lista.get(i).isEmpty()) {
                int posDefensor = i - 4;
                Guerreiro atacante = lista.get(i).get(0);
                if (lista.get(i - 4).isEmpty()) {
                    posDefensor = encontrarDefensorGN(posDefensor);
                }
                if (posDefensor >= 0 && posDefensor < 4) {
                    Guerreiro defensor = lista.get(posDefensor).get(0);

                    atacante.atacar(defensor, lista, i, posDefensor);

                } else {
                    return true;
                }

            }
        }
        return false;

    }

    private static int encontrarDefensorGN(int posDefensor) {
        ArrayList<Guerreiro> ListaDefensor = VetorArena.get(posDefensor);
        boolean reset = false;
        while (ListaDefensor.isEmpty()) {
            posDefensor++;
            if (posDefensor > VetorArena.size()/2 && !reset) {
                posDefensor = 0;
                reset = true;
            } else if (posDefensor > VetorArena.size()/2 && reset) {
                return -1;
            } 
            ListaDefensor = VetorArena.get(posDefensor);
        }
        return posDefensor;
    }
}
