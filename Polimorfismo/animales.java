/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author OHMASTER
 */
public class animales {
    public char tam;
    public int patas;

    public animales( char tam, int patas) {
        this.tam = tam;
        this.patas = patas;
    }
    public char getTam() {
        return tam;
    }
    public int getPatas() {
        return patas;
    }
    public String datos() {
        return "Soy de tamaño "+tam+" tengo "+patas+" patas";
    }
}
