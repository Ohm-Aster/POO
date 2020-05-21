/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetSet;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println(" ingresa tu apellido");
        String apellido = sc.nextLine();
        System.out.println(" ingresa edad");
        int edad = sc.nextInt();
        
        empleado e1 = new empleado(nombre, apellido, edad);
        e1.datos();
    
    }
}
