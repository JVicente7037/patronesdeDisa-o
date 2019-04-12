
package UsuarioAdapter;

import java.util.Scanner;
public class Conductor extends Usuario
{
    
    String login;
    String password;
    String tipo;
    
    public Conductor()
    {
        super();
        //JOptionPane.showMessageDialog(null,"Creando Conductor");
    }

    public Conductor(String login, String password) {
        this.login = login;
        this.password = password;
    }

    
    @Override
    public String getLogin() 
    {
        return login;
    }

    @Override
    public String getPassword() 
    {
        return password;
    }

    @Override
    public void setLogin(String login) 
    {
    	this.login = login;	
    }

    @Override
    public void setPassword(String pass) 
    {
    	this.password= pass;
    }

    @Override
    public String getTipoUsuario() 
    {
            return tipo;
    }

    @Override
    public boolean ingresar(String login,String pass) {
    	if (this.login.equals(login) && this.password.equals(pass)) {
			return true;
		}
		else {
			return false;
		}
    }
	@Override
	public void SetTipoUsuario(String tip) {
					
			this.tipo=tip;
		
	}
}



