package Creational_Design_Pattern.BuilderDesign;

public class LoginService {
    public void registerUser(String name,int age,String email,String city){
        User user = new User(name, age, email, city);
        System.out.println("User registered successfully: " + user);
    }

}
