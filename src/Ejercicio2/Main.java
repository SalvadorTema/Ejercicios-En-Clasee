package Ejercicio2;

/*
 * CASOS DE PRUEBA:
 * 1. Retiro dentro del limite.
 * 2. Retiro que excede el sobregiro (Falla validacion).
 */
public class Main {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(100.0, 50.0);
        
        System.out.println("Prueba de Retiro");
        cc.retirar(120.0); 
      
        System.out.println("Prueba de Exceso");
        cc.retirar(100.0); 
    }
}