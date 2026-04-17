package Ejercicio8;

/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * Se sobrescribe calcularArea() para aplicar la fórmula: base * altura.
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        // VALIDACIÓN: El área no puede ser negativa
        return (area < 0) ? 0 : area;
    }
}