package Tienda.Ropa;

public class Pantalon implements ProductoRopa {
    private String talla;
    private double precio;

    public Pantalon(String talla, double precio) {
        this.talla = talla;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarDetalles() {
        return "Pantalón talla " + talla + ": $ " + precio;
    }

    @Override
    public String getTalla() {
        return talla;
    }
}