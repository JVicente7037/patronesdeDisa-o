
package UsuarioAdapter;

public abstract class Usuario {
    abstract public String getLogin();
    abstract public String getPassword();
    abstract public String getTipoUsuario();
    abstract public void setPassword(String pass);
    abstract public void setLogin(String login);
    abstract public boolean ingresar(String login,String pass);
    abstract public void SetTipoUsuario(String tip);
}
