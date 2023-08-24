package FiguraLienzo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio);
    }
}
