
package UsuarioAdapter;

public class AdminAdapter extends Usuario {
    private Admin admin;   

    public AdminAdapter(Admin admin) {
        this.admin = admin;
    }
    
    
    public AdminAdapter(){
        super();
        
        // JOptionPane.showMessageDialog(null, "Creando nuevo Admin");
    }

    @Override
    public String getLogin()
    {
        String log = this.admin.getUsuario();
        return log;
    }

    

    @Override
    public void setPassword(String pass) {
    	this.admin.setContrasena(pass);
    }

    @Override
    public void setLogin(String login) {
        this.admin.setUsuario(login);
    }

    @Override
    public boolean ingresar(String login,String pass) {
    	boolean test = false;
		if(this.admin.Log(login, pass) == true)
		{
			
			test = true;
			
		}
		return test;
    }

    @Override
    public String getTipoUsuario() {
        String tipe = this.admin.getTipeUser();
        return tipe;
    }

	@Override
	public void SetTipoUsuario(String tip) {
		this.admin.SetTipeUser(tip);
	}

	@Override
	public String getPassword() {
		String passw = this.admin.getContrasena();
        return passw;
	}

    
    
}
