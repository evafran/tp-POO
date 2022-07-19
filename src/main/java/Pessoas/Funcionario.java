/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

import java.util.LinkedList;

/**
 *
 * @author eva
 */
public class Funcionario extends Pessoa implements Listas{
    //private int idFuncionario;
    //Agencia funcionario = new Agencia();
    
    public Funcionario(int id, String nome, String cpf, String dataNascimento,
               String endereco, String email, String telefone){

       super(id,  nome, cpf, dataNascimento, endereco, email, telefone);
              
       }
    //métodod para funcionário adicionar um novo cliente 
    public void adicionarCliente(int id, String nome, String cpf, String dataNascimento, String endereco,
        String email, String telefone, Funcionario funcionario, Agencia a){
        
        Cliente cliente = new Cliente(id, nome, cpf, dataNascimento, endereco, email, telefone);
        listaClientes.add(cliente);
        System.out.println("cliente adicionado com sucesso!");
        
    }
    
    public void criarConta(int idConta, String tipoConta, int agencia, int numeroConta, double saldoConta, Cliente cliente, Funcionario funcionario, Agencia a){
        Conta conta = new Conta(idConta, tipoConta, agencia, numeroConta, saldoConta, cliente);
        listaContas.add(conta);
        System.out.println("conta adicionado com sucesso!");
    }
  
    public void removeCliente(Cliente cliente, Funcionario funcionario, Agencia a){
        listaClientes.remove(cliente);
        System.out.println("cliente removido com sucesso!");
    }
    
    public void removerConta(Conta conta,Funcionario funcionario, Agencia a){
        listaContas.remove(conta);
        System.out.println("conta removida com sucesso!");
    }  

 // método para exibição dos dados do funcionário
   // public void exibirInfos(){
       // System.out.printf("\nNome: %s",);
       // System.out.printf("\nId: %s",super.id);
       // System.out.printf("\nCpf: %s",super.cpf);
        
    //}
     
  
  @Override
    public void AlterarEndereco(){}
    
    
    
    @Override
    public String toString(){
    
    return String.format(super.toString());
    }
  } 
    
   







    
   
 