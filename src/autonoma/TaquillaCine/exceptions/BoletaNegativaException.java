/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.exceptions;

/**
 * Excepción personalizada que se lanza cuando el precio calculado de una boleta es negativo.
 * 
 * Esta excepción se utiliza para garantizar que los precios de las boletas sean válidos
 * y no tengan valores negativos debido a errores en los cálculos de descuentos.
 * 
 * @author Juan Diego Pinilla
 * @since 2025-04-02
 * @version 1.0
 */
public class BoletaNegativaException extends Exception {

    /**
     * Constructor de la clase BoletaNegativaException.
     * 
     * @param message El mensaje de error asociado a la excepción.
     */
    public BoletaNegativaException(String message) {
        super(message);
    }
}
