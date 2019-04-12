/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Composite.Component;

/**
 *
 * @author UsuarioPC
 */
public class DecPuestos extends Decorator
{
    private String puestos;
            
    public DecPuestos(Component componente) 
    {
        super(componente);
        setPuestos("/20");
    }

    public String showMedioTransporte()
    {
        return componente.showMedioTransporte()+addDescripcion();
    }
    
    private String addDescripcion() 
    {
        return puestos;
    }
    
    @Override
    public String consulta(String nombre) 
    {
        return componente.showMedioTransporte()+addDescripcion();
    }

    @Override
    public void modificar(String busca, String nuevo) 
    {
        if(this.getPuestos().equals(busca))
        {
            setPuestos(nuevo);
        }
        else this.componente.modificar(busca, nuevo);
    }

    public String getPuestos() {
        return puestos;
    }

    public void setPuestos(String puestos) {
        this.puestos = puestos;
    }
    
}
