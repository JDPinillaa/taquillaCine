/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa un usuario genérico del sistema del cine.
 * Esta clase es abstracta y debe ser extendida por clases concretas que definan
 * el porcentaje de descuento específico para cada tipo de usuario.
 * 
 * @author Juan Diego Pinilla
 * @since 2025-04-02
 * @version 1.0
 */
public abstract class Usuario {
    protected String nombre;

    /**
     * Constructor de la clase Usuario.
     * 
     * @param nombre El nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Calcula el porcentaje de descuento aplicable al usuario.
     * Este método debe ser implementado por las subclases.
     * 
     * @return El porcentaje de descuento aplicable.
     */
    public abstract double calcularPorcentajeDescuentoUsuario();
}
