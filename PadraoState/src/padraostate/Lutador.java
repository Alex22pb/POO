/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraostate;

/**
 *
 * @author 2022222760020
 */
public class Lutador {
    protected LutadorState estado;
    
    String nome;
    int ki;
    int vida;
    int ataquesConsecutivos = 0;

    public Lutador(String nome, int ki, int vida) {
        this.nome = nome;
        this.ki = ki;
        this.vida = vida;
        this.estado = new FormaNormal(this);
    }

    public String getNome() {
        return nome;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaquesConsecutivos() {
        return ataquesConsecutivos;
    }

    public void setAtaquesConsecutivos(int ataquesConsecutivos) {
        this.ataquesConsecutivos = ataquesConsecutivos;
    }
    
    public void levarDano(int dano){
        estado = estado.levarDano(dano);
    }
    
    public void verificarKI(){
        estado = estado.verificarKI();
    }
    
    public void atacar(){
        estado = estado.atacar();
    }
    
    public void descansar(){
        System.out.println("Descansando, recuperando vida...");
        this.setVida(this.getVida() + 10);
    }
    
    public void carregarKi() {
        estado = estado.carregarKI();
    }
}
