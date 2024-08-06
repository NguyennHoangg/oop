package BiaTap07;

public class HinhTron extends ToaDo{
    private ToaDo tam;
    private double bankinh;

    
    public HinhTron(float x, float y, ToaDo tam, double bankinh) {
        super(x, y);
        this.tam = tam;
        this.bankinh = bankinh;
    }


    public ToaDo getTam() {
        return tam;
    }


    public void setTam(ToaDo tam) {
        this.tam = tam;
    }


    public double getBankinh() {
        return bankinh;
    }


    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double dientich(){
        return (this.bankinh * this.bankinh) * 3.14;
    }

    public double chuvi(){
        return (this.bankinh * 2 * 3.14);
    }


    @Override
    public String toString() {
        return "HinhTron [tam= (" + x + ", " + y +  ")"  + ", bankinh=" + bankinh + "]";
    }

    
}
