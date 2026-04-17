package Ejercicio2;

/*
 * EXPLICACIÓN:
 * 1. Sobrescritura: Se cambia el comportamiento de retirar() para usar el sobregiro.
 * 2. Uso de super: Llama al constructor del padre.
 */
public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        // VALIDACIÓN: El total retirado no puede exceder saldo + sobregiro
        if (monto <= (saldo + limiteSobregiro)) {
            saldo -= monto;
            System.out.println("Retiro procesado (Sobregiro). Nuevo saldo: Q" + saldo);
        } else {
            System.out.println("Error: Excede el limite de sobregiro.");
        }
    }
}