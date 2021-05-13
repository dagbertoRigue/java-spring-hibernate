package c_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import b_sobrecarga.Product;

/*
 * Encapsulamento : � um princ�pio que consiste em esconder detalhes de implementa��o
 * de uma classe, expondo apenas opera��es seguras e que mantenham os objetos em um 
 * estado consistente.
 * 
 * Regra de ouro : 
 *    o objeto deve sempre estar em um estado consistente, 
 *    e a pr�pria classe deve garantir isso.
 * 
 * Regra geral b�sica :
 *    Um objeto N�O deve expor nenhum atributo (modificador de acesso private);
 *    Os atributos devem ser acessados por meio de m�todos get e set.
 *    
 * Padr�o JavaBeans: https://en.wikipedia.org/wiki/JavaBeans
 *    
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
		
		Product product = new Product(name, price);
		
		/*Testando os m�todos de encapsulamento*/
		product.setName("Computer");
		System.out.println("Update name : " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price : " + product.getPrice());
		/*O atributo quantity n�o deve possuir o m�todo set para esse exemplo.
		 * Isso porque a quantidade do produto em estoque poder� ser alterada somente
		 * pelos m�todos de adi��o e remo��o de itens do estoque, para proteger as 
		 * regras do neg�cio do sistema.
		 * */
		
		
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
