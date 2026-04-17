package Ejercicio10;

/*
 * SOBRESCRITURA: Se aplica un recargo al total.
 * ENCAPSULAMIENTO: Atributos privados para seguridad de datos.
 */
public class FacturaCredito extends Factura {
    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public double calcularTotal() {
        double finalTotal = total + recargo;
        return (finalTotal < 0) ? 0 : finalTotal;
    }
}