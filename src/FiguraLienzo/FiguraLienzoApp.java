package FiguraLienzo;

public class FiguraLienzoApp {
    public static void main(String[] args) {
        Dibujable[] figuras = new Dibujable[2];
        figuras[0] = new Circulo("Círculo 1", 5);
        figuras[1] = new Rectangulo("Rectángulo 1", 10, 7);

        Lienzo lienzo = new Lienzo(figuras);
        lienzo.dibujarTodo();
    }
}
