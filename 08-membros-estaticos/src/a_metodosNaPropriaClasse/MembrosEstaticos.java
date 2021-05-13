package a_metodosNaPropriaClasse;

import java.util.Locale;
import java.util.Scanner;

/*
 * Membros est�ticos :
 * Tamb�m chamados membros de classe, em oposi��o a membros e inst�ncia.
 * S�o membros que fazem sentido independentemente de objetos. 
 * N�o precisam de objeto para serem chamados. S�o chamados a partir do pr�prio nome da classe.
 * Aplica��es comuns:
 *  Classes utilit�rias (Math.sqrt(double)
 *  Declara��o de constantes
 * Uma classe que possui somente membros est�ticos, pode ser uma classe est�tica tamb�m. 
 * Esta classe n�o poder� ser instanciada.
 * 
 * 
 * Problema exemplo :
 *  Fazer um programa para ler um valor num�rico qualquer, e da� mostrar quanto 
 *  seria o valor de uma circunfer�ncia e do volume de uma esfera para um raio 
 *  daquele valor. Informar tamb�m o valor de PI com duas casas decimais.
 *  
 *  Exemplo : 
 *   Enter radius: 3.0
 *   Circumference: 18.85
 *   Volume: 113.10
 *   PI value: 3.14
 *   
 *   Vers�o 1: m�todos na pr�pria classe do programa. 
 *     Nota1: dentro de um m�todo est�tico voc� n�o pode chamar membros de inst�ncia da mesma classe.
 *     Nota2: todos os m�todos chamados devem ser static, pois a classe main � static.
 *   Vers�o 2: classe Calculator com membros de inst�ncia.
 *     Nota1: n�o � necess�rio criar m�todos static, por�m � obrigat�rio instanci�-los no main.
 *   Vers�o 3: classe Calculator com m�todo est�tico.
 *   
 * */

public class MembrosEstaticos {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter radius : ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);

		System.out.printf("Circumference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
