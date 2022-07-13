/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author eva
 */
public class Funcionario extends Pessoa {
    //private int idFuncionario;
    public Funcionario(int id, String nome, String cpf, String dataNascimento,
               String endereco, String email, String telefone){

       super(id,  nome, cpf, dataNascimento, endereco, email, telefone);
              
       }
    
    public void adicionarCliente(int id, String nome, String cpf, String dataNascimento, String endereco,
            String email,String telefone, Agencia agenciaBancaria){
        Cliente cliente = new Cliente(id, nome, cpf, dataNascimento, endereco, email, telefone);

        agenciaBancaria.getListaClientes().add(cliente);
    }
    
    public void criarConta(int idConta, String tipoConta, int agencia, int numeroConta, double saldoConta, Cliente cliente, Agencia agenciaBancaria){
        Conta conta = new Conta(idConta, tipoConta, agencia, numeroConta, saldoConta, cliente);
        agenciaBancaria.getListaContas().add(conta);
    }
  
    public void removeCliente(Cliente cliente, Agencia agenciaBancaria){
        agenciaBancaria.getListaClientes().remove(cliente);
    }
    
    public void removerConta(Conta conta,Agencia agenciaBancaria){
        agenciaBancaria.getListaContas().remove(conta);
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
    
   







    
   
 