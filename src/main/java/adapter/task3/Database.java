package adapter.task3;

public class Database extends БазаДаних {
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }
    public String getStaticData() {
        return super.отриматиСтатистичніДані();
    }

}
