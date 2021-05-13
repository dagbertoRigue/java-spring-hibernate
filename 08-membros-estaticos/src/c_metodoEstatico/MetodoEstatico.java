package c_metodoEstatico;

import java.util.Locale;
import java.util.Scanner;

import c_util.Calculator2;

/*
 * Os valores dos c�lculos n�o mudam para calculadoras diferentes, ou seja, s�o c�lculos est�ticos.
 * O valor de PI tamb�m � static.
 * 
 * Por causa disso, n�o � preciso instanciar a calculadora no m�todo main.
 * */

public class MetodoEstatico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter radius : ");
		double radius = sc.nextDouble();
		
		double c = Calculator2.circumference(radius);
		double v = Calculator2.volume(radius);

		System.out.printf("Circumference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", Calculator2.PI);
		
		sc.close();
	}

}
