package DIP;

public class PgDB implements Database {

    @Override
    public void saveData(String data) {
        System.out.println("Saving data to PostgreSQL database: " + data);
    }

}