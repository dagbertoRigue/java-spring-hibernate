package c_util;

/*
 * Os valores dos c�lculos n�o mudam para calculadoras diferentes, ou seja, s�o c�lculos est�ticos.
 * O valor de PI tamb�m � static.
 * 
 * Por causa disso, n�o � preciso instanciar a calculadora no m�todo main.
 * */

public class Calculator2 {
	
	public static final double PI = 3.14159;
		
		public static double circumference(double radius) {
			return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
			return 4.0 * PI * radius * radius * radius / 3.0;
		}
}