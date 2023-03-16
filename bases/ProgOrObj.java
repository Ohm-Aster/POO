package bases;

import java.util.Scanner;

public class ProgOrObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //crear el array
        int[] numeros = new int[5];
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("ingresa el valor de la posicion: " + i);
            numeros[i] = sc.nextInt();
            suma = suma + numeros[i];
        }
        System.out.println("la suma de los valores es: " + suma);

        /* System.out.println("ingresa una palabra");
        //int a=sc.nextInt();  nuero entero
        //char a=sc.next().charAt(0); // caracter
        //String a=sc.nextLine(); // cadena de caracteres
        
        System.out.println("el valor ingresado es: "+a);
        
        
         */
    }
    /*int[] numeros = {2, 4, 6, 8, 10};
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("el resultado de la suma es: "+ suma);
    }*/
}
