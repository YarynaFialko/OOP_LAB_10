package adapter.task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
//    public static void main(String[] args) {
//        БазаДаних db = new БазаДаних();
//        Авторизація авторизація = new Авторизація();
//        if (авторизація.авторизуватися(db)) {
//            ReportBuilder br = new ReportBuilder(db);
//        }
//    }
}
