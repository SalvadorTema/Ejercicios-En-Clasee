package Ejercicio9;

/*
 * EXPLICACIÓN - CASOS DE PRUEBA UTILIZADOS:
 * 1. Libro Digital Válido: Se crea un objeto con datos reales para verificar 
 * la correcta integración de la herencia y la sobrescritura.
 * 2. Validación de Tamaño: Se ingresa un valor negativo o cero para comprobar 
 * que el método sobrescrito gestiona correctamente el error de datos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBA 1: LIBRO DIGITAL");
        LibroDigital libro1 = new LibroDigital("Cien Años de Soledad", "G. García Márquez", 2.5);
        libro1.mostrarInfo();

        System.out.println("PRUEBA 2: ERROR DE TAMAÑO");
        LibroDigital libro2 = new LibroDigital("Java para Principiantes", "Desconocido", -1.0);
        libro2.mostrarInfo();
    }
}