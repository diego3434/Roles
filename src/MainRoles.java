import java.util.Scanner;

public class MainRoles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;
        String usuario;
        String clave;

        System.out.println("===== SISTEMA DE ROLES =====");
        System.out.println("1. Cajero");
        System.out.println("2. Administrador");
        System.out.println("3. Supervisor");

        System.out.print("Seleccione un rol: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese usuario: ");
        usuario = scanner.nextLine();

        System.out.print("Ingrese clave: ");
        clave = scanner.nextLine();

        switch (opcion) {

            case 1:

                Cajero cajero = new Cajero();

                if (cajero.iniciarSesion(usuario, clave)) {

                    System.out.println("Inicio de sesión exitoso.");
                    cajero.gestionarDatos();

                } else {

                    System.out.println("Usuario o clave incorrectos.");

                }

                break;

            case 2:

                Administrador admin = new Administrador();

                if (admin.iniciarSesion(usuario, clave)) {

                    System.out.println("Inicio de sesión exitoso.");
                    admin.generarReporte();
                    admin.gestionarDatos();

                } else {

                    System.out.println("Usuario o clave incorrectos.");

                }

                break;

            case 3:

                Supervisor supervisor = new Supervisor();

                if (supervisor.iniciarSesion(usuario, clave)) {

                    System.out.println("Inicio de sesión exitoso.");
                    supervisor.generarReporte();

                } else {

                    System.out.println("Usuario o clave incorrectos.");

                }

                break;

            default:

                System.out.println("Opción inválida.");

        }

        scanner.close();
    }
}