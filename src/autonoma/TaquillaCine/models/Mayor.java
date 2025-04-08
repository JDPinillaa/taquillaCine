/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa un usuario mayor que tiene un descuento del 30% en la compra de boletas.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Mayor extends Usuario {

    /**
     * Constructor de la clase Mayor.
     * 
     * @param nombre El nombre del usuario mayor.
     */
    public Mayor(String nombre) {
        super(nombre);
    }

    /**
     * Calcula el porcentaje de descuento para un usuario mayor.
     * 
     * @return 0.3, que representa un 30% de descuento.
     */
    @Override
    public double calcularPorcentajeDescuentoUsuario() {
        return 0.3; // 30% de descuento
    }
}