/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.primefaces.model;

/**
 *
 * @author alumno
 */
public class Persona {

    private String  nombres;
    private String apellidos;
    private String codigo;

    public Persona(String nombres, String apellidos, String codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
    
}
