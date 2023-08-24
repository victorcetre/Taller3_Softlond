package FiguraLienzo;

public abstract class Figura implements Dibujable {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
