package BaiTap06;

public class Accout {
    private long accoutNumbers;
    private String Name;
    private double balacne;
    double Rate = 0.035;


    public Accout() {
    }


    public Accout(long accoutNumbers, String name, double balacne) {
        this.accoutNumbers = accoutNumbers;
        Name = name;
        this.balacne = balacne;
    }


    public Accout(long accoutNumbers, String name) {
        this.accoutNumbers = accoutNumbers;
        Name = name;
    }


    public long getAccoutNumbers() {
        return accoutNumbers;
    }


    public double getBalacne() {
        return balacne;
    }

    public boolean depoitsit(double amount){
        if(amount > 0){
            this.balacne += amount;
            return true;
        }
        return false;
    }

    public boolean withDraw(double amount, double fee){
        if(amount > 0 && amount + fee <= this.balacne){
            this.balacne -= amount + amount * fee;
            return true;
        }
        return false;
    }

    public double addInterest(){
      return  this.balacne = balacne + balacne * Rate;
    }

    public boolean tranfers(Accout accout2, double amount){
        if(amount <= this.balacne){
            this.balacne -= amount;
            accout2.balacne += amount;
            return true;
        }
        else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "Accout [accoutNumbers=" + accoutNumbers + ", Name=" + Name + ", balacne=" + balacne + "]";
    }

    
    
}
