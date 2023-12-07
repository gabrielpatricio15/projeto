package br.com.login.model;


public class Login {
    
private String nome, email, senha;

    public Login(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }


    public void cadastrar(String nome, String email, String senha){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    
    
    
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    
}
