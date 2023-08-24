package FiguraLienzo;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de base " + base + " y altura " + altura);
    }
}
