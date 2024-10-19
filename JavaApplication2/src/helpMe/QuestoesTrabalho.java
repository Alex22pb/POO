/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpMe;

import Guerreiro.Atlantico.ArgusA;
import Guerreiro.Gregos.Grego;
import Guerreiro.Guerreiro;
import Guerreiro.Nordico.Nordico;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class QuestoesTrabalho {

    private static Guerreiro g_dead;
    private static Guerreiro atacante;

    public static Guerreiro getG_dead() {
        return g_dead;
    }

    public static void setG_dead(Guerreiro g_dead) {
        QuestoesTrabalho.g_dead = g_dead;
    }

    public static Guerreiro getAtacante() {
        return atacante;
    }

    public static void setAtacante(Guerreiro atacante) {
        QuestoesTrabalho.atacante = atacante;
    }
    
    public static void exibirDadosGuerreiros(ArrayList<ArrayList<Guerreiro>> lista) {
        int i = 0;
        for (ArrayList<Guerreiro> vetor : lista) {
            i++;
            if(i == 5){
                System.out.println("\n=============Guerreiros Atlanticos e Egípcios=============");
            }
            for (Guerreiro g : vetor) {
                System.out.println("Nome: " + g.getNome() + " Idade: " + g.getIdade() + " Peso: " + g.getPeso() + " Energia: " + g.getEnergia());
            }
        }
    }

    public static double somaPesos(ArrayList<ArrayList<Guerreiro>> lista) {
        double somaPeso = 0;
        for(ArrayList<Guerreiro> vetor : lista){
            for (Guerreiro g : vetor) {
                somaPeso += g.getPeso();
            }
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
        ArrayList<Guerreiro> armazenarLista = lista.get(0);
        Guerreiro armazenarVelho = armazenarLista.get(0);

        armazenarVelho = percorrer(lista, armazenarVelho);
      

        System.out.println("\nGuerreiro mais velho: ");
        System.out.println("Nome: " + armazenarVelho.getNome() + " Idade: " + armazenarVelho.getIdade() + " Peso: " + armazenarVelho.getPeso() + " Energia: " + armazenarVelho.getEnergia());

    }
    
    public static void morreuMatou(Guerreiro morreu, Guerreiro matou){
        setG_dead(morreu);
        setAtacante(matou);
    }
    
    public static void ultimoMorreuUltimoAtk(){
        
        System.out.println("\n=============================== | FIM DO JOGO | ===============================\n");
        System.out.println("=====| Dados do Ultimo Morto| =====");
         if (g_dead instanceof Grego || g_dead instanceof Nordico) {
             System.out.println("O " + g_dead.getClass().getSimpleName() + " " + g_dead.getNome()
                     + " de " + g_dead.getIdade() + " anos e " + g_dead.getPeso() + " kilos foi o último a ser derrotado no lado dos Gregos e Nórdicos.\n");
         } else {
             System.out.println("O " + g_dead.getClass().getSimpleName() + " " + g_dead.getNome()
                     + " de " + g_dead.getIdade() + " anos e " + g_dead.getPeso() + " kilos foi o último a ser derrotado no lado dos Atlantes e Egípcios.\n");
        }
         
        System.out.println("=====| Dados do Ultimo A Atacar| =====");
        System.out.println("O " + atacante.getClass().getSimpleName() + " de nome " + atacante.getNome() + " idade " + atacante.getIdade() + " e peso " + atacante.getPeso() + ", deu o ultimo golpe no " 
                + g_dead.getClass().getSimpleName() + " " + g_dead.getNome()
                + " de " + g_dead.getIdade() + " anos e " + g_dead.getPeso());
        
        //getSimpleName retorna o nome da classe sem o caminho completo do pacote, se n uso ele, iria imprimir o caminho inteiro EX: Guerreiro.Egipcio.HomemEscorpiaoE

    }
    
    
    public static void determinarVencedor() {
        System.out.println("\n=======| Determinar Vencedor |======");

//        System.out.println("Tamanho da lista: " + lista.size());
//
//        ArrayList<Guerreiro> listaInterna = lista.get(0);
//        if (lista.size() == 1) {
//            System.out.println("Lista tem 1 elemento");
//        }
//        Guerreiro warrior = listaInterna.get(0);

        if (getAtacante() instanceof Grego || getAtacante() instanceof Nordico) {
            System.out.println("Os vencedores são os Gregos e Nórdicos!");
        } else {
            System.out.println("Os vencedores são os Atlánticos e Egípcios!");
        }

    }
    
    
}