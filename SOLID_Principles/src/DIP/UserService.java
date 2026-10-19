package DIP;

public class UserService {

    private MySqlDB db1 = new MySqlDB();
    private PgDB db2 = new PgDB();

    public void saveUser(String user) {
        db1.saveData(user);
    }

    public void saveUserToPgDB(String user) {
        db2.saveData(user);
    }
}
