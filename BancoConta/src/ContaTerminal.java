import java.util.Scanner;

/**Desafio proposta pela DIO de criar um projeto de banco.
 * Este projeto é para praticar questões de variáveis, Scanner, concatenação e sobre o terminal.
 */
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" -------------------------");
        System.out.println("|Bem-vindo ao nosso banco!|");
        System.out.println(" -------------------------");

        System.out.println("Informe alguns dados antes de começar. \nO seu nome:");
        String nome = scanner.nextLine();

        System.out.println("\nA sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("\nO número de conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("\nQual o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e o seu saldo R$" + saldo  + " já está disponível para saque.");

        scanner.close();
    }
}
