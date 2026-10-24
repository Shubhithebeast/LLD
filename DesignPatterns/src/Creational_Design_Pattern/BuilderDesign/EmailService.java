package Creational_Design_Pattern.BuilderDesign;

public class EmailService {
    public void sendEmail(){
        UserBuilder builder = new UserBuilder()
                .setName("Shubham")
                .setAge(24)
                .setEmail("shubh.b@example.com");

        User user = new User(builder);

        System.out.println("Welcome email sent " + user);
    }

}
