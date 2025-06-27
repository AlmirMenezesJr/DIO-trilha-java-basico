import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner
        //TODO: exibir mensagens para o usuario
        // Obter pela classe scanner os valores digitados no terminal
        // exibir a mensagem da conta criada
        //variaveis usadas
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        float saldo = 0f;
        //cria object classe Scanner
        Scanner scanner1 = new Scanner(System.in);

        //solicita nome do cliente
        System.out.println("\033[0m\n Informe o nome: \033[34m");
        nomeCliente = scanner1.next();
        //solicita 
        System.out.println("\033[0m\n Informe o numero da agência: \033[34m");
        agencia = scanner1.next();

        System.out.println("\033[0m\n Informe o número da conta: \033[34m");
        numeroConta = scanner1.nextInt();

        System.out.println("\033[0m\n Informe o aporte inicial: \033[34m");
        saldo = scanner1.nextFloat();
        
        scanner1.close();

        System.out.printf("\033[0m\n Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo atual de R$% já está disponível para saque.",nomeCliente,agencia,numeroConta,saldo);
      

        

    }
}
