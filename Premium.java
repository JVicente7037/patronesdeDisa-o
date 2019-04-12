/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;
import Composite.Component;

/**
 *
 * @author Brian Alejandro
 */
/**
public class Premium extends Decorator{
   

    private String tipo;
    
    public Premium()
    {
        setTipo("Transporte Normal");
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
        return tipo;        
    }

    @Override
    public void modificar(String buscador, String nuevo) 
    {
        if(this.getTipo().equals(buscador))
        {
            setTipo(nuevo);
        }
        else this.modificar(buscador, nuevo);
    }
    
}

    */
    
    

