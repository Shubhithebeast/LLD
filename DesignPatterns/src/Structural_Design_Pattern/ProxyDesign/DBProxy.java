package Structural_Design_Pattern.ProxyDesign;

public class DBProxy implements Database {

    private Database database;
    private String role;

    public DBProxy(String role) {
        this.role = role;
        this.database = new MSQLDB();
    }

    @Override
    public void delete() {
        if (!"admin".equals(role)) {
            System.out.println("Access denied: Only admin can delete users");
            return;
        }   
        database.delete();
    }


}
