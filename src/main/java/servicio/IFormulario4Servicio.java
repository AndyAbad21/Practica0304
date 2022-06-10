/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import modelo.Formulario4;

import java.util.ArrayList;
/**
 *
 * @author Andy Abad
 */
public interface IFormulario4Servicio
{
    public Formulario4 crear(Formulario4 formulario4);
    public ArrayList<Formulario4> listar();
    public Formulario4 modificar(int i, Formulario4 formulario4);
    public Object eliminar(int i);
}
