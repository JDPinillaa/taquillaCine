/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Niño extends Usuario {

    public Niño(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPorcentajeDescuentoUsuario() {
        return 0.5; // 50% de descuento
    }
}
