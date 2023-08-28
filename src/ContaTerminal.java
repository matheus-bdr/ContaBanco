import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá, informe o seu nome: " );
        String nome = scanner.next();

        System.out.print("Por favor, digite o número da Agência: " );
        int agencia = scanner.nextInt();

        System.out.print("Por favor, digite o número da sua conta: " );
        int conta = scanner.nextInt();

        System.out.print("Por favor, digite o seu saldo: " );
        float saldo = scanner.nextFloat();

        System.out.println("=========É UM PRAZER TE TER CONCOSCO "+nome+"=========");
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta: "+conta+" e seu saldo: "+saldo+" já está disponível para saque");
    }
}
