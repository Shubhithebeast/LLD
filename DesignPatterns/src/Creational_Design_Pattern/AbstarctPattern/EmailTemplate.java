package Creational_Design_Pattern.AbstarctPattern;

public class EmailTemplate implements Template{
    @Override
    public void format() {
        System.out.println("Displaying Email Template");
    }
}
