package Ejercicio7;

/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Se crea la clase base 'Vehiculo' para definir atributos generales (marca).
 * La herencia permite que tipos específicos como 'Moto' utilicen esta base,
 * promoviendo la reutilización y organización del código.
 */
public class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo Marca: " + marca);
    }
}