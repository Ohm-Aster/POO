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
public class Rectangulo {
    public double largo;
    public double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getArea() {
        return largo * ancho;
    }

    public double getPerimetro() {
        return 2 * (largo + ancho);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el largo: ");
        double largo = sc.nextDouble();
        System.out.println("ingresa el ancho: ");
        double ancho = sc.nextDouble();
        Rectangulo rec = new Rectangulo(largo, ancho);
        double area = rec.getArea();
        double perimetro = rec.getPerimetro();

        System.out.println("el area es: " + area);
        System.out.println("el perimetro es: " + perimetro);
    }

}
