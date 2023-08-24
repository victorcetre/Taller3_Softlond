package Tienda.Electronica;

public class Smartphone implements ProductoElectronico {
    private String marca;
    private double precio;

    public Smartphone(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarDetalles() {
        return "Smartphone " + marca + ": $ " + precio;
    }

    @Override
    public String getMarca() {
        return marca;
    }
}
