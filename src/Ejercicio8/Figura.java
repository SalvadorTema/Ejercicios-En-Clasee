package Ejercicio8;

/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Se define 'Figura' como clase base. El método calcularArea() es genérico aquí
 * para que cada figura específica (hija) implemente su propia fórmula matemática,
 * permitiendo tratar a rectángulos y círculos como simples 'Figuras'.
 */
public class Figura {
    public double calcularArea() {
        return 0;
    }
}