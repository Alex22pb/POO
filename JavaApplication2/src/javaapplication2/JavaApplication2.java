package javaapplication2;

import helpMe.Arena;
import static helpMe.Arena.iniciarArray;
import helpMe.FimFila;
import java.io.IOException;
import helpMe.QuestoesTrabalho;


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        

        iniciarArray();

        // Chamadas para exibir dados de guerreiros, maior peso e guerreiro mais velho
        System.out.println("\nDados dos Guerreiros\n");
        System.out.println("=============Guerreiros Gregos e Nórdicos=============");
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getArena());

        double maiorPeso = QuestoesTrabalho.somaPesos(Arena.getArena());
        System.out.println("\nA soma dos pesos de todos os guerreiros e: " + maiorPeso);

        QuestoesTrabalho.maisVelho(Arena.getArena());

        Arena.comecarBatalha();
        QuestoesTrabalho.determinarVencedor();
        QuestoesTrabalho.ultimoMorreuUltimoAtk();
//        QuestoesTrabalho.determinarVencedor(Arena.getArena());
        
//            

        
    }

}
