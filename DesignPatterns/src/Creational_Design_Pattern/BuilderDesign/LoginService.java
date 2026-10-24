package Creational_Design_Pattern.BuilderDesign;

public class LoginService {
    public void registerUser(String name,int age,String email,String city){

        UserBuilder builder = new UserBuilder()
                .setName(name)
                .setAge(age)
                .setEmail(email)
                .setCity(city);

        User user = new User(builder);
        System.out.println("User registered successfully: " + user);
    }

}
