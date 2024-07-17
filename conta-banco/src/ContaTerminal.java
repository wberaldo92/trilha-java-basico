import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        //Exibir as mensagewns para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da sua Agência!");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da sua Conta!");
        numero = sc.nextInt();
        sc.nextLine(); //Consome a nova linha pendente
        System.out.println("Por favor, digite o seu nome completo!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        saldo = sc.nextDouble();

        //Fechar o Scanner
        sc.close();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque!");
    }
}
