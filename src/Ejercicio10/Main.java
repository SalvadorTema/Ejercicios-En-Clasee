package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Alexander Tema", "1234567-K");

        System.out.println("PRUEBA FACTURA CONTADO (CON DESCUENTO)");
        FacturaContado f1 = new FacturaContado(101, c, 500.0, 50.0);
        System.out.println("Total Final: Q" + f1.calcularTotal());

        System.out.println(" PRUEBA FACTURA CRÉDITO (CON RECARGO) ");
        FacturaCredito f2 = new FacturaCredito(102, c, 1000.0, 150.0, 3);
        System.out.println("Total Final: Q" + f2.calcularTotal());
    }
}