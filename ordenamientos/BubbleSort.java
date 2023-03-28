/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author OHM-ASTER
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] v={4,8,2,5,1,82,99,21,33};
        int temp=v[0];
        System.out.println("arreglo original");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" ["+v[i]+"]");    
        }
        System.out.println("ordenamiento burbuja...");
        for (int i = 0; i < v.length-1; i++) {
            for (int j = 0; j < v.length-i-1; j++) {
                if(v[j]>v[j+1]){
                    temp=v[j];
                    v[j]=v[j+1];
                    v[j+1]=temp;
                }                
            }          
        }
        System.out.println("arreglo ordenado");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" ["+v[i]+"]");    
        }
    }
}
