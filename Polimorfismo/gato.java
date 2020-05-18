package Polimorfismo;
/**
 *
 * @author OHMASTER
 */
public class gato extends animales{
    public String sonido;
    public String nombre;
    public gato( String nombre, String sonido,  char tam, int patas) {
        super( tam, patas);
        this.sonido= sonido;
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getSonido() {
        return sonido;
    }
    @Override
    public String datos() {
        return "Soy "+nombre+" de tamaño "+tam+
                " tengo "+patas+" patas y hago "+sonido;
    }
}
