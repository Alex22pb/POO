/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpMe;

import Guerreiro.Gregos.Grego;
import Guerreiro.Guerreiro;
import Guerreiro.Nordico.Nordico;

/**
 *
 * @author Usuario
 */
public class FimFila extends Exception{
    private final Guerreiro g_dead;
    private final Guerreiro atacante;
    
      public FimFila(Guerreiro morto, Guerreiro atacante) {
        this.g_dead = morto;
        this.atacante = atacante;
    }
      
//     public void Imprimir() {
//        System.out.println("\n=============================== | FIM DO JOGO | ===============================\n");
//        System.out.println("=====| Dados do Ultimo Morto| =====");
//         if (g_dead instanceof Grego || g_dead instanceof Nordico) {
//             System.out.println("O " + g_dead.getClass().getSimpleName() + " " + g_dead.getNome()
//                     + " de " + g_dead.getIdade() + " anos e " + g_dead.getPeso() + " kilos foi o último a ser derrotado no lado dos Atlantes e Egípcios.\n");
//         } else {
//             System.out.println("O " + g_dead.getClass().getSimpleName() + " " + g_dead.getNome()
//                     + " de " + g_dead.getIdade() + " anos e " + g_dead.getPeso() + " kilos foi o último a ser derrotado no lado dos Gregos e Nórdivos.\n");
//        }
//         
//        System.out.println("=====| Dados do Ultimo A Atacar| =====");
//        System.out.println("Nome: " + atacante.getNome() + "\nIdade: " + atacante.getIdade() + "\nPeso: " + atacante.getPeso() + " no " 
//                + g_dead.getClass().getSimpleName() + " " + g_dead.getNome()
//                + " de " + g_dead.getIdade() + " anos e " + g_dead.getPeso());
//        
//        //getSimpleName retorna o nome da classe sem o caminho completo do pacote, se n uso ele, iria imprimir o caminho inteiro EX: Guerreiro.Egipcio.HomemEscorpiaoE
//
//    }
}
