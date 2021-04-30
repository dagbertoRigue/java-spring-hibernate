import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 1 - Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro qualquer : ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("O n�mero digitado n�o � negativo !");
		}
		else {
			System.out.println("O n�mero � negativo !");
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 2 - Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.");
		
		System.out.println("Digite um n�mero inteiro qualquer : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 0) {
			System.out.println("N�mero � par !");
		}
		else {
			System.out.println("N�mero � �mpar !");
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 3 - Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem \"S�o m�ltiplos\" ou \"N�o s�o\n"
				+ "m�ltiplos\", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em \n"
				+ "ordem crescente ou decrescente.");
		
		System.out.println("Digite dois n�meros para saber se s�o m�ltiplos :");
		int num31 = sc.nextInt();
		int num32 = sc.nextInt();
		int result;
		
		if(num31 > num32) {
			result = num31 % num32;
			if(result == 0) {
				System.out.println("S�o m�ltiplos.");
			}
			else {
				System.out.println("N�o s�o m�ltiplos.");
			}
		}
		else {
			result = num32 % num31;
			if(result == 0) {
				System.out.println("S�o m�ltiplos.");
			}
			else {
				System.out.println("N�o s�o m�ltiplos.");
			}
		}
				
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode\r\n"
				+ "come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.");
		
		System.out.println("Digite a hora inicial do jogo :");
		int num41 = sc.nextInt();
		System.out.println("Digite a hora inicial do jogo :");
		int num42 = sc.nextInt();
		int duracao;
		
		if(num41 < num42) {
			duracao = num42 - num41;
		}
		else {
			duracao = (24 - num41) + num42;
		}

		System.out.println("O jogo durou " + duracao + " horas.");
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 5 - Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade \n"
				+ "deste item. A seguir, calcule e mostre o valor da conta a pagar.");
		System.out.println("------------------------------------");
		System.out.println(" C�digo |  Produto          | Pre�o ");
		System.out.println("------------------------------------");
		System.out.println("   1    |  Cachorro Quente  | R$4.00");
		System.out.println("   2    |  X-Salada         | R$4.50");
		System.out.println("   3    |  X-Bacon          | R$5.00");
		System.out.println("   4    |  Torrada Simples  | R$2.00");
		System.out.println("   5    |  Refrigerante     | R$1.50");
		System.out.println("------------------------------------");
		
		System.out.println("Digite o c�digo do produto e a quantidade :");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double conta = 0;
		
		if(codigo == 1) {
			conta = quantidade * 4.0;
		}
		if(codigo == 2) {
			conta = quantidade * 4.5;
		}
		if(codigo == 3) {
			conta = quantidade * 5.0;
		}
		if(codigo == 4) {
			conta = quantidade * 2.0;
		}
		if(codigo == 5) {
			conta = quantidade * 1.5;
		}
		System.out.printf("Total da conta : R$ %.2f%n", conta);
		

		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos \n"
				+ "seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em \n"
				+ "nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.");
		
		System.out.println("Digite um n�mero para checar o intervalo :");
		int intervalo = sc.nextInt();
		
		if(intervalo > 0 && intervalo <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (intervalo > 25 && intervalo <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if(intervalo > 50 && intervalo <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if(intervalo > 75 && intervalo <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else if(intervalo < 0 || intervalo > 100) {
			System.out.println("Fora de intervalo !");
		}
		

		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.\n"
				+ "A seguir, determine qual o quadrante ao qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).\n"
				+ "Se o ponto estiver na origem, escreva a mensagem �Origem�.\n"
				+ "Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a situa��o.\n");
		System.out.println("    Plano cartesiano :");
		System.out.println("            |y");
		System.out.println("     Q2     |      Q1");
		System.out.println("------------ ------------x");
		System.out.println("     Q3     |      Q4");
		System.out.println("            |");
		
		System.out.println("Digite dois valores :");
		double eixox = sc.nextDouble();
		double eixoy = sc.nextDouble();
		
		if (eixox == 0.0 && eixoy == 0.0) {
			System.out.println("Origem");
		}
		else if (eixox == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (eixoy == 0.0) {
			System.out.println("Eixo X");
		}
		else if (eixox > 0.0 && eixoy > 0.0) {
			System.out.println("Q1");
		}
		else if (eixox < 0.0 && eixoy > 0.0) {
			System.out.println("Q2");
		}
		else if (eixox < 0.0 && eixoy < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		
		sc.close();
	}

}
