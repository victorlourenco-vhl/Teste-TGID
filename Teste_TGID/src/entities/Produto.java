package entities;

public class Produto {

	private String name;
	private Integer availableQuantity;
	
	
	
	public Produto() {
		super();
	}

	public Produto(String name, Integer quantity) {
		super();
		this.name = name;
		this.availableQuantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	@Override
	public String toString() {
		return this.name + " - quantidade em estoque: " + this.availableQuantity;
	}
	
	
}
