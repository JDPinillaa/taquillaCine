/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa una función de cine asociada a una película.
 * Contiene información sobre los asientos disponibles y los descuentos aplicables.
 * 
 * Esta clase es abstracta y debe ser extendida por clases concretas que definan
 * el porcentaje de descuento específico para cada tipo de función.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public abstract class Funcion {
    private int asientosDisponibles;
    private Pelicula pelicula;

    /**
     * Constructor de la clase Funcion.
     * 
     * @param pelicula          La película asociada a la función.
     * @param asientosDisponibles La cantidad de asientos disponibles para la función.
     * @throws IllegalArgumentException Si la cantidad de asientos disponibles es negativa.
     */
    public Funcion(Pelicula pelicula, int asientosDisponibles) {
        if (asientosDisponibles < 0) {
            throw new IllegalArgumentException("La cantidad de asientos disponibles no puede ser negativa.");
        }
        this.pelicula = pelicula;
        this.asientosDisponibles = asientosDisponibles;
    }

    /**
     * Obtiene la cantidad de asientos disponibles para la función.
     * 
     * @return La cantidad de asientos disponibles.
     */
    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    /**
     * Obtiene la película asociada a la función.
     * 
     * @return La película asociada.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Reduce la cantidad de asientos disponibles para la función.
     * 
     * @param cantidad La cantidad de asientos a reducir.
     * @throws IllegalArgumentException Si la cantidad a reducir es mayor que los asientos disponibles.
     */
    public void reducirAsientosDisponibles(int cantidad) {
        if (cantidad > asientosDisponibles) {
            throw new IllegalArgumentException("No hay suficientes asientos disponibles.");
        }
        this.asientosDisponibles -= cantidad;
    }

    /**
     * Calcula el porcentaje de descuento aplicable a la función.
     * Este método debe ser implementado por las subclases.
     * 
     * @return El porcentaje de descuento aplicable.
     */
    public abstract double calcularDescuentoFuncion();
}
