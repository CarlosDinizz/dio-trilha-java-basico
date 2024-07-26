import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Digite o número da conta: ");
        String numeroConta = sc.next();

        sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo do cliente: ");
        double saldoCliente = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente +
                " já está disponível para saque.");
    }
}
