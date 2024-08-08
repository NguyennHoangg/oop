package Baitap10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> LineItem;
    private int count ;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        LineItem = new ArrayList<>();
        count = 0;
    }   

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        LocalDate date = LocalDate.now();
        this.orderDate = date;
    }

    public List<OrderDetail> getItems() {
        return LineItem;
    }

    public void setItems(List<OrderDetail> items) {
        this.LineItem = items;
    }
    
    public void addItem(Product product, int quantity){
        LineItem.add(new OrderDetail(quantity, product));
    }

    public double calcTotalCharge(){
        double total = 0;
        for(OrderDetail index : LineItem){
            total += index.getProduct().getPrice() * index.getQuantity();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", LineItem=" + LineItem + ", count=" + count
                + "]";
    }

    
}
