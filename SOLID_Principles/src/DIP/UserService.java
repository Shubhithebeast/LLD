package DIP;

public class UserService {

    private Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void saveData(String user) {
        db.saveData(user);
    }

}
