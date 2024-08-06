package BaiTap08;

public class CD {
    private int maCD;
    private String name;
    private int soBaiHat;
    private double price;
    
    public CD(int maCD, String name, int soBaiHat, double price) {
        setMaCD(maCD);
        setName(name);
        this.soBaiHat = soBaiHat;
        this.price = price;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
        if(this.maCD < 0){
            this.maCD = 999999;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(this.name == null){
            this.name = "Chưa xác định";
        }
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaTien() {
        return price;
    }

    public void setGiaTien(int giaTien) {
        this.price = giaTien;
    }

    @Override
    public String toString() {
        return "CD [maCD=" + maCD + ", name=" + name + ", soBaiHat=" + soBaiHat + ", giaTien=" + price + "]";
    }

    
}
