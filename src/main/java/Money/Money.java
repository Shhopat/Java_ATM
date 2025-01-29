package Money;

public class Money {
    private double count;

    public Money(double count) {
        this.count = count;
    }

    public String getBalance() {

        return "your balance: " + count;
    }

    public void setBalance(double count) {
        this.count = count;
    }
}
