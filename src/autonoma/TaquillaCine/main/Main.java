package autonoma.TaquillaCine.main;

import autonoma.TaquillaCine.models.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine();
        Venta ventaActual = null;

        while (true) {
            System.out.println("\n---- MENÚ PRINCIPAL ----");
            System.out.println("1. Vender boletas");
            System.out.println("2. Generar factura");
            System.out.println("3. Gestionar películas");
            System.out.println("4. Gestionar usuarios");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Vender boletas
                    System.out.print("Nombre de la película: ");
                    String nombrePeli = scanner.nextLine();
                    System.out.print("Costo base de la película: ");
                    double costoBase = scanner.nextDouble();
                    scanner.nextLine();
                    Pelicula peli = new Pelicula(nombrePeli, costoBase);

                    System.out.print("Número de asientos disponibles para la función: ");
                    int asientos = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Seleccione función: 1. Primera (50%) 2. Tarde (10%) 3. Noche (0%)");
                    int f = scanner.nextInt();
                    scanner.nextLine();
                    Funcion funcion = (f == 1) ? new Primera(peli, asientos) :
                                      (f == 2) ? new Tarde(peli, asientos) :
                                      new Noche(peli, asientos);

                    System.out.println("Tipo de usuario: 1. Niño 2. Adulto 3. Mayor");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    Usuario usuario = (tipo == 1) ? new Niño("Niño") :
                                      (tipo == 2) ? new Adulto("Adulto") :
                                      new Mayor("Mayor");

                    System.out.print("Cantidad de boletas a comprar: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    List<Boleta> boletas = new ArrayList<>();
                    for (int i = 0; i < cantidad; i++) {
                        Boleta boleta = new Boleta(peli, usuario, funcion);
                        boletas.add(boleta);
                    }

                    ventaActual = new Venta(usuario, boletas);
                    System.out.println("Venta registrada con éxito.");
                    break;

                case 2:
                    // Generar factura
                    if (ventaActual != null) {
                        Factura factura = cine.generarFactura(ventaActual.getBoletas(), ventaActual.getUsuario());
                        System.out.println("Factura generada con éxito:");
                        System.out.println(factura.toString());
                    } else {
                        System.out.println("Debe realizar una venta primero.");
                    }
                    break;

                case 3:
                    // Gestionar películas
                    System.out.println("1. Agregar película\n2. Eliminar película\n3. Mostrar cartelera");
                    int opPeli = scanner.nextInt();
                    scanner.nextLine();
                    switch (opPeli) {
                        case 1:
                            System.out.print("Nombre de la película: ");
                            String nueva = scanner.nextLine();
                            System.out.print("Costo base de la película: ");
                            double costo = scanner.nextDouble();
                            scanner.nextLine();
                            cine.agregarPelicula(new Pelicula(nueva, costo));
                            break;
                        case 2:
                            System.out.print("Nombre de la película a eliminar: ");
                            String elim = scanner.nextLine();
                            cine.eliminarPelicula(new Pelicula(elim, 0)); // El costo no es relevante para eliminar
                            break;
                        case 3:
                            for (Pelicula p : cine.mostrarCartelera()) {
                                System.out.println("- " + p.getTitulo());
                            }
                            break;
                    }
                    break;

                case 4:
                    // Gestionar usuarios
                    System.out.println("1. Registrar usuario\n2. Eliminar usuario\n3. Mostrar usuarios");
                    int opUser = scanner.nextInt();
                    scanner.nextLine();
                    switch (opUser) {
                        case 1:
                            System.out.print("Nombre del usuario: ");
                            String nombreUsuario = scanner.nextLine();
                            System.out.print("Tipo de usuario (Niño, Adulto, Mayor): ");
                            String tipoUser = scanner.nextLine();
                            Usuario nuevoUsuario;
                            if (tipoUser.equalsIgnoreCase("Niño")) {
                                nuevoUsuario = new Niño(nombreUsuario);
                            } else if (tipoUser.equalsIgnoreCase("Adulto")) {
                                nuevoUsuario = new Adulto(nombreUsuario);
                            } else {
                                nuevoUsuario = new Mayor(nombreUsuario);
                            }
                            cine.registrarUsuario(nuevoUsuario);
                            break;
                        case 2:
                            System.out.print("Nombre del usuario a eliminar: ");
                            String eliminarUsuario = scanner.nextLine();
                            Usuario usuarioAEliminar = new Adulto(eliminarUsuario); // Tipo no relevante para eliminar
                            cine.eliminarUsuario(usuarioAEliminar);
                            break;
                        case 3:
                            for (Usuario u : cine.getUsuarios()) {
                                System.out.println("- " + u.getNombre());
                            }
                            break;
                    }
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
