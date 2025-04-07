/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Factura {
    private Venta venta;
    private double totalPagar;

    public Factura(Venta venta) {
        this.venta = venta;
        this.totalPagar = venta.calcularTotalVenta();
    }

    public Venta getVenta() {
        return venta;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    @Override
    public String toString() {
        return "Factura:\n" +
                venta.toString() +
                "Total a pagar: $" + totalPagar + "\n";
    }
}
