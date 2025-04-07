/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

/**
 *
 * @author ACER
 */
public class Boleta {
    private Pelicula pelicula;
    private Usuario usuario;
    private Funcion funcion;
    private double precioFinal;

    public Boleta(Pelicula pelicula, Usuario usuario, Funcion funcion) {
        this.pelicula = pelicula;
        this.usuario = usuario;
        this.funcion = funcion;
        this.precioFinal = calcularPrecio(); // Se calcula al crear
    }

    public double calcularPrecio() {
        double precioBase = pelicula.getPrecioIndividual();
        double descuentoUsuario = usuario.calcularPorcentajeDescuentoUsuario(); // Por ejemplo, 0.25 para niños
        double descuentoFuncion = funcion.calcularDescuentoFuncion(); // Por ejemplo, 0.1 para tarde

        double totalDescuento = descuentoUsuario + descuentoFuncion;
        precioFinal = precioBase * (1 - totalDescuento);
        return precioFinal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "pelicula=" + pelicula.getTitulo() +
                ", usuario=" + usuario.getNombre() +
                ", funcion=" + funcion.getClass().getSimpleName() +
                ", precioFinal=" + precioFinal +
                '}';
    }
}