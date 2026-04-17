package Ejercicio3;
import java.time.LocalDate;

/*
 * EXPLICACIÓN - CASOS DE PRUEBA UTILIZADOS:
 * 1. Producto Vigente: Se crea un producto con fecha de vencimiento en el futuro 
 * (año 2027) para verificar que la validación lo marque como vigente.
 * 2. Producto Vencido: Se crea un producto con fecha del año pasado (2023) 
 * para comprobar que el método estaVencido() detecta el error de caducidad.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBA 1: PRODUCTO EN BUEN ESTADO ");
        // LocalDate.of(año, mes, día)
        ProductoPerecedero leche = new ProductoPerecedero("Leche Entera", LocalDate.of(2027, 5, 20));
        leche.mostrarDetalles();

        System.out.println("PRUEBA 2: PRODUCTO CADUCADO ");
        ProductoPerecedero yogurt = new ProductoPerecedero("Yogurt Griego", LocalDate.of(2023, 1, 10));
        yogurt.mostrarDetalles();
    }
}