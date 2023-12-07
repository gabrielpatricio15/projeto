package br.com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection() throws SQLException {
    Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto", "postgres", "lg1811");
    return conexao;
    
    
    
    }
    
    
    
    
}
