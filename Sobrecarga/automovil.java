/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sobrecarga;

/**
 *
 * @author OHMASTER
 */
public class automovil {
    //atributos
    String marca;
    String modelo;
    String color;
    int precio; 
    int km;
    
    //metodos
    public automovil(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public automovil(String color, int precio, int km){
        this.color = color;
        this.precio = precio;
        this.km = km;
    }
    
    //constructores
    public void datos(){
        System.out.println("\ndatos del automovil \nmarca: "+marca+"\nmodelo: "+modelo);
    }
    public void datos(String color, int precio, int km){
        System.out.println("color: "+color+"\nprecio: "+precio+"\nkm"+km);
    }
    
}
