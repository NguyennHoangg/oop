package Baitap10;

public class LineItem {
	private Product product;
	private int quantity;

	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "LineItems{" +
				"product=" + product +
				", quantity=" + quantity +
				'}';
	}
}
