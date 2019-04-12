/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
/**

public class MediosTransportess implements Component{
 
    private ArrayList <Component> componente;
    private String nombre;
    private String tipo;
    private String placa;
    private String cantidadpuestos;
    private String marca;
    private String año;
    private String referencia;

    public MediosTransportess(String nombre, String tipo, String placa, String cantidadpuestos , String marca, String año,String referencia) {
        
        this.nombre = nombre;
        this.tipo= tipo;
        this.placa= placa;
        this.cantidadpuestos= cantidadpuestos;
        this.marca= marca;
        this.año= año;
        this.referencia= referencia;
        this.componente = new ArrayList<>();
     }
    
    public MediosTransportess() {
        this.nombre = "";
        this.tipo = "";
        this.placa = "";
        this.cantidadpuestos= "";
        this.marca="";
        this.año="";
        this.referencia="";
        this.componente = new ArrayList<>();
    }
    
    
    
    @Override
    public void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarporNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
*/