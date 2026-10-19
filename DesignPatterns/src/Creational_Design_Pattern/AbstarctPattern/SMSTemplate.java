package Creational_Design_Pattern.AbstarctPattern;

public class SMSTemplate implements Template{
    @Override
    public void format() {
        System.out.println("Displaying SMS Template");
    }
}
