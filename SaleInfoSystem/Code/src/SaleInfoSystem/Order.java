package SaleInfoSystem;

public class Order {
	
	private int orderNumber;
    private int productiId;
    private String productName;
    private double totalPrice;
    private int quantity;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    
    public Order(int orderNumber, int id, String productName, double totalPrice, int quantity, String customerName, String customerAddress, String customerPhone) {
        this.orderNumber = orderNumber;
    	this.productiId = id;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getProductId() {
		return productiId;
	}

	public void setProductiId(int productiId) {
		this.productiId = productiId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	private void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}


	

	
	
	
	
}
