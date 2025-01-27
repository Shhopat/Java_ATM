import Money.Money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Registration {
    private Map<User, Money> users = new HashMap<>();
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private int password;

    public void registration(int password, String name, Status status) throws IOException {
        if (users.containsKey(password)) {
            System.out.println("there is such a password");
            System.out.println("create a new password");
            while (true) {
                password = Integer.parseInt(bufferedReader.readLine());
                registration(password, name, status);
            }
        }else {

        }


    }

}
