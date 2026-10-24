package Creational_Design_Pattern.BuilderDesign;

public class UserMigrationService {
    public void migrateUser(){
        User user = new User("Rahul", 24, "rahul@example.com", "New Delhi");
        System.out.println("User migrated successfully: " + user);
    }
}
    