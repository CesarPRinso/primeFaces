/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.primefaces.bean;

import com.tecsup.primefaces.model.Producto;
import com.tecsup.primefaces.service.GestionProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alumno
 */

@ManagedBean
public class ProductoBean {
    
    private List<Producto> productos;
    private Producto productoSeleccionado ;
    
    public ProductoBean(){
        
        GestionProducto gestion = new GestionProducto();
        this.productos = gestion.listarPorCategoria(0L);
    }
    
//    public void findProducto (Producto producto){
//        
//        this.productoSeleccionado = producto;
//    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }
    
    
}
