package Money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Money {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private double count = 0;

    public Money(double count) {
        this.count = count;
    }

    public Money() {
    }

    public String getBalance() {

        return "your balance: " + count + " " + getClass().getSimpleName();
    }

    public void Deposit() throws IOException {
        System.out.println("Write sum witch you want to deposit");
        this.count += Integer.parseInt(bufferedReader.readLine());
        getBalance();
    }

    public void takeMoney() throws IOException {
        System.out.println("Write sum witch you want to take");
        count -= Double.parseDouble(bufferedReader.readLine());
        getBalance();


    }
}
