/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List;
import javax.swing.table.DefaultTableModel;

import Modelo.Aluno;
import Modelo.Aluno;

/**
 *
 * @author Adriano
 */
public class ControleAluno {
    String INSERT_ALUNO = "INSERT INTO aluno (login, cpf, endereco, dt_cadastro, senha) VALUES (?,?,?,?,?)";
    String SELECT_ALUNO = "Select * from aluno";
    String UPDATE_ALUNO = "UPDATE ALUNO set login = ?, "
            + "endereco = ?, dt_cadastro = ?, "
            + "senha = ? where cpf = ?";
    String DELETE_ALUNO = "DELETE FROM ALUNO where cpf = ?";
    boolean retorno = false;
    Conexao conecta = new Conexao();
    public ResultSet result;
    
    public boolean insertAluno(Aluno aluno) throws SQLException{
        
        try{
            conecta.conectar();
            PreparedStatement prepared = conecta.con.prepareStatement(INSERT_ALUNO);
            prepared.setString(1, aluno.getLogin());
            prepared.setString(2, aluno.getCpf());
            prepared.setString(3, aluno.getEndereco());
            prepared.setString(4, aluno.getData_entrada());
            prepared.setString(5, aluno.getSenha());
            retorno = prepared.execute();
            listarAluno();
        } catch(Exception e){
            e.printStackTrace();
        }
         return retorno;
    }
    
    public ResultSet listarAluno(){
        conecta.conectar();
        try{
        Statement sentenca = conecta.con.createStatement(result.TYPE_SCROLL_INSENSITIVE, result.CONCUR_READ_ONLY);
        result = sentenca.executeQuery(SELECT_ALUNO);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public void atualizaAluno(Aluno aluno){
        conecta.conectar();
        try{
        PreparedStatement prepared = 
       conecta.con.prepareStatement(UPDATE_ALUNO);
            prepared.setString(1, aluno.getLogin());
            prepared.setString(2, aluno.getEndereco());
            prepared.setString(3, aluno.getData_entrada());
            prepared.setString(4, aluno.getSenha());
            prepared.setString(5, aluno.getCpf());
            prepared.execute();
            listarAluno();
        } catch(Exception e){
            
        }        
    }
   public void excluirAluno(Aluno aluno){
       conecta.conectar();
       try{
        PreparedStatement prepared = conecta.con.prepareStatement(DELETE_ALUNO);
        prepared.setString(1, aluno.getCpf());
        prepared.execute();
        listarAluno();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
}
