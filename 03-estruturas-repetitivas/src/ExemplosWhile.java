import java.util.Scanner;

public class ExemplosWhile {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 1 : Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha\n"
				+ "incorreta informada, escrever a mensagem \"Senha Invalida\". Quando a senha for informada corretamente deve ser\n"
				+ "impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a senha : ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inv�lida !");
			senha = sc.nextInt();
		}		
		System.out.println("Acesso permitido !");

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 2 : Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema\n"
				+ "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo\n"
				+ "menos uma de duas coordenadas for NULA (nesta situa��o escrever a mensagem \"Fim do Programa\").");
		int coordx = sc.nextInt();
		int coordy = sc.nextInt();
		
		while(coordx != 0 && coordy != 0) {
			if( coordx > 0 && coordy > 0) {
				System.out.println("Primeiro quadrante !");
			}
			else if( coordx < 0 && coordy > 0) {
				System.out.println("Segundo quadrante !");
			}
			else if( coordx < 0 && coordy < 0) {
				System.out.println("Terceiro quadrante !");
			}
			else {
				System.out.println("Quarto quadrante !");
			}
			coordx = sc.nextInt();
			coordy = sc.nextInt();
		}
		System.out.println("Fim do programa !");
	
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 3 : Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes.\n"
				+ "Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel\n"
				+ "4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�\n"
				+ "que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a\n"
				+ "mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combust�vel.");
		
		System.out.println("Informe o combust�vel :  1.�lcool 2.Gasolina 3.Diesel !");
		int fuel = sc.nextInt();
		
		int alcool = 0;
		int gas = 0;
		int diesel = 0;
		
		while(fuel != 4) {
			if(fuel == 1) {
				alcool += 1;
				/*System.out.println("�lcool : " + alcool + "\n Gasolina : "+ gas + "\n Diesel : " + diesel);*/
			}
			else if(fuel == 2) {
				gas += 1;
				/*System.out.println("�lcool : " + alcool + "\n Gasolina : "+ gas + "\n Diesel : " + diesel);*/
			}
			else if(fuel == 3) {
				diesel += 1;
				/*System.out.println("�lcool : " + alcool + "\n Gasolina : "+ gas + "\n Diesel : " + diesel);*/
			}
			else {
				System.out.println("Informe um c�digo v�lido!");
			}
			System.out.println("Informe o combust�vel :  1.�lcool 2.Gasolina 3.Diesel !");
			fuel = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO! \n �lcool : " + alcool + "\n Gasolina : "+ gas + "\n Diesel : " + diesel);
		
		
		sc.close();
	}

}
