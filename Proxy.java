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
    public void Realizooperaciones(String usuario, String contrasena,String tip) 
    {
         facade = new Facade();
        if(usu.getLogin().equalsIgnoreCase(usuario) && usu.getPassword().equalsIgnoreCase(contrasena))
        {
           
            
           facade.verificarUsuario(usuario,contrasena);
            
             
            
            if(facade.obteterTipo(usuario)=="Admin")
            {
              
               facade.Composite();
               facade.Decorator();
               facade.FlyWeight();
               facade.Pago();
               facade.Reserva();
               facade.crearUsuario(usuario, contraseña, tip);
            }
            else if(facade.obteterTipo(usuario)=="Conductor")
            {
               facade.Composite();
                facade.Decorator();
                        }
            else if(facade.obteterTipo(usuario)=="Pasajero")
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
