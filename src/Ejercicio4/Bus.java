package Ejercicio4;
/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * 1. descripcion(): Se sobrescribe para añadir la información específica 
 * de la 'ruta' que recorre el bus.
 * * USO DE SUPER: Se utiliza super(capacidad) en el constructor para pasar 
 * el valor a la clase padre y super.descripcion() para imprimir la 
 * base de la información antes de añadir el detalle de la ruta.
 */

public class Bus extends Transporte{
private String ruta;

public Bus(int capacidad, String ruta) {
	super(capacidad);
	this.ruta = ruta;
}

@Override
public void descripcion() {
	super.descripcion();
	System.out.println ("Ruta asiganada:"+ ruta);
	//Validacion 
    if (ruta == null || ruta.isEmpty()) {
        System.out.println("ALERTA: Este bus no tiene una ruta definida todavía.");
    }
}
}
