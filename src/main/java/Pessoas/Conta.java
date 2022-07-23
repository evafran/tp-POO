/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author eva
 */
public class Conta {

    private int idConta;  //criada a classe conta e o construtor com  sete  parâmentros.
    private String tipoConta;
    private int agencia;
    private int numeroConta;  
    private double saldoConta;
    private Cliente  cliente;
    private String senha;
    
    
    public Conta(int idConta, String tipoConta, int agencia, int numeroConta, double saldoConta, Cliente cliente, String senha){
    
        this.idConta = idConta;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.numeroConta = numeroConta; 
        this.saldoConta = saldoConta;
        this.cliente = cliente;
        this.senha = senha;
    
    
    }
    
    public int getIdConta(){
                              //os getters e setters permite o acesso a classe conta e os seus objetos.
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
    public Cliente getCliente(){

        return cliente;

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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
              System.out.println("saldo atual é de R$" + this.saldoConta);

          }else{    //caso o saldo é menor que o valor de saque,aparecerá a msg.

              System.out.println("saldo insufiente");
             
          }
     
    }
    
    public void depositarDinheiro(double valor){
        
        this.saldoConta += valor;
        System.out.println("saldo atual é de R$" + this.saldoConta);
    }
    //método para  transferir dinheiro tendo dois paramentros a classe Conta e o objeto da classe e o valor
    public void trasferirDinheiro(double valor,Conta conta){
      if(this.saldoConta>= valor){
         this.saldoConta -= valor;   // o if é a condicional para verificar  se o valor for maior ou igual o saldo 
         double saldoNovo = conta.getSaldoConta() + valor;
         conta.setSaldoConta(saldoNovo);
         
          System.out.println("saldo atual é de R$" +  this.saldoConta);
          
      } else{
          System.out.println("saldo insufiente"); //caso não seja aparecerá está msg
      }
   
   }
   
    public void efetuarPagamentos(double valor){
        if(this.saldoConta >= valor){
            this.saldoConta -= valor;
            
            
        }else{
            
            System.out.println("saldo insuficente");
        }
        
        
        
    }
   
            
    public void exibirInfoConta(){
        System.out.println("idConta :" + getIdConta()); 
        System.out.println("tipoConta :" + getTipoConta());
        System.out.println("agencia : "  + getAgencia());
        System.out.println("numeroConta: " + getNumeroConta());
        System.out.println("saldoConta : " + getSaldoConta());
        System.out.println("cliente :"  + getCliente());
        
        
        
        
    }
    @Override
    public String toString(){

        return String.format( super.toString()); //método tosTRING sobreescrito.
    }
}
    