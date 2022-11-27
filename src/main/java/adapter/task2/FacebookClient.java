package adapter.task2;

import adapter.Country;

import java.time.LocalDate;

public class FacebookClient implements Client {
    private FacebookUser user;

    public FacebookClient(FacebookUser user) {
        this.user = user;
    }

    public FacebookClient(String gefe, Country ukraine, LocalDate now) {
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Country getCountry() {
        return user.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}
