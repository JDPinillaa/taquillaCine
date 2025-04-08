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

public class Cine {
    private List<Pelicula> peliculas;
    private List<Factura> facturas;
    private List<Venta> ventas;
    private List<Usuario> usuarios;
    private Cartelera cartelera;

    public Cine() {
        this.peliculas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.cartelera = new Cartelera();
        this.ventas = new ArrayList<>();
        this.facturas = new ArrayList<>();
    }

    // Gestión de películas
    public void agregarPelicula(Pelicula pelicula) {
        cartelera.agregarPelicula(pelicula);
    }
    
    public void eliminarPelicula(Pelicula pelicula) {
        cartelera.eliminarPelicula(pelicula);
    }

    public List<Pelicula> mostrarCartelera() {
        return new ArrayList<>(cartelera.getPeliculas());
    }

    // Gestión de usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void eliminarUsuario(Usuario usuario) {
        if (usuarios.removeIf(u -> u.getNombre().equalsIgnoreCase(usuario.getNombre()))) {
            System.out.println("Usuario eliminado correctamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
    
    // Venta de boletas
    public void venderBoleta(Usuario usuario, Funcion funcion, int cantidad) {
        if (usuario == null || funcion == null) {
            System.out.println("Usuario o función no pueden ser nulos.");
            return;
        }

        if (cantidad <= 0) {
            System.out.println("La cantidad de boletas debe ser mayor a 0.");
            return;
        }

        if (funcion.getAsientosDisponibles() < cantidad) {
            System.out.println("No hay suficientes asientos disponibles para esta función.");
            return;
        }

        List<Boleta> boletas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            try {
                Pelicula pelicula = funcion.getPelicula(); // Obtener la película asociada a la función
                Boleta boleta = new Boleta(pelicula, usuario, funcion);
                boletas.add(boleta);
            } catch (BoletaNegativaException e) {
                System.out.println("Error al calcular el precio de la boleta: " + e.getMessage());
                return; // Salir del método si ocurre un error
            }
        }

        // Actualizar asientos disponibles en la función
        funcion.reducirAsientosDisponibles(cantidad);

        Venta venta = new Venta(usuario, boletas);
        ventas.add(venta);

        Factura factura = new Factura(venta);
        facturas.add(factura);

        System.out.println("Venta realizada con éxito. Factura generada:");
        System.out.println(factura.toString());
    }

    // Generar factura
    public Factura generarFactura(List<Boleta> boletas, Usuario usuario) {
        if (boletas == null || boletas.isEmpty()) {
            System.out.println("No se pueden generar facturas sin boletas.");
            return null;
        }

        Venta venta = new Venta(usuario, boletas);
        ventas.add(venta);

        Factura factura = new Factura(venta);
        facturas.add(factura);

        return factura;
    }
}
