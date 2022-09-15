package entities;

//Criando um programa de estoque 

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	
	//construtor que obrigada a dar um valor inicial 
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//métodos get e set para conseguir acesso aos atributos e modificá-los 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	//não criamos o setQuantity para evitar que haja quantidades incosistentes, a quantidade
	//só pode mudar com os métodos de entrada e saída

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public double TotalValue() {
		return price * quantity;
	}
	
	public String toString() {
		return "Nome: " + name + "\n" + "Preço: R$" + price + "\n" + "Quantidade: " + quantity
				+ "\n" + "Valor no estoque: R$" + TotalValue();
	}
	
}
