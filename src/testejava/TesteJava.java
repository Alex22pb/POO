package testejava;



import helpMe.Arena;
import static helpMe.Arena.iniciarArray;
import java.io.IOException;
import helpMe.QuestoesTrabalho;


/**
 *
 * @author Usuario
 */

public class TesteJava {

   
    public static void main(String[] args) {
        try {        
            
            iniciarArray(); // Certifique-se de que isso inicializa todas as listas de guerreiros necessárias

            // Chamadas para exibir dados de guerreiros, maior peso e guerreiro mais velho
            AparecerQuestoes.exibirDados();
            AparecerQuestoes.exibirPeso();
            QuestoesTrabalho.maisVelho(Arena.getArena()); 
            

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao inicializar ou exibir os dados dos guerreiros: " + e.getMessage());
        }
    }

}
