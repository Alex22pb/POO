/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guerreiro;

import java.util.ArrayList;

/**
 *
 * @author 2022222760020
 */
public interface Provocavel {
    void ativarProvocacao(int indiceFila, ArrayList<ArrayList<Guerreiro>> lista, int valorAtk);
    boolean isProvocando();
}
