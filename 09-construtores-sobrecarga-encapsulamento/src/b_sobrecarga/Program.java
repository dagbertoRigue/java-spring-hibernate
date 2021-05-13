package b_sobrecarga;

import java.util.Locale;
import java.util.Scanner;

/*
 * Palavra "this" : � uma refer�ncia para o pr�prio objeto
 *    Usos comuns:
 *       Diferenciar atributos de vari�veis locais;
 *       Passar o pr�prio objeto como argumento na chamada de um m�todo ou construtor.
 *       
 * Sobrecarga : 
 *    � um recurso que uma classe possui de oferecer mais de uma opera��o 
 *    com o mesmo nome, por�m com diferentes listas de par�metros.
 *    
 * Proposta de melhoria :
 *    Vamos criar um construtor opcional, o qual recebe apenas nome e 
 *    pre�o do produto. A quantidade em estoque deste novo produto, por
 *    padr�o, dever� ent�o ser iniciada com o valor zero.
 * 
 * Nota: � poss�vel tamb�m incluir um construtor padr�o.
*/

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data : ");
		System.out.println("Name : ");
		String name = sc.nextLine();
		System.out.println("Price : ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);		
		
		System.out.println("Product data : " + product.toString());
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
