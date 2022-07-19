/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Pessoas;
import java.util.LinkedList;

/**
 *
 * @author eva
 */
public class Banco implements Listas{ //movendo a interface criada ,para isso usa se  a palavra chave implements,foi criada 
                                      //pra guardar a listas dinâmicas ,mais fácil de colocar na man.

    public static void main(String[] args) {
        
        Sistema bancoop  = new Sistema();
        Agencia a = new Agencia();
        System.out.println(colaboradores.length);
        System.out.println(colaboradores[24]);
     
       
        
        listaAgencias.add(a);
        System.out.println(listaAgencias.size());
        Cliente c1 = new Cliente(3,"Eva","5674","110/10/09", "rio","email","5214318");
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

        
        
    }
}
