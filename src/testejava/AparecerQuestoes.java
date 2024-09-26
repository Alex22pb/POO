/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testejava;

import helpMe.ArraisListas;
import helpMe.QuestoesTrabalho;

/**
 *
 * @author 2022222760020
 */
public class AparecerQuestoes {
    public static void exibirDados(){
        QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista11(), 1);
            QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista12(), 1);
            QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista13(), 1);
            QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista14(), 1);
            
            QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista21(), 2);
            QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista22(), 2);
            QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista23(), 2);
            QuestoesTrabalho.exibirDadosGuerreiros(ArraisListas.getLista24(), 2);
    }
    
    public static void exibirPeso(){
            double maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista11());
            maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista12());
            maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista13());
            maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista14());
            
            maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista21());
            maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista22());
            maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista23());
            maiorPeso = QuestoesTrabalho.somaPesos(ArraisListas.getLista24());
            
            System.out.println("A soma dos pesos de todos os guerreiros e: " + maiorPeso);
    }
}
