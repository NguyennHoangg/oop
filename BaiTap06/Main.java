package BaiTap06;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
    Accout acc1 = new Accout(1234, "Hoang", 200000);
    Accout acc2 = new Accout(12345, "ng Hoang", 300000);
    System.out.println("Nhập số tiền bạn muốn gửi vào ngân hàng");
    double x = sc.nextDouble();
    boolean result = acc1.depoitsit(x);
    boolean result1 = acc2.depoitsit(2000000);

    boolean result2 = acc2.withDraw(430000, 0.015);
    boolean result3 = acc2.tranfers(acc1, 30000);
    if(result || result1 ){
        System.out.println("gửi tiueenf vào tài khoản thành công");
    }else{
        System.out.println("guiwr tieenf vaof taif khoanr khoong thanh cong");
    }
    System.out.println(acc1);
    System.out.println(acc2);
   }
}
