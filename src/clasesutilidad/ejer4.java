/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesutilidad;

import java.util.Date;
import servicios.DateService;

/**
 *
 * @author NICOpc
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateService ds = new DateService();
        Date fechaNac = ds.fechaNacimiento();
        Date fechaAct = ds.fechaaActual();
        System.out.println("Mostrar fecha actual");
        ds.mostraFecha(fechaAct);
        System.out.println("Mostrar fecha de nacimiento");
        ds.mostraFecha(fechaNac);
        ds.Diferencia(fechaNac, fechaAct);
        
    }
    
}
