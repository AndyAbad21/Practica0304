/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import modelo.Formulario5;

import java.util.ArrayList;
/**
 *
 * @author Andy Abad
 */
public interface IFormulario5Servicio
{
    public Formulario5 crear(Formulario5 formulario5);
    public ArrayList<Formulario5> listar();
    public Formulario5 modificar(int i, Formulario5 formulario5);
    public Object eliminar(int i);
}
