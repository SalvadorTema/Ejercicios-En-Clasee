package Ejercicio4;
/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Se crea la clase base 'Transporte' que centraliza el atributo 'capacidad'.
 * Al usar herencia, cualquier tipo de transporte específico (como un Bus) 
 * hereda esta propiedad, evitando duplicar código y permitiendo una 
 * estructura jerárquica clara.
 */

public class Transporte {
	protected int capacidad;

	public Transporte(int capacidad) {
        // VALIDACIÓN: La capacidad no puede ser negativa
        if (capacidad >= 0) {
            this.capacidad = capacidad;
        } else {
            this.capacidad = 0;
            System.out.println("Aviso: Capacidad negativa detectada, ajustada a 0.");
        }
        
    }
	public void descripcion() {
        System.out.println("Transporte con capacidad para " + capacidad + " personas.");
    }
}

