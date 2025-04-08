/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa una factura generada para una venta en el cine.
 * Contiene información sobre la venta y el total a pagar.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Factura {
    private Venta venta;
    private double totalPagar;

    /**
     * Constructor de la clase Factura.
     * Calcula el total a pagar basado en la venta proporcionada.
     * 
     * @param venta La venta asociada a la factura.
     */
    public Factura(Venta venta) {
        this.venta = venta;
        this.totalPagar = venta.calcularTotalVenta();
    }

    /**
     * Obtiene la venta asociada a la factura.
     * 
     * @return La venta asociada.
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * Obtiene el total a pagar de la factura.
     * 
     * @return El total a pagar.
     */
    public double getTotalPagar() {
        return totalPagar;
    }

    /**
     * Representa la factura como una cadena de texto.
     * Incluye la información de la venta y el total a pagar.
     * 
     * @return Una representación en texto de la factura.
     */
    @Override
    public String toString() {
        return "Factura:\n" +
                venta.toString() +
                "Total a pagar: $" + totalPagar + "\n";
    }
}
