/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import java.util.ArrayList;
import modelo.Formulario1;
/**
 *
 * @author Andy Abad
 */
public interface IFormulario1Servicio 
{
    public Formulario1 crear(Formulario1 formulario);
    public ArrayList<Formulario1> listar();
    public Formulario1 modificar(int i, Formulario1 formulario1);
    public Object eliminar(int i);
}
