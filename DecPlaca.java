/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Composite.Transporte;
import Composite.Component;
/**
 *
 * @author UsuarioPC
 */
public class DecPlaca extends Decorator
{
    private String placa;
    
    public DecPlaca(Component componente) 
    {
        super(componente);
        setPlaca("/VivaReach");
    }
    
    public String showMedioTransporte()
    {
        return componente.showMedioTransporte()+addDescripcion();
    }

    public void modificar(String buscador, String nuevo)
    {
        if(this.getPlaca().equals(buscador))
        {
            setPlaca(nuevo);
        }
        else this.componente.modificar(buscador, nuevo);
    }
    private String addDescripcion() 
    {
        return placa;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String consulta(String nombre) 
    {
        return this.placa;
    }
    
}
