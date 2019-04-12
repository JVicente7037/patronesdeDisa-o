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

    Fachada1 facate;
    Usuario usu;
    
    public Proxy(Usuario user)
    {
        this.usu = user;
    }

    

   
    @Override
    public void Realizooperaciones(String usuario, String contraseña) 
    {
         facate = new Facate();
        if(usu.getLogin().equalsIgnoreCase(usuario) && usu.getPassword().equalsIgnoreCase(contraseña))
        {
           
            facate.
            
            
            if(usu.getTipoUsuario()=="Admin")
            {
               String tip=null;
               facate.Composite();
               facate.Decorator();
               facate.FlyWeight();
               facate.Pago();
               facate.Reserva();
               facate.crearUsuario(usuario, contraseña, tip);
            }
            else if(usu.getTipoUsuario()=="Conductor")
            {
                facate.Composite();
                facate.Decorator();
                        }
            else if(usu.getTipoUsuario()=="Pasajero")
            {
                facate.Reserva();
                facate.Pago();
                
            }
        }
        else
        {
            System.out.println("no tiene acceso");
            String password=null;
            facate.crearUsuario(usuario, contraseña, password);
        }
        
    }

    void Realizooperaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
