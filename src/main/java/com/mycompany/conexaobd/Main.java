package com.mycompany.conexaobd;


import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acsimoes
 */
public class Main {
    
     public static void main(String[] args) {
        DbConnection db = DbConnection.getInstance();
        Connection conexao = db.getConexao();
        if(conexao != null){
            System.out.println("Sucess");
        }
     }
    
}
    
