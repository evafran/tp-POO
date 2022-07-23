/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author eva
 
*/
public class Sistema implements Listas{
    
    private static int countStatic; //variável static
    protected int  countProtected;
    
    //métodod para funcionário adicionar um novo cliente 
    public void adicionarCliente(int id, String nome, String cpf, String dataNascimento, String endereco,
        String email, String telefone, Sistema s){
        
        Cliente cliente = new Cliente(id, nome, cpf, dataNascimento, endereco, email, telefone,s);
        listaClientes.add(cliente);
        
        System.out.println("cliente adicionado com sucesso!");
        System.out.println(getCount());
        System.out.println(countProtected);
    }
    
    public  static void addCount(){
        countStatic+=1;  
       //toda vez que um cliente for instanciado ele vai adicionar + 1 ao contador. 
    }
     
    public static void subCount(){
        countStatic-=1;  
        
    }
    public static  int getCount(){
        
        return countStatic;//retornar o contador estático da quantidades de clientes
    }
    
    
    public void editarCliente(int id, String nome, String cpf, String dataNascimento, String endereco,
          String email, String telefone, Cliente cliente){

        listaClientes.remove(cliente);
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setDataNascimento(dataNascimento);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        listaClientes.add(cliente);
        System.out.println("dados atualizados: ");
        cliente.returnInfos();
        
    }
    public void removeCliente(Cliente cliente){
        listaClientes.remove(cliente);
        subCount();
        System.out.println("cliente removido com sucesso!");
    }
    
    //métodos para adiconar, editar e remover e funcionários
    public void adicionarAdm(int idAdm, int id, String nome, String cpf, String dataNascimento, String endereco, String email, String telefone){
      
        Administrador adm = new Administrador( idAdm,  id,  nome,cpf, dataNascimento, endereco, email,telefone);
        
        listaAdm.add(adm);
        System.out.println("adicionado com sucesso: ");
        adm.returnInfos();
        
    }
    public void editarAdm(int idAdm, int id, String nome, String cpf, String dataNascimento, String endereco, String email, String telefone,Administrador adm){
        
        listaAdm.remove(adm);
        adm.setIdAdm(idAdm);
        adm.setId(id);
        adm.setNome(nome);
        adm.setCpf(cpf);
        adm.setDataNascimento(dataNascimento);
        adm.setEndereco(endereco);
        adm.setEmail(email);
        adm.setTelefone(telefone);
        listaAdm.add(adm);
        System.out.println("editado com sucesso! ");
        adm.returnInfos();
        
    }
    
    public void removerAdm(Administrador adm){
        
        listaAdm.remove(adm);
        System.out.println("removido com sucesso! ");
        
    }
    @Override
    public String toString(){

        return String.format( super.toString()); //método tosTRING sobreescrito.
    }

}

