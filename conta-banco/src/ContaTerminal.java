import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("Por favor, insira o número da conta:");
        numero = sc.nextInt();
        System.out.println("Informe o número da agência:");
        agencia = sc.next();
        System.out.println("Qual o nome do cliente?");
        nomeCliente = sc.next();
        System.out.println("Qual é o saldo atual?");
        saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
