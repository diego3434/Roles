public class Supervisor implements Autenticable, Reportable {

    private String usuarioCorrecto = "supervisor";
    private String claveCorrecta = "super123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        return usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta);

    }

    @Override
    public void generarReporte() {

        System.out.println("El supervisor generó un reporte de supervisión.");

    }
}
