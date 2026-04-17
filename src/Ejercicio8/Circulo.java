package Ejercicio8;

/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * Se sobrescribe calcularArea() usando la fórmula: π * radio².
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // Uso de Math.PI y Math.pow para precisión técnica
        double area = Math.PI * Math.pow(radio, 2);
        return (area < 0) ? 0 : area;
    }
}