package application;

import java.security.AccessControlContext;
import java.util.Scanner;

import entities.Account;

public class bank_exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account ac = new Account();
		
		System.out.println("BEM VINDO(A) AO BANCO BRUNELIS! BORA CRIAR SUA CONTA?");
		System.out.println("Qual o nome do titular?");
		String nameAc = sc.nextLine();
		System.out.println("Qual número da conta? (não poderá ser alterado posteriormente)");
		int numberAc = sc.nextInt();
		System.out.println("Quer inserir um valor de depósito inicial?");
		System.out.println("Digite 1 para sim. Digite 2 para não.");
		int option = sc.nextInt();
		
		if(option == 1) {
			
			
			System.out.println("Qual o valor inicial?");
			double firstDeposit = sc.nextDouble();
			ac.deposit(firstDeposit);
			ac = new Account(numberAc, nameAc, firstDeposit);
	
			System.out.println("Dados da conta: " + ac);
			
		}else {
			
			ac = new Account(numberAc, nameAc);
			
			System.out.println("Dados da conta: " + ac);
			
		}
		
		System.out.println("Parabéns, sua conta foi criada com sucesso. Escolha uma opção: ");
		System.out.println("\n 1- Depositar \n 2- Sacar \n 3- Sair");
		option = sc.nextInt();
		
		switch(option) {
			case 1:
				System.out.println("Qual o valor do depósito? ");
				double depositValue = sc.nextDouble();
				
				double deposit = ac.deposit(depositValue);
				
				System.out.println("Dados atualizados: "+ ac);
				break;
			case 2:
				System.out.println("Qual o valor do saque? ");
				double withdrawValue = sc.nextDouble();
				double withDraw = ac.withDraw(withdrawValue);
				
				System.out.println("Dados atualizados: " + ac);
				break;
				
			case 3:
				System.out.println("Obrigado por contribuir conosco, volte sempre!");
				break;
		}
		
		
		
		sc.close();
		
		
	}
}
