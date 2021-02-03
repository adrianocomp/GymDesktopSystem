/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author auditorio
 */
public class Conexao {
    
    Connection con = null;
    
    public void conectar(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/powergym", "root", "Extrem@X");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void desconectar(){
        try{
        con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
