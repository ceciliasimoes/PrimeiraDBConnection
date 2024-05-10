package com.mycompany.conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection{
    private Connection conexao;
    private static DbConnection instance;
    private String user = "gybbunxv";
    private String password = "BV6Yv-2zLXg1-wU7VrUP_vIY9TXOqhVS";
    private String urlElephantSQL = "jdbc:postgresql://silly.db.elephantsql.com/gybbunxv";

    private DbConnection(){
        try{
            conexao =  DriverManager.getConnection(urlElephantSQL,user,password);
            System.out.println("Conexão bem sucedida!");
        }catch (SQLException e){
            System.out.println("Conexão falhou!");
            e.getMessage();
        }
    }

    public static DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }

    public Connection getConexao(){
        return conexao;
    }
    

}