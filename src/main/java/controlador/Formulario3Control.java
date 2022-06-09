/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;
import modelo.Formulario3;
import servicio.Formulario3Servicio;

import java.util.ArrayList;
/**
 * 
 * @author Andy Abad
 */
public class Formulario3Control 
{
    private Formulario3 formulario3;
    private Formulario3Servicio formulario3Servicio;
    
    public Formulario3Control()
    {
        formulario3Servicio=new Formulario3Servicio();
    }
    
    public Formulario3 crear(String carrera, String modalidad, String sede,
            String campus, String jornada)
    {
        formulario3=new Formulario3(carrera, modalidad, sede, campus, jornada);
        return this.formulario3Servicio.crear(formulario3);
    }
    
    public ArrayList listar()
    {
        return formulario3Servicio.listar();
    }
    
    public Formulario3 modificar(int i,String carrera, String modalidad,
            String sede, String campus, String jornada )
    {
        formulario3=new Formulario3(carrera, modalidad, sede, campus, jornada);
        return this.formulario3Servicio.modificar(i, formulario3);
    }
    
    public Object eliminar(int i)
    {
        return this.formulario3Servicio.eliminar(i);
    }
}
