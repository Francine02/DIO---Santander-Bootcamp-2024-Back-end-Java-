import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
// TODO: Inicialize um bloco try-catch para capturar exceções:
// TODO: Leia a entrada do usuário como uma string representando o número da conta:
        try {
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta); // TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
        
        } catch (NumeroInvalido e) { // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
            System.out.println(e.getMessage()); // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:

        } finally {
            scanner.close();
        }
    }

    public static class NumeroInvalido extends Exception {
        public NumeroInvalido(String messagem) {
            super(messagem);
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws NumeroInvalido{ 
        if (numeroConta.length() != 8){
            throw new NumeroInvalido("Erro: Numero de conta invalido. \nDigite exatamente 8 digitos.");
        } else {
            System.out.println("Numero de conta valido."); // Imprime que o número de conta é válido:
        }
//TODO: Verifique se o número da conta tem exatamente 8 dígitos:
//TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            
    }
}
