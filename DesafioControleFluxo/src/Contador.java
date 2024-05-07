import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
        System.out.println(" -----------------");
        System.out.println("|CONTROLE DE FLUXO|");
        System.out.println(" -----------------");

		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();

        terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
	}

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String messagem) {
            super(messagem);
        }
    }

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		
		int contagem = parametroDois - parametroUm;
        System.out.println("A diferença é de "+ contagem +" números. \nIniciando a interação: ");

        for (int i=1; i <=contagem; ++i){
            System.out.println(i);
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}

