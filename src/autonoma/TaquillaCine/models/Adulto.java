/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa un usuario adulto que no tiene descuento en la compra de boletas.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Adulto extends Usuario {

    /**
     * Constructor de la clase Adulto.
     * 
     * @param nombre El nombre del usuario adulto.
     */
    public Adulto(String nombre) {
        super(nombre);
    }

    /**
     * Calcula el porcentaje de descuento para un usuario adulto.
     * 
     * @return 0.0, ya que los adultos no tienen descuento.
     */
    @Override
    public double calcularPorcentajeDescuentoUsuario() {
        return 0.0; // Sin descuento
    }
}
