package Ejercicio6;

/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Se define la clase base 'Animal'. La herencia permite que cualquier animal 
 * específico comparta un comportamiento base (hacerSonido), pero permite que 
 * cada especie tenga su propia implementación. Se usa 'protected' en el nombre
 * para que las clases hijas lo hereden directamente.
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}