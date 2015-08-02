package com.tecsup.primefaces.service;

import com.tecsup.primefaces.model.Categoria;
import com.tecsup.primefaces.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestionProducto {

    public List<Categoria> listar() {
        List<Categoria> categorias = new ArrayList();

        categorias.add(new Categoria(1l, "Libros"));
        categorias.add(new Categoria(2l, "Electrónicos"));
        categorias.add(new Categoria(3l, "Niños"));

        return categorias;
    }

    public List<Producto> listarPorCategoria(Long id) {

        List<Producto> productos = new ArrayList();

        switch (id.intValue()) {
            case 1:
                productos.add(new Producto(1l, "Viajes de Guilliver", "Intersante"));
                productos.add(new Producto(2l, "La isla del tesoro", "Aventuras"));
                productos.add(new Producto(3l, "Las aventuras de Tom Sawyer", "Divertido"));
                break;
            case 2:
                productos.add(new Producto(4l, "TV LG 3D SMART XYZ ", "WOW"));
                productos.add(new Producto(5l, "PlayStation 4", "Diversión a toda hora"));
                productos.add(new Producto(6l, "HomeTheater", "Mejor sonido."));
                break;
            case 3:
                productos.add(new Producto(7l, "Set Dinosaurios JW", "WOW"));
                productos.add(new Producto(8l, "Iron Man", "El personaje favorito"));
                productos.add(new Producto(9l, "Monster Girl", "Muñecas para niñas de hoy."));
                break;
        }
        return productos;
    }

}
