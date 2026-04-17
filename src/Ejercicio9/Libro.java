package Ejercicio9;

/*
 * EXPLICACIÓN - CÓMO SE APLICÓ HERENCIA:
 * Se define la clase base 'Libro' con atributos generales como título y autor.
 * La herencia permite que 'LibroDigital' adquiera estas propiedades básicas sin 
 * tener que redefinirlas, manteniendo un código limpio y estructurado.
 */
public class Libro {
    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " Autor: " + autor);
    }
}