
package meuprojeto.banco;

import java.util.Scanner;

class ContaBancaria {
    public String nome;
    public String sobrenome;
    public String cpf;
    public double saldo;
    
    public ContaBancaria (String nome, String sobrenome, String cpf){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
            this.saldo = 0.0;
    }
    
    public double consultarSaldo(){
        return saldo;
    }
    
    public void depositar (double valor){
        saldo += valor;
        System.out.println("deposito de r$ + "  + valor + "realizado com sucesso");
        
    }
    
    public void sacar (double valor){
        if (saldo >=valor){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "realidado com sucesso");
            } else {
            System.out.println("Saldo insulficiente");            
        } 
            }
    
    public void exibirMenu(){
        Scanner scanner = new Scanner (System.in);
        int opcao;
        
        do {
            System.out.println("\n--------Menu----------");
             System.out.println("1.Consultar saldo");
             System.out.println("2. Realizar deposito");
             System.out.println("3. Realizar Saque");
             System.out.println("4. Encerrar");
             System.out.println("Qual opcao voce deseja escolher?:");
             opcao = scanner.nextInt();
             
             switch(opcao){
                 case 1:
                          System.out.println("Saldo : R$"  + consultarSaldo());
                          break;
                           case 2:
                          System.out.println("Digite o valor do deposito:" );
                          double valorDeposito = scanner.nextDouble();
                          depositar(valorDeposito);
                          break;
                           case 3:
                          System.out.println("Digite o valor do Saque:" );
                          double valorSaque = scanner.nextDouble();
                          sacar(valorSaque);
                          break;
                           case 4:
                          System.out.println("Encerrar" );
                           break;
                           default:
                            System.out.println("Opção invalida" );
                  
             }
             
             
        } while (opcao !=4);
        
        scanner.close();
        
    }
    
}


public class Banco {
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("seja bem vindo ao siatema bancario");
    
     System.out.println("qual o seu nome ?");
          String nome = scanner.nextLine();
          
           System.out.println("qual seu sobrenome?");
           String sobrenome = scanner.nextLine();
           
              System.out.println("qual seu cpf?");
           String cpf = scanner.nextLine();
           
           ContaBancaria conta =  new ContaBancaria (nome,sobrenome,cpf);
           
           conta.exibirMenu();
           
           
                   
     System.out.println("Obrigado, até a proxima!!!!");
     
     scanner.close();
     
            
    }

   
}
