/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import modelo.Formulario3;

/**
 * 
 * @author Andy Abad
 */
public class Formulario3Servicio implements IFormulario3Servicio
{
    //private Formulario2 formulario2;
    private static ArrayList<Formulario3> formulario3List=new ArrayList();

    @Override
    public Formulario3 crear(Formulario3 formulario3)
    {
        formulario3List.add(formulario3);
        return formulario3;
    }

    @Override
    public ArrayList<Formulario3> listar()
    {
        return formulario3List;
    }

    @Override
    public Formulario3 modificar(int i, Formulario3 formulario3)
    {
        formulario3List.add(i, formulario3);
        return formulario3;
    }

    @Override
    public Object eliminar(int i) 
    {
        Object objeto=formulario3List.get(i);
        formulario3List.remove(i);
        return objeto;
    }
    
}
