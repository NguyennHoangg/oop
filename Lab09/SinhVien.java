package Lab09;


public class SinhVien {
    private String Name;
    private int Id;
    private float Diem;
    private int Tuoi;


    public SinhVien(String name, int id, float diem, int tuoi) {
        this.Name = name;
        this.Id = id;
        this.Diem = diem;
        this.Tuoi = tuoi;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public float getDiem() {
        return Diem;
    }
    public void setDiem(float diem) {
        Diem = diem;
    }
    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi){
        Tuoi = tuoi;
    }

    
    @Override
    public String toString() {
        return "SinhVien [Name=" + Name + ", Id=" + Id + ", Diem=" + Diem + ", Tuoi=" + Tuoi + "]";
    }

    
}

    