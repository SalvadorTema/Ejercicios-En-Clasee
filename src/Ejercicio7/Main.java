package Ejercicio7;

/*
 * EXPLICACIÓN - CASOS DE PRUEBA UTILIZADOS:
 * 1. Moto Estándar: Se prueba una moto con marca y cilindraje válidos para 
 * confirmar que la herencia y sobrescritura funcionan.
 * 2. Validación de Cilindraje: Se ingresa un valor de 0 para verificar que 
 * el método @Override maneje el error mediante la validación lógica.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBA 1: MOTO DEPORTIVA");
        Moto m1 = new Moto("Yamaha", 600);
        m1.mostrarInfo();

        System.out.println("PRUEBA 2: ERROR DE DATOS");
        Moto m2 = new Moto("Suzuki", 0);
        m2.mostrarInfo();
    }
}