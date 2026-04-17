package Ejercicio6;

/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * 1. hacerSonido(): Se aplica la anotación @Override para redefinir el sonido 
 * genérico por uno específico ("Guau Guau"). 
 * * USO DE SUPER: Se utiliza super(nombre) para invocar al constructor de la 
 * clase Animal y asegurar que el nombre del perro se guarde correctamente.
 */
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre); // Pasa el nombre al constructor del padre
    }

    @Override
    public void hacerSonido() {
        // VALIDACIÓN LÓGICA: Identifica al animal antes de emitir sonido
        System.out.println(nombre + " (Perro) dice: ¡Guau Guau!");
    }
}