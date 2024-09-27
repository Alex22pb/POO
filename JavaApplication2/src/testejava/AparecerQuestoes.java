package testejava;

import helpMe.Arena;
import helpMe.QuestoesTrabalho;

/**
 *
 * @author 2022222760020
 */
public class AparecerQuestoes {

    public static void exibirDados() {
        
        System.out.println("\nDados dos Guerreiros\n");
        System.out.println("=============Guerreiros Gregos e Nórdicos=============");
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista11(), 1);
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista12(), 1);
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista13(), 1);
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista14(), 1);

        System.out.println("\n=============Guerreiros Atlanticos e Egípcios=============\n");
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista21(), 2);
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista22(), 2);
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista23(), 2);
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista24(), 2);
    }

    public static void exibirPeso() {
        double maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista11());
        maiorPeso += QuestoesTrabalho.somaPesos(Arena.getLista12());
        maiorPeso += QuestoesTrabalho.somaPesos(Arena.getLista13());
        maiorPeso += QuestoesTrabalho.somaPesos(Arena.getLista14());

        maiorPeso += QuestoesTrabalho.somaPesos(Arena.getLista21());
        maiorPeso += QuestoesTrabalho.somaPesos(Arena.getLista22());
        maiorPeso += QuestoesTrabalho.somaPesos(Arena.getLista23());
        maiorPeso += QuestoesTrabalho.somaPesos(Arena.getLista24());

        System.out.println("\nA soma dos pesos de todos os guerreiros e: " + maiorPeso);
    }
}
