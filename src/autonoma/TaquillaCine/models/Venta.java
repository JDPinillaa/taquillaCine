/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Boleta> boletas;

    public Venta() {
        this.boletas = new ArrayList<>();
    }

    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    public double calcularTotalVenta() {
        double total = 0.0;
        for (Boleta boleta : boletas) {
            total += boleta.getPrecioFinal();
        }
        return total;
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta:\n");
        for (Boleta boleta : boletas) {
            sb.append(boleta.toString()).append("\n");
        }
        sb.append("Total: ").append(calcularTotalVenta()).append("\n");
        return sb.toString();
    }
}