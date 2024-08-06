package BaiTap04;

public class Vehicle {
    private String Name;
    private String loaiXe;
    private long giaTriXe;
    private int dungtichXilanh;
    double thue;

    
    public Vehicle(String name, String loaiXe, long giaTriXe, int dungtichXilanh) {
        Name = name;
        this.loaiXe = loaiXe;
        this.giaTriXe = giaTriXe;
        this.dungtichXilanh = dungtichXilanh;
        setThue(giaTriXe, dungtichXilanh);
    }

    
    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public String getLoaiXe() {
        return loaiXe;
    }


    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }


    public double getGiaTriXe() {
        return giaTriXe;
    }


    public void setGiaTriXe(long giaTriXe) {
        this.giaTriXe = giaTriXe;
    }


    public int getDungtichXilanh() {
        return dungtichXilanh;
    }


    public void setDungtichXilanh(int dungtichXilanh) {
        this.dungtichXilanh = dungtichXilanh;
    }

    public double getThue() {
        return thue;
    }


    public void setThue(double thue, int dungtichXilanh) {
        if(this.dungtichXilanh < 100){
            this.thue = 0.01;
        }
        else if(this.dungtichXilanh <= 200 && this.dungtichXilanh > 100){
            this.thue = 0.03;
        }
        else{
            this.thue = 0.05;
        }
    }

    
    public double Thue(){
        double Thue1 = (this.giaTriXe * this.thue);
        return Thue1;
    }


    @Override
    public String toString() {
        return "Vehicle [Name=" + Name + ", loaiXe=" + loaiXe + ", giaTriXe=" + giaTriXe + ", dungtichXilanh="
                + dungtichXilanh + ", Thue()=" + Thue() + "]";
    }

    


    
    
}
