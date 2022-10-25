package primerageneracion;

public abstract class Vampiro {
    //Atributos de la clase Vampiro
    private String nombre;
    private int edad;

    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Métodos de la clase Vampiro
    public void morder() {
        System.out.println("¡Vampiro mordiendo!");
    }

    public abstract void chuparSangre() ;

  public static void aguantarSol(){
        System.out.println("Nada de nervios..");
    }


}
