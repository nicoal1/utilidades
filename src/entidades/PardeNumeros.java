/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;

/**
 *
 * @author NICOpc
 */
public class PardeNumeros {
    /**Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales 
    se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.
    En el constructor vacío se usará el Math.random para generar los dos números.
     */
    
    private int n1;
    private int n2;
    
    Random aleatorio = new Random();
    
    public PardeNumeros() {
        n1 = aleatorio.nextInt(5);
        n2 = aleatorio.nextInt(5);
    }

    public int getN1() {
        return n1;
    }
    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    
    
}
