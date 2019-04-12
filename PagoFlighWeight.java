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

 
public class PagoFlighWeight implements CambioInt {
 
private int id;
private String tipo;
private PagoGeneral pagoGeneral;
 
public PagoFlighWeight(int id, PagoGeneral pagoGeneral) {
super();
this.id = id;
 
}
 
public int getPrecio() {
return pagoGeneral.getPrecio();
}
 

 
@Override
public String getTipo() {
return tipo;
}

@Override
    public int getId() {
        return id;
    }




 
}
