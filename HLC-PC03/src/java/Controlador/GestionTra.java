package Controlador;


import Controlador.Conexion;
import Modelo.Trabajadores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class GestionTra {
    
     public static Trabajadores t;
    public static PreparedStatement ps;
    
    public static boolean validar(int id,String nombreT)
    {
        String consulta ="SELECT * FROM TRABAJADORES WHERE id= ? AND nombreT=?";
        
        
        try
        {
            ps = Conexion.getConexion().prepareStatement(consulta);
        }
        catch(SQLException ex)
        {
            System.err.println("Error consulta");
        }
        ResultSet rs;
        if(Conexion.isConectado())
        {    
            try
            {
            ps.setInt(1,id);
            ps.setString(2,nombreT);
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                System.out.println("Validacion Correcta");
                
                t = new Trabajadores(
                        rs.getInt("id"),
                        rs.getInt("DNI"),
                        rs.getString("nombreT"),
                        rs.getString("apellidosT")
                );
                return true;
                
            }
        }
         catch(SQLException ex)
        {
            return false;
        }
        }else
        {
            return false;
        }
       
        return false;
    }
}
