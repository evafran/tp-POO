/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

import java.util.LinkedList;
/**
 *
 * @author eva
 */

public class Agencia implements Listas, Comparable< Agencia>{
    
    private String nome;
    private String cidade;
    private int codigoAgencia;
    private LinkedList<Cliente>  listClientes = new LinkedList<>();
    private LinkedList<Funcionario> listFuncionario = new LinkedList<>();
    private LinkedList<Administrador> listAdm = new LinkedList<>();
    private LinkedList<Conta> listConta = new LinkedList<>();
    
    //construtor
    public Agencia(String nome,String cidade,int codigoAgencia ){
        
        this.nome = nome;
        this.cidade = cidade;
        this.codigoAgencia = codigoAgencia;
        listaAgencias.add(this);
        
    }

    //getters e setters dos atributos da classe agência e método de remoção
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(int codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public int getListClientes() {
        return listClientes.size();
    }

    public void setListClientes(Cliente c ) {
        this.listClientes.add(c);
    }

    public int getListFuncionario() {
        return listFuncionario.size();
    }

    public void setListFuncionario(Funcionario f) {
        this.listFuncionario.add(f);
    }

    public int getListAdm() {
        return listAdm.size();
    }

    public void setListAdm(Administrador a) {
        this.listAdm.add(a);
    }
    
    public int getListConta() {
        return listConta.size();
    }

    public void setListConta(Conta c) {
        this.listConta.add(c);
    }
    
    //métodos para remover clientes,funcionários ,conta e administrador
    public void removerCliente(Cliente c){
        System.out.printf("\ncliente %s removido com sucesso!", c.getNome());
        listClientes.remove(c);
    }
    
    public void removerFuncionario(Funcionario f){
        System.out.printf("\nfuncionário %s removido com sucesso!", f.getNome());
        listFuncionario.remove(f);
    }
    
    public void removerAdministrador(Administrador a){
        System.out.printf("\nAdminsitrador %s removido com sucesso!", a.getNome());
        listAdm.remove(a);
    }
    
    public void removerConta(Conta c){
        System.out.printf("\nconta %s removida com sucesso!", c.getNumeroConta());
        listConta.remove(c);
    }
    
    
   @Override
   public String toString(){
        return String.format( super.toString());
   }

   //métodos para comparar atributos
   public void compararCidades(Agencia a , Agencia b){
       
       String c1 = a.getCidade();
       String c2 = b.getCidade();
       int tam = (c1.compareTo(c2));//compara c1 com c2
      
       if(tam > 0){// se c1 >c2 retorna numero+
           System.out.printf("%s é maior que %s\n", c1, c2);
       }else if(tam < 0){//se c1 <c2 retorna numero-
           System.out.printf("%s é menor que %s\n", c2, c1);
       }else{// se c1 ==c2 retorna 0
           System.out.printf("%s e %s são iguais\n", c1, c2);
       }
   }

    @Override
    public int compareTo(Agencia o) {
        if(this.getCodigoAgencia() == o.getCodigoAgencia()) return 0;
        else if(this.getCodigoAgencia() > o.getCodigoAgencia()) return 1;
        else return -1;
    }
}
