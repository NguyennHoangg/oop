package BiaTap07;

public class Main {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron(5 , 5,null, 10.5);
        double result = hinhTron.chuvi();
        double result1 = hinhTron.dientich();

        System.out.println(hinhTron);
        System.out.println(result);
        System.out.println(result1);
    }
}
