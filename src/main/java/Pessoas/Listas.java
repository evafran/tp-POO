/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pessoas;

import java.util.LinkedList;
//import java.util.ArrayList;
/**
 *
 * @author eva
 */
public interface Listas {
    
    LinkedList<Agencia> listaAgencias = new LinkedList<>();
    LinkedList<Cliente> listaClientes = new LinkedList<>();
    LinkedList< Conta> listaContas = new LinkedList<>();
    LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();
    Funcionario[] colaboradores = new Funcionario[25];
    //ArrayList<Funcionario> colaboradores = new ArrayList<>();       
            
            
}
