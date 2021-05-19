package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * Vetores - em programa��o, "vetor" � o nome dado a arranjos unidimensionais.
 * Arranjo (array) � uma estrutura de dados:
 *    Homog�nea (dados do mesmo tipo);
 *    Ordenada (elementos acessados por meio de posi��es);
 *    Alocada de uma vez s�, em um bloco cont�guo de mem�ria.
 * 
 * Vantagens:
 *    Acesso imediato aos elementos pela sua posi��o.
 * Desvantagens:
 *    Tamanho fixo;
 *    Dificuldade para se realizar inser��es e dele��es.
 * 
 * Exemplo 1 :
 *    Fazer um programa para ler um n�mero inteiro N e a altura de N pessoas. 
 *    Armazene as N alturas em um vetor. Em seguida, mostrar a altura m�dia dessas pessoas.
 *    
 * */

public class Vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}

}
