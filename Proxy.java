/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import Facate.Facate;
import UsuarioAdapter.Admin;
import UsuarioAdapter.Usuario;

/**
 *
 * @author USUARIO
 */
public class Proxy implements Interface {

    Facade facade;
    Usuario usu;
    
    public Proxy(Usuario user)
    {
        this.usu = user;
    }

    

   
    @Override
    public void Realizooperaciones(String usuario, String contraseña) 
    {
         facade = new Facade();
        if(usu.getLogin().equalsIgnoreCase(usuario) && usu.getPassword().equalsIgnoreCase(contraseña))
        {
           
            
           
             String tip=null;
            
            if(usu.getTipoUsuario()=="Admin")
            {
              
               facade.Composite();
               facade.Decorator();
               facade.FlyWeight();
               facade.Pago();
               facade.Reserva();
               facade.crearUsuario(usuario, contraseña, tip);
            }
            else if(usu.getTipoUsuario()=="Conductor")
            {
               facade.Composite();
                facade.Decorator();
                        }
            else if(usu.getTipoUsuario()=="Pasajero")
            {
               facade.Reserva();
                facade.Pago();
                
            }
        }
        else
        {
            System.out.println("no tiene acceso");
           
           facade.crearUsuario(usuario, contraseña, tip);
        }
        
    }

    
    
}
