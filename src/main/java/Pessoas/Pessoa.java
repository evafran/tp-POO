package Pessoas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eva
 */
public abstract  class Pessoa { 
 
    private int id;
    private String nome;     
    private String cpf;
    private String dataNascimento;     //criando a sperclasse abstrata pesssoa com todos atributos private
    private String endereco;           //controle de acesso dos dados 
    private String email;
    private String telefone;
    
    //construtor com sete parâmetros
    public Pessoa(int id, String nome, String cpf, String dataNascimento,
            String endereco,String email, String telefone ){
        
        this.id = id;
        this.nome = nome; 
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    
    //getters e setters
    public void setId( int id){
    
        this.id = id;
    }
    public int getId(){
        
        return id;
    }
   
    public void setNome(String nome){
        
       this.nome = nome;  
        
    }
    
    public String getNome(){
    
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
        
    public String getCpf(){
    
        return cpf;
    }
    
    public void setDataNascimento(String dataNascimento){
        
        this.dataNascimento = dataNascimento;
    
    }
    public String getDataNascimento(){
    
        return dataNascimento;
    }
    public void setEndereco(String endereco){
    
        this.endereco = endereco;
    }
    public String getEndereco(){
     
        return endereco;
    }
    
    public void setEmail(String email){
    
        this.email = email;
    
    }
    public String getEmail(){
    
        return email;
    
    }
    public void setTelefone(String telefone){
    
        this.telefone = telefone;
    }
    
    public String getTelefone(){
    
        return telefone;
    }
    

    public abstract void retornarInfos(); 
 
    @Override
    public String toString(){
    
        return String.format(super.toString());  //metodo sobreescrito
    }
}







    
    
    
    
    


    

