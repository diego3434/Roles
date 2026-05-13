public class Cajero implements Autenticable, Gestionable {

    private String usuarioCorrecto = "cajero";
    private String claveCorrecta = "123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        return usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta);

    }

    @Override
    public void gestionarDatos() {

        System.out.println("El cajero está gestionando pagos y cobros.");

    }
}