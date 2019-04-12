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

 
import java.util.HashMap;
import java.util.Map;
 
public class ContenedorPagoGeneral {
 
private static Map<String,PagoGeneral> pagoGeneral= new HashMap<String, PagoGeneral>();
public static PagoGeneral getPagoGeneral(int precio, String tipo) {
if ("Debitar"== tipo){
    precio= precio*-1;
}

String clave=precio+":"+tipo;
 
System.out.println(clave);
 
if (!pagoGeneral.containsKey(clave)) {
 
pagoGeneral.put(clave,new PagoGeneral(precio, tipo));
}
return pagoGeneral.get(precio);
}
}
