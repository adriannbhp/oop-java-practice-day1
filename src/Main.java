class User {

    // Agar field bisa diakses, ubah
    protected String username;

    protected String password;

    void register(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Berhasil daftar");
    }

    void notification() {
        System.out.println("Created by User");
    }
}

class Admin extends User {

}

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.register("adrian", "123");
        user1.notification();
    }
}