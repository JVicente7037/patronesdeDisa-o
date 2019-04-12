/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import UsuarioAdapter.Admin;
import UsuarioAdapter.AdminAdapter;
import UsuarioAdapter.Conductor;
import UsuarioAdapter.Pasajero;
import UsuarioAdapter.Usuario;

/**
 *
 * @author USUARIO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String us = null, pas = null, tip = null;
        Usuario usu = new Conductor(us,pas);
        usu = new Pasajero(us,pas);
        Admin ad= new Admin(us,pas);
        Proxy fp = new Proxy(usu);
        fp=new Proxy(ad);
        System.out.println("Cuando la clave y el usuario esten correctos");
        fp.Realizooperaciones();
        System.out.println("********");
        
        Usuario usum = new Conductor("nn","1");
        usum = new Pasajero("nn","1");
        
        Proxy fp2 = new Proxy(usum);
        fp2.Realizooperaciones();
        System.out.println("Cuando la clave y el usuario esten incorrectos");
        
        
    }
    
}
