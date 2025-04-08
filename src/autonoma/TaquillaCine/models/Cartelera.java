/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la cartelera de un cine, que contiene una lista de películas disponibles.
 * Permite agregar, eliminar y mostrar las películas en cartelera.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Cartelera {

    private List<Pelicula> peliculas;

    /**
     * Constructor de la clase Cartelera.
     * Inicializa la lista de películas como una lista vacía.
     */
    public Cartelera() {
        this.peliculas = new ArrayList<>();
    }

    /**
     * Muestra las películas disponibles en la cartelera.
     * Si no hay películas, muestra un mensaje indicando que la cartelera está vacía.
     */
    public void mostrarPeliculas() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas en cartelera.");
        } else {
            System.out.println("Películas en cartelera:");
            for (Pelicula pelicula : peliculas) {
                System.out.println("- " + pelicula.getTitulo());
            }
        }
    }

    /**
     * Agrega una película a la cartelera.
     * 
     * @param pelicula La película que se desea agregar.
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Película agregada a la cartelera: " + pelicula.getTitulo());
    }

    /**
     * Elimina una película de la cartelera.
     * Si la película no se encuentra en la cartelera, muestra un mensaje indicando que no se encontró.
     * 
     * @param pelicula La película que se desea eliminar.
     */
    public void eliminarPelicula(Pelicula pelicula) {
        if (peliculas.remove(pelicula)) {
            System.out.println("Película eliminada de la cartelera: " + pelicula.getTitulo());
        } else {
            System.out.println("La película no se encontró en la cartelera.");
        }
    }

    /**
     * Obtiene la lista de películas en la cartelera.
     * 
     * @return Una lista de las películas disponibles en la cartelera.
     */
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
}