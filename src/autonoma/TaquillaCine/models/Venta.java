/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
import java.util.List;

public class Venta {
    private Usuario usuario; // Usuario asociado a la venta
    private List<Boleta> boletas;

    public Venta(Usuario usuario, List<Boleta> boletas) {
        if (usuario == null || boletas == null || boletas.isEmpty()) {
            throw new IllegalArgumentException("Usuario y boletas no pueden ser nulos o vacíos.");
        }
        this.usuario = usuario;
        this.boletas = boletas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }

    public double calcularTotalVenta() {
        double total = 0.0;
        for (Boleta boleta : boletas) {
            total += boleta.getPrecioFinal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta realizada por: ").append(usuario.getNombre()).append("\n");
        sb.append("Boletas:\n");
        for (Boleta boleta : boletas) {
            sb.append(boleta.toString()).append("\n");
        }
        sb.append("Total: ").append(calcularTotalVenta()).append("\n");
        return sb.toString();
    }
}