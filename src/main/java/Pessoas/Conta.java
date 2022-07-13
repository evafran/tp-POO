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

    private int idConta;
    private String tipoConta;
    private int agencia;
    private int numeroConta;
    private double saldoConta;
    private Cliente cliente;
    
    
    public Conta(int idConta, String tipoConta, int agencia, int numeroConta, double saldoConta, Cliente cliente){
    
        this.idConta = idConta;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.cliente = cliente;
    
    
    }
    
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
    
    public void sacarDinheiro(double valor){
          if(this.saldoConta >= valor){
              this.saldoConta = valor;

          }else{

              System.out.println("saldo insufiente");
          }

    }
    public void trasferirDinheiro(Conta conta, double valor){
      if(this.saldoConta>= valor){
         this.saldoConta -= valor;
         conta.saldoConta += valor;

      } else{
          System.out.println("saldo insufiente");
      }



}




@Override
public String toString(){

return String.format( super.toString());
}
}
    
   
        

