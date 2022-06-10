/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 * 
 * @author Andy Abad
 */
public class Formulario2 
{
    //Artibutos
    private String numero;
    //Getters y Setters
    public Formulario2(String numero)
    {
        this.numero=numero;
    }
    public void setNumero(String numero)
    {
        this.numero=numero;
    }
    public String getNumero()
    {
        return numero;
    }
    //Sobreescritura de metodo toString
    @Override
    public String toString()
    {
        return "Numero de WattsApp: "+numero+"\n";
    }
}
