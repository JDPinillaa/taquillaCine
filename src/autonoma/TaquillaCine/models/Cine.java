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
    private ArrayList<Factura> facturas = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();
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

    public ArrayList<Pelicula> mostrarCartelera() {
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
    
    public void venderBoleta(Usuario usuario, Funcion funcion, int cantidad) {
    ArrayList<Boleta> boletas = new ArrayList<>();

    for (int i = 0; i < cantidad; i++) {
        Boleta boleta = new Boleta(funcion, usuario);
        boletas.add(boleta);
    }

    Venta venta = new Venta(usuario, boletas);
    ventas.add(venta);

    Factura factura = new Factura(venta);
    facturas.add(factura);

    System.out.println("Venta realizada con éxito. Factura generada:");
    System.out.println(factura.toString());
}

    // Generar venta y factura
    public Factura generarFactura(List<Boleta> boletas) {
        Venta venta = new Venta();
        for (Boleta boleta : boletas) {
            venta.agregarBoleta(boleta);
        }
        return new Factura(venta);
    }
}
