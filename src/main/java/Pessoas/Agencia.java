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
public class Agencia {
    
   private LinkedList listaContas;
   private LinkedList listaClientes;
   private LinkedList listaFuncionarios;
   
   public LinkedList getListaContas(){
       return listaContas;
   }
   public void setListaContas( LinkedList listaContas){
       
       this.listaContas = listaContas;
   }
   public LinkedList getListaClientes(){
       return listaClientes;
   }
   public void setListaClientes( LinkedList listaClientes){
        
       this.listaClientes = listaClientes;
    } 
   public LinkedList getListaFuncionarios(){
        return listaFuncionarios;
    }    
   public void setListaFuncionarios(LinkedList listaFuncionarios){
       
       this.listaFuncionarios = listaFuncionarios;
   }
   @Override
   public String toString(){
   return String.format( super.toString());
   
   }
}
