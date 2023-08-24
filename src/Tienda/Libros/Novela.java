package Tienda.Libros;

public class Novela implements ProductoLibro {
    private String autor;
    private String genero;
    private String titulo;
    private double precio;

    public Novela(String autor, String genero, String titulo, double precio) {
        this.autor = autor;
        this.genero = genero;
        this.titulo = titulo;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarDetalles() {
        return "Novela de " + autor + " - Título: " + titulo + " - Género: " + genero + " - Precio: $ " + precio;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTema() {
        return genero;
    }
}