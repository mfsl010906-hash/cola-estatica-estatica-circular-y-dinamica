public class colaEstatica {

    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;

    // El constructor recibe el tamaño estático al momento de crear el objeto
    public colaEstatica(int tamano) { // tamaño variable temporal que entra
        this.capacidad = tamano; // definimos capacidad = tamaño
        this.arreglo = new int[this.capacidad]; // aquí es donde definimos el...
        this.frente = 0; // inicializamos frente, el que está al inicio
        this.fin = -1; // inicializamos fin, número fantasma
    }

    public void enqueue(int valor) { // agregar un elemento al final de la cola
        if (fin == capacidad - 1) { // cuando la fila esta llena
            System.out.println("Error: La cola está llena.");
        } else {
            fin++; // actualizamos la fila
            arreglo[fin] = valor; // agregamos al arreglo
            System.out.println("Entró a la fila: " + valor); // imprimimos
        }
    }

    public void dequeue() { // saca al primero de la fila
        if (frente > fin) { // si frente llega a ser mayor que fin la fila se vacia
            System.out.println("Error: La cola está vacía.");
        } else {
            System.out.println("Atendido y fuera: " + arreglo[frente]); // atiende e imprime
            frente++; // actualiza frente cuando se atiende un elemento de la fila
        }
    }

    public void mostrar() {
        if (frente > fin) {
            System.out.println("La cola está vacía.");
            return; // ya no hace nada de lo de abajo
        }

        System.out.print("Fila actual: ");
        for (int i = frente; i <= fin; i++) { // DESDE EL INICIO DE LA FILA HASTA EL FINAL
            System.out.print(arreglo[i] + " "); // IMPRIMIMOS EL ARREGLO.
        }
        System.out.println();
    }
    public int peek() {
        if (frente > fin) {
            System.out.println("error: la cola esta vacia.");
            return -1;
        }
        return arreglo[frente];
    }
}
