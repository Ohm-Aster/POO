/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesObjetos;

/**
 *
 * @author OHMASTER
 */
public class coche {
    String color;
    String marca;
    int km;
    
    public static void main(String[] args) {
        coche coche1 = new coche();
        
        coche1.color = "negro";
        coche1.marca = "toyota";
        coche1.km = 20;
        
        System.out.println("el color del automovil es: "+coche1.color);
        System.out.println("la marca del automovil es: "+coche1.marca);
        System.out.println("el kilometraje al momento es: "+coche1.km);
        
        coche coche2 = new coche();
        
        coche2.color = "verde";
        coche2.marca = "ford";
        coche2.km = 0;
        
        System.out.println("el color del automovil es: "+coche2.color);
        System.out.println("la marca del automovil es: "+coche2.marca);
        System.out.println("el kilometraje al momento es: "+coche2.km);
        
    }
}
