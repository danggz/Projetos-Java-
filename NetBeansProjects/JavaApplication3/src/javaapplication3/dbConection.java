/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
    import java.sql.*;
/**
 *
 * @author info2507
 */
public class dbConection {
    static String url="jdbc:mysql://127.0.0.1:3306/cadproduto";
    static String user="daniel";
    static String pass="17965009684Dd@";
    
    public static Connection conectar(){
        
        Connection con=null;
        try
        { 
        con=DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão bem sucedida");
        }catch(SQLException e){
        e.printStackTrace();
        }
        return con;
        }
    }

