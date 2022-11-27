package adapter.task2;

import adapter.Country;

import java.time.LocalDate;

public interface Client {
    String getEmail();
    Country getCountry();
    LocalDate getLastActiveTime();
}
