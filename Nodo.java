public class Nodo {
    int dato;
    Nodo siguiente; // la flachita que apunta al de abajo //tiene que ser de la misma clase.

    //constructor del nodo
    public Nodo(int x) {
        this.dato = x; // para que nasca con un valor y no con basura.
        this.siguiente = null; //al nacer, no apunta a nadie todavia
    }
}
