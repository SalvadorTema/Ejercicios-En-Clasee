package Ejercicio10;

/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Esta es la clase base que contiene los datos comunes (numero, cliente, total).
 * Permite que FacturaContado y FacturaCredito hereden la estructura básica.
 */
public class Factura {
    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total;
    }

    public double calcularTotal() {
        return total;
    }
}