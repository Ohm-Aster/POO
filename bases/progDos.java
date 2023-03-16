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
public class progDos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] matriz = new char[5][5];
       
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==j || (i+j==4)){
                    matriz[i][j]='*';
                }else{
                    matriz[i][j]=' ';
                } 
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+" ");
            }System.out.println(" ");
        }
    }
}
