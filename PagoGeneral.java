/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightsuper;

/**
 *
 * @author User1
 */

 
public class PagoGeneral {
 
private int precio;
private String tipo;
private static int contador;
 
public PagoGeneral(int precio, String tipo) {
super();

this.tipo = tipo;

this.precio = precio;

contador++;
System.out.println("contador ligero: "+ contador);
}
public int getPrecio() {
return precio;
}
public void setPrecio(int precio) {

this.precio = precio;
if (this.tipo=="debit"){

}
}

public String getTipo() {
        return tipo;
    }

public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
