/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author NICOpc
 */
public class Persona {
   /**Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y
    una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set.
    */ 
    private String nombre;
    private Date fechaNac;

    public Persona() {
    }
    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }
    public Date getFechaNac() {
        return fechaNac;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}
