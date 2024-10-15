/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro.Gregos;

import Guerreiro.Guerreiro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ManticoraG extends Grego{
    
    public ManticoraG(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
        
    
    @Override
    public void atacar(Guerreiro defender, ArrayList<Guerreiro> filaDefensor, ArrayList<Guerreiro> filaAtacante){
        this.setarEnergia();
        
        int danoPrincipal = 30;
        int danoAdjacente = 15;
        
        defender.setEnergia(defender.getEnergia() - danoPrincipal);
        
        int posFila = filaDefensor.indexOf(defender);
        
        if(posFila == 0){
            Guerreiro defensorAdjacente = filaDefensor.get(1);
            defensorAdjacente.setEnergia(defensorAdjacente.getEnergia() - danoAdjacente);
        }else if(posFila == 1){
            if(!filaDefensor.isEmpty()){
                Guerreiro defensorAdjacente1 = filaDefensor.get(0);
                Guerreiro defensorAdjacente2 = filaDefensor.get(2);

                defensorAdjacente1.setEnergia(defensorAdjacente1.getEnergia() - danoAdjacente);
                defensorAdjacente2.setEnergia(defensorAdjacente2.getEnergia() - danoAdjacente);
            }
        }else if(posFila == 2){
            if(!filaDefensor.isEmpty()){
                Guerreiro defensorAdjacente1 = filaDefensor.get(1);
                Guerreiro defensorAdjacente2 = filaDefensor.get(3);

                defensorAdjacente1.setEnergia(defensorAdjacente1.getEnergia() - danoAdjacente);
                defensorAdjacente2.setEnergia(defensorAdjacente2.getEnergia() - danoAdjacente);
            }
        }else if(posFila == 3){
            if(!filaDefensor.isEmpty()){
                Guerreiro defensorAdjacente1 = filaDefensor.get(2);
                Guerreiro defensorAdjacente2 = filaDefensor.get(4);

                defensorAdjacente1.setEnergia(defensorAdjacente1.getEnergia() - danoAdjacente);
                defensorAdjacente2.setEnergia(defensorAdjacente2.getEnergia() - danoAdjacente);
            }
        }else{
            if (!filaDefensor.isEmpty()) {
                Guerreiro defensorAdjacente = filaDefensor.get(3);

                defensorAdjacente.setEnergia(defensorAdjacente.getEnergia() - danoAdjacente);
            }
        }
        
    
    }
    
    public void morrer(Guerreiro defender, ArrayList<Guerreiro> filaDefensor){
        filaDefensor.remove(defender);
    }
}
