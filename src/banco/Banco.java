
package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Banco {


    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    List<Conta> lista = new ArrayList<>();
    int sair[] = new int[1];
    
    while(sair[0] != 6){
    System.out.println("---- BANCO MENTORAMA ----");
    System.out.println("Menu de Opções: ");
    System.out.println("1- Criar Conta");
    System.out.println("2- Sacar");
    System.out.println("3- Depositar");
    System.out.println("4- Transferir Valores");
    System.out.println("5- Mostrar Montante Disponível nas Contas");
    System.out.println("6- Sair");
    System.out.println("Escolha a opção desejada:");
    int menu = teclado.nextInt();
    
    if(menu == 6){
      sair[0] = menu;  
    }
    
        
    //Criar Conta
    
    if(menu == 1){
        System.out.println("Deseja criar Conta Corrente (1) ou Poupança (2)?");
        int option = teclado.nextInt();
        
        if(option == 1){
            System.out.println("Informe o nome do cliente");
            String name = teclado.nextLine();
            System.out.println("Informe a agência do cliente");
            int agencia = teclado.nextInt();
            System.out.println("Informe a conta do cliente");
            int conta = teclado.nextInt();
            lista.add(new ContaCorrente(name, agencia, conta));
    }
        else{
            System.out.println("Informe o nome do cliente");
            String name1 = teclado.nextLine();
            System.out.println("Informe a agência do cliente");
            int agencia1 = teclado.nextInt();
            System.out.println("Informe a conta do cliente");
            int conta1 = teclado.nextInt();
            System.out.println("Informe a data de aniversário do cliente");
            int dataAniversario = teclado.nextInt();
            lista.add(new ContaPoupanca(dataAniversario, name1, agencia1, conta1));
        }
    }
    // Saque
    if(menu == 2){
        System.out.println("Informe a sua conta:");
        int cc = teclado.nextInt();
        int indice = lista.indexOf(cc);
        System.out.println("Informe o valor a ser sacado:");
        double saque = teclado.nextInt();
        lista.get(indice).sacar(saque);
        System.out.println("Saque realizado com sucesso!");
    }
    // Deposito
    if(menu == 3){
        System.out.println("Informe a conta a ser depositado o valor");
        int cc = teclado.nextInt();
        int indice = lista.indexOf(cc);
        System.out.println("Informe o valor a ser depositado");
        double deposito = teclado.nextDouble();
        lista.get(indice).depositar(deposito);
        System.out.println("Deposito realizado com sucesso!");
    }
    // Transferir
    if(menu == 4){
        System.out.println("Informe a conta a transferir valores");
        int cc1 = teclado.nextInt();
        System.out.println("Informe a conta a receber os valores");
        int cc2 = teclado.nextInt();
        System.out.println("Informe o valor a ser transferido");
        double valor = teclado.nextInt();
        int indice1 = lista.indexOf(cc1);
        int indice2 = lista.indexOf(cc2);
        lista.get(indice1).sacar(valor);
        lista.get(indice2).depositar(valor);
        System.out.println("Transferência realizada com sucesso");
    }
    // Saldo de todas as contas
    if(menu == 5){
        double saldo = 0;
        for(Conta p : lista){
                saldo += p.getSaldo();
        }
        System.out.println("O saldo total das contas é: "+ saldo);
    }      

}
}
}
