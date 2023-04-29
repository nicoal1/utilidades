/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NICOpc
 */
public class PersonaService {
    /** Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
    * a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
    Retornar el objeto Persona creado.
    * b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de 
    nacimiento y la fecha actual.
    * c) Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona 
    es menor que la edad consultada o false en caso contrario.
    * d) Método mostrarPersona que muestra la información de la persona deseada.
    */
    
    Scanner leer = new Scanner(System.in).useDelimiter(("\n"));
    ArrayList<Persona> lista = new ArrayList<Persona>();
    Date fecha = new Date();
    
    /** . Parece haber un problema con todos los NExtLine(), ya que estos pegan salto de linea de comando.
    Y el next() solo toma una palabra . Mirar opciones para solucionar esto. 
    */
    public Persona CrearPersona(Persona p){
        System.out.println("Ingrese el Nombre y  apellido");
        leer.nextLine();
        
        String name = leer.nextLine();
        p.setNombre(name);
        System.out.println("Ingrese su fecha de nacimiento : ");
        
        System.out.println("dia : ");
        int dia = leer.nextInt();
        System.out.println("mes : ");
        int mes = leer.nextInt() - 1;
        System.out.println("año : ");
        int anio = leer.nextInt() - 1900;
        Date fecha = new Date(anio, mes, dia);
        p.setFechaNac(fecha);;
        System.out.println(fecha.toString());
        return p;
    }
    public boolean menorQue(ArrayList<Persona> list){
        // A traves de la lista, buscamos la persona p que coincida su nombre con el ingresado
        // Y ahi se sale del for y se calcula la edad
        System.out.println("Ingrese el nombre de la persona ");
        leer.nextLine();
        String name = leer.nextLine();
        System.out.println(" Ingrese la edad con la que quiera comparar ");
        Date actual = new Date();
        int edad = leer.nextInt();
        int age = 0;
        boolean esmenor;
        for(Persona p:list){
            if(p.getNombre().equalsIgnoreCase(name)){
                age = RetornaEdad(p);
                
                break;
            } 
        }
        if(age<edad){
            esmenor=true;
        }else{
            esmenor=false;
        }
        return esmenor;
    }
    public void MostrarPersona(ArrayList<Persona> list){
        System.out.println("Ingrese el nombre para mostrar los datos");
        leer.nextLine();
        String name = leer.nextLine();
        int edad;
        for(Persona p:list){
            if(p.getNombre().equalsIgnoreCase(name)){
                edad = RetornaEdad(p);
                System.out.println("EL nombre es : " + p.getNombre());
                System.out.println("Fecha de Nacimiento : " + p.getFechaNac().toString());
                System.out.println("Edad : " + edad);
            }
        }
        
    }    
    public int RetornaEdad(Persona p){
        int age = 0;
        Date fechaNac = p.getFechaNac();
        Date actual = new Date();
        
        if(fechaNac.getMonth() == actual.getMonth()){
            if(fechaNac.getDay()<= actual.getDay()){
                age = (actual.getYear()-fechaNac.getYear()) - 1 ;
            }else{
                age = (actual.getYear()-fechaNac.getYear()) ;
            }
        }else if(fechaNac.getMonth()>actual.getMonth()){
            age = (actual.getYear()-fechaNac.getYear()) - 1 ;
        }else if(fechaNac.getMonth()<actual.getMonth()){
            age = (actual.getYear()-fechaNac.getYear());
        }
        
        return age;
    }    
    
    
    public void Menu(){
        int eleccion;
        boolean salida = true;
        do{
        eleccion = 0;
        System.out.println("1 - Ingresar persona ");
        System.out.println("2 - Mostrar edad ");
        System.out.println("3 - Quien es menor ? ");
        System.out.println("4 - Mostrar datos de persona ");
        System.out.println("5 - Salir");
        eleccion = leer.nextInt();
        switch(eleccion){
            case 1:
                IngresarPersona(lista);
                break;
            case 2:
                MuestraEdad(lista);
                break;
            case 3:
                QuienMenor(lista);
                break;
            case 4:
                MostrarPersona(lista);
                break;
            case 5:
                salida=Salir();
                break;
            default:
                System.out.println("Ingrese un numero correcto");
        }
        
        }while(salida);
    }
    
    public void IngresarPersona(ArrayList<Persona> list){
        Persona p = new Persona();
        list.add(CrearPersona(p));
    }
    public void MuestraEdad(ArrayList<Persona> list){
        System.out.println("Ingrese el nombre de la persona que quiere averiguar");
        leer.nextLine();
        String name = leer.nextLine();
        int cont = 0;
        for(Persona p:list){
            if(p.getNombre().equalsIgnoreCase(name)){
                System.out.println(" La edad de" + p.getNombre() + " es " + RetornaEdad(p));
                 
                cont ++;
                break;
            }
        }
        if(cont==0){
            System.out.println("No se ha encontrado una persona con ese nombre en el sistema");
        }
        
    }
    public void QuienMenor(ArrayList<Persona> list){
        boolean confir = menorQue(list);
        if(confir){
            System.out.println(" Es menor la Persona a la edad ingresada");
        }else{
            System.out.println(" La persona tiene la misma edad o es mayor a ella ");
        }
    }
    public boolean Salir(){
        boolean confir = true ;
        System.out.println(" Esta seguro que desea salir? S/N");
        String entrada = leer.next();
        if(entrada.equalsIgnoreCase("S")){
            confir = false;
        }
        return confir;
    }
    
}
