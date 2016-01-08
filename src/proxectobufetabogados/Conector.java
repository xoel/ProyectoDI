/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectobufetabogados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class Conector {

    String url = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\ProxectoBufetAbogados\\src\\Bufet.sqlite";
    Connection connect;

    public Conector() {
    }

    public void connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("Error de conexion: "+ex);
        }
    }
    
    public void close(){
        try {
            connect.close();
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);            
        }
    }

}
