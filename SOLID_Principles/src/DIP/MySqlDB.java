package DIP;

public class MySqlDB implements Database {

    @Override
    public void saveData(String data) {
        System.out.println("Saving data to MySQL database: " + data);
    }
}
