package Ejercicio9;

/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * 1. mostrarInfo(): Se sobrescribe para incluir el tamaño del archivo en MB.
 * * USO DE SUPER: Se utiliza super(titulo, autor) para inicializar los datos en el 
 * constructor del padre y super.mostrarInfo() para imprimir la base del mensaje.
 */
public class LibroDigital extends Libro {
    private double tamañoMB;

    public LibroDigital(String titulo, String autor, double tamañoMB) {
        super(titulo, autor);
        this.tamañoMB = tamañoMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        // VALIDACIÓN: El tamaño en MB debe ser un valor positivo
        if (tamañoMB > 0) {
            System.out.println("Formato: Digital | Tamaño: " + tamañoMB + " MB");
        } else {
            System.out.println("Formato: Digital | Tamaño: Error en lectura de datos.");
        }
    }
}