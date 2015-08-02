/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.primefaces.bean;

import com.tecsup.primefaces.model.Categoria;
import com.tecsup.primefaces.model.Producto;
import com.tecsup.primefaces.service.GestionProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alumno
 */
@ManagedBean

public class CategoriaBean {
    
    private long idCategoria;
    private List<Categoria>categorias;
    private List<Producto>productos;
    
    public CategoriaBean (){
        GestionProducto gestion = new GestionProducto();        
        this.categorias=gestion.listar();
        System.out.println("TOTAL Categorias" + this.categorias.size());
    }
    
    public void cargarProductos (Long categoria){
        
        GestionProducto gestion = new GestionProducto();
        this.productos = gestion.listarPorCategoria(categoria);
        System.out.println("TOTAL PRODUCTOS" + this.productos.size());
    }
    
    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
