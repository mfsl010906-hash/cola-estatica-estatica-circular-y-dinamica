public class MainColaEstaticaCircular {
    public static void main(String[] args) {
        colaEstaticaCircular cola = new colaEstaticaCircular(5);

        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");

        System.out.println("\n--- Fila actual ---");
        cola.mostrar();

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        cola.enqueue(50);

        System.out.println("\n--- Fila actual ---");
        cola.mostrar();

        System.out.println("\n--- Atendiendo (Dequeue) ---");
        cola.dequeue();
        cola.dequeue();

        System.out.println("\n--- Fila después de atender ---");
        cola.mostrar();

        System.out.println("\n--- Agregando más (Efecto circular) ---");
        cola.enqueue(60);
        cola.enqueue(70);

        System.out.println("\n--- Estado final ---");
        cola.mostrar();
    }
}