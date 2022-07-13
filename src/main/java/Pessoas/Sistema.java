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
public class Sistema {
    
    Funcionario[] funcionario = new Funcionario[24];
    
    private LinkedList<Agencia> agencias;
    private LinkedList< Cliente> clientes;
    private LinkedList< Conta> contas;
    private LinkedList<Funcionario> funcionarios;
    
    public LinkedList<Agencia> getAgencias(){
    
        return agencias;
    }
    public LinkedList<Cliente > getClientes(){
    
        return clientes;
    }
    public LinkedList<Conta> getContas(){
    
        return contas;
    }
    public LinkedList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
}
