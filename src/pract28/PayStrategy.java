package pract28;

public interface PayStrategy {
    boolean pay(int price);
    int getCommissionPercentage();
    void init();
}
