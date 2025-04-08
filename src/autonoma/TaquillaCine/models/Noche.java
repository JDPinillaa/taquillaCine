/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa una función de cine en horario nocturno.
 * No aplica ningún descuento en la compra de boletas.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Noche extends Funcion {

    /**
     * Constructor de la clase Noche.
     * 
     * @param pelicula          La película asociada a la función.
     * @param asientosDisponibles La cantidad de asientos disponibles para la función.
     */
    public Noche(Pelicula pelicula, int asientosDisponibles) {
        super(pelicula, asientosDisponibles);
    }

    /**
     * Calcula el porcentaje de descuento para una función nocturna.
     * 
     * @return 0.0, ya que no se aplica ningún descuento.
     */
    @Override
    public double calcularDescuentoFuncion() {
        return 0.0; // Sin descuento
    }
}
