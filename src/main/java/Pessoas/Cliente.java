package Pessoas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eva
 */
public class Cliente extends Pessoa{

    public Cliente(int id, String nome, String cpf,
          String dataNascimento, String endereco, String email,String telefone){
        
        super(id, nome, cpf,dataNascimento, endereco, email,telefone);
       
        
    }


    @Override
    public void AlterarEndereco(){
        
    }
    @Override
    public String toString(){
    
    return String.format(super.toString());
    }
}
    
        
    



