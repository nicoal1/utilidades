/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NICOpc
 */
public class DateService {
    /** Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, 
     que tenga los siguientes métodos:
    * a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase
    por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    * b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío 
    de la clase Date. Ejemplo: Date fechaActual = new Date(); El método debe retornar el objeto Date.
    * c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años 
    entre una y otra (edad del usuario).
    */
    
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        int anio;
        int dia;
        int mes;
        do{
        System.out.println("Ingrese el año de la fecha");
            anio = leer.nextInt()-1900;
        }while(anio>200);
        do{
            System.out.println("Ingrese el mes");
            mes = leer.nextInt() - 1;
        }while(mes<0 && mes>11);
        do{
            System.out.println("Ingrese el dia");
            dia = leer.nextInt();
        }while(dia<0 && dia>31);
        return new Date(anio,mes,dia);
    }
    public Date fechaaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
    public void Diferencia(Date nacimiento, Date actual){
        int diferencia=0;
        if(nacimiento.getMonth() == actual.getMonth()){
            if(nacimiento.getDay()<= actual.getDay()){
                diferencia = (actual.getYear()-nacimiento.getYear()) - 1 ;
            }else{
                diferencia = (actual.getYear()-nacimiento.getYear()) ;
            }
        }else if(nacimiento.getMonth()>actual.getMonth()){
            diferencia = (actual.getYear()-nacimiento.getYear()) - 1 ;
        }else if(nacimiento.getMonth()<actual.getMonth()){
            diferencia = (actual.getYear()-nacimiento.getYear());
            
        }
        System.out.println("La deferencia de edad es de " + diferencia);
    }
    public void mostraFecha(Date fecha){
        System.out.println(fecha);
        System.out.println(fecha.getDate() + " / " + (fecha.getMonth()+1) + " / " + (fecha.getYear()+1900) );
    }
}
