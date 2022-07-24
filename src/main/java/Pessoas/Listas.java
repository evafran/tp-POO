/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pessoas;

import java.util.LinkedList;
/**
 *
 * @author eva
 */
public interface Listas {
    
    //listas para armazenar objetos das classes
    
    LinkedList<Agencia> listaAgencias = new LinkedList<>();
    LinkedList<Cliente> listaClientes = new LinkedList<>();
    LinkedList< Conta> listaContas = new LinkedList<>();
    LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();
    LinkedList<Administrador> listaAdm= new LinkedList<>();
    Funcionario[] colaboradores = new Funcionario[25];
            
            
}
