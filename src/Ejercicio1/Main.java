package Ejercicio1;
/*
 * CASOS DE PRUEBA UTILIZADOS:
 * 1. Creación de Docente: Se verifica que herede nombre/edad y muestre su especialidad.
 * 2. Creación de Estudiante con datos válidos.
 * 3. Creación de Estudiante con error (carnet vacío) para probar la validación del @Override.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(" EJECUTANDO CASO DE PRUEBA: DOCENTE ");
        Docente profe = new Docente("Alex", 35, "Programacion");
        profe.mostrar();

        System.out.println(" EJECUTANDO CASO DE PRUEBA: ESTUDIANTE VALIDO ");
        Estudiante alumno1 = new Estudiante("Luis", 20, "2024-001");
        alumno1.mostrar();

        System.out.println("EJECUTANDO CASO DE PRUEBA: ESTUDIANTE CON ERROR ");
      
        Estudiante alumnoError = new Estudiante("Pedro", 19, ""); 
        alumnoError.mostrar();
    }
}