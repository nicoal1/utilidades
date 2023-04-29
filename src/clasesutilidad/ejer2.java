/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesutilidad;

import entidades.PardeNumeros;
import servicios.PardeNumerosService;

/**
 *
 * @author NICOpc
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PardeNumeros enes = new PardeNumeros();
        PardeNumerosService ns = new PardeNumerosService();
        ns.MostrarValores(enes);
        ns.devolverMayor(enes);
        ns.calcularPotencia(enes);
        ns.CalculaRaiz(enes);
    }
    
}
