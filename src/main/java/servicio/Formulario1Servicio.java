/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;
import java.util.ArrayList;
import modelo.Formulario1;
/**
 * 
 * @author Andy Abad
 */
public class Formulario1Servicio implements IFormulario1Servicio
{
    private static ArrayList<Formulario1> formulario1List=new ArrayList();

    @Override
    public Formulario1 crear(Formulario1 formulario) 
    {
        formulario1List.add(formulario);
        return formulario;
    }

    @Override
    public ArrayList<Formulario1> listar() 
    {
        return formulario1List;
    }

    @Override
    public Formulario1 modificar(int i, Formulario1 formulario1) 
    {
        formulario1List.add(i, formulario1);
        return formulario1;
    }

    @Override
    public Object eliminar(int i) 
    {
        Object formulario1=formulario1List.get(i);
        formulario1List.remove(i);
        return formulario1;
    }
    
}
