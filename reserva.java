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
public class reserva {
   
        private String nombreReserva;
	private int puestosReserva;
	private String loginPasajero;

	

	public reserva(String nombreReserva, int puestosReserva,
			String loginPasajero) {
		
		this.nombreReserva = nombreReserva;
		this.puestosReserva = puestosReserva;
		this.loginPasajero = loginPasajero;
	}

    public String getNombreReserva() {
        return nombreReserva;
    }

    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
    }

    public int getPuestosReserva() {
        return puestosReserva;
    }

    public void setPuestosReserva(int puestosReserva) {
        this.puestosReserva = puestosReserva;
    }

    public String getLoginPasajero() {
        return loginPasajero;
    }

    public void setLoginPasajero(String loginPasajero) {
        this.loginPasajero = loginPasajero;
    }
        
    @Override
    public String toString() {
	return "Reserva [nombreReserva=" + nombreReserva + ", puestoRutaReservada=" + puestosReserva
		+  "Login del Pasajero=" + loginPasajero + "]";
    }
}

