/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 * 
 * @author Andy Abad
 */
public class Formulario5 
{
    //Artibutos
    private String sede;
    private String campus;
    private String carrera;
    private String codigoProyecto;
    private String modalidad;
    private String periodo;
    //Constructor
    public Formulario5(String sede, String campus, String carrera, String codigoProyecto, String modalidad, String periodo) {
        this.sede = sede;
        this.campus = campus;
        this.carrera = carrera;
        this.codigoProyecto = codigoProyecto;
        this.modalidad = modalidad;
        this.periodo = periodo;
    }
    //Getters y Setters
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    @Override
    public String toString()
    {
        return "Sede: "+sede+"\n"+"Campus/Extension: "+campus+"\n"+"Carrera: "+
                carrera+"\n"+"Codigo del Proyecto: "+codigoProyecto+"\n"+"Modalidad"+
                modalidad+"\n"+"Periodo: "+periodo+"\n";
    }
    
}
