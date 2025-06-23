/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class PadraoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador personagem = new Lutador("Goku", 100, 100);

        // Forma Normal
        personagem.atacar(); // -10 Ki FORMA NORMAL

        // Carrega Ki até poder virar SSJ1 (150)
        personagem.carregarKi(); // +50 => 140
        personagem.carregarKi(); // +50 => 190
        personagem.transformar(); // Vira SSJ1

        personagem.atacar(); // -20 Ki (SSJ1)
        personagem.transformar(); // Tenta SSJ2 com Ki insuficiente

        personagem.carregarKi(); // +50 => 220
        personagem.transformar(); // Vira SSJ2
        personagem.atacar(); // -30 Ki, 190 KI
        personagem.verificarKI(); // Regride SSJ1

        personagem.carregarKi(); // +50 => 240
        personagem.transformar(); // Vira SSJ2
        personagem.carregarKi(); // +50 => 290
        personagem.transformar(); // Vira SSJ3
        personagem.atacar(); // -40 Ki, 250 KI
        personagem.verificarKI(); // VERIFICA KI

        personagem.carregarKi(); // +50 => 300
        personagem.transformar(); // Vira SSJ Blue
        personagem.carregarKi(); // +50 => 350
        personagem.atacar(); // -50 Ki
        personagem.verificarKI(); // VERIFICA KI
        
        personagem.carregarKi(); // +50 => 350
        personagem.transformar(); // Vira SSJ God
        personagem.atacar(); // -60 Ki
        personagem.verificarKI(); // Regride SSJ3

        // Descansa: volta à forma normal
        personagem.descansar();

        // Testa morte
        personagem.levarDano(personagem.getVida());
        personagem.verificarKI(); // Entra no estado de Morte
    }

}
