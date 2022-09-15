package application;

import java.util.Scanner;

import entities.Product;

public class Stock_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		/*Product prod = new Product(); (agora que foi criado o construtor 
		 para haver um valor inicial obrigatório, essa instanciação só ocorre após prrenchimento
		 dos dados com variáceis tempoárias como mostra abaixo*/
		
		
		
		System.out.println("******* CADASTRO *********");
		System.out.println("Insira o nome do produto: ");
		String name = sc.next();
		System.out.println("Insira o preço do produto: ");
		double price = sc.nextDouble();
		/*System.out.println("Insira a quantidade atual: ");
		int quantity = sc.nextInt();*/
		
		Product prod = new Product(name, price); 
		
		System.out.println(prod);
		
		
		System.out.println("Menu: \n 1 - Dar entrada no produto \n 2 - Dar saída no produto");
		int menu = sc.nextInt();
		
		switch(menu) {
			case 1:
				System.out.println("Digite a quantidade que será adicionada: ");
			    int quantity = sc.nextInt();
				prod.AddProducts(quantity);
				System.out.println(prod);
				break;
				
			case 2:
				System.out.println("Digite a quantidade que será retirada: ");
				quantity = sc.nextInt();
				prod.RemoveProducts(quantity);
				System.out.println(prod);
				
		}
		 
		sc.close();
	}

}
