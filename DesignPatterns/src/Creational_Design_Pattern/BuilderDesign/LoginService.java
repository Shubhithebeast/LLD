package Creational_Design_Pattern.BuilderDesign;

public class LoginService {
    public void registerUser(String name,int age,String email){
        User user = new User(name, age, email);
        System.out.println("User registered successfully: " + user);
    }

}
