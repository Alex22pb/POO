package javaapplication2;

import helpMe.Arena;
import static helpMe.Arena.iniciarArray;
import java.io.IOException;
import helpMe.QuestoesTrabalho;


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            iniciarArray(); // Certifique-se de que isso inicializa todas as listas de guerreiros necessárias

            // Chamadas para exibir dados de guerreiros, maior peso e guerreiro mais velho
            System.out.println("\nDados dos Guerreiros\n");
            System.out.println("=============Guerreiros Gregos e Nórdicos=============");
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getArena());
            
            double maiorPeso = QuestoesTrabalho.somaPesos(Arena.getArena());
            System.out.println("\nA soma dos pesos de todos os guerreiros e: " + maiorPeso);
            
            QuestoesTrabalho.maisVelho(Arena.getArena());
//            

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao inicializar ou exibir os dados dos guerreiros: " + e.getMessage());
        }
    }

}
