/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 * 
 * @author Andy Abad
 */
public class Formulario1 
{
    //Atributos
    private String sede;
    private String tipoDocumentacion;
    private String identificacion;
    //Constructor de la clase
    public Formulario1(String sede, String tipoDocumentacion, String identificacion) {
        this.sede = sede;
        this.tipoDocumentacion = tipoDocumentacion;
        this.identificacion = identificacion;
    }
    //Getters y Setters
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getTipoDocumentacion() {
        return tipoDocumentacion;
    }

    public void setTipoDocumentacion(String tipoDocumentacion) {
        this.tipoDocumentacion = tipoDocumentacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    //Recritura de metodo toString
    @Override
    public String toString()
    {
        return "Sede: "+sede+"\n"+"Tipo Documentacion: "+tipoDocumentacion+"\n"+
                "Identificacion: "+identificacion+"\n";
    }
    

}
