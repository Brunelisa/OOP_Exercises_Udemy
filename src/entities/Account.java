package entities;

public class Account {
	private int numberAc;
	public String nameAc;
	private double firstDeposit;
	private double depositValue;
	private double withDrawValue;
	
	//constructors
	public Account() {
		
	}


	public Account(int numberAc, String nameAc, double firstDeposit) {
		this.numberAc = numberAc;
		this.nameAc = nameAc;
		this.firstDeposit = firstDeposit;
	}
	
	public Account(int numberAc, String nameAc) {
		this.numberAc = numberAc;
		this.nameAc = nameAc;
		
	}


	//getters and setters
	public int getNumberAc() { //number of the account can't be edited
		return numberAc;
	}


	public String getNameAc() {
		return nameAc;
	}


	public void setNameAc(String nameAc) {
		this.nameAc = nameAc;
	}


	public double getFirstDeposit() {
		return firstDeposit;
	}


	public void setFirstDeposit(double firstDeposit) {
		this.firstDeposit = firstDeposit;
	}
	
	
	//methods
	public double deposit(double depositValue) {
		this.depositValue = depositValue;     
		return depositValue + firstDeposit;
	}
	
	public double withDraw(double withDrawValue) {
		this.withDrawValue = withDrawValue;
		return withDrawValue;
	}
	
	public double acBalance() {
		double balance = deposit(depositValue) - withDraw(withDrawValue);
		return balance;
	}


	@Override
	public String toString() {
		return "\n Número da conta: " + numberAc + "\n Nome do titular: " + nameAc + "\n Saldo: " + acBalance();
				
	}
	
	
	
	
	
	
	

	
	
}
