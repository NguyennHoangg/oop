package Tet;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tet {


public class DateTime_Baitapvandung{
    static Scanner sc = new Scanner(System.in);

    public static void ThongTin(){
        System.out.println("28/01/2025 23:59:59");
        System.out.println("24/12/2024 23:59:59");
        System.out.println("Tet am lich la ngay 29/01/2025");
        System.out.println("Giang sinh la ngay 25/12/2024");
    }
    public static void main(String[] args) {

        ThongTin();
        //Định dạng ngày thngs hiện tại
        LocalDateTime thisTime = LocalDateTime.now();

        //Định dạng ngày tháng
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        //Nhap ngay thang nam
        System.out.println("Nhap ngay thang nam ma ban muon tinh toan (dd/MM/yyyy hh:mm:ss )");
        String targetTimeString = sc.nextLine();
        boolean check = false;
        if(targetTimeString.equals("24/12/2024 23:59:59")){
            check = true;
        }

        //Định dạng ngày tháng từ chuỗi sang thời gian
        LocalDateTime targetTime = LocalDateTime.parse(targetTimeString, date);

        //Tính toán ngày tháng 
        Duration tinhToan = Duration.between(thisTime, targetTime);

        //Chuyển đổi ngày tháng 
        long Ngay = tinhToan.toDays();
        long Gio = tinhToan.toHours() % 24;
        long Phut = tinhToan.toMinutes() % 60;
        long Giay = tinhToan.toSeconds() % 60;

        //xuất ra màn hinhf
        if(check){
            System.out.println("Con " + Ngay+" ngay " + Gio+ " gio " + Phut + " phut " + Giay + " giay nua la den Giang Sinh roi!!!" );
        }
        else{
            System.out.println( "Con " + Ngay+ " ngay " + " " + Gio + " gio " + Phut + " phut " + Giay + " giay nua la den Tet roi!!!");
        System.out.println("Co len!!!");

        }

    }
}
}
    
