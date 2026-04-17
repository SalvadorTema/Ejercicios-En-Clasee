package Ejercicio2;

/*
 * EXPLICACIÓN:
 * 1. Herencia: Clase base para el sistema bancario.
 * 2. Encapsulamiento: Atributo protected para que el hijo lo herede.
 */
public class Cuenta {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        // VALIDACIÓN: Saldo no negativo
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo: Q" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}