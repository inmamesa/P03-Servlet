package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inmamesa98
 */
public class Trabajadores {
    private int id;
    private int DNI;
    private String nombreT;
    private String apellidosT;
    private float beneficio;
    

    public Trabajadores() {
        
    }
    public Trabajadores(int id, int DNI, String nombreT, String apellidosT){
        this.id = id;
        this.DNI = DNI;
        this.nombreT = nombreT;
        this.apellidosT = apellidosT;
        
    }

   
    public int getDNI() {
        return DNI;
    }

    public String getNombreT() {
        return nombreT;
    }

    public String getApellidosT() {
        return apellidosT;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public void setApellidosT(String apellidosT) {
        this.apellidosT = apellidosT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
    
    
}
