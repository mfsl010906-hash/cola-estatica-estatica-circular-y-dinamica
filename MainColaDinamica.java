public class MainColaDinamica {
    public static void main(String[] args) {
        colaDinamica cola = new colaDinamica();

        System.out.println("PRUEBA DE COLA DINÁMICA");
        cola.encolar(100);
        cola.encolar(200);
        cola.encolar(300);

        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Total de elementos en la cola: " + cola.contarElementos());

        cola.desencolar();
        cola.mostrar();
        System.out.println("Nuevo elemento al frente (peek): " + cola.peek());
        System.out.println("Total de elementos actualizados: " + cola.contarElementos());
    }
}