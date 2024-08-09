package Baitap10;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderID(1);
        order.setOrderDate(java.time.LocalDate.now());
        System.out.println(order);
        while(true){
            System.out.println("Nhập sản phẩm muốn mua: ");
            String name = sc.nextLine();
            //Nhập exit nếu muốn thoát vòng lặp
            if(name.equals("exit")){
                break;
            }
            System.out.println("Nhập mã sản phẩm: ");
            String maSanPham = sc.nextLine();
            System.out.println("Nhập giá sản phẩm: ");
            double giaSanPham = sc.nextDouble();
            Product pr =  new Product(name, maSanPham, giaSanPham);
            System.out.println("Nhập số lượng sản phẩm: ");
            int soLuong = sc.nextInt();
            order.addItem(pr, soLuong);
            sc.nextLine(); // Consume newline left-over
        }

        for(LineItem index : order.getItems()){
            System.out.println(index);
            
        }
    }
}