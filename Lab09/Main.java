package Lab09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    //ham nhap mssv
    public static int nhapMssv(){
        System.out.println("Nhap Mssv");
        int result = 0;
        while(true){
            try {
                result = sc.nextInt();
                break;
            } catch (Exception e) {
               System.out.println("Mssv không hợp lệ. Nhập lại");
               sc.next();
            }
        }
       return result;
    }

    //Ham nhap diem
    public static float nhapDiem(){
        System.out.println("Nhap diem");
        float p = 0;
        do{
           try {
                p = sc.nextFloat();
           } catch (Exception e) {
                System.out.println("Điểm nhập vaò không hợp lệ");
                System.out.println("Nhap lai diem");
                sc.next();
           }
        }while(p < 1 || p > 10);

        return p;
    }

    // Ham nhap tuoi

public static int nhapTuoi(){
    System.out.println("Nhập tuổi");
    int Age = 0;
    do{
        try {
            Age = sc.nextInt();
        } catch (Exception e) {
             System.out.println("Tuổi nhập vaò không hợp lệ");
             System.out.println("Nhập lại tuổi");
             sc.next();
        }
     }while(Age < 1 || Age > 100);

    return Age;
}
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        while(true){
            System.out.println("Nhaạp tên sinh viên");
            String ten = sc.nextLine();
            if(ten.equalsIgnoreCase("exit")){
                break;
            }
            int Mssv = nhapMssv();
            int Age = nhapTuoi();
            float Diem = nhapDiem();
            sc.nextLine();
            SinhVien sv = new SinhVien(ten, Mssv, Diem, Age);
            list.add(sv);
        }
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
