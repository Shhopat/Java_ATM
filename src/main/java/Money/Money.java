package Money;

public class Money {
    private double count;

    public Money(double count) {
        this.count = count;
    }

    public String getCount() {

        return "your balance: " + count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}
