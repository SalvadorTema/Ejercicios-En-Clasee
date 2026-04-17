package Ejercicio10;

/*
 * USO DE SUPER: Se usa para inicializar numero, cliente y total en la clase padre.
 * SOBRESCRITURA: Se resta el descuento al total original.
 */
public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        double finalTotal = total - descuento;
        // VALIDACIÓN: El total no sea negativo
        return (finalTotal < 0) ? 0 : finalTotal;
    }
}