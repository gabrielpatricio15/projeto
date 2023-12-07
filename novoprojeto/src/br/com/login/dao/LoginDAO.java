package br.com.login.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException{
        try (Connection conexao = new Conexao().getConnection()) {
            String sql = "INSERT INTO usuario (nome, email, senha) VALUES ('"+nome+"', '"+email+"', '"+senha+"')";
            PreparedStatement statment = conexao.prepareStatement(sql);
            boolean execute = statment.execute();
        }

}
    public void login(String nome, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT nome,senha FROM usuario WHERE nome = '"+nome+"' AND senha = '"+senha+"';";
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        
        if (rs.next()){
            System.out.println("Possui");
        } else {
            System.out.println("Não possoi Usuario cadastrado");
        
        
        
        
        }
    
    }
    
}
