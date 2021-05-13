package a_construtores;

import java.util.Locale;
import java.util.Scanner;

/*
 * Construtores
 *    
 * � uma opera��o especial da classe, que executa no momento da instancia��o do objeto.
 *    
 * Usos comuns:
 *    Iniciar valores dos atributos;
 *    Permitir ou obrigar que o objeto receba dados / depend�ncias no momento de sua instancia��o (inje��o de depend�ncia)
 *   
 * Se um construtor customizado n�o for especificado, a classe disponibiliza o construtor padr�o:
 *    Product p = new Product();
 * � poss�vel especificar mais de um construtor na mesma classe (sobrecarga)
 * 
 * Melhorando o exemplo do reposit�rio 06-introducaoOrientacaoObjetos2 :
 *  Cria��o do m�todo construtor na classe Product
 *  Elimina��o do construtor padr�o (Product product = new Product();)
 *  Altera��o das vari�veis que recebem name, price e quantity para vari�veis locais
 *  Adi��o do novo construtor ap�s as vari�veis locais.
 * */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data : ");
		System.out.println("Name : ");
		String name = sc.nextLine();
		System.out.println("Price : ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock : ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		
		System.out.println("Product data : " + product.toString());
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
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
