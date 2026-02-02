package model;
public class Usuario {
    private String nome;
    private String cpf;
    
    public Usuario(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return cpf;
    }
}
