/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author NICOpc
 */
public class Curso {
    /** Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán:
    nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), 
    precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 
    5 (cinco), donde se alojarán los nombres de cada alumno.
    */
    private String nombreCurso;
    private int CantHorasPorDia;
    private int CantDiaPorSemana;
    private String turno;
    private double PrecioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }
    
    public String getNombreCurso() {
        return nombreCurso;
    }
    public int getCantHorasPorDia() {
        return CantHorasPorDia;
    }
    public int getCantDiaPorSemana() {
        return CantDiaPorSemana;
    }
    public String getTurno() {
        return turno;
    }
    public double getPrecioPorHora() {
        return PrecioPorHora;
    }
    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void setCantHorasPorDia(int CantHorasPorDia) {
        this.CantHorasPorDia = CantHorasPorDia;
    }
    public void setCantDiaPorSemana(int CantDiaPorSemana) {
        this.CantDiaPorSemana = CantDiaPorSemana;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void setPrecioPorHora(double PrecioPorHora) {
        this.PrecioPorHora = PrecioPorHora;
    }
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
