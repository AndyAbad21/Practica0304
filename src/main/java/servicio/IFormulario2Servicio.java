/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import modelo.Formulario2;

import java.util.ArrayList;
/**
 *
 * @author Andy Abad
 */
public interface IFormulario2Servicio 
{
    public Formulario2 crear(Formulario2 formulario2);
    public ArrayList<Formulario2> listar();
    public Formulario2 modificar(int i, Formulario2 formulario2);
    public Object eliminar(int i);
}
