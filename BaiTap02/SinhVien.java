package BaiTap02;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private double diemTH;
    private double diemLT;

    public SinhVien() {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemTH = diemTH;
        this.diemLT = diemLT;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", diemTH=" + diemTH + ", diemLT=" + diemLT + '}';
    }
}
