/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Nordico;

import Guerreiro.Atlantico.AtlanticoA;
import Guerreiro.Egipcio.Egipcio;
import Guerreiro.Envenenavel;
import Guerreiro.Guerreiro;
import helpMe.QuestoesTrabalho;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GigantePedraN extends Nordico{

    public GigantePedraN(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(300);
    }
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posAtk, int posDef) {
        
        if (this instanceof Envenenavel) {
            ((Envenenavel) this).aplicarEfeitoEnvenenado();
        }
        
        if (this.getEnergia() <= 0) {
            System.out.println("A " + this.getClass().getSimpleName() + " " + this.getNome() + " morreu envenenado\n");
            this.morrer(this, lista, posAtk);
        } else {
            if (defender.getEnergia() <= 0) {
                defender.morrer(defender, lista, posDef);
            } else {
                QuestoesTrabalho.morreuMatou(this, defender);
                defender.setEnergia(defender.getEnergia() - 30);
                System.out.println("O " + this.getClass().getSimpleName() + " " + this.getNome() + " atacou " + defender.getNome() + "\n");
                
                for (int i = lista.size() / 2; i < lista.size(); i++) {
                    defender = lista.get(i).get(0);
                    if (defender instanceof AtlanticoA atlas) {
                        if (!atlas.isProvocando()) {
                            atlas.setForcarSerAtk(true);
                            atlas.setIndiceQueProvocou(posAtk);
                        }
                    } else {
                        Egipcio egito = (Egipcio) defender;
                        if (!egito.isProvocando()) {
                            egito.setForcarSerAtk(true);
                            egito.setIndiceQueProvocou(posAtk);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void morrer(Guerreiro defender, ArrayList<ArrayList<Guerreiro>> lista, int posDef){
       lista.get(posDef).remove(defender);
    }
}
