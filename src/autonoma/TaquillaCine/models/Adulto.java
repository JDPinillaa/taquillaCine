/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Adulto extends Usuario {

    public Adulto(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPorcentajeDescuentoUsuario() {
        return 0.0; // Sin descuento
    }
}
