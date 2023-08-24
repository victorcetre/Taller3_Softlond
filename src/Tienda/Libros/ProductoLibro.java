package Tienda.Libros;

import Tienda.Producto;

public interface ProductoLibro extends Producto {
    String getAutor();
    String getTema();
}
