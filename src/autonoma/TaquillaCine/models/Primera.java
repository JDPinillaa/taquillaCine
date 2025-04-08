/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Primera extends Funcion {

    public Primera(Pelicula pelicula, int asientosDisponibles) {
        super(pelicula, asientosDisponibles);
    }

    @Override
    public double calcularDescuentoFuncion() {
        return 0.5; // 50% de descuento
    }
}