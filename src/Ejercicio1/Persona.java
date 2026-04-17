package Ejercicio1;
/*
 * EXPLICACIÓN:
 * 1. Herencia: Esta es la clase base Padre que contiene los atributos comunes.
 * 2. Encapsulamiento: Usamos 'protected' para que las clases hijas puedan 
 * acceder a 'nombre' y 'edad' directamente, pero manteniéndolos protegidos del exterior.
 */
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}