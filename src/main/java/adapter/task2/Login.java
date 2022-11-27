package adapter.task2;


import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient("gefe", "Ukraine", "2022-11-21");
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient("gefe", Country.Ukraine, LocalDate.now());
        }
        throw new IllegalArgumentException("No such loginMethod.");
    }
}
