import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nome_Cliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        nome_Cliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo a ser depositado: ");
        saldo = scanner.nextDouble();
        System.out.println();
        System.out.println(
                "Olá " + nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");

    }
}
