/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa una función de cine en horario de la tarde.
 * Aplica un descuento del 10% en la compra de boletas.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Tarde extends Funcion {

    /**
     * Constructor de la clase Tarde.
     * 
     * @param pelicula          La película asociada a la función.
     * @param asientosDisponibles La cantidad de asientos disponibles para la función.
     */
    public Tarde(Pelicula pelicula, int asientosDisponibles) {
        super(pelicula, asientosDisponibles);
    }

    /**
     * Calcula el porcentaje de descuento para una función de la tarde.
     * 
     * @return 0.1, que representa un 10% de descuento.
     */
    @Override
    public double calcularDescuentoFuncion() {
        return 0.1; // 10% de descuento
    }
}