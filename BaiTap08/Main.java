package BaiTap08;

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CDList cdList = new CDList(10);  // Initializing with capacity of 10 for example

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Thêm CD vào danh sách");
            System.out.println("2. Tính số lượng CD có trong danh sách");
            System.out.println("3. Tính tổng giá thành của các CD");
            System.out.println("4. Hiển thị thông tin toàn bộ CD trong danh sách");
            System.out.println("5. Sắp xếp danh sách giảm dần theo giá thành");
            System.out.println("6. Sắp xếp danh sách tăng dần theo tựa CD");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã CD: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Nhập tựa CD: ");
                    String title = scanner.nextLine();

                    System.out.print("Nhập số bài hát: ");
                    int numberOfSongs = scanner.nextInt();

                    System.out.print("Nhập giá thành: ");
                    double price = scanner.nextDouble();

                    CD cd = new CD(id, title, numberOfSongs, price);
                    if (cdList.addCD(cd)) {
                        System.out.println("Thêm CD thành công.");
                    } else {
                        System.out.println("Thêm CD thất bại. Có thể mã CD đã tồn tại hoặc danh sách đầy.");
                    }
                    break;
                case 2:
                    System.out.println("Số lượng CD có trong danh sách: " + cdList.informationCDList());
                    break;
                case 3:
                    System.out.println("Tổng giá thành của các CD: " + cdList.totalPrice());
                    break;
                case 4:
                    System.out.println("Thông tin toàn bộ CD trong danh sách:");
                    for (CD cdItem : cdList.informationCDList()) {
                        System.out.println(cdItem);
                    }
                    break;
                case 5:
                    cdList.sortbyPrice();
                    System.out.println("Đã sắp xếp danh sách giảm dần theo giá thành.");
                    break;
                case 6:
                    cdList.sortbyName();
                    System.out.println("Đã sắp xếp danh sách tăng dần theo tựa CD.");
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }

        scanner.close();
    }
}

