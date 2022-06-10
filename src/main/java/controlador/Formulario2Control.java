/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;
import modelo.Formulario2;
import servicio.Formulario2Servicio;

import java.util.ArrayList;
/**
 * 
 * @author Andy Abad
 */
public class Formulario2Control 
{
    Formulario2 formulario2;
    Formulario2Servicio formulario2Servicio;
    public Formulario2Control()
    {
        formulario2Servicio=new Formulario2Servicio();
    }
    public Formulario2 crear(String numero)
    {
        formulario2=new Formulario2(numero);
        formulario2Servicio.crear(formulario2);
        return formulario2;
    }
    public ArrayList<Formulario2> listar()
    {
        return formulario2Servicio.listar();
    }
    public Formulario2 modificar(int i, String numero)
    {
        formulario2=new Formulario2(numero);
        formulario2Servicio.modificar(i, formulario2);
        return formulario2;
    }
    public Object eliminar(int i)
    {
        return formulario2Servicio.eliminar(i);
    }
}
