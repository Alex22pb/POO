/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public interface LutadorState {
    LutadorState atacar();
    LutadorState carregarKI();
    LutadorState levarDano(int dano);
    LutadorState verificarKI();
}
