package Ejercicio5;

/*
 * EXPLICACIÓN - CASOS DE PRUEBA UTILIZADOS:
 * 1. Caso Normal: Gerente con salario Q5000 y bono Q1000. Se espera un total de Q6000.
 * 2. Caso Límite (Salario 0): Verifica que el bono se sume correctamente incluso sin base.
 * 3. Caso de Error: Se ingresan valores negativos para comprobar que la validación 
 * del constructor y del método sobrescrito protejan los datos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(" PRUEBA 1: GERENTE DE PROYECTOS");
        Gerente g1 = new Gerente("Samuel Tema", 5000.0, 1000.0);
        g1.mostrarDatos();

        System.out.println("PRUEBA 2: GERENTE CON SALARIO NEGATIVO");
        // Debería ajustar el salario a 0 y sumar solo el bono (si es positivo)
        Gerente g2 = new Gerente("Prueba Error", -2000.0, 500.0);
        g2.mostrarDatos();
        
        System.out.println("PRUEBA 3: BONO NEGATIVO EXTREMO");
        Gerente g3 = new Gerente("Marta Lopez", 1000.0, -1500.0);
        g3.mostrarDatos();
    }
}