package penalva.ale.ejercicios;

/**
 * Programa que muestra una tabla con dos columnas: inglés y castellano.
 * Cada fila contiene una palabra en inglés y su traducción al castellano.
 */
public class DosColumnas {

    public static void main(String[] args) {
        // Cabecera de la tabla
        System.out.printf("%-15s %s%n", "INGLÉS", "CASTELLANO");
        System.out.println("-----------------------------");

        // Cuerpo de la tabla
        System.out.printf("%-15s %s%n", "Bear", "Oso");
        System.out.printf("%-15s %s%n", "Dog", "Perro");
        System.out.printf("%-15s %s%n", "Cat", "Gato");
        System.out.printf("%-15s %s%n", "Horse", "Caballo");
        System.out.printf("%-15s %s%n", "Cow", "Vaca");
        System.out.printf("%-15s %s%n", "Elephant", "Elefante");
        System.out.printf("%-15s %s%n", "Camel", "Camello");
        System.out.printf("%-15s %s%n", "Fish", "Pez");
        System.out.printf("%-15s %s%n", "Rabbit", "Conejo");
    }
}
