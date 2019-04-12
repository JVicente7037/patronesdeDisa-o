
package UsuarioAdapter;

import proxy.Proxy;

public class MainAdmin {
    
    public static void main(String[] args) {
       Usuario usuario=new Conductor();
       
       usuario.getLogin();
       usuario.getPassword();
       usuario.getTipoUsuario();
       
       
       //usuario.setLogin();
       //usuario.setPassword();
       //usuario.ingresar();
       
       usuario=new Pasajero();
       usuario.getLogin();
       usuario.getPassword();
       usuario.getTipoUsuario();
       //usuario.setLogin();
       //usuario.setPassword();
       //usuario.ingresar();
       
       usuario=new AdminAdapter();
       usuario.getLogin();
       usuario.getPassword();
       usuario.getTipoUsuario();
       //usuario.setLogin();
       //usuario.setPassword();
       //usuario.ingresar();
    }
    

}
