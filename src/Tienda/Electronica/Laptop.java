package Tienda.Electronica;

public class Laptop implements ProductoElectronico {
    private String marca;
    private double precio;

    public Laptop(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarDetalles() {
        return "Laptop " + marca + ": $ " + precio;
    }

    @Override
    public String getMarca() {
        return marca;
    }
}
