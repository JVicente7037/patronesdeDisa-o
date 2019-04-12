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
public class FlyWeightSuper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CambioInt m1= FactoriaPagos.crearPago(1,1200,"Debitar");
        CambioInt m2= FactoriaPagos.crearPago(2,3,"Creditar");
        CambioInt m3= FactoriaPagos.crearPago(3,1200,"Debitar");
        CambioInt m4= FactoriaPagos.crearPago(4,1200,"Creditar");
    }
    
}
