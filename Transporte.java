/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author UsuarioPC
 */
public class Transporte implements Component 
{
    private String nombre;
    private String tipo;
    
    @Override
    public String consulta(String nombre)
    {
        return this.nombre;
    }
    
    @Override
    public void modificar(String busca,String nuevo) 
    {
        setnombre(nuevo);
    }
    
    public Transporte(String nombre, String tipo)
    {
        setnombre(nombre);
        setTipo(tipo);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    @Override
    public String showMedioTransporte() 
    {
        return nombre + tipo;
    }
}
