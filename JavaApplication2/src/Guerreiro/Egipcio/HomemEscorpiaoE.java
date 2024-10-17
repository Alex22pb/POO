/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Egipcio;

import Guerreiro.Gregos.Grego;
import Guerreiro.Guerreiro;
import Guerreiro.Nordico.Nordico;
import helpMe.QuestoesTrabalho;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class HomemEscorpiaoE extends Egipcio{

    public HomemEscorpiaoE(String nome, int idade, double peso) {
        super(nome, idade, peso);

    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        if (defender.getEnergia() <= 0) {
            defender.morrer(defender, lista, posDef);
        } else {
            QuestoesTrabalho.morreuMatou(this, defender);
            if (((Egipcio) this).isProvocando()) {
                this.ativarProvocacao(this.getIndiceQueProvocou(), lista, 20);
                defender = lista.get(this.getIndiceQueProvocou()).get(0);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");

                if (defender instanceof Grego grego) {
                    if (!grego.isEnvenenado()) {
                        grego.setEnvenenado(true);
                    }
                } else {
                    Nordico nordico = (Nordico) defender;
                    if (!nordico.isEnvenenado()) {
                        nordico.setEnvenenado(true);
                    }
                }

                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, this.getIndiceQueProvocou());
                }
            } else {
                defender.setEnergia(defender.getEnergia() - 20);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                if (defender instanceof Grego grego) { //VERIFICO SE MEU DEFENDER E UM GREGO OU NORIDCO PARA ENVENENAR ELE
                    //O Grego grego, eu meio q to falando q o meu defender e da classe Grego
                    //então transformo o defender em grego para usar
                    if (!grego.isEnvenenado()) {
                        grego.setEnvenenado(true);
                    }
                } else {
                    //SE FOSSE FAZER IGUAL PARA OS GREGOS, SERIA...
                    Nordico nordico = (Nordico) defender;
                    if (!nordico.isEnvenenado()) {
                        nordico.setEnvenenado(true);
                    }
                    //MAS TANTO O DE CIMA COMO O DE BAIXO SÃO IGUAIS
                    //((Nordico) defender).setEnvenenado(true)
                }
                if (defender.getEnergia() <= 0) {
                    defender.morrer(defender, lista, posDef);
                }
            }
        }
    }
    
    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
        lista.get(posDef).remove(defender);
    }
    
}
