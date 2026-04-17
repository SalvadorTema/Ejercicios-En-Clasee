package Ejercicio3;
import java.time.LocalDate; // Importación necesaria para manejar fechas

/*
 * EXPLICACIÓN - MÉTODOS SOBRESCRITOS:
 * 1. mostrarDetalles(): Se sobrescribe para incluir la fecha de vencimiento.
 * 2. estaVencido(): Método específico de esta clase para validar la integridad del producto.
 * * USO DE SUPER: Se usa super(nombre) para inicializar el producto en la clase padre.
 */
public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre, LocalDate fechaVencimiento) {
        super(nombre);
        this.fechaVencimiento = fechaVencimiento;
    }

    // Validación: Compara la fecha de vencimiento con la fecha actual del sistema
    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaVencimiento);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        
        // VALIDACIÓN DE SEGURIDAD
        if (estaVencido()) {
            System.out.println("ESTADO: [VENCIDO] - Retirar de estantería.");
        } else {
            System.out.println("ESTADO: [VIGENTE] - Apto para consumo.");
        }
    }
}