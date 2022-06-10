/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import modelo.Formulario2;

/**
 * 
 * @author Andy Abad
 */
public class Formulario2Servicio implements IFormulario2Servicio 
{
    private static ArrayList<Formulario2> formulario2List=new ArrayList();
    @Override
    public Formulario2 crear(Formulario2 formulario2) 
    {
        formulario2List.add(formulario2);
        return formulario2;
    }

    @Override
    public ArrayList<Formulario2> listar() 
    {
        return formulario2List;
    }

    @Override
    public Formulario2 modificar(int i, Formulario2 formulario2) 
    {
        formulario2List.add(i, formulario2);
        return formulario2;
    }

    @Override
    public Object eliminar(int i) 
    {
        Object object=formulario2List.get(i);
        formulario2List.remove(i);
        return object;
    }
    
}
