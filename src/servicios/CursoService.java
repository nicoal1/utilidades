/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NICOpc
 */
public class CursoService {
    /**  d) Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un
    arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
        e) Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
        f) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una 
    semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la
    cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
    **/ 
    
    /** vamos a agregar un menu, para tener mas opciones. Una opcion que te muestre cuantos son.
    Otra que te muestre todos los cursos cargados y te de un resumen, con hora semanales, ganancia y cant alumnos.
    Otra que te muestre un curso, con todos sus detalles.
    
    **/ 
    ArrayList<Curso> lista = new ArrayList<Curso>() ;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(Curso curse){
        System.out.println("Cuantos alumnos tiene el curso");
        int n = leer.nextInt();
        String[] alumnos = new String[n];
        System.out.println("Ingrese los alumnos que componen el curso");
        for(int i=0; i<n; i++){
            alumnos[i]=leer.next();
        }
        curse.setAlumnos(alumnos);
    }
    public void CrearCurso(ArrayList<Curso> list){
        Curso c = new Curso();
        System.out.println(" Ingrese el nombre del curso ");
        leer.nextLine();
        c.setNombreCurso(leer.nextLine());
        System.out.println("Turno: ");
        c.setTurno(leer.next());
        System.out.println("Cantidad de Dias por Semana que trabaja : ");
        c.setCantDiaPorSemana(leer.nextInt());
        System.out.println("Cantidad de Horas por Dia : ");
        c.setCantHorasPorDia(leer.nextInt());
        System.out.println(" Cobro por Hora :");
        c.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(c);
        list.add(c);
    }
    public double calcularGananciaSemanal(Curso c){
        double ganancia;
        ganancia = (c.getPrecioPorHora()*c.getCantHorasPorDia()*c.getCantDiaPorSemana());
        int n = c.getAlumnos().length;
        // A modo de juego, vamos a mutiplicar el dinero por la cantidad de alumnos que tiene.
        // sumandole 10% por cada alumno superando los cinco
        double porc=0;
        if(n>5){
            for(int i=5;i<n;i++){
                porc += 0.1 ;
            }
        }
        ganancia = ganancia*(1.0+porc);
        return ganancia;
    }    
    public void LlamarCalculo(ArrayList<Curso> list){
        System.out.println("Ingrese el nombre del curso que quiere calcular sus ganancias ");
        String name = leer.next();
        double ganancia ;
        int cont = 0;
        for(Curso c: list){
            if(c.getNombreCurso().equalsIgnoreCase(name)){
                cont ++;
                ganancia = calcularGananciaSemanal(c);
                System.out.println(" Por este curso usted cobra $ " + ganancia + " semanalmente ");
                break;
            }

        }
        if(cont==0){
            System.out.println("No se encontro un curso con ese nombre, intente de nuevo ");
        }
        
    }
    public void TotalCursos(ArrayList<Curso> list){
        System.out.println(" Usted tiene " + list.size() + " cursos cargados ");
    }
    public void ResumenCursos(ArrayList<Curso> list){
        
        for(Curso c:list){
            Resumen(c);
        }
    }
    public void Resumen(Curso c){
        // Mostrar nombre de curso, cant alummnos, horas semanales y ganancia.
        int horas = c.getCantHorasPorDia()*c.getCantDiaPorSemana();
        System.out.println(" CURSO : " + c.getNombreCurso() + " , alumnos : " + c.getAlumnos().length + " , ganancias semanales : $ " + calcularGananciaSemanal(c) + " , horas semanales : " + horas );
    }
    public void MostrarCurso(ArrayList<Curso> list){
        System.out.println(" SObre que curso quiere obtener informacion");
        String nombre = leer.next();
        int cont = 0;
        for(Curso c:list){
           if(c.getNombreCurso().equalsIgnoreCase(nombre)){
               Detalle(c);
               cont++;
               break;
           } 
        }
        if(cont==0){
            System.out.println(" NO se ha encontado un curso con ese nombre ");
        }
        
    }
    public void Detalle(Curso c){
        int horas;
        System.out.println(" El nombre del curso es : " + c.getNombreCurso());
        System.out.println(" Tiene " + c.getAlumnos().length + " alumnos, sus nombres son : ");
        System.out.println( Arrays.toString(c.getAlumnos()) );
        horas = c.getCantDiaPorSemana()*c.getCantHorasPorDia();
        System.out.println(" Por dia trabaja : " + c.getCantHorasPorDia() + " horas.  Cobrando $ " + c.getPrecioPorHora() + " por hora " );
        System.out.println(" En la semana trabaja:  " + horas + " horas. Cobrando $ " + calcularGananciaSemanal(c) + " por Semana ");
        System.out.println(" Este curso se encuentra en el turno " + c.getTurno());
    }
    
    public boolean Salir(){
        boolean sal ;
        System.out.println(" Esta seguro que desea salir? S/N");
        String conf = leer.next();
        if(conf.equalsIgnoreCase("S")){
            sal=true;
            System.out.println(" Muchas gracias por elegirnos ");
        }else{
            sal=false;
        }
        return sal;
    }
    
    public void Menu(){
        boolean salida = false;
        // int eleccion;
        do{
            System.out.println(" Menu Principal");
            System.out.println(" 1 - Cargar curso ");
            System.out.println(" 2 - Calcular ganancia de curso ");
            System.out.println(" 3 - Mostrar cuantos cursos tengo ");
            System.out.println(" 4 - Resumen de todos los cursos ");
            System.out.println(" 5 - Mostrar un curso en detalle ");
            System.out.println(" 6 - Salir");
            int eleccion = leer.nextInt();
            switch(eleccion){
                case 1:
                    CrearCurso(lista);
                    break;
                case 2:    
                    LlamarCalculo(lista);
                    break;
                case 3:
                    TotalCursos(lista);
                    break;
                case 4:
                    ResumenCursos(lista);
                    break;
                case 5:
                    MostrarCurso(lista);
                    break;
                case 6:
                    salida = Salir();
                    break;        
                default:
                    System.out.println(" Ingrese un numero correcto ");
            }
            
            
            
        }while(!salida);
    }
}
