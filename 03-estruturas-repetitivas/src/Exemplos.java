import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		System.out.println("Exemplo 1 : Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha\n"
				+ "incorreta informada, escrever a mensagem \"Senha Invalida\". Quando a senha for informada corretamente deve ser\n"
				+ "impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a senha : ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida !");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido !");
		
		
		
		sc.close();
	}

}
