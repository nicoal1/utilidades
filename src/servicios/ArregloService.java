/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author NICOpc
 */
public class ArregloService {
    /** Crear la clase ArregloService, en el paquete servicio, con los siguientes metodos: .
     * 1) Metodo inicializarA, recibe un arreglo por parametro y lo inicializa con numeros aleatorios.
     * 2) Metodo Mostrar, recibe un arreglo por parametro y lo muestra por pantalla.
     * 3) Metodo ordenar, recibe un arreglo por parametro y lo ordena de mayor a menor.
     * 4) Metodo incializarB, copia los primeros 10 numeros del arreglo A en el arreglo B. 
     Luego llenar las ultimas 10 posiciones del arreglo B con 0.5 .
     */
    Random aleat = new Random();
    
    public int[] incializarA(int[] A){
        int n = A.length;
        for(int i = 0; i < n; i++){
            A[i] = aleat.nextInt(40);
        }
       
        Arrays.toString(A);
        return A;
    }
    public void Mostrar(int[] A){
        System.out.print("[ ");
        for(int i=0; i<A.length; i++){
            System.out.print(" " + A[i] );
        }
        System.out.print(" ]");
    }
    public void Mostrarr(double[] A){
        System.out.println(" ---- ---- ----");
        System.out.print("[ ");
        for(int i=0; i<A.length; i++){
            System.out.print(" " + A[i] );
        }
        System.out.print(" ]");
    }
    public int[] ordenar(int[] A){
        Arrays.sort(A);
        return A;
    }
    public double[] incializarB(double[] B, int[] A){
        int n1 = B.length;
        int n2 = A.length;
        for(int i=0; i<10; i++){
            
            B[i]=A[A.length-1-i];
            
        }
        Arrays.fill(B, 10, 20, 0.5);
        Arrays.toString(A);
        return B;
    }
    
}
