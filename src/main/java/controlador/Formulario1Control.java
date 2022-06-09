/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;
import java.util.ArrayList;

import modelo.Formulario1;

import servicio.Formulario1Servicio;
/**
 * 
 * @author Andy Abad
 */
public class Formulario1Control
{
    private Formulario1Servicio formulario1Servicio;
    private Formulario1 formulario1;
    public Formulario1Control()
    {
        formulario1Servicio=new Formulario1Servicio();
    }
    
    public Formulario1 crear(String sede, String tipoDocumento, String identificacion)
    {
        formulario1=new Formulario1(sede, tipoDocumento, identificacion);
        this.formulario1Servicio.crear(formulario1);
        return formulario1;
    }
    public ArrayList<Formulario1> listar()
    {
        return this.formulario1Servicio.listar();
    }
    public Formulario1 modificar(int i, String sede,String tipoDocumentacion, String identificacion)
    {
        formulario1=new Formulario1(sede, tipoDocumentacion, identificacion);
        return this.formulario1Servicio.modificar(i, formulario1);
    }
    public Object eliminar(int i)
    {
        return this.formulario1Servicio.eliminar(i);
    }

}
