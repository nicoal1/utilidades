/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author NICOpc
 */
public class Cadena {
    /* Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
    atributos una frase (String) y su longitud. Agregar constructor vacío y con atributo
    frase solamente. Agregar getters y setters. El constructor con frase como atributo
    debe setear la longitud de la frase de manera automática. 
    */
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }
    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
    
}
