package BaiTap09;

public class CongNhan {
    protected String mTen;
    protected int soSanPham;
    protected String maCN;
    protected String mHo;


    public CongNhan(String mTen, int soSanPham, String maCN, String mHo) {
        this.mTen = mTen;
        this.soSanPham = soSanPham;
        this.maCN = maCN;
        this.mHo = mHo;
    }


    public String getmTen() {
        return mTen;
    }


    public void setmTen(String mTen) {
        this.mTen = mTen;
    }


    public int getSoSanPham() {
        return soSanPham;
    }


    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }


    public String getMaCN() {
        return maCN;
    }


    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }


    public String getmHo() {
        return mHo;
    }


    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public double tinhLuong(){
        double donGia;
        if(this.soSanPham > 0 && this.soSanPham < 200){
            donGia = 0.5;
        }
        else if(this.soSanPham >= 200 && this.soSanPham <= 399){
            donGia = 0.55;
        }
        else if(this.soSanPham >= 400 && this.soSanPham <= 599){
            donGia = 0.6;
        }
        else{
            donGia = 0.65;
        }
        return this.soSanPham * donGia;
    }


    @Override
    public String toString() {
        return "CongNhan [mTen=" + mTen + ", soSanPham=" + soSanPham + ", maCN=" + maCN + ", mHo=" + mHo
                + ", tinhLuong()=" + tinhLuong() + "]";
    }


    
}
