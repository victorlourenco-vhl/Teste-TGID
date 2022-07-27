package entities;


public class ItemVenda {
	private Integer quantity;
	private Double price;
	private Produto produtoVenda;
	
	
	public ItemVenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemVenda(Integer quantity, Double price, Produto product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.produtoVenda = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Produto getProdutoVenda() {
		return produtoVenda;
	}

	public void setProdutoVenda(Produto produtoVenda) {
		this.produtoVenda = produtoVenda;
	}
	
	@Override
	public String toString() {
		if(this.quantity > produtoVenda.getAvailableQuantity()) {
			this.setPrice(0.0);
			return "OPERACAO CANCELADA! Possuimos apenas " + produtoVenda.getAvailableQuantity() + " " + produtoVenda.getName() + " em estoque!";
			
		}
		else {
			return  this.produtoVenda.toString() + " vendas: " + this.quantity
					+ String.format(" preço unidade: %.2f", this.price);
		}
		
	}
	
	
}
