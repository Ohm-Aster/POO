/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParametrosCalc;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el dato 1 ");
        int n1=sc.nextInt();
        System.out.println("ingresa el dato 2 ");
        int n2=sc.nextInt();
        
        datos op = new datos();
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.resultados();
    }
}
