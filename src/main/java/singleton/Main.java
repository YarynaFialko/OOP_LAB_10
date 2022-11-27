package singleton;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Yaroslav", "ya@gmail.com", 21);
        user.save();
    }
}

