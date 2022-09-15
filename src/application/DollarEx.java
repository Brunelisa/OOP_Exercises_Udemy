package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class DollarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do dólar: ");
		double actualValue = sc.nextDouble();
		System.out.println("Digite o valor que irá cotar: ");
		double dollarBought = sc.nextDouble();
		
		System.out.println("Valor em reais: " + CurrencyConverter.dollar(actualValue, dollarBought));
		
		
		sc.close();
	}

}
