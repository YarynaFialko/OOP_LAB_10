package adapter.task3;

public class Authorization extends Авторизація{

    public boolean authorize(Database db) {
        db.getUserData();
        return true;
    }
}
