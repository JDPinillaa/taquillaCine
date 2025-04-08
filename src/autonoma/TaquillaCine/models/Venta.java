/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

import java.util.List;

/**
 * Representa una venta realizada en el cine.
 * Contiene información sobre el usuario que realizó la compra y las boletas adquiridas.
 * Permite calcular el total de la venta.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Venta {
    private Usuario usuario; 
    private List<Boleta> boletas;

    /**
     * Constructor de la clase Venta.
     * 
     * @param usuario El usuario que realizó la compra.
     * @param boletas La lista de boletas adquiridas en la venta.
     * @throws IllegalArgumentException Si el usuario o la lista de boletas son nulos o vacíos.
     */
    public Venta(Usuario usuario, List<Boleta> boletas) {
        if (usuario == null || boletas == null || boletas.isEmpty()) {
            throw new IllegalArgumentException("Usuario y boletas no pueden ser nulos o vacíos.");
        }
        this.usuario = usuario;
        this.boletas = boletas;
    }

    /**
     * Obtiene el usuario que realizó la venta.
     * 
     * @return El usuario asociado a la venta.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Obtiene la lista de boletas adquiridas en la venta.
     * 
     * @return La lista de boletas.
     */
    public List<Boleta> getBoletas() {
        return boletas;
    }

    /**
     * Calcula el total de la venta sumando el precio final de todas las boletas.
     * 
     * @return El total de la venta.
     */
    public double calcularTotalVenta() {
        double total = 0.0;
        for (Boleta boleta : boletas) {
            total += boleta.getPrecioFinal();
        }
        return total;
    }

    /**
     * Representa la venta como una cadena de texto.
     * Incluye información sobre el usuario, las boletas y el total de la venta.
     * 
     * @return Una representación en texto de la venta.
     */
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