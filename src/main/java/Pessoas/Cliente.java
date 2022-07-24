package Pessoas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eva
 */
public class Cliente extends Pessoa implements Comparable<Cliente>{
    
    //construtor e o construtor da superclasse abstrata 
    public Cliente(int id, String nome, String cpf, String dataNascimento, String endereco, 
            String email,String telefone, Sistema s, Agencia a){
        
        super(id, nome, cpf,dataNascimento, endereco, email,telefone);
        Sistema.addCount();//método de sistema adicionar mais um cliente for instaciado 
        s.countProtected +=1;//cada vez que o cliente for instanciado vai somar mais 1 á quantidade de cliente
        a.setListClientes(this);
        
    }

    //métodos para exibir informações das contas.
    public void acessarConta(Conta conta){
     
        conta.exibirInfoConta();
        
    }
    
    //método para o cliente altera dados pessoais ,somente os que estão passado como parâmentros.
    public void alterarDadosPessoais(String endereco,String email,String telefone){
        
        // os setters permite o acesso e alterações das informações.
        setEndereco(endereco);
        setEmail(email);
        setTelefone(telefone);
        System.out.println("dados atualizados com sucesso !");
        retornarInfos();
        
    }
    
    //método para retoranar informações do cliente
    

    @Override
    public void retornarInfos(){
        
        System.out.println("nome: "  + Cliente.super.getNome());
        System.out.println("cpf: " + Cliente.super.getCpf());
        System.out.println("data nascimento: " + Cliente.super.getDataNascimento());
        System.out.println("Endereco: " + Cliente.super.getEndereco());
        System.out.println("email: " + Cliente.super.getEmail());
        System.out.println("Telefone: " + Cliente.super.getTelefone());
        
    }
    @Override
    public String toString(){
    
        return String.format(super.toString());
    }

    @Override
    public int compareTo(Cliente o) {
        if(this.getId() == o.getId()) return 0;
        else if(this.getId() > o.getId()) return 1;
        else return -1;
    } 
}
    
        
    



