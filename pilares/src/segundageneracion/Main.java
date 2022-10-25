package segundageneracion;

import primerageneracion.Vampiro;

public class Main {
    public static void main(String[] args) {
    Dracula obj1= new Dracula("Vladimir",600,190);
        obj1.morder();//poder del vampiro
        obj1.chuparSangre();//poder del vampiro
        obj1.hipnotizar();//poder de Dracula
        obj1.aguantarSol();//poder
        obj1.comerFrutas();
        obj1.volar();





        Vampiro obj2 = new Vampiro("Oto",1000) {
            @Override
            public void chuparSangre() {

            }
        };
        obj2.morder();
        obj2.chuparSangre();
        obj2.aguantarSol();//poder del vampiro


        Murcielago.haceChichi();

    }
}
