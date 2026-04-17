package Ejercicio7;

/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * 1. mostrarInfo(): Se redefinió para incluir el tipo de cilindraje.
 * * USO DE SUPER: Se usa super(marca) para enviar el dato al constructor del padre
 * y super.mostrarInfo() para no repetir la lógica de impresión de la marca.
 */
public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, int cilindraje) {
        super(marca);
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        // VALIDACIÓN: El cilindraje debe ser un valor lógico
        if (cilindraje > 0) {
            System.out.println("Tipo: Motocicleta | Cilindraje: " + cilindraje + "cc");
        } else {
            System.out.println("Tipo: Motocicleta | Cilindraje: No especificado correctamente.");
        }
    }
}