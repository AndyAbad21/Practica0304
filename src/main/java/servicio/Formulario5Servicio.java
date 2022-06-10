/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import modelo.Formulario5;

/**
 * 
 * @author Andy Abad
 */
public class Formulario5Servicio implements IFormulario5Servicio
{
    private static ArrayList<Formulario5> formulario5List=new ArrayList();

    @Override
    public Formulario5 crear(Formulario5 formulario5) 
    {
        formulario5List.add(formulario5);
        return formulario5;
    }

    @Override
    public ArrayList<Formulario5> listar()
    {
        return formulario5List;
    }

    @Override
    public Formulario5 modificar(int i, Formulario5 formulario5) 
    {
        formulario5List.add(i, formulario5);
        return formulario5;
    }

    @Override
    public Object eliminar(int i)
    {
        Object object=formulario5List.get(i);
        formulario5List.remove(i);
        return object;
    }

}
