/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author inmamesa98
 */
public class Servicios {
    
    private int numeroServicio;
    private String nombre;
    private int precio;
    private int idT;
    private String imagen;
    
    
    public Servicios(int numeroServicio, String nombre, int precio,int idT, String imagen){
        this.numeroServicio = numeroServicio;
        this.nombre = nombre;
        this.precio = precio;
        this.idT = idT;
        this.imagen =imagen;
    }

    

    public int getNumeroServicio() {
        return numeroServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNumeroServicio(int numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return numeroServicio + "           " + nombre + "          " + precio + "          "+ idT;
    }
    
}

