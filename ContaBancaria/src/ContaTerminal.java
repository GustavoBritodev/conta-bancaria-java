import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        //ler.useDelimiter("\n");

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = ler.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agenciaConta = ler.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = ler.next();

        // ler.useLocale(Locale.US);
        System.out.println("Por favor, digite o saldo da sua conta!");
        double saldoConta = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");


    }
}
