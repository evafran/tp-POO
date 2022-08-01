/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author eva
 
*/
public class Sistema implements Listas{
    
    private static int countStatic; //variável static
    protected int  countProtected;//variável protected
    
    
    
    public static void addCount(){
        
        countStatic+=1;  
       //toda vez que um cliente for instanciado ele vai adicionar + 1 ao contador. 
    }
     
    public static void subCount(){
        countStatic-=1;  
        
    }
    public static  int getCount(){
        
        return countStatic;//retorna o contador estático da quantidades de clientes
    }
     
    
    //métodod para funcionário adicionar um novo cliente 
    public void adicionarCliente(int id, String nome, String cpf, String dataNascimento,
            String endereco,String email, String telefone, Sistema s, Agencia a){
        
        Cliente cliente = new Cliente(id, nome, cpf, dataNascimento, endereco, email, telefone, s, a);
        listaClientes.add(cliente);
        
        System.out.printf("\ncliente %s adicionado com sucesso!\n",nome);
        
       
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
        System.out.printf("\ndados  do cliente %s atualizados: \n",cliente.getNome());
        cliente.retornarInfos();
        
    }
    
    public void removeCliente(Cliente cliente, Agencia a){
        
        listaClientes.remove(cliente);
        subCount();
        a.removerCliente(cliente);
        System.out.printf("\ncliente %s deletado com sucesso! \n", cliente.getNome());
    }
    
    //métodos para adiconar, editar e remover e funcionários
    public void adicionarAdm(int idAdm, int id, String nome, String cpf, String dataNascimento,
            String endereco, String email, String telefone, Agencia a){
      
        Administrador adm = new Administrador( idAdm,  id,  nome,cpf, dataNascimento, endereco,
                email,telefone, a);
        
        System.out.println("adicionado com sucesso: ");
        adm.retornarInfos();
        
    }
    
    public void editarAdm(int idAdm, int id, String nome, String cpf, String dataNascimento,
            String endereco, String email, String telefone,Administrador adm){
        
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
        adm.retornarInfos();
        
    }
    
    public void removerAdm(Administrador adm, Agencia a){
        
        listaAdm.remove(adm);
        System.out.println("removido com sucesso! ");
        a.removerAdministrador(adm);
    }
    
    //métodos para salvar os objetos em um json
    public void jsonClientes()throws IOException{
        
        FileWriter fw = new FileWriter("clientes.json"); //o arquivo json será criado no diretório do projeto
        for(Cliente c: listaClientes){
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try{
                
                String json = gson.toJson(c);
                fw.write(json);
                fw.flush();
                System.out.println(json);
                
            }catch (IOException e){
                System.out.println("erro:" + e);
            }   
        } 
    }
    
    public void jsonAgencias()throws IOException{
        
        FileWriter fw = new FileWriter("agencias.json");
        for(Agencia a: listaAgencias){
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try{
                
                String json = gson.toJson(a);
                fw.write(json);
                fw.flush();
                System.out.println(json);
                
            }catch (IOException e){
                System.out.println("erro:" + e);
            }   
        } 
    }
    
    public void jsonColaboradores()throws IOException{
        
        FileWriter fw = new FileWriter("colaboradores.json");
        for(Funcionario f: colaboradores){
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try{
                
                String json = gson.toJson(f);
                fw.write(json);
                fw.flush();
                System.out.println(json);
                
            }catch (IOException e){
                System.out.println("erro:" + e);
            }   
        } 
    }
    
    public void jsonContas()throws IOException{
        
        FileWriter fw = new FileWriter("contas.json");
        for(Conta co: listaContas){
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try{
                
                String json = gson.toJson(co);
                fw.write(json);
                fw.flush();
                System.out.println(json);
                
            }catch (IOException e){
                System.out.println("erro:" + e);
            }   
        } 
    }
    
    @Override
    public String toString(){

        return String.format( super.toString()); //método tosTRING sobreescrito.
    }

    

}

