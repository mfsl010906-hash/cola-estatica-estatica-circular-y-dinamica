# cola-estatica-estatica-circular-y-dinamica
**materia** tarea 2 unidad 3 estructura de datos
**institucion** instituto tecnologico superior de xalapa
**carrera** ingeneria en sistemas computacionales
**docente** victor hugo vasquez herrera
**practica** programacion en java:arquitetura modular, colas (estatica,circular y dinamica)
**alumna** maria fatima sanchez landa
# Práctica de Programación en Java: Arquitectura Modular, Colas (Estática, Circular y Dinámica)

---

## 📋 Descripción de la Práctica
Desarrollo bajo un enfoque estrictamente modular en Java que implementa y analiza tres variantes fundamentales de estructuras de datos tipo FIFO (*First In, First Out*):
1. **Cola Estática Lineal** (`ColaEstatica`) con operación `peek()`.
2. **Cola Estática Circular** (`ColaEstaticaCircular`) con operación `peek()`.
3. **Cola Dinámica** (`ColaDinamica`) basada en nodos enlazados, extendida con los métodos `peek()` y `contarElementos()`.

---

## 🗂️ Estructura del Proyecto
El proyecto está organizado de manera modular separando cada tipo de cola y su respectiva clase `Main` independiente:

```text
src/
│
├── Estructuras_lineales/
│   ├── Nodo.java
│   └── COLA/
│       ├── colaEstatica.java
│       ├── Main.java
│       ├── colaEstaticaCircular.java
│       ├── MainColaEstaticaCircular.java
│       ├── ColaDinamica.java
│       └── MainColaDinamica.java
```
---

## ⚙️ Clases Principales e Implementación

1. **Cola Estática** (`colaEstatica.java`): Utiliza un arreglo estático de tamaño fijo con apuntadores de frente y fin. Incluye métodos de inserción (enqueue), extracción (dequeue), consulta frontal (peek) y visualización (mostrar).
2. **Cola Estática Circular** (`colaEstaticaCircular.java`): Optimiza el uso del arreglo fijo mediante aritmética modular, permitiendo reutilizar las posiciones libres al desencolar elementos y evitando el falso desbordamiento.
3. **Cola Dinámica** (`ColaDinamica.java`): Implementada mediante nodos enlazados (Nodo). No tiene una capacidad fija predefinida y crece o decrece de forma dinámica en tiempo de ejecución. Cuenta con métodos de análisis como contarElementos() mediante recorrido y consulta con peek().

---

## 🛠️ Instrucciones para Compilar y Ejecutar

### Desde la Terminal/Consola

1. Clonar el repositorio y acceder a la carpeta del proyecto:
   ´´´bash
   git clone <https://github.com/mfsl010906-hash/cola-estatica-estatica-circular-y-dinamica.git>
   cd <cola-estatica-estatica-circular-y-dinamica>
   ´´´

2. Compilar los archivos fuente:
   ´´´bash
   java *.java
   ´´´

3. Ejecutar las clases de prueba:
   - Para probar la **cola Estatica:**
     ```bash
     java Main
     ```
   - Para probar la **cola Estatica Circular:**
     ```bash
     java MainColaEstaticaCircular
     ``` 
   - para probar la **cola Dinamica:**
     ```bash
     java MainColaDinamica
     ```
---
## conclucion

La cola estática es útil en contextos muy simples, pero su incapacidad para reutilizar espacio desencolado la vuelve ineficiente.

La cola estática circular soluciona de forma elegante el desperdicio de memoria utilizando la aritmética modular, siendo la mejor opción cuando se conoce el límite máximo de elementos a procesar y se busca un rendimiento óptimo de memoria contigua.

La cola dinámica ofrece máxima flexibilidad para sistemas con alta variabilidad en el volumen de datos, eliminando restricciones de capacidad predefinidas gracias al uso de referencias enlazadas.


