/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;
import modelo.Formulario5;
import servicio.Formulario5Servicio;

import java.util.ArrayList;
/**
 * 
 * @author Andy Abad
 */
public class Formulario5Control 
{
    private Formulario5 formulario5;
    private Formulario5Servicio formulario5Servicio;
    public Formulario5Control()
    {
        formulario5Servicio=new Formulario5Servicio();
    }
    
    public Formulario5 crear(String sede, String campus, String carrera,
            String codigoProyecto, String modalidad, String periodo)
    {
        formulario5=new Formulario5(sede, campus, carrera, codigoProyecto,
                modalidad, periodo);
        formulario5Servicio.crear(formulario5);
        return formulario5;
    }
    public ArrayList<Formulario5> listar()
    {
        return formulario5Servicio.listar();
    }
    public Formulario5 modificar(int i,String sede, String campus, String carrera,
            String codigoProyecto, String modalidad, String periodo )
    {
        formulario5=new Formulario5(sede, campus, carrera, codigoProyecto,
                modalidad, periodo);
        formulario5Servicio.modificar(i, formulario5);
        return formulario5;
    }
    public Object eliminar(int i)
    {
        return formulario5Servicio.eliminar(i);
    }
}
