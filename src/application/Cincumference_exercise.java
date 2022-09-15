package application;

import java.util.Scanner;

import util.Calculator;

public class Cincumference_exercise {

	public static void main(String[] args) {
		//cálculo do comprimento e volume de uma circunferência através do valor do raio
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do raio: ");
		double radius = sc.nextDouble();
		
		System.out.println("Circunferência = " + Calculator.circumference(radius));
		System.out.println("Volume = " + Calculator.volume(radius));
		System.out.println("Valor do PI = " + Calculator.PI);
		
		sc.close();
	}

}
