package testejava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import helpMe.Arena;
import helpMe.QuestoesTrabalho;

/**
 *
 * @author 2022222760020
 */
public class AparecerQuestoes_1 {
    public static void exibirDados(){
        QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista11(), 1);
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista12(), 1);
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista13(), 1);
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista14(), 1);
            
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista21(), 2);
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista22(), 2);
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista23(), 2);
            QuestoesTrabalho.exibirDadosGuerreiros(Arena.getLista24(), 2);
    }
    
    public static void exibirPeso(){
            double maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista11());
            maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista12());
            maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista13());
            maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista14());
            
            maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista21());
            maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista22());
            maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista23());
            maiorPeso = QuestoesTrabalho.somaPesos(Arena.getLista24());
            
            System.out.println("A soma dos pesos de todos os guerreiros e: " + maiorPeso);
    }
}
