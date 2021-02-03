/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Adriano
 */
public class Aluno {
    private String login;
    private String cpf;
    private String endereco;
    private String data_entrada;
    private String senha;
 
    public Aluno(String login, String cpf, String endereco, String data_entrada, String senha){
        this.login = login;
        this.cpf = cpf;
        this.endereco = endereco;
        this.data_entrada = data_entrada;
        this.senha = senha;
    }
  
    
    public String getLogin() {
        return login;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
