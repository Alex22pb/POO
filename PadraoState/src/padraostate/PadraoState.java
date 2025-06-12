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

//        personagem.atacar();        
//        personagem.carregarKi();    
//        personagem.transformar();   
//        personagem.atacar();      
//        personagem.transformar();  
//        personagem.carregarKi();
//        personagem.transformar();  
//        personagem.atacar();
//        personagem.descansar();

        
        personagem.carregarKi();  
        personagem.transformar(); 
        personagem.transformar(); 
        personagem.carregarKi(); 
        personagem.transformar(); 
        personagem.transformar(); 
        personagem.atacar();      
        personagem.verificarKI(); 
    }

}
