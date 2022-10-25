package segundageneracion;

public interface Murcielago extends Mamifero{

    void volar();

    default void comerFrutas(){
        System.out.println("Soy vegano");
    }


    static void haceChichi(){
        System.out.println("Hace Chichi");
    }
}
