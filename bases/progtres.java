/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bases;

import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class progtres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt, a, b, c;
        do {
            System.out.println("1 sumar\n"
                    + "2 restar\n"
                    + "3 multiplicar\n"
                    + "4 salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    System.out.println("numero 1: ");
                    a = sc.nextInt();
                    System.out.println("numero 2: ");
                    b = sc.nextInt();
                    c = a + b;
                    System.out.println("el resultado es: " + c);
                    break;
                case 2:
                    System.out.println("numero 1: ");
                    a = sc.nextInt();
                    System.out.println("numero 2: ");
                    b = sc.nextInt();
                    c = a - b;
                    System.out.println("el resultado es: " + c);
                    break;
                case 3:
                    System.out.println("numero 1: ");
                    a = sc.nextInt();
                    System.out.println("numero 2: ");
                    b = sc.nextInt();
                    c = a * b;
                    System.out.println("el resultado es: " + c);
                    break;
            }
        } while (opt != 4);
    }
}
