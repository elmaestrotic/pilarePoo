package segundageneracion;


import primerageneracion.Vampiro;

public class Dracula extends Vampiro implements Murcielago {
    int talla;

    public Dracula(String nombre, int edad, int talla) {
        super(nombre, edad);
        this.talla = talla;//atributo particular de Dracula
    }

    void hipnotizar() {
        System.out.println("Hipnotizad@..");
    }

    @Override
    public void chuparSangre() {
        System.out.println("Dracula está alimentándose");
    }

    @Override
    public void amamantar() {

    }

    @Override
    public void volar() {
        System.out.println("Volando con ecolocalización");
    }
}
