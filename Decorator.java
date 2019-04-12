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
public abstract class Decorator implements Component
{
    protected Component componente;
    
    public Decorator(Component componente)
    {
        this.componente=componente;
    }
    public String showMediot()
    {
        return componente.showMedioTransporte();
    }
}
