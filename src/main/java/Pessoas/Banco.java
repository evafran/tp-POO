/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Pessoas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

/**
 *
 * @author eva
 */
public class Banco implements Listas { //movendo a interface criada ,para isso usa se  a palavra chave implements,foi criada 
    //pra guardar a listas dinâmicas ,mais fácil de colocar na man.

    public static void main(String[] args) {

        Sistema bancoop = new Sistema();
        Agencia a = new Agencia("agencia1", "belo horizonte", 123);
        Agencia b = new Agencia("agencia1", "diamantina", 124);
        a.compararCidades(a, b);
        //método comparable para Strings
        Conta c1 = new Conta(1,"corrente",0112,20309,1092883,"3443434",a);
        c1.efetuarPagamentos(300);
        c1.sacarDinheiro(2.00);
        
        
        Conta c2 = new Conta(3,"poupança",0112,22345,10,"evcsr",a);
        c2.depositarDinheiro(5);
        c1.transferirDinheiro(300, c2);
       
        c1.exibirExtrato();
        c2.exibirExtrato();
        //adicionando editando e removendo funcionários.
        Scanner input = new Scanner(System.in);//input é para capturar os dados do usuário
        Scanner input2 = new Scanner(System.in);//o primeiro input estava conservando os dados digitados anteriormente na hora de colocar o nome.
        //int qtdFuncionario;
       /* System.out.println("Quantos funcionarios vc quer adicionar no sistema? ");
        qtdFuncionario = input.nextInt();
        Administrador admin = new Administrador(12, 13, "Gabi", "12345", "13/12/1999", "centro", "cas@", "391000003");
        if (qtdFuncionario <= colaboradores.length) {//checar se o número digitado pelo usário é <= ao tamanho vetor
            for (int i = 0; i < qtdFuncionario; i++) {
                System.out.println("\nqual o id do funcionario " + (i+1));
                int id = input.nextInt();

                System.out.println("digite o nome do funcionario " + (i+1));
                String nome = input2.nextLine();

                System.out.println("digite o cpf do funcionário " + (i+1));
                String cpf = input.next();
                System.out.println("digite a data de nascimento do funcionário "+ (i+1));
                String dataNascimento = input.next();
                System.out.println("digite o endereco do funcionario " + (i+1));
                String endereco = input.next();
                System.out.println("digite o email do funcionario " + (i+1));
                String email = input.next();
                System.out.println("digite o telefone do funcionário " + (i+1));
                String telefone = input.next();
                admin.adicionarFuncionario(id, nome, cpf, dataNascimento, endereco, email, telefone, i);
                System.out.printf("\nfuncionario %s cadastrado com sucesso!\n", nome);

            }

        } else {

            System.out.println("capacidade máxima excedida :");

        }
        System.out.println(listaFuncionarios.size());
        
        admin.editarFuncionario(2, "2", "2", "2", "2", "2", "2", colaboradores[0]);
        System.out.println(listaFuncionarios.size());
        admin.removerFuncionario(colaboradores[0]);
        System.out.println(listaFuncionarios.size());*/
        
        //adicionar clientes
        System.out.println(listaClientes.size());
        System.out.println("Quantos clientes deseja adicionar? ");
        int qtdClientes = input.nextInt();
        
        
        for(int i=1; i<= qtdClientes;i++){
            
            System.out.println("\ndigite  o id do cliente: ");
            int id = input.nextInt();
            System.out.println("digite  o nome do cliente:");
            String nome = input2.nextLine();
            System.out.println("digite o cpf do cliente:");
            String cpf = input.next();
            System.out.println("digite a data de nascimento do cliente: ");
            String dataNascimento = input.next();
            System.out.println("digite o email do cliente: ");
            String email = input.next();
            System.out.println("digite o endereco do cliente: ");
            String endereco = input.next();
            System.out.println("digite o telefone do cliente: ");
            String telefone = input.next();
            bancoop.adicionarCliente(id, nome, cpf, dataNascimento, endereco, email, telefone, 
                    bancoop, a);
            
        }
        
        ArrayList<Cliente> arr = new ArrayList<>();
        for(int i = 0;i<listaClientes.size();i++){
            
            arr.add(listaClientes.get(i));
         
        }
        
        System.out.println("for 1");
        
        for(Cliente o: arr){
            System.out.println(o.getId());
        }
        Collections.sort(arr);
        
        System.out.println("for 2");
        
        for(Cliente o:arr){
            System.out.println(o.getId());
        }
        
        /*
        System.out.println(a.getListClientes());
        System.out.println(listaClientes.size());
        System.out.println(listaClientes.get(0));
        System.out.printf("cliente foi instanciado %s vezes", Sistema.getCount());
        //bancoop.editarCliente(1,"HUGO", "2", "2", "2", "2", "2", listaClientes.get(0));
        //edita o cliente ,passando a posição na lista em que o objeto cliente está armazenado.
        bancoop.removeCliente(listaClientes.get(1), a);
        System.out.println(listaClientes.size());
        System.out.println(a.getListClientes());*/

    }
}