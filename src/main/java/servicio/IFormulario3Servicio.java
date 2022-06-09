/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import modelo.Formulario3;

import java.util.ArrayList;
/**
 *
 * @author Andy Abad
 */
public interface IFormulario3Servicio 
{
    //Crear
    public Formulario3 crear(Formulario3 formulario3);
    //Listar
    public ArrayList<Formulario3> listar();
    //Modificar
    public Formulario3 modificar(int i,Formulario3 formulario3);
    //Eliminar
    public Object eliminar(int i);
}
