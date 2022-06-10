/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import modelo.Formulario4;

/**
 * 
 * @author Andy Abad
 */
public class Formulario4Servicio implements IFormulario4Servicio
{
    private static ArrayList<Formulario4> formulario4List=new ArrayList();
    @Override
    public Formulario4 crear(Formulario4 formulario4)
    {
        formulario4List.add(formulario4);
        return formulario4;
    }

    @Override
    public ArrayList<Formulario4> listar()
    {
        return formulario4List;
    }

    @Override
    public Formulario4 modificar(int i, Formulario4 formulario4)
    {
        formulario4List.add(i, formulario4);
        return formulario4;
    }

    @Override
    public Object eliminar(int i)
    {
        Object object=formulario4List.get(i);
        formulario4List.remove(i);
        return object;
    }
    
}
