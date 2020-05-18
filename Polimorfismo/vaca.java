/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;
/**
 *
 * @author OHMASTER
 */
public class vaca extends animales{
    public String sonido;
    public String alimento;
    public String nombre;
    public vaca( String nombre, String alimento, String sonido, char tam, int patas) {
        super( tam, patas);
        this.sonido= sonido;
        this.alimento=alimento;
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getSonido() {
        return sonido;
    }
    public String getAlimento() {
        return alimento;
    }
    @Override
    public String datos() {
        return "Soy "+nombre+" de tamaño "+tam+
                " tengo "+patas+" patas me alimento de "+alimento+
                " y hago "+sonido;
    }
}
