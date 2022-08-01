/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author eva
 */
public class Conta implements Listas{

    private int idConta;  //criada a classe conta e o construtor com  sete  parâmentros.
    private String tipoConta;
    private int agencia;
    private int numeroConta;  
    private double saldoConta;
    //private Cliente  cliente;
    private String senha;
    private ArrayList<String> extratosBancario = new ArrayList<>();
    
    //construtor
    public Conta(int idConta, String tipoConta, int agencia, int numeroConta, double saldoConta,
            String senha,Agencia a){
    
        this.idConta = idConta;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.numeroConta = numeroConta; 
        this.saldoConta = saldoConta;
        this.senha = senha;
        a.setListConta(this);
        listaContas.add(this);
        
    }

    //Os getters e setters permite o acesso a classe conta e os seus atributos.
    public int getIdConta(){
                           
        return idConta;      
    }
    public String getTipoConta(){
        return tipoConta;
    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumeroConta(){

        return numeroConta;
    }

    public double getSaldoConta(){
 
        return saldoConta;
    
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //método para o cliente sacar o dinheiro,dentro do parâmentro passa o valor 
    public void sacarDinheiro(double valor){
        
          if(this.saldoConta >= valor){    //a condicão é para verificar se o valor é maior  ou igual o saldo
              this.saldoConta -= valor;
              LocalDate dataSaque = LocalDate.now();
              String extrato;
              extrato = "\nData de saque: " + dataSaque.toString()+
                        "\nTipo de transação: débito/saque" +
                        "\nSaldo atual é R$" + Double.toString(saldoConta);
              
              System.out.println(extrato);
              extratosBancario.add(extrato);

          }else{    //caso o saldo é menor que o valor de saque,aparecerá a msg.

              System.out.println("saldo insufiente");
             
          }
     
    }
    
    public void depositarDinheiro(double valor){
        
        this.saldoConta += valor;
        LocalDate dataDeposito = LocalDate.now();
        String extrato;
        extrato = "\ndata de depósito: " + dataDeposito.toString() +
                  "\ntipo de transação crédito/transferência: " +
                  "\nsaldo atual R$" + Double.toString(getSaldoConta());
        
        System.out.println(extrato);
        extratosBancario.add(extrato);
    }
    
    //método para  transferir dinheiro tendo dois paramentros a classe Conta e o objeto da classe e o valor
    public void transferirDinheiro(double valor,Conta conta){
        
        if(this.saldoConta>= valor){
            this.saldoConta -= valor;   // o if é a condicional para verificar  se o valor for maior ou igual o saldo 
            double saldoNovo = conta.getSaldoConta() + valor;
            conta.setSaldoConta(saldoNovo);
            LocalDate dataTransferencia = LocalDate.now();
            String extrato;
            extrato = "\ndata de transferência: " + dataTransferencia.toString() +
                    "\ntipo de transação débito/transferência : " +
                    "\nsaldo atual R$" + Double.toString(saldoConta);
            
            extratosBancario.add(extrato);
            System.out.println(extrato);
            
            String extrato2;
            extrato2 = "\ndata de transferência: " + dataTransferencia.toString() +
                       "\ntipo de transação crédito/transferência : " +
                       "\nsaldo atual R$" + Double.toString(conta.getSaldoConta());
            
            conta.addExtrato(extrato2);
          //código  para conta em que será créditado 
          
        } else{
              System.out.println("saldo insufiente"); //caso não seja aparecerá está msg
        }
   
   }
   
    public void efetuarPagamentos(double valor){//método de efetuar pagamento e verificar extrato,saldo da conta
        
        if(this.saldoConta >= valor){
            this.saldoConta -= valor;
            LocalDate dataTransacao = LocalDate.now();
            
            String extrato;
            extrato = "\nData de transação: " + dataTransacao.toString() + 
                    "\nTipo de transação: débito/pagamento" +
                    "\nO saldo é R$" + Double.toString(getSaldoConta());
            
            System.out.println(extrato);
            extratosBancario.add(extrato);
            
        }else{
            
            System.out.println("saldo insuficente");
        }
        
    }
   
            
    public void exibirInfoConta(){
        
        System.out.println("\nidConta: " + getIdConta()); 
        System.out.println("tipoConta: " + getTipoConta());
        System.out.println("agencia: "  + getAgencia());
        System.out.println("numeroConta: " + getNumeroConta());
        System.out.println("saldoConta: " + getSaldoConta());
        System.out.println("\n"); 
    }
    
    public void exibirExtrato(){
        System.out.println("\n=-=-=-=-=-= Extrato Bancário =-=-=-=-=-=");
        for(int i=0;i<extratosBancario.size();i++){
            System.out.println(extratosBancario.get(i));
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }
    
    public void addExtrato(String s){
        
        extratosBancario.add(s);
    }
    
    @Override
    public String toString(){

        return String.format( super.toString()); //método tosTRING sobreescrito.
    }
}
    