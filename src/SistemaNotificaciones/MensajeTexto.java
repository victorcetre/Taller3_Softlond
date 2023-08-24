package SistemaNotificaciones;

public class MensajeTexto implements Notificacion {
    private String numeroDestino;
    private String mensaje;

    public MensajeTexto(String numeroDestino, String mensaje) {
        this.numeroDestino = numeroDestino;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto a " + numeroDestino + ": " + mensaje);
    }
}