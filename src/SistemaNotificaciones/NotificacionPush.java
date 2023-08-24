package SistemaNotificaciones;

public class NotificacionPush implements Notificacion {
    private String dispositivo;
    private String mensaje;

    public NotificacionPush(String dispositivo, String mensaje) {
        this.dispositivo = dispositivo;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación push a " + dispositivo + ": " + mensaje);
    }
}
