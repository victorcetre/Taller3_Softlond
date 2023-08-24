package Tienda;

import Tienda.Electronica.*;
import Tienda.Libros.*;
import Tienda.Ropa.*;

public class TiendaApp {
    public static void main(String[] args) {
        Producto[] productos = new Producto[6];
        productos[0] = new Laptop("HP", 1200);
        productos[1] = new Smartphone("Samsung", 800);
        productos[2] = new Camiseta("M", 25);
        productos[3] = new Pantalon("L", 40);
        productos[4] = new Novela("J.K. Rowling", "Fantasía", "Harry Potter y la Piedra Filosofal", 20);
        productos[5] = new Ensayo("Linus Torvalds", "Desarrollo de Linux", "El código abierto y la innovación", 15);

        for (Producto producto : productos) {
            System.out.println(producto.mostrarDetalles() + " - Precio: $ " + producto.calcularPrecio());
        }
    }
}
