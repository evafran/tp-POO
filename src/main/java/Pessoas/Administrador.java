/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;
/**
 *
 * @author eva
 */
public class Administrador extends Funcionario implements Listas{
    private int idAdm;

    public Administrador(int idAdm, int id, String nome, String cpf, String dataNascimento, String endereco, String email, String telefone) {
        super(id, nome, cpf, dataNascimento, endereco, email, telefone);
        this.idAdm = idAdm;
       
    }

    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

  
    
   
    public void adicionarFuncionario( int id, String nome, String cpf, String dataNascimento,
               String endereco, String email, String telefone, int i ){
        
        
        
        Funcionario f = new Funcionario(id,nome,cpf,dataNascimento,endereco,email,telefone);
    
        colaboradores[i] = f;
        listaFuncionarios.add(f);
        
          
         
    }
    
    public void editarFuncionario(int id, String nome, String cpf, String dataNascimento,
               String endereco, String email, String telefone, Funcionario funcionario){
        
        listaFuncionarios.remove(funcionario);
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setDataNascimento(dataNascimento);
        funcionario.setEndereco(endereco);
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);
        listaFuncionarios.add(funcionario);
        System.out.println("dados atualizados com sucesso!");
        funcionario.returnInfos();
        
    }
            
    public void removerFuncionario(Funcionario f){
        listaFuncionarios.remove(f);
        System.out.printf("funcionário %s removido com sucesso: \n", f.getNome());
        
        
    }
    @Override
    public void returnInfos(){
        
        System.out.println("idAdm: " +getIdAdm());
        System.out.println("id: " + Administrador.super.getId());
        System.out.println("nome: " + Administrador.super.getNome());
        System.out.println("cpf:  "  + Administrador.super.getCpf());
        System.out.println("data de nascimento: " +Administrador.super.getDataNascimento());
        System.out.println(" endereço: "  +Administrador.super.getEndereco());
        System.out.println(" email:  "  +Administrador.super.getEmail());
        System.out.println("telefone:  " +Administrador.super.getTelefone());
    }
    
    @Override
    public String toString(){
    
    return String.format(super.toString());
    }
}
