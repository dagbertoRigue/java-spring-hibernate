package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/*
 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres 
 * do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
 * Ao final, mostrar qual a nota final do aluno no ano. Dizer tamb�m se o aluno est� aprovado (PASS) 
 * ou n�o (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o m�nimo para ser 
 * aprovado (que � 60% da nota). Voc� deve criar uma classe Student para resolver este problema.
 * 
 * 
 * */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.println("Informe o nome do estudante : ");
		stu.name = sc.nextLine();
		System.out.println("Informe a nota do primeiro trimestre :");
		stu.nota1Trim = sc.nextDouble();
		System.out.println("Informe a nota do segundo trimestre :");
		stu.nota2Trim = sc.nextDouble();
		System.out.println("Informe a nota do terceiro trimestre :");
		stu.nota3Trim = sc.nextDouble();
		
		System.out.println(stu.toString());
		
		if(stu.notaFinal() < 60) {
			System.out.printf("Failed \n Faltam : %.1f pontos.", stu.pontos());
		}
		else {
			System.out.println("Pass");
		}
		
		sc.close();
	}

}
