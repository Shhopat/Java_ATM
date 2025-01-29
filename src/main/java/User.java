import Money.Money;
import Money.TypeMany;
import Money.USD;
import Money.RUB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private final List<Money> wallet;
    private String name;
    private int password;


    public User(String name, int password) {
        this.name = name;
        this.password = password;
        wallet = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public List<Money> getWallet() {
        return wallet;
    }

    public void addValuta() throws IOException {
        System.out.println("Write type of valuta: ");
        System.out.println("1.USD");
        System.out.println("2.RUB");
        int choice = Integer.parseInt(bufferedReader.readLine());

        switch (choice) {
            case 1 -> {
                wallet.add(new USD());
                System.out.println("Successfully!");
            }
            case 2 -> {
                wallet.add(new RUB());
                System.out.println("Successfully!");
            }
        }


    }
}
