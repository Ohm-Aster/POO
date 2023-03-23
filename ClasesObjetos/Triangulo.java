/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class Triangulo {
    public double base;
    public double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea(){
        double Area= (base*altura)/2;
        return Area;
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        System.out.println("ingresa la base: ");
        double b=sc.nextDouble();
        System.out.println("ingresa la altura: ");
        double h=sc.nextDouble();
        
        Triangulo tri=new Triangulo(b,h);
        
        double area=tri.getArea();
        
        System.out.println("el area del triangulo es: "+ area);
        
        
    }
    
}
