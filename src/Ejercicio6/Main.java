package Ejercicio6;

/*
 * EXPLICACIÓN - CASOS DE PRUEBA UTILIZADOS:
 * 1. Objeto Animal: Se instancia un animal genérico para verificar que 
 * el método base funciona correctamente.
 * 2. Objeto Perro (Sobrescritura): Se instancia un perro para verificar 
 * que @Override reemplaza exitosamente el sonido genérico por el ladrido.
 * 3. Validación de Nombre: Se comprueba que el nombre pasado mediante 
 * 'super' se imprime correctamente en la consola.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CASO DE PRUEBA 1: ANIMAL GENÉRICO");
        Animal animal1 = new Animal("Cosa");
        animal1.hacerSonido();

        System.out.println("CASO DE PRUEBA 2: PERRO (SOBRESCRITURA)");
        Perro miPerro = new Perro("Firulais");
        miPerro.hacerSonido();
    }
}