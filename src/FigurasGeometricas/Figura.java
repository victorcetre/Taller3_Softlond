package FigurasGeometricas;

public class Figura {
    private FiguraGeometrica figura;

    public Figura(FiguraGeometrica figura) {
        this.figura = figura;
    }

    public double calcularArea() {
        return figura.calcularArea();
    }

    public double calcularPerimetro() {
        return figura.calcularPerimetro();
    }

    public void imprimirCalculos() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println();
    }

    public static void main(String[] args) {
        FiguraGeometrica[] formas = new FiguraGeometrica[3];
        formas[0] = new Circulo(5);
        formas[1] = new Triangulo(6, 4, 5, 4, 3);
        formas[2] = new Cuadrado(3);

        Figura[] figuras = new Figura[formas.length];
        for (int i = 0; i < formas.length; i++) {
            figuras[i] = new Figura(formas[i]);
        }

        for (Figura figura : figuras) {
            figura.imprimirCalculos();
        }
    }
}
