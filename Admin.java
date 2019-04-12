
package UsuarioAdapter;


import java.util.Scanner;
public class Admin 
{
     String user;
     String contrasena;
     String tipe;
    Scanner input = new Scanner(System.in);
    
    public Admin()
    {
         super();
 //       JOptionPane.showMessageDialog(null,"Creando Administrador");
    }

    public Admin(String user, String contrasena) {
        this.user = user;
        this.contrasena = contrasena;
    }
    
   
    public String getUsuario() 
    {
        return user;
    }

    
    public String getContrasena()
    {
        return contrasena;
    }
    public String getTipeUser() 
    {
         
        return tipe;
       
    }
    
    public void setUsuario(String login) 
    {
    	this.user = login;
    }

   
    public void setContrasena(String pass) 
    {
    	this.contrasena = pass;
    }

    public boolean Log(String usuario,String pass) 
    {
    	if (this.user.equals(usuario) && this.contrasena.equals(pass)) {
			return true;
		}
		else {
			return false;
		}
    }
    public void SetTipeUser(String tipe) {
			
			this.tipe=tipe;
		
	}

   
    
}
