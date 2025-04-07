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

public class Cartelera {

    private List<Pelicula> peliculas;

    public Cartelera() {
        this.peliculas = new ArrayList<>();
    }

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

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Película agregada a la cartelera: " + pelicula.getTitulo());
    }

    public void eliminarPelicula(Pelicula pelicula) {
        if (peliculas.remove(pelicula)) {
            System.out.println("Película eliminada de la cartelera: " + pelicula.getTitulo());
        } else {
            System.out.println("La película no se encontró en la cartelera.");
        }
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
}