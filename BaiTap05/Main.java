package BaiTap05;


import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static Scanner sc = new Scanner(System.in);

    //Hàm nhập mã hàng
    public static int nhapMaHang(){
        System.out.println("Nhap ma hang");
        int maHang = 0;
        while(0 < maHang || maHang < Integer.MAX_VALUE){
            try {
                maHang =sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Nhap sai định dạng mã hàng.");
                sc.next();
            }
        }
        return maHang;
    }

    //Hàm nhập đơn giá từng sản phẩm
    public static double nhapDonGia(){
        double donGia = 0;
        while(donGia > 0 || donGia < Double.MAX_VALUE){
            try {
                System.out.println("Nhap don gia");
                donGia = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Nhập sao định dạng đơn giá");
                sc.next();
            }
        }
        return donGia;
    }


    public static void main(String[] args) {
        
        ArrayList<HangThucPham> list = new ArrayList<>();
        while(true){
            System.out.println("Nhap ten Hang Hoa");
            String tenHang = sc.nextLine();
            if(tenHang.equals("exit")){
                break;
            }
        int maHang = nhapMaHang();
        double donGia = nhapDonGia();
        HangThucPham tp1 = new HangThucPham(maHang, tenHang, donGia, "18/07/2004", "17/07/2024");
        list.add(tp1);
        sc.nextLine();
    }

    for(HangThucPham index : list){
        System.out.println(index);
    }
}
}
