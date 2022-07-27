package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.VendaStatus;

public class Venda {
	
	private Date date;
	private Usuario client;
	private VendaStatus status;
	
	// Fotamatação da Data
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Uma venda (sale) pode conter vários items
	List<ItemVenda> listItems = new ArrayList<>();


	public Venda() {
		super();
	}

	public Venda(Date date, Usuario client, VendaStatus status) {
		this.date = date;
		this.client = client;
		this.status = status;
	}

	// Getters e Setters
	public String getDate() {
		return sdf.format(this.date);
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Usuario getClient() {
		return client;
	}

	public void setClient(Usuario client) {
		this.client = client;
	}

	public VendaStatus getStatus() {
		return status;
	}

	public void setStatus(VendaStatus status) {
		this.status = status;
	}
	
	
	// Métodos para adicionar e remover um item da lista
	public void addItem(ItemVenda item) {
		
		listItems.add(item);
	}
	
	public void removeItem(ItemVenda item) {
		listItems.remove(item);
	}
	
	// Método para calcular o valor total da compra
	public Double totalOfSale(){
		double amount = 0.0;
		for(ItemVenda item : listItems) {
			amount += item.getPrice() * item.getQuantity();
		}
		
		return amount;
	}
	public void getItemsList() {
		for (ItemVenda item: listItems) {
			System.out.println(item.toString());
		}
	}
	
	@Override
	public String toString() {
		return "Data: " + this.getDate() + "\nStatus: " + this.status + "\n";
	}
	
	
	
}
