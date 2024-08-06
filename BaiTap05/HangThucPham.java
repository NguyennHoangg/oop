package BaiTap05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HangThucPham {
    private int maHang;
    protected String tenHang;
    protected double donGia;
    protected String ngaySanXuat;
    protected String ngayHetHan;

    public HangThucPham(int maHang, String tenHang, double donGia, String ngaySanXuat, String ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan, this.ngaySanXuat);
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date;
        try {
            date = LocalDate.parse(ngaySanXuat, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            date = LocalDate.now();
        }

        if (date.isBefore(LocalDate.now())) {
            this.ngaySanXuat = LocalDate.now().format(dateTimeFormatter);
        } else {
            this.ngaySanXuat = date.format(dateTimeFormatter);
        }
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan, String ngaySanXuat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateHetHan;
        LocalDate dateSanXuat;

        try {
            dateHetHan = LocalDate.parse(ngayHetHan, formatter);
        } catch (DateTimeParseException e) {
            dateHetHan = LocalDate.now();
        }

        try {
            dateSanXuat = LocalDate.parse(ngaySanXuat, formatter);
        } catch (DateTimeParseException e) {
            dateSanXuat = LocalDate.now();
        }

        // Compare dates between production and expiration
        if (dateHetHan.isAfter(dateSanXuat)) {
            this.ngayHetHan = dateHetHan.format(formatter);
        } else {
            this.ngayHetHan = dateSanXuat.format(formatter);
        }
    }

    @Override
    public String toString() {
        return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", ngaySanXuat="
                + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + "]";
    }
}
