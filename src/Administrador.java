public class Administrador implements Autenticable, Reportable, Gestionable {

    private String usuarioCorrecto = "admin";
    private String claveCorrecta = "admin123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        return usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta);

    }

    @Override
    public void generarReporte() {

        System.out.println("El administrador generó un reporte general.");

    }

    @Override
    public void gestionarDatos() {

        System.out.println("El administrador está gestionando usuarios y datos.");

    }
}
