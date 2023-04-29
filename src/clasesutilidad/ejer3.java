/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesutilidad;

import servicios.ArregloService;

/**
 *
 * @author NICOpc
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Crear en el main dos arreglos. El arreglo A de 50 numeros Reales y el arreglo B de 
        20 numeros Reales.
        * 
        * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
        */
        
        ArregloService as = new ArregloService();
        
        int[] A = new int[50];
        double[] B = new double[20];
        A = as.incializarA(A);
        as.Mostrar(A);
        A = as.ordenar(A);
        as.Mostrar(A);
        B = as.incializarB(B, A);
        as.Mostrarr(B);
        
    
    }
    
}
