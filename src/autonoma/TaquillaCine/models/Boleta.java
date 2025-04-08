/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCine.models;

import autonoma.TaquillaCine.exceptions.BoletaNegativaException;

/**
 * Representa una boleta para una función de cine, asociada a una película, un usuario y una función.
 * Calcula el precio final de la boleta teniendo en cuenta los descuentos aplicables.
 * 
 * @author Santiago Uribe
 * @since 2025-04-02
 * @version 1.0
 */
public class Boleta {
    private Pelicula pelicula;
    private Usuario usuario;
    private Funcion funcion;
    private double precioFinal;

    /**
     * Constructor de la clase Boleta.
     * 
     * @param pelicula La película asociada a la boleta.
     * @param usuario  El usuario que compra la boleta.
     * @param funcion  La función de cine asociada a la boleta.
     * @throws BoletaNegativaException Si el precio calculado de la boleta es negativo.
     */
    public Boleta(Pelicula pelicula, Usuario usuario, Funcion funcion) throws BoletaNegativaException {
        this.pelicula = pelicula;
        this.usuario = usuario;
        this.funcion = funcion;
        this.precioFinal = calcularPrecio(); // Se calcula al crear
    }

    /**
     * Calcula el precio final de la boleta teniendo en cuenta los descuentos del usuario y la función.
     * 
     * @return El precio final de la boleta.
     * @throws BoletaNegativaException Si el precio calculado de la boleta es negativo.
     */
    public double calcularPrecio() throws BoletaNegativaException {
        double precioBase = pelicula.getPrecioIndividual();
        double descuentoUsuario = usuario.calcularPorcentajeDescuentoUsuario(); // Por ejemplo, 0.25 para niños
        double descuentoFuncion = funcion.calcularDescuentoFuncion(); // Por ejemplo, 0.1 para tarde

        double totalDescuento = descuentoUsuario + descuentoFuncion;
        precioFinal = precioBase * (1 - totalDescuento);

        if (precioFinal < 0) {
            throw new BoletaNegativaException("El precio de la boleta no puede ser negativo.");
        }

        return precioFinal;
    }

    /**
     * Obtiene el precio final de la boleta.
     * 
     * @return El precio final de la boleta.
     */
    public double getPrecioFinal() {
        return precioFinal;
    }

    /**
     * Obtiene la película asociada a la boleta.
     * 
     * @return La película asociada.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Obtiene el usuario que compró la boleta.
     * 
     * @return El usuario asociado.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Obtiene la función asociada a la boleta.
     * 
     * @return La función asociada.
     */
    public Funcion getFuncion() {
        return funcion;
    }

    /**
     * Representa la boleta como una cadena de texto.
     * 
     * @return Una representación en texto de la boleta.
     */
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