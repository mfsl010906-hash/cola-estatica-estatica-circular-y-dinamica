public class Main {

    public static void main(String[] args) {
        // Creamos una cola con espacio para 3 personas/elementos
        colaEstatica miCola = new colaEstatica(3);

        // Metemos Elementos
        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);

        // Vemos como queda la fila
        miCola.mostrar();

        // Atendemos el primero
        miCola.dequeue();

        // Vemos cómo quedó la fila después de atender
        miCola.mostrar();
    }
}