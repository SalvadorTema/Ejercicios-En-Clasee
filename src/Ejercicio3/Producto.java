package Ejercicio3;

/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Se define la clase base 'Producto' con atributos protegidos (nombre).
 * Esto permite que cualquier producto especializado (como el perecedero) 
 * herede la identidad del objeto y añada su propia lógica de vencimiento.
 */

public class Producto {
protected String nombre;

public Producto(String nombre) {
	super();
	this.nombre = nombre;
}

public void mostrarDetalles () {
	System.out.println("Prdocuto:"+ nombre);
	
}
}
