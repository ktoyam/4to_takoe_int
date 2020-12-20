package pract28;

import java.math.BigInteger;

public class CreditCartPay implements PayStrategy{
    private BigInteger num;
    private short cvv;


    @Override
    public boolean pay(int price) {
        if(num.toString().length() != 16 || cvv<0 || cvv>999) return false;
        else return true;
    }

    @Override
    public int getCommissionPercentage() {
        return 15;
    }

    @Override
    public void init() {
        num = new BigInteger("4564111122223333");
        cvv = 204;
    }
}
