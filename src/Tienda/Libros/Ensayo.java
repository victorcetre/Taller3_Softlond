package Tienda.Libros;

public class Ensayo implements ProductoLibro {
    private String autor;
    private String tema;
    private String titulo;
    private double precio;

    public Ensayo(String autor, String tema, String titulo, double precio) {
        this.autor = autor;
        this.tema = tema;
        this.titulo = titulo;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarDetalles() {
        return "Ensayo de " + autor + " - Título: " + titulo + " - Tema: " + tema + " - Precio: $ " + precio;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTema() {
        return tema;
    }
}