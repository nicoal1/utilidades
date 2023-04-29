/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesutilidad;

import entidades.Cadena;
import servicios.CadenaService;

/**
 *
 * @author NICOpc
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** TODO code application logic here
        */
        CadenaService cs = new CadenaService();
        Cadena c = new Cadena();
        c=cs.CrearCadena(c);
        cs.Menu(c);
        
    }
    
}
