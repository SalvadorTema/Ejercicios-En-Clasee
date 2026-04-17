package Ejercicio4;

/*
 * EXPLICACIÓN - CASOS DE PRUEBA UTILIZADOS:
 * 1. Caso Bus Escolar: Se prueba un bus con capacidad positiva y ruta definida. 
 * Verifica que super.descripcion() y la sobrescritura funcionen juntas.
 * 2. Caso de Error (Capacidad): Se ingresa una capacidad negativa (-5) para 
 * validar que el constructor del padre proteja el dato ajustándolo a 0.
 * 3. Caso de Error (Ruta): Se ingresa una ruta vacía para probar la 
 * validación interna del método descripcion().
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBA 1: BUS ESCOLAR");
        Bus bus1 = new Bus(45, "Ruta A - Colegios Norte");
        bus1.descripcion();

        System.out.println("PRUEBA 2: CAPACIDAD INVÁLIDA");
        Bus bus2 = new Bus(-5, "Ruta B - Express");
        bus2.descripcion();

        System.out.println("PRUEBA 3: SIN RUTA DEFINIDA");
        Bus bus3 = new Bus(30, "");
        bus3.descripcion();
    }
}