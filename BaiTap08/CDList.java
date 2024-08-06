package BaiTap08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CDList {
    private List<CD> list;
    private int soLuong;



    public CDList(int soLuong) {
        this.list = new ArrayList<>(list);
        this.soLuong = soLuong;
    }


    //Ham thêm 1 CD nếu list còn trống hoặc ko trùng mã CD
    public boolean addCD(CD cd){
        if( list.size() >= soLuong){
            return false;
        }

        for(CD maCD : list){
            if(maCD.getMaCD() == cd.getMaCD()){
                return false;
            }
        }
        list.add(cd);
        return true;
    }


    //Hàm trả về số lượng CD trong list
    public int listSize() {
        return list.size();
    }

    //Hàm tính tổng giá tiền trong list
    public double totalPrice(){
        double total = 0;
        for(CD x : list){
            total += x.getGiaTien();
        }
        return total;
    }

    //Hàm trả về thông tin của list
    public List<CD> informationCDList(){
        return new ArrayList<>(list);
    }


    //hàm sắp xếp theo giá tiền
    public void sortbyPrice(){
        list.sort(Comparator.comparingDouble(CD::getGiaTien).reversed());
    }


    //hàm sắp xếp theo tên
    public void sortbyName(){
        list.sort(Comparator.comparing(CD::getGiaTien));
    }
}
