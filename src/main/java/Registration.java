import Money.Money;
import Money.RUB;
import Money.USD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Registration {
    private static List<User> users = new ArrayList<>();
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private static int password;
    private static String name;

    private Registration() {

    }


    static class Single {
        private static Registration r = new Registration();

    }

    public static Registration getInsistence() {
        return Single.r;
    }

    public static void registration() throws IOException {
        System.out.println("registration: write your login and password");

        while (true) {
            name = bufferedReader.readLine();
            password = Integer.parseInt(bufferedReader.readLine());
            if (!users.isEmpty()) {
                for (User user : users) {
                    if (user.getName().equals(name) && user.getPassword() == password) {
                        System.out.println("There is already such a login and a porch.");
                        System.out.println("Try to change login or password and try again.");
                        registration();
                    }
                }
            } else {
                users.add(new User(name, password));
                System.out.println("Registration was successfully");
                System.out.println("do you want to add money ? If do agree to write yes");
                if (bufferedReader.readLine().equals("yes")) {
                    for (User user : users) {
                        if (user.getName().equals(name) && user.getPassword() == password) {
                            user.addValuta();
                        }
                    }
                }
                break;
            }
        }

    }

    public static void checkRegistration() throws IOException {
        System.out.println("write your login and password for check your registration");
        String name = bufferedReader.readLine();
        int password = Integer.parseInt(bufferedReader.readLine());
        if (!users.isEmpty()) {
            for (User user : users) {
                if (user.getName().equals(name) && user.getPassword() == password) {
                    System.out.println("You are already registered");
                    for (Money money : user.getWallet()) {
                        System.out.println(user.getName() + " " + user.getPassword());
                        money.getBalance();
                    }

                }
            }
        } else {
            System.out.println("You don't registration. Register right now ");
            registration();
        }
    }


    public static void entryDeposit() throws IOException {
        System.out.println("write your login and password for entry");
        String name = bufferedReader.readLine();
        int choosing;
        int password = Integer.parseInt(bufferedReader.readLine());
        if (!users.isEmpty()) {
            for (User user : users) {
                if (user.getPassword() == password && user.getName().equals(name)) {
                    System.out.println("what valuta do you want to deposit ? ");
                    System.out.println("1.USD");
                    System.out.println("2.RUB");
                    choosing = Integer.parseInt(bufferedReader.readLine());
                    for (Money money : user.getWallet()) {
                        switch (choosing) {
                            case 1 -> {
                                if (money instanceof USD) {
                                    money.Deposit();
                                }
                                return;
                            }
                            case 2 -> {
                                if (money instanceof RUB) {
                                    money.Deposit();
                                }
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("You don't registration. Register right now ");
            registration();
        }
    }

    public static void entryTake() throws IOException {
        System.out.println("write your login and password for entry");
        String name = bufferedReader.readLine();
        int choosing;
        int password = Integer.parseInt(bufferedReader.readLine());
        if (!users.isEmpty()) {
            for (User user : users) {
                if (user.getPassword() == password && user.getName().equals(name)) {
                    System.out.println("what valuta do you want to take ? ");
                    System.out.println("1.USD");
                    System.out.println("2.RUB");
                    choosing = Integer.parseInt(bufferedReader.readLine());
                    for (Money money : user.getWallet()) {
                        switch (choosing) {
                            case 1 -> {
                                if (money instanceof USD) {
                                    money.takeMoney();
                                }
                            }
                            case 2 -> {
                                if (money instanceof RUB) {
                                    money.takeMoney();
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("You don't registration. Register right now ");
            registration();
        }
    }
}
