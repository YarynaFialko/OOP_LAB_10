package adapter.task2;

import java.time.LocalDate;

public class TwitterClient implements Client {
    private TwitterUser user;

    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    public TwitterClient(String gefe, String ukraine, String s) {
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Country getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}
