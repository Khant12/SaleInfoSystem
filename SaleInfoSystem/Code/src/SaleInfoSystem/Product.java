package SaleInfoSystem;

public class Product {
	
	private int id;
	private String name;
	private int price;
	private int quantity;
	private String category;
	
	public Product(int id, String name, int price, int quantity, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	protected void setCategory(String category) {
		this.category = category;
	}
	
}
