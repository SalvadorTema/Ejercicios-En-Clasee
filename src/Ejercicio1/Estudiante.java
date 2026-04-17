package Ejercicio1;
/*
 * EXPLICACIÓN:
 * 1. Herencia: Hereda de Persona todos sus atributos básicos.
 * 2. Sobrescritura: El método mostrar() incluye una validación de seguridad.
 * 3. Validación: Se verifica que el carnet no sea nulo o vacío antes de mostrar datos.
 */
public class Estudiante extends Persona {
    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad);
        this.carnet = carnet;
    }

    @Override
    public void mostrar() {
        
        if (carnet != null && !carnet.isEmpty()) {
            super.mostrar();
            System.out.println("Carnet: " + carnet);
        } else {
            System.out.println("Error: El estudiante no tiene carnet asignado.");
        }
    }
}