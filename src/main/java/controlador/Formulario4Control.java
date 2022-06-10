/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;
import servicio.Formulario4Servicio;
import modelo.Formulario4;

import java.util.ArrayList;
/**
 * 
 * @author Andy Abad
 */
public class Formulario4Control 
{
    private Formulario4Servicio formulario4Servicio;
    private Formulario4 formulario4;
    
    public Formulario4Control()
    {
        formulario4Servicio=new Formulario4Servicio();
    }
    public Formulario4 crear(String nombreGrupo, int cuposDeGrupo, boolean autorizacion,
            String jornadasDisponibles, boolean ofertaEstudiantes,boolean aplicarCambios)
    {
        formulario4=new Formulario4(nombreGrupo, cuposDeGrupo, autorizacion, jornadasDisponibles,
        ofertaEstudiantes, aplicarCambios);
        return formulario4Servicio.crear(formulario4);
    }
    
    public ArrayList<Formulario4> listar()
    {
        return formulario4Servicio.listar();
    }
    
    public Formulario4 modificar(int i,String nombreGrupo, int cuposDeGrupo,
            boolean autorizacion,String jornadasDisponibles,
            boolean ofertaEstudiantes,boolean aplicarCambios)
    {
        formulario4=new Formulario4(nombreGrupo, cuposDeGrupo, autorizacion, jornadasDisponibles,
        ofertaEstudiantes, aplicarCambios);
        return formulario4Servicio.modificar(i, formulario4);
    }
    
    public Object eliminar(int i)
    {
        return formulario4Servicio.eliminar(i);
    }
    

}
