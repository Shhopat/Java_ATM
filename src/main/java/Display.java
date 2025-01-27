import Money.Money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Display {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static int choosing;

    public static void Menu() throws IOException {

        while (true) {
            System.out.println("Available features: ");
            System.out.println(" ");
            System.out.println("1." + Status.INFO);
            System.out.println(" ");
            System.out.println("2." + Status.DEPOSIT);
            System.out.println(" ");
            System.out.println("3." + Status.TAKE);
            System.out.println(" ");
            System.out.println("4.Exit");
            choosing = Integer.parseInt(bufferedReader.readLine());
            switch (choosing) {
                case 1 -> {


                }
            }

        }


    }
}
