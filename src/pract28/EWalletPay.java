package pract28;

public class EWalletPay implements PayStrategy {
    public long num;
    public String pass;

    @Override
    public boolean pay(int price) {
        if(num<0) return false;
        else return true;
    }

    @Override
    public int getCommissionPercentage() {
        return 2;
    }

    @Override
    public void init() {
        num = 10000;
        pass = "hahaika";
    }
}
