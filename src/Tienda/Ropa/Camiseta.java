package Tienda.Ropa;

public class Camiseta implements ProductoRopa {
    private String talla;
    private double precio;

    public Camiseta(String talla, double precio) {
        this.talla = talla;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarDetalles() {
        return "Camiseta talla " + talla + ": $ " + precio;
    }

    @Override
    public String getTalla() {
        return talla;
    }
}