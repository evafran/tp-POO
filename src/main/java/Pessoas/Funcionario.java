/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;


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
   
    
    
    public void criarConta(int idConta, String tipoConta, int agencia, int numeroConta, double saldoConta, Cliente cliente, Funcionario funcionario, Agencia a,String senha){
        Conta conta = new Conta(idConta, tipoConta, agencia, numeroConta, saldoConta, cliente,senha);
        listaContas.add(conta);
        System.out.println("conta adicionado com sucesso!");
    }
    
    
    
    public void removerConta(Conta conta){ 
        listaContas.remove(conta);
        System.out.println("conta removida com sucesso!");
    } 
    
    public void adicionarAgencia(Agencia a){ //aqui tbm
        //método para adicinar agência
        listaAgencias.add(a);
        System.out.println("agencia adicionado com sucesso!");
        
    }
    
    public void removerAgencia(Agencia a){
        
        listaAgencias.remove(a);
        System.out.println("Agência removida com  sucesso! ");
    }
    public void alterarSenha(Conta conta,String senha){
        conta.setSenha(senha);
        System.out.println("senha atualizada com sucesso! ");
        
    }
    public void returnInfos(){
        System.out.println("id: " + Funcionario.super.getId());
        System.out.println("nome: " + Funcionario.super.getNome());
        System.out.println("cpf: " + Funcionario.super.getCpf());
        System.out.println("data de nascimento: " + Funcionario.super.getDataNascimento());
        System.out.println("email: " + Funcionario.super.getEmail());
        System.out.println("endereço: " + Funcionario.super.getEndereco());
        System.out.println("telefone: " + Funcionario.super.getTelefone());
    }
     
  
  @Override
    public void AlterarEndereco(){}
    
    
    
    @Override
    public String toString(){
    
    return String.format(super.toString());
    }

    
    
  } 
    
   







    
   
 