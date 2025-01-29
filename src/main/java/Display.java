import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Display {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static int choosing;

    private Display() {
    }

    private static Display display;

    public static Display getInstance() {
        if (display == null) {
            display = new Display();
            return display;
        }
        return display;
    }


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
                    Registration.checkRegistration();

                }
                case 2 -> {
                    Registration.entryDeposit();


                }
                case 3 -> {
                    Registration.entryTake();
                }
                case 4 -> {
                    return;
                }
            }

        }


    }
}
