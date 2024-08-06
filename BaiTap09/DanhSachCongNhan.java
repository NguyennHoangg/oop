package BaiTap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachCongNhan {
    List<CongNhan> list ;
   
    //Contructor
    public DanhSachCongNhan(int n) {
        this.list = new ArrayList<>(n);
    }


    //Phuong thức thêm công nhân nếu danh sách còn trống
    public boolean add(CongNhan cn){
            list.add(cn);
            return true;
    }

    //Phưuong thức trả về toàn bộ danh sách công nhân
    public List<CongNhan> CoutInfor(){
        return new ArrayList<>(list);
    }

    //Phương thức trả về toàn bộ số lượng công nhân
    public int TongSoLuongCongNhan(){
        return list.size();
    }


    //Phương thức trả về danh sách công nhân làm trên 200 san phẩm
    public void CongNhanLamtot(){
        for(CongNhan cn : list){
            if(cn.soSanPham > 200){
                System.out.println(cn);
            }
        }
    }


    //Phương thức sắp xếp số sản phầm từ cao đến thấp
    public void sort(){
        Collections.sort(list, new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan cn1, CongNhan cn2){
                return Integer.compare(cn1.soSanPham, cn2.soSanPham);
            }
        });
    }
    
}
