/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author UsuarioPC
 */
public class ReunionGrupos implements Component
{
    private String nombre;
    private String tipo;
    private ArrayList <Component> componentes;
    private String acumulador;
    private static ReunionGrupos reu;
    
    public ReunionGrupos(String nombre)
    {
        setNombre(nombre);
        setComponentes(new ArrayList());
    }
    
    private synchronized static void createIns(String nombre){
    if(reu == null){
        reu = new ReunionGrupos(nombre);
    }
    }
    
    public static ReunionGrupos getIns(String nombre){
        createIns(nombre);
        return reu;
    }
    
    @Override
    public String consulta(String nombre) 
    {
        acumulador=this.nombre;
        for(Component c : componentes)
        {
            acumulador=acumulador.concat(c.consulta(nombre));
        }
        return acumulador;
    }
    
    public void add(Component c)
    {
        getcomponentes().add(c);
    }
    
    public void delete(Component c)
    {
        Iterator<Component> iter = componentes.iterator();
        while(iter.hasNext())
        {
            Component str = iter.next();
            if(str.equals(c))
                iter.remove();
        }
    }
    
    public void modificar(String buscador, String nuevo)
    {
        for(Component c1: componentes)
        {
            if(c1.consulta(buscador).equals(c1.consulta(nombre)))
            {
                c1.modificar(buscador,nuevo);
            }
        }
    }
    
    public ArrayList<Component> getcomponentes()
    {
        return componentes;
    }
    public void setComponentes(ArrayList<Component> componentes)
    {
        this.componentes = componentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String showMedioTransporte() 
    {
        return this.getNombre();
    }
}
