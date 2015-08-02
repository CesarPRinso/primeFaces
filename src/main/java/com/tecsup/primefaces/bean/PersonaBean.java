/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.primefaces.bean;

import com.tecsup.primefaces.model.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alumno
 */
@ManagedBean
@RequestScoped
public class PersonaBean {
    
    private List<Persona> personas;
    private Persona personaSeleccionada;
    
    PersonaBean(){
        
         personas = new ArrayList();
         
         Persona Cesar = new Persona("Cesar","Pantoja ","89431");
         Persona claudia = new Persona("Claudia","Borja","03312012");
         Persona Alexander = new Persona("Alexander","Pantoja","12");
         Persona Rachel = new Persona("Rachel","McAdams","1401423");
         Persona Chavo = new Persona("Chavo","del 8","110");
         Persona Goku = new Persona("Goku","Son","11000");
         
         personas = Arrays.asList(claudia,Alexander,Cesar,Rachel,Chavo,Goku);
    }
    
    public List<Persona> buscar (String busqueda){
        
        List<Persona> encontrados = new ArrayList();
        
        for (Persona p : personas){
            
            if ((p.getApellidos()+" "+p.getNombres().toLowerCase()).contains(busqueda)){
                
                encontrados.add(p);
            }
        }
        return encontrados;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }
    
    
    
}
