package SistemaNotificaciones;

public class CorreoElectronico implements Notificacion {
    private String destinatario;
    private String contenido;

    public CorreoElectronico(String destinatario, String contenido) {
        this.destinatario = destinatario;
        this.contenido = contenido;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a " + destinatario + ": " + contenido);
    }
}
