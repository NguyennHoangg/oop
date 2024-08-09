package Baitap10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List<LineItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void addItem(Product product, int quantity) {
        LineItem item = new LineItem(product, quantity);
        items.add(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", items=" + items +
                '}';
    }
}
