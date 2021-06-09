package Controlador;


import Controlador.Conexion;
import Modelo.Servicios;
import Modelo.Trabajadores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inmamesa98
 */
public class GestionSer {
    
    public static Servicios s;
    public static PreparedStatement ps;
    
    public static ArrayList<Servicios> servicioList= new ArrayList<Servicios>();
    
    public static ArrayList servicio()throws SQLException
    {
        servicioList.clear();
        String consulta ="SELECT * FROM SERVICIOS";
        System.err.println("ok1");
        
        
        try
        {
            ps = Conexion.getConexion().prepareStatement(consulta);
        }
        catch(SQLException ex)
        {
            System.err.println("Error consulta");
        }
         ResultSet rs;
            try
            {
                
               rs =ps.executeQuery();
            
              int con=0;
            while(rs.next())
            {
                
                s = new Servicios(rs.getInt("numeroServicio"),rs.getString("nombre")
                ,rs.getInt("precio"),rs.getInt("idT"),rs.getString("imagen"));
                
                servicioList.add(s);
                con++;
            }
            System.err.println(con);
            rs.close();
        }
        catch(SQLException ex)
        {
            System.err.println("Error consulta");
        }
       
        return servicioList;
    }
    
    public static ArrayList cargarServicios() {

        try {
            Connection con = Conexion.getConexion();

            String consulta = "select * from servicios";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);

            servicioList = new ArrayList<>();

            while (rs.next()) {
                
                s = new Servicios(rs.getInt("numeroServicio"),rs.getString("nombre")
                ,rs.getInt("precio"),rs.getInt("idT"),rs.getString("imagen"));
                
                servicioList.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionSer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return servicioList;
    }
    public static ArrayList servicioN(String nombre)throws SQLException
    {
        servicioList.clear();
        String consulta ="SELECT * FROM SERVICIOS WHERE nombre='"+nombre+"'";        
        
        
        try
        {
            ps = Conexion.getConexion().prepareStatement(consulta);
        }
        catch(SQLException ex)
        {
            System.err.println("Error consulta");
        }
         ResultSet rs;
            try
            {
                
               rs =ps.executeQuery();
            
            while(rs.next())
            {
                
                s = new Servicios(rs.getInt("numeroServicio"),rs.getString("nombre")
                ,rs.getInt("precio"),rs.getInt("idT"),rs.getString("imagen"));
                
                servicioList.add(s);
                
            }
            
            rs.close();
        }
        catch(SQLException ex)
        {
            System.err.println("Error consulta");
        }
       
        return servicioList;
    }
    
}
