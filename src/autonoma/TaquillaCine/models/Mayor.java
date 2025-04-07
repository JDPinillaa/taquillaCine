/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Mayor extends Usuario {

    public Mayor(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPorcentajeDescuentoUsuario() {
        return 0.3; // 30% de descuento
    }
}