/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Toshiba
 */
public class pagosefectivo {

    public String valor;
    public String loginConductor;
    public String loginPasajero;
    
    public void establecerParametros(String parametros) {
	String[] parametrosBanco = parametros.split(",");
	setValor(parametrosBanco[0]);
	setLoginConductor(parametrosBanco[1]);
	setLoginPasajero(parametrosBanco[2]);
    }

    public String obtenerParametros() {
		return "Valor: " + getValor() + ". Documento conductor: " + getLoginConductor()
		+ ". Documento pasajero: " + getLoginPasajero();
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getLoginConductor() {
        return loginConductor;
    }

    public void setLoginConductor(String loginConductor) {
        this.loginConductor = loginConductor;
    }

    public String getLoginPasajero() {
        return loginPasajero;
    }

    public void setLoginPasajero(String loginPasajero) {
        this.loginPasajero = loginPasajero;
    }
}
