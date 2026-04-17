package Ejercicio5;

/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Se define la clase 'Empleado' como base para la jerarquía. 
 * Aplicamos herencia permitiendo que 'Gerente' herede atributos comunes como 
 * 'nombre' y 'salario', facilitando la reutilización de código y la lógica base de pagos.
 */
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        // VALIDACIÓN: El salario base no debe ser negativo
        if (salario >= 0) {
            this.salario = salario;
        } else {
            this.salario = 0;
            System.out.println("Aviso: Salario negativo ajustado a 0.");
        }
    }

    public double calcularSalario() {
        return salario;
    }
}