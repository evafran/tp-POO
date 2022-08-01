/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Pessoas;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

/**
 *
 * @author eva
 */
public class Banco implements Listas { //movendo a interface criada ,para isso usa se  a palavra chave implements,foi criada 
    //pra guardar a listas dinâmicas ,mais fácil de colocar na man.

    public static void main(String[] args) throws IOException {

        Sistema bancoop = new Sistema();
        Agencia a = new Agencia("itau","Diamantina",0112);
        Agencia d = new Agencia("nubank", "Bh",12345);
        Conta conta = new Conta(011,"corrente", 0112, 2010945, 120000000,
            "092367", a);
        
        Cliente cliente= new Cliente(1, "Eva", "091456398-09","01/01/2000","largo Dom João",
            "eva@hotmail.com","35310089",bancoop,a);
        cliente.acessarConta(conta);
        cliente.retornarInfos();
        cliente.alterarDadosPessoais("centro", "evinhafrancesca@hotmail.com", "5351971242");
        cliente.retornarInfos();//chamando todos os métodos na man classe clientes
        conta.exibirInfoConta();
        //testando os métodos funcionários
        Funcionario funcionario = new Funcionario(33, "Breno", "12546789", "3/6/2009",
               "rua santa rita 324", "breno@gmail.com","3798765444", a);
        funcionario.retornarInfos();
        funcionario.criarConta(45, "conta poupança", 0112, 345672, 900000,"126598", a);
        funcionario.removerConta(conta, a);
        funcionario.adicionarAgencia(a, "caixa", "curvelo", 21);
        funcionario.removerAgencia(a);
        funcionario.alterarSenha(conta, "345261");
        funcionario.retornarInfos();
        
        //testando os  métodos administrador
        Administrador admini = new Administrador(3, 011, "Lais", "091543678", "10 /01 /1998", 
            "Jardim imperial 24", "laisinha@gmail", "3899901234",  a);
        admini.retornarInfos();
        admini.adicionarFuncionario(56, "Carlos Emanuel", "24536879", "29/08/1997","Rua sother Ramos couto  40 centro" ,
                "carlinhos@outlook.com", "3899235467", 0, a);
        admini.retornarInfos();
        admini.editarFuncionario(2, "Eva", "387596087", "1/2/2001", "Rua oliveira 10 centro", "evinha@hotmail", "435678992", funcionario);
        admini.retornarInfos();
        admini.removerFuncionario(funcionario, a);
       
        //testando  métodos conta/ questão 09)
        
        Conta c1 = new Conta(1,"corrente",0112,20309,1092883,"3443434",a);
        c1.efetuarPagamentos(300);
        c1.sacarDinheiro(49);
        
        
        Conta c2 = new Conta(3,"poupança",0112,22345,10,"evcsr",a);
        c2.depositarDinheiro(20);
        c1.transferirDinheiro(120, c2);
       
        c1.exibirExtrato();
        c2.exibirExtrato();
        
        //métodos sistema adicionar, editar e remover
        
        bancoop.adicionarAdm(1, 3, "Hugo", "2847575", "10/3/1999", "centro", "hlmc@gail", "37597088", a);
        admini.retornarInfos();
        bancoop.editarAdm(1, 3, "Hugo", "2847575", "10/3/1999", "largo", "hlmc@gail", "273645", admini);
        admini.retornarInfos();
        bancoop.removerAdm(admini, a);
        admini.retornarInfos();
        
        //métodos agência
        a.removerCliente(cliente);
        a.removerAdministrador(admini);
        a.removerFuncionario(funcionario);
        a.removerConta(c2);
        
        //questão 10)variáves static protected e encapsulamento
        
        
        System.out.printf("\n\na classe Cliente foi instanciada %s vez(es) (atributo static)\n", Sistema.getCount());
        System.out.printf("\na classe Cliente foi instanciada %s vez(es) (atributo protected)\n", bancoop.countProtected);

        
       
        // questão 05)
        //adicionando editando e removendo funcionários.
        
        Scanner input = new Scanner(System.in);//input é para capturar os dados do usuário
        Scanner input2 = new Scanner(System.in);//o primeiro input estava conservando os dados digitados anteriormente na hora de colocar o nome.
        //int qtdFuncionario;
       /* System.out.println("Quantos funcionarios vc quer adicionar no sistema? ");
        qtdFuncionario = input.nextInt();
        Administrador admin = new Administrador(12, 13, "Gabi", "12345", "13/12/1999", "centro", "cas@", "391000003");
        if (qtdFuncionario <= colaboradores.length) {//checar se o número digitado pelo usuário é <= ao tamanho vetor
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
        
        
        //questão 08
        //adicionar clientes
        /*System.out.println(listaClientes.size());
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
        //Quaestão 12) comparable 
        
        ArrayList<Cliente> arr = new ArrayList<>();
        for(int i = 0;i<listaClientes.size();i++){
            
            arr.add(listaClientes.get(i));
         
        }
        
        System.out.println("for 1");//mostra os valores antes de ordenar 
        
        for(Cliente o: arr){
            System.out.println(o.getId());
        }
        Collections.sort(arr);
        
        System.out.println("for 2");//chama o método sort e mostra a ordenação dos números
        
        for(Cliente o:arr){
            System.out.println(o.getId());
        }
        
        ArrayList<Agencia> array = new ArrayList<>();
        for(int j = 0; j<listaAgencias.size();j++){
            
            array.add(listaAgencias.get(j));
            
        }
        System.out.println("for 1"); //mostra os valores antes de ordenar 
        
        for(Agencia o:array){
             System.out.println(o.getCodigoAgencia());
        }
        Collections.sort(array);
        
        System.out.println("for 2");//chama o método sort e mostra a ordenação dos códigos das agências
            
        for(Agencia o:array){
            System.out.println(o.getCodigoAgencia());
        }
        Agencia c= new Agencia("agencia1", "belo horizonte", 123);
        Agencia b = new Agencia("agencia1", "diamantina", 124);
        a.compararCidades(a, b);
        //método comparable para Strings
    
        
        /*
        System.out.println(a.getListClientes());
        System.out.println(listaClientes.size());
        System.out.println(listaClientes.get(0));
        System.out.printf("cliente foi instanciado %s vezes", Sistema.getCount());
        //bancoop.editarCliente(1, "Eva", "091456398-09","01/01/2000","largo Dom João",
            "eva@hotmail.com","35310089",bancoop,a, listaClientes.get(0));
        //edita o cliente ,passando a posição na lista em que o objeto cliente está armazenado.
        bancoop.removeCliente(listaClientes.get(1), a);
        System.out.println(listaClientes.size());
        System.out.println(a.getListClientes());*/
        
        

       //questão 13) json
        bancoop.jsonClientes();
        bancoop.jsonColaboradores();
        bancoop.jsonAgencias();
        bancoop.jsonContas();
        
        
    }
    
    
}