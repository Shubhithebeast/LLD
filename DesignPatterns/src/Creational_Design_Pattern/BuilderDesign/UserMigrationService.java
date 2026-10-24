package Creational_Design_Pattern.BuilderDesign;

public class UserMigrationService {
    public void migrateUser(){
        UserBuilder builder = new UserBuilder()
                .setName("Shubham")
                .setAge(24)
                .setEmail("shubh.b@example.com")
                .setCity("New York");
        User user = new User(builder);
        System.out.println("User migrated successfully: " + user);
    }
}
    