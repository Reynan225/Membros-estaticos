package application;

import java.util.Locale;
import java.util.Scanner;

import entties.Calculator;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Como esse caso é constante (estático), então não é preciso instância o objeto
		// Podemos usar somento o nome da classe
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circuference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", Calculator.PI);

		sc.close();
	}

}