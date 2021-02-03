/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;
import Modelo.Aluno;
import Controle.ControleAluno;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author Adriano
 */
public class ControladorPrincipal {
    public static JFrame janela ;
    public static JPanel menuAluno;
    public static JPanel loginGeral;
    public static JPanel cadastroAluno;
    public static ArrayList<Aluno> listaDeAlunos;
    
    public static Aluno aluno;
    public static ControleAluno gravaaluno;
    public static void main(String[] args) {
        janela = new Janela();
        loginGeral = new LoginGeral();
        menuAluno = new MenuAluno();
        cadastroAluno = new Cadastro_Aluno();
        listaDeAlunos = new ArrayList<Aluno>();
        
        gravaaluno = new ControleAluno();
        
        janela.setVisible(true);
        janela.setContentPane(loginGeral);
        
        
    }
}
