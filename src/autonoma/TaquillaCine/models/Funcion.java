/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public abstract class Funcion {
    private int asientosDisponibles;
    private Pelicula pelicula; // Película asociada a la función

    public Funcion(Pelicula pelicula, int asientosDisponibles) {
        if (asientosDisponibles < 0) {
            throw new IllegalArgumentException("La cantidad de asientos disponibles no puede ser negativa.");
        }
        this.pelicula = pelicula;
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void reducirAsientosDisponibles(int cantidad) {
        if (cantidad > asientosDisponibles) {
            throw new IllegalArgumentException("No hay suficientes asientos disponibles.");
        }
        this.asientosDisponibles -= cantidad;
    }

    public abstract double calcularDescuentoFuncion();
}
