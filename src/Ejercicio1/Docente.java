package Ejercicio1;
/*
 * EXPLICACIÓN:
 * 1. Herencia: Se aplica mediante 'extends Persona'.
 * 2. Uso de super: Se usa super(nombre, edad) en el constructor para inicializar al padre.
 * 3. Sobrescritura: Se sobrescribe el método mostrar() para añadir la especialidad.
 */

public class Docente extends Persona {
private String especialidad ;

public Docente(String nombre, int edad, String especialidad) {
	super(nombre, edad);
	this.especialidad = especialidad;
}

@Override
public void mostrar() {
	super.mostrar();
	System.out.println ("Especialidad:" + especialidad );
}

}

