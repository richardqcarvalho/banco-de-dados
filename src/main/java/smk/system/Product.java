package smk.system;

public class Product {
	public Product(String id, String name, String category, String price, String amount) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.amount = amount;
	}
	
	private String id;
	private String name;
	private String category;
	private String price;
	private String amount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
