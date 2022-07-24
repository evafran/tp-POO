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
    
    //construtor
    public Administrador(int idAdm, int id, String nome, String cpf, String dataNascimento, String endereco, String email, String telefone, Agencia a) {
        super(id, nome, cpf, dataNascimento, endereco, email, telefone, a);
        
        this.idAdm = idAdm;
        a.setListAdm(this);
    }

    //getters e setters
    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    //métodos para  adicionar,editar e remover funcionários
    public void adicionarFuncionario( int id, String nome, String cpf, String dataNascimento,
               String endereco, String email, String telefone, int i, Agencia a ){
        
        Funcionario f = new Funcionario(id,nome,cpf,dataNascimento,endereco,email,telefone,a);
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
        funcionario.retornarInfos();
        
    }
            
    public void removerFuncionario(Funcionario f, Agencia a){
        
        listaFuncionarios.remove(f);
        a.removerFuncionario(f);
        System.out.printf("funcionário %s removido com sucesso: \n", f.getNome());
          
    }
    
    @Override
    public void retornarInfos(){
        
        System.out.println("idAdm: " + getIdAdm());
        System.out.println("id: " + Administrador.super.getId());
        System.out.println("nome: " + Administrador.super.getNome());
        System.out.println("cpf: " + Administrador.super.getCpf());
        System.out.println("data de nascimento: " + Administrador.super.getDataNascimento());
        System.out.println("endereço: " + Administrador.super.getEndereco());
        System.out.println("email: " + Administrador.super.getEmail());
        System.out.println("telefone: " + Administrador.super.getTelefone());
    }
    
    @Override
    public String toString(){
    
    return String.format(super.toString());
    }
}
