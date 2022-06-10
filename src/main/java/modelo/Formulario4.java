/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 * 
 * @author Andy Abad
 */
public class Formulario4 
{
    private String nombreGrupo;
    private int cuposDeGrupo;
    private boolean autorizacion;
    private String jornadasDisponibles;
    private boolean ofertasEstudiantes;
    private boolean aplicarCambios;

    public Formulario4(String nombreGrupo, int cuposDeGrupo, boolean autorizacion, String jorandasDispones, boolean ofertasEstudiantes, boolean aplicarCambios) {
        this.nombreGrupo = nombreGrupo;
        this.cuposDeGrupo = cuposDeGrupo;
        this.autorizacion = autorizacion;
        this.jornadasDisponibles = jorandasDispones;
        this.ofertasEstudiantes = ofertasEstudiantes;
        this.aplicarCambios = aplicarCambios;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getCuposDeGrupo() {
        return cuposDeGrupo;
    }

    public void setCuposDeGrupo(int cuposDeGrupo) {
        this.cuposDeGrupo = cuposDeGrupo;
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getJorandasDispones() {
        return jornadasDisponibles;
    }

    public void setJorandasDispones(String jorandasDispones) {
        this.jornadasDisponibles = jorandasDispones;
    }

    public boolean isOfertasEstudiantes() {
        return ofertasEstudiantes;
    }

    public void setOfertasEstudiantes(boolean ofertasEstudiantes) {
        this.ofertasEstudiantes = ofertasEstudiantes;
    }

    public boolean isAplicarCambios() {
        return aplicarCambios;
    }

    public void setAplicarCambios(boolean aplicarCambios) {
        this.aplicarCambios = aplicarCambios;
    }

    
    
    @Override
    public String toString()
    {
        String autorizacionS;
        if(autorizacion==true) 
        {
            autorizacionS="Si";
        }
        else{
            autorizacionS="No";
        }
        String aplicarCambiosS;
        if(aplicarCambios==true)
        {
            aplicarCambiosS="Si";
        }
        else{
            aplicarCambiosS="No";
        }
        String ofertaEstudiantesS;
        if(ofertasEstudiantes==true)
        {
            ofertaEstudiantesS="Nuevos";
        }else{
            ofertaEstudiantesS="Antiguos";
        }
        return "Nombre del Grupo: "+nombreGrupo+"\n"+"Cupos de Grupo: "+cuposDeGrupo+
                "\n"+"Autorizacion: "+autorizacionS+"\n"+"Jornada de Grupo: "+jornadasDisponibles
                +"\n"+"Ofertas de Estudiantes: "+ofertaEstudiantesS+"\n"+
                "Aplicar Cambios: "+aplicarCambiosS+"\n";
    }
}
