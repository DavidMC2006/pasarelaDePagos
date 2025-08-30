/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zambr
 */
public class ConexionPasarela {
     //unica intancia de siglenton 
    private static ConexionPasarela instance;
    
    //Objeto de conexion
  private Connection con;
  
  //parametros de conexion 
  private final String url = "jdbc:mysql://localhost:3306/pasarela_de_pagos";
    private final String user = "root";
    private final String pass = "";
    //contructor privado que nadie mas puede intanciar 
    
    private ConexionPasarela(){}
    
    public static ConexionPasarela getInstance() {
        if (instance == null) {
            instance = new ConexionPasarela();
        }
        return instance;
    }
   public java.sql.Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver"); 
        return DriverManager.getConnection(url, user, pass);
    }
        
                
    
    
}
