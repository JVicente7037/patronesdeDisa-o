/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author UsuarioPC
 */
public interface Component 
{
    public String consulta(String nombre);
    public void modificar(String buscador, String nuevo);
    public String showMedioTransporte();
    
}
