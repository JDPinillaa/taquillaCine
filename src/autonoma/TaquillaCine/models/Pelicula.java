/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 * Representa una película en el cine con un título y un precio individual.
 * 
 * @author Santiago
 * @since 20240407
 * @version 1.0
 */
public class Pelicula {
    private String titulo;
    private double precioIndividual;

    /**
     * Constructor de la clase Pelicula.
     * 
     * @param titulo           El título de la película.
     * @param precioIndividual El precio base de la película.
     */
    public Pelicula(String titulo, double precioIndividual) {
        this.titulo = titulo;
        this.precioIndividual = precioIndividual;
    }

    /**
     * Obtiene el título de la película.
     * 
     * @return El título de la película.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el precio base de la película.
     * 
     * @return El precio base de la película.
     */
    public double getPrecioIndividual() {
        return precioIndividual;
    }
}
