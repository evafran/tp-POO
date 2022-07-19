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
    private Sistema sistema;

    public Administrador(int idAdm, Sistema sistema, int id, String nome, String cpf, String dataNascimento, String endereco, String email, String telefone) {
        super(id, nome, cpf, dataNascimento, endereco, email, telefone);
        this.idAdm = idAdm;
        this.sistema = sistema;
    }

    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
   
    public void adicionarFuncionario( int id, String nome, String cpf, String dataNascimento,
               String endereco, String email, String telefone ){
        
        
        
        Funcionario funcionario = new Funcionario(id,nome,cpf,dataNascimento,endereco,email,telefone);
    
        sistema.getFuncionarios().add(funcionario);
          
         
    }
    public void removerFuncionario(int id){
        sistema.getFuncionarios().remove(id);
    }
    
    @Override
    public String toString(){
    
    return String.format(super.toString());
    }
}
