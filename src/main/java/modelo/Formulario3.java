/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 * 
 * @author Andy Abad
 */
public class Formulario3 
{
    private String carrera;
    private String modalidad;
    private String sede;
    private String campus;
    private String jornada;
    //Constructor para iniciarlizar los valores
    public Formulario3(String carrera, String modalidad, String sede, String campus, String jornada) {
        this.carrera = carrera;
        this.modalidad = modalidad;
        this.sede = sede;
        this.campus = campus;
        this.jornada = jornada;
    }
//Getters y Setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

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

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
   //SobreEscritura de metodo toString 
    @Override 
    public String toString()
    {
        return "Carrera: "+carrera+"\n"+"Modalidad: "+modalidad+"\n"+"Sede: "
                +sede+"\n"+"Campus: "+campus+"\n"+"Jordana: "+jornada+"\n";
    }
}
