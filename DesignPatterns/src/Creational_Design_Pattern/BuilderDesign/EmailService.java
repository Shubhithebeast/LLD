package Creational_Design_Pattern.BuilderDesign;

public class EmailService {
    public void sendEmail(){
        User user = new User("Shubham", 24, "shubh.b@example.com");
        System.out.println("Welcome email sent " + user);
    }

}
