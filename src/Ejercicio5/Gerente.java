package Ejercicio5;

/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * 1. calcularSalario(): Se sobrescribe para sumar el 'bonoAdicional' al salario base.
 * * USO DE SUPER: Se usa super() para inicializar los datos en el padre y se accede 
 * a la variable protegida 'salario' para realizar el cálculo del nuevo monto.
 */
public class Gerente extends Empleado {
    private double bonoAdicional;

    public Gerente(String nombre, double salario, double bonoAdicional) {
        super(nombre, salario);
        this.bonoAdicional = bonoAdicional;
    }

    @Override
    public double calcularSalario() {
        double total = salario + bonoAdicional;
        // VALIDACIÓN: Verificar que el total a pagar sea coherente
        if (total < 0) {
            return 0.0;
        }
        return total;
    }

    public void mostrarDatos() {
        System.out.println("Gerente: " + nombre);
        System.out.println("Pago total: Q" + calcularSalario());
    }
}