package Baitap10;

public class Product {
	private String name;
	private String code;
	private double price;

	public Product(String name, String code, double price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

    public double getPrice() {
        return price;
    }   

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", code='" + code + '\'' +
				", price=" + price +
				'}';
	}
}