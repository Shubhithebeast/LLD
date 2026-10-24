
package Creational_Design_Pattern.BuilderDesign;

public class UserBuilder {

     String name;
     int age;
     String email;
     String city;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    
    // public User build() {
    //     return new User(name, age, email, city);
    // }

}
