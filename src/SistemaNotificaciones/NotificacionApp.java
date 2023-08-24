package SistemaNotificaciones;

public class NotificacionApp {
    public static void iniciar() {
        Notificacion[] notificaciones = new Notificacion[3];
        notificaciones[0] = new CorreoElectronico("usuario@gmail.com", "¡Hola!");
        notificaciones[1] = new MensajeTexto("123456789", "Hola, ¿cómo estás?");
        notificaciones[2] = new NotificacionPush("Dispositivo1", "Nueva actualización disponible");

        for (Notificacion notificacion : notificaciones) {
            notificacion.enviar();
        }
    }
}
