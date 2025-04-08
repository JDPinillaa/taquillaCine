/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa una función de cine en horario de la mañana (Primera función).
 * Aplica un descuento del 50% en la compra de boletas.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Primera extends Funcion {

    /**
     * Constructor de la clase Primera.
     * 
     * @param pelicula          La película asociada a la función.
     * @param asientosDisponibles La cantidad de asientos disponibles para la función.
     */
    public Primera(Pelicula pelicula, int asientosDisponibles) {
        super(pelicula, asientosDisponibles);
    }

    /**
     * Calcula el porcentaje de descuento para una función de la mañana.
     * 
     * @return 0.5, que representa un 50% de descuento.
     */
    @Override
    public double calcularDescuentoFuncion() {
        return 0.5; // 50% de descuento
    }
}