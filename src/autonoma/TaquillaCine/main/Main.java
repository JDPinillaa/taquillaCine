package autonoma.TaquillaCine.main;

import autonoma.TaquillaCine.models.*;

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
                    ventaActual = new Venta(usuario, boletas);
                    System.out.print("Nombre de la película: ");
                    String nombrePeli = scanner.nextLine();
                    Pelicula peli = new Pelicula(nombrePeli, 10000); // costo base fijo
                    System.out.println("Seleccione función: 1. Primera (50%) 2. Tarde (10%) 3. Noche (0%)");
                    int f = scanner.nextInt();
                    Funcion funcion = (f == 1) ? new Primera() : (f == 2) ? new Tarde() : new Noche();

                    System.out.println("Tipo de usuario: 1. Niño 2. Adulto 3. Mayor");
                    int tipo = scanner.nextInt();
                    Usuario usuario = (tipo == 1) ? new Niño("Niño") :
                                      (tipo == 2) ? new Adulto("Adulto") :
                                      new Mayor("Mayor");

                    Boleta boleta = new Boleta(peli, funcion, usuario);
                    ventaActual.agregarBoleta(boleta);

                    System.out.println("Boleta registrada con éxito.");
                    break;S

                case 2:
                    // Generar factura
                    if (ventaActual != null) {
                        Factura factura = cine.venderBoletas(ventaActual);
                        cine.generarFactura(factura);
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
                            cine.agregarPelicula(new Pelicula(nueva, 10000));
                            break;
                        case 2:
                            System.out.print("Nombre de la película a eliminar: ");
                            String elim = scanner.nextLine();
                            cine.eliminarPelicula(new Pelicula(elim, 10000));
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
                            System.out.print("Tipo de usuario (Niño, Adulto, Mayor): ");
                            String tipoUser = scanner.nextLine();
                            Usuario nuevo;
                            if (tipoUser.equalsIgnoreCase("Niño")) {
                                nuevo = new Niño(tipoUser);
                            } else if (tipoUser.equalsIgnoreCase("Adulto")) {
                                nuevo = new Adulto(tipoUser);
                            } else {
                                nuevo = new Mayor(tipoUser);
                            }
                            cine.registrarUsuario(nuevo);
                            break;
                        case 2:
                            System.out.print("Tipo de usuario a eliminar: ");
                            String eliminar = scanner.nextLine();
                            Usuario eliminarUsuario = new Adulto(eliminar); // simplificado
                            cine.eliminarUsuario(eliminarUsuario);
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
