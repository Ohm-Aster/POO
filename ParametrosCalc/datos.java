/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParametrosCalc;

/**
 *
 * @author OHMASTER
 */
public class datos {
    //atributos, variables globales
    int suma;
    int resta;
    int multiplicacion;
    //metodos
    public void sumar(int a, int b){
        suma = a + b;
    }
    public void restar(int a, int b){
        resta = a - b;
    }
    public void multiplicar(int a, int b){
        multiplicacion = a*b;
    }
    public void resultados(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
    }
    
}
