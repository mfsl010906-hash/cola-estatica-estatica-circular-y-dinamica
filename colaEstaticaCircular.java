public class colaEstaticaCircular {
    private int[] arreglo;
    private int capacidad;
    private int frente;
    private int fin;

    // NOTA: Se agregó este atributo 'tamaño' para llevar el control exacto de elementos y evitar que 'fin' colapse.
    private int tamaño;

    // Constructor
    public colaEstaticaCircular(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0; // NOTA: Arranca en 0 porque la cola empieza vacía
    }

    // Método para meter gente (enqueue)
    public void enqueue(int valor) {
        // NOTA: Validación infalible usando el tamaño actual
        if (tamaño == capacidad) {
            System.out.println("Error: La cola está llena.");
            return; // Si está llena la cola, retorna
        }

        // El truco de la vuelta al ruedo con módulo
        fin = (fin + 1) % capacidad; // Avanza el apuntador una posición
        arreglo[fin] = valor;        // En esa posición ya calculada, guarda el valor

        // Cada que entra alguien, sumamos uno al tamaño
        tamaño++;
        System.out.println("Entró a la fila: " + valor);
    }

    // Método para atender gente (dequeue)
    public int dequeue() {
        // NOTA: Validación de vacía con el tamaño
        if (tamaño == 0) {
            System.out.println("Error: La cola está vacía.");
            return -1; // Retornamos un entero por el tipo de método int
        }

        int atendido = arreglo[frente]; // El que está en frente lo guardamos en atendido
        frente = (frente + 1) % capacidad; // Usar el módulo para dar la vuelta y regresar al 0 automáticamente

        // Cada que sale alguien, restamos uno al tamaño
        tamaño--;

        System.out.println("Atendido y fuera: " + atendido);
        return atendido; // Retorna la variable atendido
    }

    // Método para mostrar la fila actual
    public void mostrar() {
        if (tamaño == 0) { // Si el tamaño es igual a cero, retorna
            System.out.println("La cola está vacía.");
            return;
        }

        System.out.print("Fila actual: ");
        // NOTA: Usamos el tamaño para fijar el límite del ciclo de impresión circular
        for (int i = 0; i < tamaño; i++) {
            int indice = (frente + i) % capacidad; // Asegurándose de imprimir a todos en el orden exacto
            System.out.print(arreglo[indice] + " ");
        }
        System.out.println();
    }
    public int peek() {
        //valida si la cola ets vacia
        if (tamaño == 0) {
            System.out.println("error: la cola esta vacia.");
            return -1;
        }
        //retorna el elemento que se encuentra enfrente sin modificar los apuntadores
        return arreglo[frente];
    }
}