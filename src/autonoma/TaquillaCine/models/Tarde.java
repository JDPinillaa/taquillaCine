/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Tarde extends Funcion {

    @Override
    public double calcularDescuentoFuncion() {
        return 0.1; // 10% de descuento por función de la tarde
    }
}