/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Pessoas;

import java.util.Scanner;

/**
 *
 * @author eva
 */
public class Banco implements Listas { //movendo a interface criada ,para isso usa se  a palavra chave implements,foi criada 
    //pra guardar a listas dinâmicas ,mais fácil de colocar na man.

    public static void main(String[] args) {

        Sistema bancoop = new Sistema();
        Agencia a = new Agencia();
        
        
        //adicionando editando e removendo funcionários.
        Scanner input = new Scanner(System.in);//input é para capturar os dados do usuário
        Scanner input2 = new Scanner(System.in);//o primeiro input estava conservando os dados digitados anteriormente na hora de colocar o nome.
        int qtdFuncionario;
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
        Cliente[] vetClientes = new Cliente[qtdClientes];
        for(int i=1; i<= qtdClientes;i++){
            System.out.println("digite  o id do cliente : ");
            int id = input.nextInt();
            System.out.println("digite  o nome do cliente :");
            String nome = input2.nextLine();
            System.out.println("digite o cpf do cliente :");
            String cpf = input.next();
            System.out.println("digite a data de nascimento do cliente: ");
            String dataNascimento = input.next();
            System.out.println("digite o email do cliente: ");
            String email = input.next();
            System.out.println("digite o endereco do cliente");
            String endereco = input.next();
            System.out.println("digite o telefone do cliente");
            String telefone = input.next();
            bancoop.adicionarCliente(id, nome, cpf, dataNascimento, endereco, email, telefone, bancoop);
        }
        System.out.println(listaClientes.size());
        System.out.println(listaClientes.get(0));
        

        /*  Funcionario funcionarioum = new Funcionario(1,"Breno", "13452", "01/01/09","largo","email","123487");
        listaAgencias.add(a);//listas de novas agencias add
        System.out.println(listaAgencias.size());//retorna o numero das agencias atualizadas.
        bancoop.adicionarCliente(3,"Eva","5674","110/10/09", "rio","email","5214318", bancoop);
        bancoop.getCount();
        System.out.println(listaClientes.size());
        System.out.println("dados antigos: "); 
      
        //bancoop.editarCliente(2, "nome2", "cpf2", "data2", "endereco2", "email2", "telefone2");
        System.out.println(listaClientes.size());
        Administrador funcionario2 = new Administrador(1,3,"Lais","3425","01/01/01","largo","eu@","389192345");
        listaFuncionarios.add(funcionario2);
        System.out.println(listaFuncionarios.size());//adiministrador atualiza dados dos funcionarios
        //System.out.println("dados antigos");
        System.out.println("dados atualizados");
        funcionarioum.returnInfos();//retorna as informações atualizadas
        bancoop.adicionarAdm(1,3,"Lais","3425","01/01/01","largo","eu@","389192345");
        
        listaClientes.add(c1);
        System.out.println(listaClientes.size());
        Funcionario funcionarioum = new Funcionario(1,"Breno", "13452", "01/01/09","largo","email","123487");
        funcionarioum.adicionarCliente(12, "Hugo", "243165", "10/4/99", "centro", "hlcms", "5460931", funcionarioum, a); //segundo cliente
        funcionarioum.adicionarCliente(13, "Breno", "243165", "10/4/99", "centro", "hlcms", "5460931", funcionarioum, a); //terceiro cliente
        funcionarioum.adicionarCliente(14, "Hugo2", "243165", "10/4/99", "centro", "hlcms", "5460931", funcionarioum, a);
        System.out.println(listaClientes.size());//adicionando cliente e atualizando a lista ,size retorna o tamanho com o valor total de clientes cadastrados
        funcionarioum.removeCliente(c1, funcionarioum, a);//método remover cliente da classe funcionario
        System.out.println(listaClientes.size());
        
        Administrador adm1 = new Administrador(1, bancoop, 2, "Eva", "12345", "01/01/01", "rua", "email", "3898385969");
        Funcionario funcionario = new Funcionario(1,"Breno", "13452", "01/01/09","largo","email","123487");
        Cliente cliente = new Cliente(3,"Eva","5674","110/10/09", "rio","email","5214318");
        Conta contaum = new Conta(545,"contacorrente",0112, 253091,350.00,cliente); 
        Conta contadois = new Conta(234,"poupança",11234,54321,234.00,cliente);
        contaum.trasferirDinheiro(contadois,30); //movimentaçaõ simples de duas conta uma poupança e ou corrente
       
        funcionarioum.adicionarAgencia(contaum, funcionario, a);//
        
        
        System.out.println(adm1.getNome());
        System.out.println(funcionarioum.getDataNascimento());
        System.out.println(cliente.getEndereco());
        System.out.println(contaum.getCliente());
        System.out.println(contaum.getIdConta());
        System.out.println(contaum.getTipoConta());
        System.out.println(contaum.getNumeroConta());
        System.out.println(contaum.getSaldoConta());
        System.out.println(contaum.getSaldoConta());
        System.out.println(contadois.getSaldoConta());
         */
    }
}
