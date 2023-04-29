/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.PardeNumeros;

/**
 *
 * @author NICOpc
 */
public class PardeNumerosService {
    /**. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además 
    implementar los siguientes métodos:

    * a) Método mostrarValores que muestra cuáles son los dos números guardados.
    * b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    * c) Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado
    al menor número. Previamente se deben redondear ambos valores.
    * d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    */
    
    public void MostrarValores(PardeNumeros ns){
        System.out.println("El primer numero es  " + ns.getN1());
        System.out.println("El segundo numero es " + ns.getN2());
    }
    public void devolverMayor(PardeNumeros ns){
        if(ns.getN1() < ns.getN2()){
            System.out.println("EL numero " + ns.getN2() + " es MAYOR a " + ns.getN1() );
        }else if(ns.getN2() < ns.getN1() ){
            System.out.println("El numero " + ns.getN1() + " es MAYOR a " + ns.getN2() );
        }else{
            System.out.println("Los dos numeros son iguales " + ns.getN1() + " y " + ns.getN2() );
        }        
    }
    public void calcularPotencia(PardeNumeros ns){
        double resultado;
        if( ns.getN1() > ns.getN2() ){
            resultado = Math.pow(ns.getN1() , ns.getN2());
        System.out.println(" El resultado de el numero " + ns.getN1() + " elevado a " + ns.getN2() + " es  " + resultado);
        }else {
            resultado = Math.pow(ns.getN2(), ns.getN1());
        System.out.println(" El resultado de el numero " + ns.getN2() + " elevado a " + ns.getN1() + " es  " + resultado);
        }
    }
    public void CalculaRaiz(PardeNumeros ns){
        double resultado;
        if( ns.getN1() > ns.getN2() ){
            int n2 = Math.abs(ns.getN2());
            resultado = Math.sqrt(n2);
            System.out.println(" El resultado de la raiz cuadrada de " + n2 + " es  " + resultado);
        }else {
            int n1 = Math.abs(ns.getN1());
            resultado = Math.sqrt(n1);
            System.out.println(" El resultado de la raiz cuadradad de " + n1 + " es  " + resultado);
        }
    }
}
