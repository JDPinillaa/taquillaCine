/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Pelicula {
    private String titulo;
    private double precioIndividual;

    public Pelicula(String titulo, double precioIndividual) {
        this.titulo = titulo;
        this.precioIndividual = precioIndividual;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioIndividual() {
        return precioIndividual;
    }
}
