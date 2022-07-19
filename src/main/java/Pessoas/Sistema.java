/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;
import java.util.LinkedList;

/**
 *
 * @author eva
 *///classe Sistema para criar lista dinâmica para novas contas e clientes e o vetor 
//estático pra guardar os 25 colaboradores do banco.
public class Sistema{
   //vetor estático 
    Funcionario[] funcionario = new Funcionario[25];
    
    //lista dinâmica da estrutura de classes da interfacecollection  inseri ou remove 
    
    private LinkedList<Agencia> agencias = new LinkedList<Agencia>();
    private LinkedList< Cliente> clientes = new LinkedList<Cliente>();
    private LinkedList< Conta> contas = new LinkedList<Conta>();
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
    
   //usando o get para retonar o valor do atributo e controlando o acesso de manipulação dos dados.
    
    public LinkedList<Agencia> getAgencias(){
    
        return agencias;
    }
    public LinkedList<Cliente > getClientes(){
    
        return clientes;
    }
    public LinkedList<Conta> getContas(){
    
        return contas;
    }
    public LinkedList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
}
