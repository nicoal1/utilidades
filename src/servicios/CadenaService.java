/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author NICOpc
 */
public class CadenaService {
    /** Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos: .
    * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    * Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    * Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar
    cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    * Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
     con otra nueva frase ingresada por el usuario.
    * Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase
     ingresada por el usuario y mostrar la frase resultante.
    * Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
     por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    * Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario 
     y devuelve verdadero si la contiene y falso si no.
    */
    
    Scanner leer = new Scanner(System.in);
    
    
    public Cadena CrearCadena(Cadena c){
        System.out.println("Ingrese la frase ");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
        
        return c;
    }
    public void MostrarVocales(Cadena c){
        String frase = c.getFrase();
        int largo = frase.length();
        int contador = 0;
        System.out.println(largo);
        for(int i=0; i<largo; i++ ){
            
            if((frase.substring(i, i+1).equalsIgnoreCase("a")) || (frase.substring(i, i+1).equalsIgnoreCase("e")) || (frase.substring(i, i+1).equalsIgnoreCase("i")) || (frase.substring(i, i+1).equalsIgnoreCase("o")) || (frase.substring(i, i+1).equalsIgnoreCase("u")) ) {
                System.out.print(frase.substring(i,i+1));
                contador ++ ;
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println(" La frase tiene " + contador + " vocales");
    }
    public void InvertirFrase(Cadena c){
        String invertida="";
        String frase = c.getFrase();
        int largo = c.getLongitud();
        for(int i=largo; i>0; i--){
            invertida += frase.substring(i-1,i);    
        }
        System.out.println(" == " + invertida );
    }
    public void vecesRepetido(Cadena c){
        System.out.println("Ingrese el caracter a buscar : ");
        String carac=leer.next();
        String frase = c.getFrase();
        int largo = c.getLongitud();
        int contador = 0;
         for(int i=0; i<largo; i++ ){
            
            if(((frase.substring(i, i+1).equalsIgnoreCase(carac))) ) {
                contador ++ ;
            }
        }
        System.out.println(" La frase tiene " + contador + " veces la palabra " + carac );
        
    }
    public void compararLongitud(Cadena c){
        System.out.println("Ingrese la frase");
        String frasenew = leer.nextLine();
        frasenew = leer.nextLine();
        int long1 = frasenew.length();
        if(long1==c.getLongitud()){
            System.out.println(" La frase " + frasenew + "tiene la misma longitud que la frase " + c.getFrase() );
            
        }else{
            System.out.println(" La frase " + frasenew + " NO tiene la misma longitud que la frase " + c.getFrase());
        }
        
    }
    public void unirFrases(Cadena c){
        // este esel metodo facil solo une la frase al mostrarla.
        // Lo ideal seria crear una frase nueva para guardar en una variable
        System.out.println("Ingrese la frase nueva");
        String frase2 = leer.nextLine();
        frase2 = leer.nextLine();
        String frasenew;
        System.out.println(" La nueva frase es : " + c.getFrase() + " " + frase2 );
        
    }
    public void Reemplazar(Cadena c){
        System.out.println("Que letra quedra reemplazar ? ");
        String carac = leer.next();
        System.out.println("Ingrese el caracter que desea reemplazar ");
        String letra = leer.next();
        String newfrase="";
        for(int i=0; i<c.getLongitud(); i++ ){
            if ((c.getFrase().substring(i, i+1)).equalsIgnoreCase(carac) ){
                newfrase += letra;
            }else{
                newfrase += c.getFrase().substring(i, i+1);
            }    
        }
        System.out.println("La nueva frase queda : " + newfrase );
    }
    public boolean Contiene(Cadena c){
        System.out.println("Ingrese la letra a buscar ");
        String letra = leer.next();
        boolean confir=false;
        for (int i=0; i<c.getLongitud(); i++){
            if(((c.getFrase()).substring(i, i+1)).equals(letra)){
                confir = true;
                System.out.println(" La letra " + letra + "  se encuentar en la posicion " + i );
                break;
            }
        }
        System.out.println(confir);
    
        return confir;
    }
    public void Menu(Cadena cadena){
        
        boolean salida=true;
        short eleccion;
        do{
        System.out.println(" 1 - Mostrar vocales ");
        System.out.println(" 2 - Invertir Frase ");
        System.out.println(" 3 - Averiguar si se encuentra una letra en la frase");
        System.out.println(" 4 - Comparar Longitud ");
        System.out.println(" 5 - Unir frases ");
        System.out.println(" 6 - Reemplazar ");
        System.out.println(" 7 - Averiguar si la frase contiene alguna letra ");
        System.out.println(" 8 - Salir ");
        eleccion=leer.nextShort();
        switch(eleccion){
            case 1:
                MostrarVocales(cadena);
                leer.nextLine();
                
                break;
            case 2:
                InvertirFrase(cadena);
                leer.nextLine();
                
                break;
            case 3:
                vecesRepetido(cadena);
                leer.nextLine();
                
                break;
            case 4:
                compararLongitud(cadena);
                leer.nextLine();
                
                break;
            case 5:
                unirFrases(cadena);
                leer.nextLine();
                
                break;
            case 6:
                Reemplazar(cadena);
                leer.nextLine();
                
                break;
            case 7:
                Contiene(cadena);
                leer.nextLine();
                
                break;
            case 8:    
                salida=Salir();
                break;
            default:
                System.out.println("Ingresa un numero correcto HUEVON");
        }
        }while(salida);
    
    }
    public boolean Salir(){
        boolean confir=true;
        System.out.println("Esta seguro que desea salir ? S/N");
        String choice = leer.next();
        if(choice.equalsIgnoreCase("S")){
            confir=false;
        }
        return confir;
    }
}
