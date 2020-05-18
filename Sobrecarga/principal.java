/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sobrecarga;

/**
 *
 * @author OHMASTER
 */
public class principal {
    public static void main(String[] args) {
        automovil A1 = new automovil("Model 3", "Tesla");
        A1.datos();
        A1.datos("Rojo", 1000000, 0);
    }
}
