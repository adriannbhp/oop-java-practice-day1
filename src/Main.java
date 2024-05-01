import java.util.Scanner;
import java.util.UUID;

abstract class Display {
    abstract void notification();

    void showToken(UUID token) {
        System.out.println("token generated: " + token);
    }
}
class User extends Display{

    private String username;

    private String password;

    protected UUID token;

    void tokenCreation() {
        token = UUID.randomUUID();
    }

    void register(String username, String password) {
        this.username = username;
        this.password = password;
        tokenCreation();
        System.out.println("username: " + this.username); // Output : username: adrian
        System.out.println("password: " + this.password); // Output : password: 123
    }

    void notification() {
        System.out.println("User Created by User");
    }
}

class Admin extends User {

    private final String role = "admin";
    @Override
    void notification(){
        System.out.println("User Created By " + role );
        showToken(this.token);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("REGISTRASI");

        System.out.println("Masukan username: ");
        String username = input.nextLine();

        System.out.println("Masukan password: ");
        String password = input.nextLine();

        User user1 = new Admin();
        user1.register(username, password);
        user1.notification();
    }
}