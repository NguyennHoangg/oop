package BaiTap09;

import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập số lượng công nhân");
        int n = sc.nextInt();
        DanhSachCongNhan cNhan = new DanhSachCongNhan(n);


        for(int i = 0; i < n; i++){
            System.out.println("Nhập tên Công Nhân. Nhập \"exit\" nếu muốn thoát.");
            String name = sc.nextLine();
            if(name.equals("exit")){
                break;
            }
            sc.nextLine();
            System.out.println("Nhập số sản phẩm");
            int soSanPham = sc.nextInt();


            sc.nextLine();
            System.out.println("Nhập mã số Công Nhân");
            String msCN = sc.nextLine();


            System.out.println("Nhập Họ đệm Công Nhân");
            String maHo= sc.nextLine();

            CongNhan cn = new CongNhan(name, soSanPham, msCN, maHo);

             if(cNhan.add(cn) == true){
                System.out.println("Thêm vào danh sách thành công");
             }else{
                System.out.println("Danh sách đã đầy hoặc gặp sự cố");
             }
        }



            System.out.println("Chọn 1 trong số các lựa chọn sau");
            System.out.println("1.Trả về toàn bộ danh sách công nhân");
            System.out.println("2.Trả về số lượng công nhân");
            System.out.println("3.Danh sách công nhân có số sản phẩm trên 200");
            System.out.println("4.Sắp xếp lại danh sách công nhân theo số sản phẩm");
            int choice = sc.nextInt();


            if(choice == 1){
                for(CongNhan index : cNhan.CoutInfor() ){
                    System.out.println(index);
                }
            }
            if(choice == 2){
                cNhan.TongSoLuongCongNhan();
            }
            if(choice == 3){
               cNhan.CongNhanLamtot();
            }
            if(choice == 4){
                cNhan.sort();
            }
           
    }
}
