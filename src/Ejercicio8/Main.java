package Ejercicio8;

/*
 * EXPLICACIÓN - CASOS DE PRUEBA UTILIZADOS:
 * 1. Rectángulo: Se calcula el área con base 5 y altura 10 (Esperado: 50).
 * 2. Círculo: Se calcula el área con radio 3 (Esperado: ~28.27).
 * Se demuestra cómo ambas clases responden al mismo método de forma distinta.
 */
public class Main {
    public static void main(String[] args) {
        Figura rect = new Rectangulo(5, 10);
        Figura circ = new Circulo(3);

        System.out.println("CÁLCULO DE ÁREAS");
        System.out.println("Área del Rectángulo: " + rect.calcularArea());
        System.out.println("Área del Círculo: " + circ.calcularArea());
    }
}