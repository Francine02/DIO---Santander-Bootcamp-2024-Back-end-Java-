import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double saque = 0;

        for (double valorSaque  = saque; limiteDiario > valorSaque; limiteDiario -= valorSaque){
            saque = scanner.nextDouble();

            if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
                
            } else if (saque == 0){
                System.out.println("Transacoes encerradas.");
                break;
                
            } else if (!scanner.hasNextDouble()) {
                System.out.println("Transacoes encerradas.");
                break;
                
            }else {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        scanner.close(); 
    }
}