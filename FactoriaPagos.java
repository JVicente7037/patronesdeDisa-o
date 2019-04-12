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

 
public class FactoriaPagos {
public static CambioInt crearPago(int id, int precio, String tipo) {
 
PagoGeneral macLigero=ContenedorPagoGeneral.getPagoGeneral(precio, tipo);
CambioInt pagoGeneral= new PagoFlighWeight(id,macLigero);
return pagoGeneral;
 
 
}
}
